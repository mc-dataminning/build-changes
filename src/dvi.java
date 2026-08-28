import com.mojang.serialization.MapCodec;

public class dvi extends dno {
   public static final MapCodec<dvi> b = b(dvi::new);
   public static final ech c = ecg.E;

   @Override
   protected MapCodec<? extends dvi> a() {
      return b;
   }

   protected dvi(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      return $$4 == jc.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebq a(ded $$0) {
      ebq $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(ebq $$0) {
      return $$0.a(axn.bC);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(c);
   }
}
