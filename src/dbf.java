import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbf extends cxi<djo> implements dfo {
   public static final MapCodec<dbf> b = b(dbf::new);
   public static final dlz c = dcj.aE;
   public static final dlw d = dlv.C;
   protected static final eol e = cyo.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vq f = vq.c("container.enderchest");

   @Override
   public MapCodec<dbf> a() {
      return b;
   }

   protected dbf(dle.d $$0) {
      super($$0, () -> div.d);
      this.k(this.E.b().a(c, ie.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dav.c<? extends dja> a(dlf $$0, cvn $$1, hz $$2, boolean $$3) {
      return dav.b::b;
   }

   @Override
   protected eol a(dlf $$0, cut $$1, hz $$2, enx $$3) {
      return e;
   }

   @Override
   protected det b_(dlf $$0) {
      return det.b;
   }

   @Override
   public dlf a(crg $$0) {
      egp $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == egq.c));
   }

   @Override
   protected blu a(dlf $$0, cvn $$1, hz $$2, chh $$3, eno $$4) {
      cln $$5 = $$3.gg();
      dit $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof djo) {
         hz $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return blu.a($$1.B);
         } else if ($$1.B) {
            return blu.a;
         } else {
            djo $$8 = (djo)$$6;
            $$5.a($$8);
            $$3.a(new bme(($$1x, $$2x, $$3x) -> cki.a($$1x, $$2x, $$5), f));
            $$3.a(atu.aj);
            cfy.a($$3, true);
            return blu.b;
         }
      } else {
         return blu.a($$1.B);
      }
   }

   @Override
   public dit a(hz $$0, dlf $$1) {
      return new djo($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dit> diu<T> a(cvn $$0, dlf $$1, div<T> $$2) {
      return $$0.B ? a($$2, div.d, djo::a) : null;
   }

   @Override
   public void a(dlf $$0, cvn $$1, hz $$2, awo $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(jz.Z, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dlf a(dlf $$0, dfa $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dlf a(dlf $$0, ddk $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected egp c_(dlf $$0) {
      return $$0.c(d) ? egq.c.a(false) : super.c_($$0);
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, egq.c, egq.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      dit $$4 = $$1.c_($$2);
      if ($$4 instanceof djo) {
         ((djo)$$4).c();
      }
   }
}
