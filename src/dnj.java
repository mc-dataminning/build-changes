import java.util.Optional;
import javax.annotation.Nullable;

public class dnj extends dnd implements boh {
   private static final int a = 2;
   private static final int b = 4;
   private final je<csd> c = je.a(4, csd.i);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cwj.a<boj, cvu> f = cwj.b(cwl.e);

   public dnj(im $$0, dpy $$1) {
      super(dnf.G, $$0, $$1);
   }

   public static void a(czu $$0, im $$1, dpy $$2, dnj $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         csd $$6 = $$3.c.get($$5);
         if (!$$6.d()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               boj $$7 = new boz($$6);
               csd $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cvu)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bom.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, csd.i);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dur.c, $$1, dur.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(czu $$0, im $$1, dpy $$2, dnj $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = axw.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(czu $$0, im $$1, dpy $$2, dnj $$3) {
      ayd $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            ddj.a($$0, $$1, $$2.c(ddj.d), false);
         }
      }

      int $$6 = $$2.c(ddj.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).d() && $$4.i() < 0.2F) {
            ir $$8 = ir.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(kw.ab, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public je<csd> b() {
      return this.c;
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bok.b($$0, this.c, $$1);
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
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      bok.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public abr c() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      ty $$1 = new ty();
      bok.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<cwi<cvu>> a(csd $$0) {
      return this.c.stream().noneMatch(csd::d) ? Optional.empty() : this.f.a(new boz($$0), this.o);
   }

   public boolean a(@Nullable bql $$0, csd $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         csd $$4 = this.c.get($$3);
         if ($$4.d()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.o.a(dur.c, this.az_(), dur.a.a($$0, this.n()));
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
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   public void a(jv $$0) {
      $$0.a(jz.Q, cux.a).a(this.b());
   }

   @Override
   public void a(jv.a $$0) {
      $$0.a(jz.Q, cux.a(this.b()));
   }

   @Override
   public void a(ty $$0) {
      $$0.r("Items");
   }
}
