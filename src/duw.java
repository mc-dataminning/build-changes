import com.mojang.serialization.MapCodec;

public class duw extends dnc {
   public static final MapCodec<duw> b = b(duw::new);
   public static final ebv c = ebu.E;

   @Override
   protected MapCodec<? extends duw> a() {
      return b;
   }

   protected duw(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      return $$4 == jb.b ? $$0.b(c, Boolean.valueOf(o($$6))) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = $$0.q().a_($$0.a().d());
      return this.m().b(c, Boolean.valueOf(o($$1)));
   }

   protected static boolean o(ebe $$0) {
      return $$0.a(axe.bC);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(c);
   }
}
