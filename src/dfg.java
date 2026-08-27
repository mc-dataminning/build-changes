import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfg extends cwp {
   public static final MapCodec<dfg> a = b(dfg::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final eml g = cwp.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final eml h = cwp.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dkg e = djw.aE;
   public static final dkg f = djw.aD;

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   public dfg(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(cto $$0, hx $$1, djg $$2, blu $$3) {
      if (!$$3.bT()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cto $$0, djg $$1, hx $$2, blu $$3, float $$4) {
      if (!($$3 instanceof cdh)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(cto $$0, djg $$1, hx $$2, blu $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(cwr.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(cto $$0, hx $$1, djg $$2) {
      $$0.a(null, $$1, arr.zl, ars.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dnq.f, $$1, dnq.a.a($$2));
         $$0.c(2001, $$1, cwp.i($$2));
      }
   }

   @Override
   public void b(djg $$0, and $$1, hx $$2, auu $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, arr.zm, ars.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dnq.c, $$2, dnq.a.a($$0));
         } else {
            $$1.a(null, $$2, arr.zn, ars.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dnq.f, $$2, dnq.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, cwp.i($$0));
               byy $$6 = bly.be.a((cto)$$1);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(csu $$0, hx $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(csu $$0, hx $$1) {
      return $$0.a_($$1).a(asg.H);
   }

   @Override
   public void b(djg $$0, cto $$1, hx $$2, djg $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2005, $$2, 0);
      }
   }

   private boolean a(cto $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(cto $$0, cfh $$1, hx $$2, djg $$3, @Nullable dgu $$4, cmx $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   public boolean a(djg $$0, cpg $$1) {
      return !$$1.h() && $$1.n().a(this.k()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public djg a(cpg $$0) {
      djg $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   public eml a(djg $$0, csu $$1, hx $$2, elx $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(e, f);
   }

   private boolean a(cto $$0, blu $$1) {
      if ($$1 instanceof byy || $$1 instanceof bxs) {
         return false;
      } else {
         return !($$1 instanceof bmk) ? false : $$1 instanceof cfh || $$0.Z().b(ctk.c);
      }
   }
}
