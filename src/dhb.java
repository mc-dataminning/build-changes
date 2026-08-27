import java.util.Optional;
import javax.annotation.Nullable;

public class dhb extends dgv implements bjs {
   private static final int a = 2;
   private static final int b = 4;
   private final iq<cmy> c = iq.a(4, cmy.f);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cqf.a<bju, cpq> f = cqf.b(cqh.e);

   public dhb(hx $$0, djh $$1) {
      super(dgx.G, $$0, $$1);
   }

   public static void a(ctp $$0, hx $$1, djh $$2, dhb $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cmy $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bju $$7 = new bkj($$6);
               cmy $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cpq)$$2x.b()).a($$7, $$0.I_())).orElse($$6);
               if ($$8.a($$0.I())) {
                  bjx.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cmy.f);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dnr.c, $$1, dnr.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(ctp $$0, hx $$1, djh $$2, dhb $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = auo.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(ctp $$0, hx $$1, djh $$2, dhb $$3) {
      auv $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            cxe.a($$0, $$1, $$2.c(cxe.d), false);
         }
      }

      int $$6 = $$2.c(cxe.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).b() && $$4.i() < 0.2F) {
            ic $$8 = ic.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(jx.ab, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public iq<cmy> c() {
      return this.c;
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c.clear();
      bjv.b($$0, this.c);
      if ($$0.b("CookingTimes", 11)) {
         int[] $$1 = $$0.n("CookingTimes");
         System.arraycopy($$1, 0, this.d, 0, Math.min(this.e.length, $$1.length));
      }

      if ($$0.b("CookingTotalTimes", 11)) {
         int[] $$2 = $$0.n("CookingTotalTimes");
         System.arraycopy($$2, 0, this.e, 0, Math.min(this.e.length, $$2.length));
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      bjv.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public zh d() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      sn $$0 = new sn();
      bjv.a($$0, this.c, true);
      return $$0;
   }

   public Optional<cqe<cpq>> a(cmy $$0) {
      return this.c.stream().noneMatch(cmy::b) ? Optional.empty() : this.f.a(new bkj($$0), this.o);
   }

   public boolean a(@Nullable blv $$0, cmy $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cmy $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dnr.c, this.aB_(), dnr.a.a($$0, this.r()));
            this.g();
            return true;
         }
      }

      return false;
   }

   private void g() {
      this.e();
      this.i().a(this.aB_(), this.r(), this.r(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public void f() {
      if (this.o != null) {
         this.g();
      }
   }
}
