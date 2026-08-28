import com.mojang.serialization.MapCodec;

public class duy extends dne {
   public static final MapCodec<duy> b = b(duy::new);
   public static final ebx c = ebw.E;

   @Override
   protected MapCodec<? extends duy> a() {
      return b;
   }

   protected duy(ebf.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      return $$4 == jc.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebg a(ddt $$0) {
      ebg $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(ebg $$0) {
      return $$0.a(axg.bC);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(c);
   }
}
