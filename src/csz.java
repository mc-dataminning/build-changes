import com.google.common.collect.Lists;
import java.util.List;

public class csz extends cqw {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final crj v;
   private final crq w = crq.a();
   private final deg x;
   private List<daj<dbe>> y = Lists.newArrayList();
   private cvp z = cvp.k;
   long A;
   final cst o;
   final cst p;
   Runnable B = () -> {
   };
   public final bri q = new brw(1) {
      @Override
      public void e() {
         super.e();
         csz.this.a(this);
         csz.this.B.run();
      }
   };
   final cso C = new cso();

   public csz(int $$0, cnt $$1) {
      this($$0, $$1, crj.a);
   }

   public csz(int $$0, cnt $$1, final crj $$2) {
      super(csf.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dS();
      this.o = this.a(new cst(this.q, 0, 20, 33));
      this.p = this.a(new cst(this.C, 1, 143, 33) {
         @Override
         public boolean a(cvp $$0) {
            return false;
         }

         @Override
         public void a(cnu $$0, cvp $$1) {
            $$1.a($$0.dS(), $$0, $$1.J());
            csz.this.C.a($$0, this.j());
            cvp $$2 = csz.this.o.a(1);
            if (!$$2.f()) {
               csz.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.aa();
               if (csz.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awe.AB, awf.e, 1.0F, 1.0F);
                  csz.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cvp> j() {
            return List.of(csz.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public List<daj<dbe>> m() {
      return this.y;
   }

   public int n() {
      return this.y.size();
   }

   public boolean o() {
      return this.o.h() && !this.y.isEmpty();
   }

   @Override
   public boolean b(cnu $$0) {
      return a(this.v, $$0, dhl.oc);
   }

   @Override
   public boolean a(cnu $$0, int $$1) {
      if (this.e($$1)) {
         this.w.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.y.size();
   }

   @Override
   public void a(bri $$0) {
      cvp $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.u();
         this.a($$0, $$1);
      }
   }

   private static dax c(bri $$0) {
      return new dax($$0.a(0));
   }

   private void a(bri $$0, cvp $$1) {
      this.y.clear();
      this.w.a(-1);
      this.p.f(cvp.k);
      if (!$$1.f()) {
         this.y = this.x.r().b(dan.f, c($$0), this.x);
      }
   }

   void p() {
      if (!this.y.isEmpty() && this.e(this.w.b())) {
         daj<dbe> $$0 = this.y.get(this.w.b());
         cvp $$1 = $$0.b().a(c(this.q), this.x.F_());
         if ($$1.a(this.x.J())) {
            this.C.a($$0);
            this.p.f($$1);
         } else {
            this.p.f(cvp.k);
         }
      } else {
         this.p.f(cvp.k);
      }

      this.d();
   }

   @Override
   public csf<?> a() {
      return csf.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cvp $$0, cst $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cvp b(cnu $$0, int $$1) {
      cvp $$2 = cvp.k;
      cst $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvp $$4 = $$3.g();
         cvk $$5 = $$4.h();
         $$2 = $$4.u();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dS(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cvp.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cvp.k;
            }
         } else if (this.x.r().a(dan.f, new dax($$4), this.x).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cvp.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cvp.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cvp.k;
         }

         if ($$4.f()) {
            $$3.e(cvp.k);
         }

         $$3.c();
         if ($$4.J() == $$2.J()) {
            return cvp.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cnu $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
