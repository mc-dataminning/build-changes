import java.util.Optional;
import javax.annotation.Nullable;

public class dpv extends dpp implements bpx {
   private static final int a = 2;
   private static final int b = 4;
   private final js<cuc> c = js.a(4, cuc.l);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cym.a<cyy, cxv> f = cym.b(cyo.e);

   public dpv(ja $$0, dsk $$1) {
      super(dpr.G, $$0, $$1);
   }

   public static void a(dcf $$0, ja $$1, dsk $$2, dpv $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         cuc $$6 = $$3.c.get($$5);
         if (!$$6.e()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               cyy $$7 = new cyy($$6);
               cuc $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cxv)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bqc.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, cuc.l);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dxg.c, $$1, dxg.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dcf $$0, ja $$1, dsk $$2, dpv $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = ayg.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dcf $$0, ja $$1, dsk $$2, dpv $$3) {
      ayo $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dfv.a($$0, $$1, $$2.c(dfv.d), false);
         }
      }

      int $$6 = $$2.c(dfv.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).e() && $$4.i() < 0.2F) {
            jf $$8 = jf.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(lj.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public js<cuc> b() {
      return this.c;
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bqa.b($$0, this.c, $$1);
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
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      bqa.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public abu c() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      tx $$1 = new tx();
      bqa.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<cyk<cxv>> b(cuc $$0) {
      return this.c.stream().noneMatch(cuc::e) ? Optional.empty() : this.f.a(new cyy($$0), this.n);
   }

   public boolean a(@Nullable btb $$0, cuc $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         cuc $$4 = this.c.get($$3);
         if ($$4.e()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.b(1, $$0));
            this.n.a(dxg.c, this.az_(), dxg.a.a($$0, this.n()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.az_(), this.n(), this.n(), 3);
   }

   @Override
   public void a() {
      this.c.clear();
   }

   public void d() {
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void a(dpp.b $$0) {
      super.a($$0);
      $$0.a(kn.aa, cwx.a).a(this.b());
   }

   @Override
   protected void a(kj.a $$0) {
      super.a($$0);
      $$0.a(kn.aa, cwx.a(this.b()));
   }

   @Override
   public void a(tx $$0) {
      $$0.r("Items");
   }
}
