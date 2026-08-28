import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dom extends dko<dxl> implements dtb {
   public static final MapCodec<dom> b = b(dom::new);
   public static final eam<ja> c = dpt.e;
   public static final eaf d = eae.I;
   private static final feq e = dlu.b(14.0, 0.0, 14.0);
   private static final ww f = ww.c("container.enderchest");

   @Override
   public MapCodec<dom> a() {
      return b;
   }

   protected dom(dzn.d $$0) {
      super($$0, () -> dwp.d);
      this.l(this.B.b().b(c, ja.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public doc.c<? extends dwv> a(dzo $$0, dip $$1, iu $$2, boolean $$3) {
      return doc.b::b;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e;
   }

   @Override
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == evw.c));
   }

   @Override
   protected bty a(dzo $$0, dip $$1, iu $$2, cqs $$3, fds $$4) {
      cvy $$5 = $$3.gw();
      if ($$5 != null && $$1.c_($$2) instanceof dxl $$7) {
         iu $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bty.a;
         } else {
            if ($$1 instanceof aro $$10) {
               $$5.a($$7);
               $$3.a(new bug(($$1x, $$2x, $$3x) -> cut.a($$1x, $$2x, $$5), f));
               $$3.a(awv.aj);
               cpi.a($$10, $$3, true);
            }

            return bty.a;
         }
      } else {
         return bty.a;
      }
   }

   @Override
   public dwn a(iu $$0, dzo $$1) {
      return new dxl($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dwn> dwo<T> a(dip $$0, dzo $$1, dwp<T> $$2) {
      return $$0.C ? a($$2, dwp.d, dxl::a) : null;
   }

   @Override
   public void a(dzo $$0, dip $$1, iu $$2, azt $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lx.af, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dzo a(dzo $$0, dsm $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dzo a(dzo $$0, dqv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(d) ? evw.c.a(false) : super.b_($$0);
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(d)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      dwn $$4 = $$1.c_($$2);
      if ($$4 instanceof dxl) {
         ((dxl)$$4).a();
      }
   }
}
