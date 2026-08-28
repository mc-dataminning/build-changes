import java.util.Optional;
import javax.annotation.Nullable;

public class duw extends duq implements bsr {
   private static final int a = 2;
   private static final int b = 4;
   private final jz<cxg> c = jz.a(4, cxg.j);
   private final int[] d = new int[4];
   private final int[] e = new int[4];

   public duw(jh $$0, dxo $$1) {
      super(dus.H, $$0, $$1);
   }

   public static void a(arx $$0, jh $$1, dxo $$2, duw $$3, dcc.a<dco, dbg> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.c.size(); $$6++) {
         cxg $$7 = $$3.c.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.d[$$6]++;
            if ($$3.d[$$6] >= $$3.e[$$6]) {
               dco $$8 = new dco($$7);
               cxg $$9 = $$4.a($$8, $$0).map($$2x -> ((dbg)$$2x.b()).a($$8, $$0.K_())).orElse($$7);
               if ($$9.a($$0.K())) {
                  bsw.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
                  $$3.c.set($$6, cxg.j);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(eck.c, $$1, eck.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgz $$0, jh $$1, dxo $$2, duw $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = azu.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dgz $$0, jh $$1, dxo $$2, duw $$3) {
      bac $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dks.a($$0, $$1, $$2.c(dks.d), false);
         }
      }

      int $$6 = $$2.c(dks.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jm $$8 = jm.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(ls.ag, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jz<cxg> b() {
      return this.c;
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bsu.b($$0, this.c, $$1);
      if ($$0.b("CookingTimes", 11)) {
         int[] $$2 = $$0.n("CookingTimes");
         System.arraycopy($$2, 0, this.d, 0, Math.min(this.e.length, $$2.length));
      }

      if ($$0.b("CookingTotalTimes", 11)) {
         int[] $$3 = $$0.n("CookingTotalTimes");
         System.arraycopy($$3, 0, this.e, 0, Math.min(this.e.length, $$3.length));
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      bsu.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public acn c() {
      return acn.a(this);
   }

   @Override
   public um a(js.a $$0) {
      um $$1 = new um();
      bsu.a($$1, this.c, true, $$0);
      return $$1;
   }

   public boolean a(arx $$0, @Nullable bvx $$1, cxg $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cxg $$4 = this.c.get($$3);
         if ($$4.f()) {
            Optional<dca<dbg>> $$5 = $$0.t().a(dcg.e, new dco($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.e[$$3] = $$5.get().b().d();
            this.d[$$3] = 0;
            this.c.set($$3, $$2.b(1, $$1));
            $$0.a(eck.c, this.aB_(), eck.a.a($$1, this.m()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aB_(), this.m(), this.m(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public void d() {
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void a(duq.b $$0) {
      super.a($$0);
      $$0.a(ku.al, czy.a).a(this.b());
   }

   @Override
   protected void a(kq.a $$0) {
      super.a($$0);
      $$0.a(ku.al, czy.a(this.b()));
   }

   @Override
   public void a(um $$0) {
      $$0.r("Items");
   }
}
