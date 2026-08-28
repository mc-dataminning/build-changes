import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhp extends dds<dqb> implements dlz {
   public static final MapCodec<dhp> b = b(dhp::new);
   public static final dsv c = diu.aE;
   public static final dss d = dsr.C;
   protected static final ewj e = dey.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xo f = xo.c("container.enderchest");

   @Override
   public MapCodec<dhp> a() {
      return b;
   }

   protected dhp(dsa.d $$0) {
      super($$0, () -> dpi.d);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhf.c<? extends dpn> a(dsb $$0, dbx $$1, iz $$2, boolean $$3) {
      return dhf.b::b;
   }

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
      return e;
   }

   @Override
   protected dle a_(dsb $$0) {
      return dle.b;
   }

   @Override
   public dsb a(cxz $$0) {
      enu $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == env.c));
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      crf $$5 = $$3.gp();
      dpg $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dqb) {
         iz $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqt.a($$1.B);
         } else if ($$1.B) {
            return bqt.a;
         } else {
            dqb $$8 = (dqb)$$6;
            $$5.a($$8);
            $$3.a(new brd(($$1x, $$2x, $$3x) -> cqa.a($$1x, $$2x, $$5), f));
            $$3.a(awj.aj);
            cln.a($$3, true);
            return bqt.c;
         }
      } else {
         return bqt.a($$1.B);
      }
   }

   @Override
   public dpg a(iz $$0, dsb $$1) {
      return new dqb($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpg> dph<T> a(dbx $$0, dsb $$1, dpi<T> $$2) {
      return $$0.B ? a($$2, dpi.d, dqb::a) : null;
   }

   @Override
   public void a(dsb $$0, dbx $$1, iz $$2, azg $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(li.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected enu b_(dsb $$0) {
      return $$0.c(d) ? env.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, env.c, env.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      dpg $$4 = $$1.c_($$2);
      if ($$4 instanceof dqb) {
         ((dqb)$$4).b();
      }
   }
}
