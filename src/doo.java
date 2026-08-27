import java.util.Optional;
import javax.annotation.Nullable;

public class doo extends doi implements bpn {
   private static final int a = 2;
   private static final int b = 4;
   private final jg<ctq> c = jg.a(4, ctq.i);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cxz.a<bpp, cxk> f = cxz.b(cyb.e);

   public doo(io $$0, drd $$1) {
      super(dok.G, $$0, $$1);
   }

   public static void a(daz $$0, io $$1, drd $$2, doo $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         ctq $$6 = $$3.c.get($$5);
         if (!$$6.e()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bpp $$7 = new bqf($$6);
               ctq $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cxk)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bps.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, ctq.i);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dvw.c, $$1, dvw.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(daz $$0, io $$1, drd $$2, doo $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = ayf.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(daz $$0, io $$1, drd $$2, doo $$3) {
      aym $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            deo.a($$0, $$1, $$2.c(deo.d), false);
         }
      }

      int $$6 = $$2.c(deo.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).e() && $$4.i() < 0.2F) {
            it $$8 = it.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(ky.ae, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jg<ctq> b() {
      return this.c;
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bpq.b($$0, this.c, $$1);
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
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      bpq.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public abx c() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      ud $$1 = new ud();
      bpq.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<cxy<cxk>> b(ctq $$0) {
      return this.c.stream().noneMatch(ctq::e) ? Optional.empty() : this.f.a(new bqf($$0), this.n);
   }

   public boolean a(@Nullable brw $$0, ctq $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         ctq $$4 = this.c.get($$3);
         if ($$4.e()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.n.a(dvw.c, this.aA_(), dvw.a.a($$0, this.n()));
            this.f();
            return true;
         }
      }

      return false;
   }

   private void f() {
      this.e();
      this.i().a(this.aA_(), this.n(), this.n(), 3);
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
   protected void a(doi.b $$0) {
      super.a($$0);
      $$0.a(kb.Z, cwm.a).a(this.b());
   }

   @Override
   protected void a(jx.a $$0) {
      super.a($$0);
      $$0.a(kb.Z, cwm.a(this.b()));
   }

   @Override
   public void a(ud $$0) {
      $$0.r("Items");
   }
}
