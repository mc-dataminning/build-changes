import com.google.common.collect.Lists;
import java.util.List;

public class coy extends cmw {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cnh t;
   private final cno u = cno.a();
   private final czg v;
   private List<cvu<cwm>> w = Lists.newArrayList();
   private crs x = crs.i;
   long y;
   final cos m;
   final cos n;
   Runnable z = () -> {
   };
   public final bny o = new boo(1) {
      @Override
      public void e() {
         super.e();
         coy.this.a(this);
         coy.this.z.run();
      }
   };
   final com A = new com();

   public coy(int $$0, cjz $$1) {
      this($$0, $$1, cnh.a);
   }

   public coy(int $$0, cjz $$1, final cnh $$2) {
      super(cod.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dM();
      this.m = this.a(new cos(this.o, 0, 20, 33));
      this.n = this.a(new cos(this.A, 1, 143, 33) {
         @Override
         public boolean a(crs $$0) {
            return false;
         }

         @Override
         public void a(cka $$0, crs $$1) {
            $$1.a($$0.dM(), $$0, $$1.G());
            coy.this.A.a($$0, this.j());
            crs $$2 = coy.this.m.a(1);
            if (!$$2.d()) {
               coy.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Y();
               if (coy.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, auo.zZ, aup.e, 1.0F, 1.0F);
                  coy.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<crs> j() {
            return List.of(coy.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cos($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cos($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cvu<cwm>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cka $$0) {
      return a(this.t, $$0, dcj.oc);
   }

   @Override
   public boolean b(cka $$0, int $$1) {
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
   public void a(bny $$0) {
      crs $$1 = this.m.g();
      if (!$$1.a(this.x.f())) {
         this.x = $$1.r();
         this.a($$0, $$1);
      }
   }

   private void a(bny $$0, crs $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(crs.i);
      if (!$$1.d()) {
         this.w = this.v.r().b(cvx.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cvu<cwm> $$0 = this.w.get(this.u.b());
         crs $$1 = $$0.b().a(this.o, this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(crs.i);
         }
      } else {
         this.n.f(crs.i);
      }

      this.d();
   }

   @Override
   public cod<?> a() {
      return cod.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(crs $$0, cos $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public crs a(cka $$0, int $$1) {
      crs $$2 = crs.i;
      cos $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         crs $$4 = $$3.g();
         crn $$5 = $$4.f();
         $$2 = $$4.r();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dM(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return crs.i;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return crs.i;
            }
         } else if (this.v.r().a(cvx.f, new boo($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return crs.i;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return crs.i;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return crs.i;
         }

         if ($$4.d()) {
            $$3.e(crs.i);
         }

         $$3.b();
         if ($$4.G() == $$2.G()) {
            return crs.i;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cka $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
