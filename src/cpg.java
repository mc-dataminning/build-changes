import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public abstract class cpg implements cot<biu> {
   protected final coq a;
   protected final clo b;
   private final coy<?> d;
   private final cox<?> e;
   protected final String c;

   public cpg(coy<?> $$0, cox<?> $$1, String $$2, coq $$3, clo $$4) {
      this.d = $$0;
      this.e = $$1;
      this.c = $$2;
      this.a = $$3;
      this.b = $$4;
   }

   @Override
   public coy<?> e() {
      return this.d;
   }

   @Override
   public cox<?> as_() {
      return this.e;
   }

   @Override
   public String c() {
      return this.c;
   }

   @Override
   public clo a(it $$0) {
      return this.b;
   }

   @Override
   public ip<coq> a() {
      ip<coq> $$0 = ip.a();
      $$0.add(this.a);
      return $$0;
   }

   @Override
   public boolean a(int $$0, int $$1) {
      return true;
   }

   @Override
   public clo a(biu $$0, it $$1) {
      return this.b.p();
   }

   public static class a<T extends cpg> implements cox<T> {
      private static final MapCodec<clo> y = RecordCodecBuilder.mapCodec(
         $$0 -> $$0.group(kc.i.q().fieldOf("result").forGetter(clo::d), Codec.INT.fieldOf("count").forGetter(clo::L)).apply($$0, clo::new)
      );
      final cpg.a.a<T> x;
      private final Codec<T> z;

      protected a(cpg.a.a<T> $$0) {
         this.x = $$0;
         this.z = RecordCodecBuilder.create(
            $$1 -> $$1.group(
                     asy.a(Codec.STRING, "group", "").forGetter($$0xx -> $$0xx.c),
                     coq.c.fieldOf("ingredient").forGetter($$0xx -> $$0xx.a),
                     y.forGetter($$0xx -> $$0xx.b)
                  )
                  .apply($$1, $$0::create)
         );
      }

      @Override
      public Codec<T> a() {
         return this.z;
      }

      public T b(ty $$0) {
         String $$1 = $$0.s();
         coq $$2 = coq.b($$0);
         clo $$3 = $$0.r();
         return this.x.create($$1, $$2, $$3);
      }

      public void a(ty $$0, T $$1) {
         $$0.a($$1.c);
         $$1.a.a($$0);
         $$0.a($$1.b);
      }

      interface a<T extends cpg> {
         T create(String var1, coq var2, clo var3);
      }
   }
}
