import com.mojang.serialization.MapCodec;

public class dmr extends dno implements dnr {
   public static final MapCodec<dmr> a = b(dmr::new);
   private static final fgw b = dno.b(8.0, 0.0, 12.0);

   @Override
   public MapCodec<dmr> a() {
      return a;
   }

   public dmr(ebp.d $$0) {
      super($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return b.a($$0.a($$2));
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if ($$3.a(3) == 0 && $$1.v($$2.d()) && $$1.b($$2.d(), 0) >= 9) {
         this.a($$1, $$2);
      }
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      return $$1.a_($$2.e()).a(axn.ax);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!$$0.a($$1, $$3)) {
         return dnq.a.m();
      } else {
         return $$4 == jc.b && $$6.a(dnq.nF) ? dnq.nF.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(dao.ej);
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      return $$0.a_($$1.d()).l();
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      this.a($$0, $$2);
   }

   protected void a(dkj $$0, iw $$1) {
      $$0.a($$1.d(), dnq.nF.m().b(dms.c, ecc.b), 3);
   }
}
