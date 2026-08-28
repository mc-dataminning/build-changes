import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import javax.annotation.Nullable;

public abstract class daz implements dak<dba> {
   protected final dag a;
   protected final cvs b;
   private final daq<?> d;
   private final dap<?> e;
   protected final String c;
   @Nullable
   private daj f;

   public daz(daq<?> $$0, dap<?> $$1, String $$2, dag $$3, cvs $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public daq<?> e() {
      return this.d;
   }

   @Override
   public dap<?> ar_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cvs a(jq.a $$0) {
      return this.b;
   }

   @Override
   public daj a() {
      if (this.f == null) {
         this.f = daj.a(this.a);
      }

      return this.f;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   public cvs a(dba $$0, jq.a $$1) {
      return this.b.u();
   }

   public interface a<T extends daz> {
      T create(String var1, dag var2, cvs var3);
   }

   public static class b<T extends daz> implements dap<T> {
      final daz.a<T> w;
      private final MapCodec<T> x;
      private final zc<wp, T> y;

      protected b(daz.a<T> $$0) {
         this.w = $$0;
         this.x = RecordCodecBuilder.mapCodec(
            $$1 -> $$1.group(
                     Codec.STRING.optionalFieldOf("group", "").forGetter($$0xx -> $$0xx.c),
                     dag.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cvs.d.fieldOf("result").forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.y = zc.a(za.m, $$0x -> $$0x.c, dag.a, $$0x -> $$0x.a, cvs.i, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public MapCodec<T> a() {
         return this.x;
      }

      @Override
      public zc<wp, T> b() {
         return this.y;
      }
   }
}
