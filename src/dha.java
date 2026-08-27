import java.util.Optional;
import javax.annotation.Nullable;

public class dha extends dgu implements bjr {
   private static final int a = 2;
   private static final int b = 4;
   private final iq<cmx> c = iq.a(4, cmx.f);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cqe.a<bjt, cpp> f = cqe.b(cqg.e);

   public dha(hx $$0, djg $$1) {
      super(dgw.G, $$0, $$1);
   }

   public static void a(cto $$0, hx $$1, djg $$2, dha $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cmx $$6 = $$3.c.get($$5);
         if (!$$6.b()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bjt $$7 = new bki($$6);
               cmx $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cpp)$$2x.b()).a($$7, $$0.I_())).orElse($$6);
               if ($$8.a($$0.I())) {
                  bjw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cmx.f);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dnq.c, $$1, dnq.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(cto $$0, hx $$1, djg $$2, dha $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = aun.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(cto $$0, hx $$1, djg $$2, dha $$3) {
      auu $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            cxd.a($$0, $$1, $$2.c(cxd.d), false);
         }
      }

      int $$6 = $$2.c(cxd.f).e();

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

   public iq<cmx> c() {
      return this.c;
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.c.clear();
      bju.b($$0, this.c);
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
      bju.a($$0, this.c, true);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public zh d() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      sn $$0 = new sn();
      bju.a($$0, this.c, true);
      return $$0;
   }

   public Optional<cqd<cpp>> a(cmx $$0) {
      return this.c.stream().noneMatch(cmx::b) ? Optional.empty() : this.f.a(new bki($$0), this.o);
   }

   public boolean a(@Nullable blu $$0, cmx $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cmx $$4 = this.c.get($$3);
         if ($$4.b()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dnq.c, this.aB_(), dnq.a.a($$0, this.r()));
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
