import com.mojang.serialization.MapCodec;

public class drm extends dno implements duz {
   public static final MapCodec<drm> a = b(drm::new);
   public static final ech b = ecg.I;
   private static final fgw c = dno.b(8.0, 0.0, 8.0);

   public drm(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   public MapCodec<drm> a() {
      return a;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   public ebq a(ded $$0) {
      eya $$1 = $$0.q().b_($$0.a());
      return this.m().b(b, Boolean.valueOf($$1.b(eyb.c)));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c;
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
