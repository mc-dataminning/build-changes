import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;

public class dnm extends drp implements dnr, duz {
   public static final MapCodec<dnm> a = b(dnm::new);
   private static final ech b = ecg.I;
   private static final Map<jc, fgw> c = fgt.c(dno.b(6.0, 0.0, 16.0).a(0.0, 0.0, 0.25).d());

   @Override
   public MapCodec<dnm> a() {
      return a;
   }

   protected dnm(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Boolean.valueOf(false)).b(e, jc.c));
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return c.get($$0.c(e));
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, e);
   }

   @Override
   protected eya b_(ebq $$0) {
      return $$0.c(b) ? eyb.c.a(false) : super.b_($$0);
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      iw $$3 = $$2.e();
      ebq $$4 = $$1.a_($$3);
      ebq $$5 = $$1.a_($$2.d());
      return ($$4.a(this) || $$4.a(axn.bB)) && ($$5.a(this) || $$5.a(dnq.tn));
   }

   protected static boolean a(dkk $$0, iw $$1, eya $$2, jc $$3) {
      ebq $$4 = dnq.to.m().b(b, Boolean.valueOf($$2.a(eyb.c))).b(e, $$3);
      return $$0.a($$1, $$4, 3);
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (($$4 == jc.a || $$4 == jc.b) && !$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      if ($$0.c(b)) {
         $$2.a($$3, eyb.c, eyb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      Optional<iw> $$3 = m.a($$0, $$1, $$2.b(), jc.b, dnq.tn);
      if ($$3.isEmpty()) {
         return false;
      } else {
         iw $$4 = $$3.get().d();
         ebq $$5 = $$0.a_($$4);
         return dnl.a((dkl)$$0, $$4, $$5);
      }
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      Optional<iw> $$4 = m.a($$0, $$2, $$3.b(), jc.b, dnq.tn);
      if (!$$4.isEmpty()) {
         iw $$5 = $$4.get();
         iw $$6 = $$5.d();
         jc $$7 = $$3.c(e);
         a($$0, $$5, $$0.b_($$5), $$7);
         dnl.a($$0, $$6, $$0.b_($$6), $$7);
      }
   }

   @Override
   protected dak a(dkm $$0, iw $$1, ebq $$2, boolean $$3) {
      return new dak(dnq.tn);
   }
}
