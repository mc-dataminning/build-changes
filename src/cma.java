import com.google.common.collect.Lists;
import java.util.List;

public class cma extends ckb {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final ckm t;
   private final ckt u = ckt.a();
   private final cvn v;
   private List<csd<csv>> w = Lists.newArrayList();
   private coz x = coz.h;
   long y;
   final clw m;
   final clw n;
   Runnable z = () -> {
   };
   public final bln o = new bmd(1) {
      @Override
      public void e() {
         super.e();
         cma.this.a(this);
         cma.this.z.run();
      }
   };
   final clr A = new clr();

   public cma(int $$0, chg $$1) {
      this($$0, $$1, ckm.a);
   }

   public cma(int $$0, chg $$1, final ckm $$2) {
      super(cli.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new clw(this.o, 0, 20, 33));
      this.n = this.a(new clw(this.A, 1, 143, 33) {
         @Override
         public boolean a(coz $$0) {
            return false;
         }

         @Override
         public void a(chh $$0, coz $$1) {
            $$1.a($$0.dM(), $$0, $$1.M());
            cma.this.A.a($$0, this.j());
            coz $$2 = cma.this.m.a(1);
            if (!$$2.b()) {
               cma.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.X();
               if (cma.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, atk.zN, atl.e, 1.0F, 1.0F);
                  cma.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<coz> j() {
            return List.of(cma.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new clw($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new clw($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<csd<csv>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(chh $$0) {
      return a(this.t, $$0, cyq.oc);
   }

   @Override
   public boolean b(chh $$0, int $$1) {
      if (this.e($$1)) {
         this.u.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.w.size();
   }

   @Override
   public void a(bln $$0) {
      coz $$1 = this.m.g();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.q();
         this.a($$0, $$1);
      }
   }

   private void a(bln $$0, coz $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(coz.h);
      if (!$$1.b()) {
         this.w = this.v.r().b(csg.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         csd<csv> $$0 = this.w.get(this.u.b());
         coz $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.I())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(coz.h);
         }
      } else {
         this.n.f(coz.h);
      }

      this.d();
   }

   @Override
   public cli<?> a() {
      return cli.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(coz $$0, clw $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public coz a(chh $$0, int $$1) {
      coz $$2 = coz.h;
      clw $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         coz $$4 = $$3.g();
         cou $$5 = $$4.d();
         $$2 = $$4.q();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return coz.h;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return coz.h;
            }
         } else if (this.v.r().a(csg.f, new bmd($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return coz.h;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return coz.h;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return coz.h;
         }

         if ($$4.b()) {
            $$3.e(coz.h);
         }

         $$3.b();
         if ($$4.M() == $$2.M()) {
            return coz.h;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(chh $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
