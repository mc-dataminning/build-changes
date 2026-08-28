import java.util.Optional;
import javax.annotation.Nullable;

public class duf extends dtz implements bsa {
   private static final int a = 2;
   private static final int b = 4;
   private final ka<cwp> c = ka.a(4, cwp.j);
   private final int[] d = new int[4];
   private final int[] e = new int[4];

   public duf(ji $$0, dwx $$1) {
      super(dub.H, $$0, $$1);
   }

   public static void a(arc $$0, ji $$1, dwx $$2, duf $$3, dbl.a<dbx, dap> $$4) {
      boolean $$5 = false;

      for (int $$6 = 0; $$6 < $$3.c.size(); $$6++) {
         cwp $$7 = $$3.c.get($$6);
         if (!$$7.f()) {
            $$5 = true;
            $$3.d[$$6]++;
            if ($$3.d[$$6] >= $$3.e[$$6]) {
               dbx $$8 = new dbx($$7);
               cwp $$9 = $$4.a($$8, $$0).map($$2x -> ((dap)$$2x.b()).a($$8, $$0.K_())).orElse($$7);
               if ($$9.a($$0.K())) {
                  bsf.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$9);
                  $$3.c.set($$6, cwp.j);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(ebt.c, $$1, ebt.a.a($$2));
               }
            }
         }
      }

      if ($$5) {
         a($$0, $$1, $$2);
      }
   }

   public static void a(dgi $$0, ji $$1, dwx $$2, duf $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = ayz.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dgi $$0, ji $$1, dwx $$2, duf $$3) {
      azh $$4 = $$0.A;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dkb.a($$0, $$1, $$2.c(dkb.d), false);
         }
      }

      int $$6 = $$2.c(dkb.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).f() && $$4.i() < 0.2F) {
            jn $$8 = jn.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lt.ag, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public ka<cwp> b() {
      return this.c;
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bsd.b($$0, this.c, $$1);
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
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      bsd.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public abr c() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      tq $$1 = new tq();
      bsd.a($$1, this.c, true, $$0);
      return $$1;
   }

   public boolean a(arc $$0, @Nullable bvg $$1, cwp $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cwp $$4 = this.c.get($$3);
         if ($$4.f()) {
            Optional<dbj<dap>> $$5 = $$0.t().a(dbp.e, new dbx($$2), $$0);
            if ($$5.isEmpty()) {
               return false;
            }

            this.e[$$3] = $$5.get().b().d();
            this.d[$$3] = 0;
            this.c.set($$3, $$2.b(1, $$1));
            $$0.a(ebt.c, this.aA_(), ebt.a.a($$1, this.m()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aA_(), this.m(), this.m(), 3);
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
   protected void a(dtz.b $$0) {
      super.a($$0);
      $$0.a(kv.al, czh.a).a(this.b());
   }

   @Override
   protected void a(kr.a $$0) {
      super.a($$0);
      $$0.a(kv.al, czh.a(this.b()));
   }

   @Override
   public void a(tq $$0) {
      $$0.r("Items");
   }
}
