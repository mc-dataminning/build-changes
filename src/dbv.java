import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dbv implements dbd<dbw> {
   private final daz c;
   private final cwo d;
   private final String e;
   @Nullable
   private dbc f;

   public dbv(String $$0, daz $$1, cwo $$2) {
      this.e = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   public abstract dbn<? extends dbv> a();

   @Override
   public abstract dbo<? extends dbv> b();

   public boolean a(dbw $$0, dgh $$1) {
      return this.c.a($$0.c());
   }

   @Override
   public String j() {
      return this.e;
   }

   public daz k() {
      return this.c;
   }

   protected cwo l() {
      return this.d;
   }

   @Override
   public dbc ao_() {
      if (this.f == null) {
         this.f = dbc.a(this.c);
      }

      return this.f;
   }

   public cwo a(dbw $$0, jt.a $$1) {
      return this.d.v();
   }

   @FunctionalInterface
   public interface a<T extends dbv> {
      T create(String var1, daz var2, cwo var3);
   }

   public static class b<T extends dbv> implements dbn<T> {
      private final MapCodec<T> w;
      private final yn<wa, T> x;

      protected b(dbv.a<T> $$0) {
         this.w = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter(dbv::j),
                     daz.d.fieldOf("ingredient").forGetter(dbv::k),
                     cwo.c.fieldOf("result").forGetter(dbv::l)
                  )
                  .apply($$1, $$0::create)
         );
         this.x = yn.a(yl.o, dbv::j, daz.a, dbv::k, cwo.h, dbv::l, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.w;
      }

      @Override
      public yn<wa, T> b() {
         return this.x;
      }
   }
}
