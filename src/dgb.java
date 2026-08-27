import com.mojang.serialization.MapCodec;

public class dgb extends cys {
   public static final MapCodec<dgb> b = b(dgb::new);
   public static final dma c = dlz.z;

   @Override
   protected MapCodec<? extends dgb> a() {
      return b;
   }

   protected dgb(dli.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Boolean.valueOf(false)));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      return $$1 == ie.b ? $$0.a(c, Boolean.valueOf(m($$2))) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public dlj a(crk $$0) {
      dlj $$1 = $$0.q().a_($$0.a().c());
      return this.o().a(c, Boolean.valueOf(m($$1)));
   }

   private static boolean m(dlj $$0) {
      return $$0.a(aua.by);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(c);
   }
}
