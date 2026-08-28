import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class dbe implements dap<dbf> {
   protected final dal a;
   protected final cwb b;
   private final dav<?> d;
   private final dau<?> e;
   protected final String c;
   @Nullable
   private dao f;

   public dbe(dav<?> $$0, dau<?> $$1, String $$2, dal $$3, cwb $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public dav<?> e() {
      return this.d;
   }

   @Override
   public dau<?> aq_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cwb a(js.a $$0) {
      return this.b;
   }

   @Override
   public dao a() {
      if (this.f == null) {
         this.f = dao.a(this.a);
      }

      return this.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cwb a(dbf $$0, js.a $$1) {
      return this.b.v();
   }

   public interface a<T extends dbe> {
      T create(String var1, dal var2, cwb var3);
   }

   public static class b<T extends dbe> implements dau<T> {
      final dbe.a<T> w;
      private final MapCodec<T> x;
      private final zg<wt, T> y;

      protected b(dbe.a<T> $$0) {
         this.w = $$0;
         this.x = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     dal.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cwb.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.y = zg.a(ze.m, $$0x -> $$0x.c, dal.a, $$0x -> $$0x.a, cwb.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.x;
      }

      @Override
      public zg<wt, T> b() {
         return this.y;
      }
   }
}
