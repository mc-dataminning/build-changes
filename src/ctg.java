import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class ctg implements css<bme> {
   protected final csp a;
   protected final cpq b;
   private final csx<?> d;
   private final csw<?> e;
   protected final String c;

   public ctg(csx<?> $$0, csw<?> $$1, String $$2, csp $$3, cpq $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public csx<?> e() {
      return this.d;
   }

   @Override
   public csw<?> as_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public cpq a(iy $$0) {
      return this.b;
   }

   @Override
   public iu<csp> a() {
      iu<csp> $$0 = iu.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public cpq a(bme $$0, iy $$1) {
      return this.b.q();
   }

   public interface a<T extends ctg> {
      T create(String var1, csp var2, cpq var3);
   }

   public static class b<T extends ctg> implements csw<T> {
      final ctg.a<T> x;
      private final Codec<T> y;
      private final xq<vd, T> z;

      protected b(ctg.a<T> $$0) {
         this.x = $$0;
         this.y = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     avu.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     csp.d.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     cpq.e.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
         this.z = xq.a(xo.i, $$0x -> $$0x.c, csp.b, $$0x -> $$0x.a, cpq.f, $$0x -> $$0x.b, $$0::create);
      }

      @Override
      public Codec<T> a() {
         return this.y;
      }

      @Override
      public xq<vd, T> b() {
         return this.z;
      }
   }
}
