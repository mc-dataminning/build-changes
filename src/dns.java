import java.util.Optional;
import javax.annotation.Nullable;

public class dns extends dnm implements bpd {
   private static final int a = 2;
   private static final int b = 4;
   private final jf<csz> c = jf.a(4, csz.i);
   private final int[] d = new int[4];
   private final int[] e = new int[4];
   private final cxg.a<bpf, cwr> f = cxg.b(cxi.e);

   public dns(in $$0, dqh $$1) {
      super(dno.G, $$0, $$1);
   }

   public static void a(dad $$0, in $$1, dqh $$2, dns $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         csz $$6 = $$3.c.get($$5);
         if (!$$6.d()) {
            $$4 = true;
            $$3.d[$$5]++;
            if ($$3.d[$$5] >= $$3.e[$$5]) {
               bpf $$7 = new bpv($$6);
               csz $$8 = $$3.f.a($$7, $$0).map($$2x -> ((cwr)$$2x.b()).a($$7, $$0.H_())).orElse($$6);
               if ($$8.a($$0.J())) {
                  bpi.a($$0, (double)$$1.u(), (double)$$1.v(), (double)$$1.w(), $$8);
                  $$3.c.set($$5, csz.i);
                  $$0.a($$1, $$2, $$2, 3);
                  $$0.a(dva.c, $$1, dva.a.a($$2));
               }
            }
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void b(dad $$0, in $$1, dqh $$2, dns $$3) {
      boolean $$4 = false;

      for (int $$5 = 0; $$5 < $$3.c.size(); $$5++) {
         if ($$3.d[$$5] > 0) {
            $$4 = true;
            $$3.d[$$5] = axz.a($$3.d[$$5] - 2, 0, $$3.e[$$5]);
         }
      }

      if ($$4) {
         a($$0, $$1, $$2);
      }
   }

   public static void c(dad $$0, in $$1, dqh $$2, dns $$3) {
      ayg $$4 = $$0.z;
      if ($$4.i() < 0.11F) {
         for (int $$5 = 0; $$5 < $$4.a(2) + 2; $$5++) {
            dds.a($$0, $$1, $$2.c(dds.d), false);
         }
      }

      int $$6 = $$2.c(dds.f).e();

      for (int $$7 = 0; $$7 < $$3.c.size(); $$7++) {
         if (!$$3.c.get($$7).d() && $$4.i() < 0.2F) {
            is $$8 = is.b(Math.floorMod($$7 + $$6, 4));
            float $$9 = 0.3125F;
            double $$10 = (double)$$1.u() + 0.5 - (double)((float)$$8.j() * 0.3125F) + (double)((float)$$8.h().j() * 0.3125F);
            double $$11 = (double)$$1.v() + 0.5;
            double $$12 = (double)$$1.w() + 0.5 - (double)((float)$$8.l() * 0.3125F) + (double)((float)$$8.h().l() * 0.3125F);

            for (int $$13 = 0; $$13 < 4; $$13++) {
               $$0.a(kx.ab, $$10, $$11, $$12, 0.0, 5.0E-4, 0.0);
            }
         }
      }
   }

   public jf<csz> b() {
      return this.c;
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.c.clear();
      bpg.b($$0, this.c, $$1);
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
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      bpg.a($$0, this.c, true, $$1);
      $$0.a("CookingTimes", this.d);
      $$0.a("CookingTotalTimes", this.e);
   }

   public abt c() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      ua $$1 = new ua();
      bpg.a($$1, this.c, true, $$0);
      return $$1;
   }

   public Optional<cxf<cwr>> a(csz $$0) {
      return this.c.stream().noneMatch(csz::d) ? Optional.empty() : this.f.a(new bpv($$0), this.n);
   }

   public boolean a(@Nullable brh $$0, csz $$1, int $$2) {
      for (int $$3 = 0; $$3 < this.c.size(); $$3++) {
         csz $$4 = this.c.get($$3);
         if ($$4.d()) {
            this.e[$$3] = $$2;
            this.d[$$3] = 0;
            this.c.set($$3, $$1.a(1));
            this.n.a(dva.c, this.az_(), dva.a.a($$0, this.n()));
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
   public void a(jw $$0) {
      $$0.a(ka.X, cvt.a).a(this.b());
   }

   @Override
   public void a(jw.a $$0) {
      $$0.a(ka.X, cvt.a(this.b()));
   }

   @Override
   public void a(ua $$0) {
      $$0.r("Items");
   }
}
