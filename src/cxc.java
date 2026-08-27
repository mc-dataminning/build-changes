import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cxc extends cwk {
   public static final MapCodec<cxc> a = b(cxc::new);
   public static final dkg[] b = new dkg[]{dkf.k, dkf.l, dkf.m};
   protected static final emv c = ems.a(cwy.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), cwy.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<cxc> a() {
      return a;
   }

   public cxc(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b[0], Boolean.valueOf(false)).a(b[1], Boolean.valueOf(false)).a(b[2], Boolean.valueOf(false)));
   }

   @Override
   public ddd b_(djp $$0) {
      return ddd.c;
   }

   @Override
   public dhd a(hx $$0, djp $$1) {
      return new dhg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dhd> dhe<T> a(ctx $$0, djp $$1, dhf<T> $$2) {
      return $$0.B ? null : a($$2, dhf.l, dhg::a);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         dhd $$5 = $$1.c_($$2);
         if ($$5 instanceof dhg) {
            $$3.a((dhg)$$5);
            $$3.a(asd.aa);
         }

         return bkc.b;
      }
   }

   @Override
   public void a(ctx $$0, hx $$1, djp $$2, bmo $$3, cng $$4) {
      if ($$4.A()) {
         dhd $$5 = $$0.c_($$1);
         if ($$5 instanceof dhg) {
            ((dhg)$$5).a($$4.y());
         }
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, auw $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(jx.ab, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, djp $$3, boolean $$4) {
      bjy.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public boolean d_(djp $$0) {
      return true;
   }

   @Override
   public int a(djp $$0, ctx $$1, hx $$2) {
      return cij.a($$1.c_($$2));
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
