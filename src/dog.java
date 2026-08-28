import com.mojang.serialization.MapCodec;

public class dog extends dgv {
   public static final MapCodec<dog> b = b(dog::new);
   public static final dur c = duq.z;

   @Override
   protected MapCodec<? extends dog> a() {
      return b;
   }

   protected dog(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      return $$1 == jj.b ? $$0.b(c, Boolean.valueOf(o($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dua a(cyw $$0) {
      dua $$1 = $$0.q().a_($$0.a().d());
      return this.o().b(c, Boolean.valueOf(o($$1)));
   }

   private static boolean o(dua $$0) {
      return $$0.a(aws.bA);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(c);
   }
}
