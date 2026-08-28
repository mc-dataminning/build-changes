import com.google.common.collect.Lists;
import java.util.List;

public class cst extends cqq {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final crd v;
   private final crk w = crk.a();
   private final dds x;
   private List<czv<daq>> y = Lists.newArrayList();
   private cvl z = cvl.k;
   long A;
   final csn o;
   final csn p;
   Runnable B = () -> {
   };
   public final brd q = new brr(1) {
      @Override
      public void e() {
         super.e();
         cst.this.a(this);
         cst.this.B.run();
      }
   };
   final csi C = new csi();

   public cst(int $$0, cno $$1) {
      this($$0, $$1, crd.a);
   }

   public cst(int $$0, cno $$1, final crd $$2) {
      super(crz.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dS();
      this.o = this.a(new csn(this.q, 0, 20, 33));
      this.p = this.a(new csn(this.C, 1, 143, 33) {
         @Override
         public boolean a(cvl $$0) {
            return false;
         }

         @Override
         public void a(cnp $$0, cvl $$1) {
            $$1.a($$0.dS(), $$0, $$1.J());
            cst.this.C.a($$0, this.j());
            cvl $$2 = cst.this.o.a(1);
            if (!$$2.f()) {
               cst.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.aa();
               if (cst.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awd.AB, awe.e, 1.0F, 1.0F);
                  cst.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cvl> j() {
            return List.of(cst.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public List<czv<daq>> m() {
      return this.y;
   }

   public int n() {
      return this.y.size();
   }

   public boolean o() {
      return this.o.h() && !this.y.isEmpty();
   }

   @Override
   public boolean b(cnp $$0) {
      return a(this.v, $$0, dgx.oc);
   }

   @Override
   public boolean a(cnp $$0, int $$1) {
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
   public void a(brd $$0) {
      cvl $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.u();
         this.a($$0, $$1);
      }
   }

   private static daj c(brd $$0) {
      return new daj($$0.a(0));
   }

   private void a(brd $$0, cvl $$1) {
      this.y.clear();
      this.w.a(-1);
      this.p.f(cvl.k);
      if (!$$1.f()) {
         this.y = this.x.r().b(czz.f, c($$0), this.x);
      }
   }

   void p() {
      if (!this.y.isEmpty() && this.e(this.w.b())) {
         czv<daq> $$0 = this.y.get(this.w.b());
         cvl $$1 = $$0.b().a(c(this.q), this.x.F_());
         if ($$1.a(this.x.J())) {
            this.C.a($$0);
            this.p.f($$1);
         } else {
            this.p.f(cvl.k);
         }
      } else {
         this.p.f(cvl.k);
      }

      this.d();
   }

   @Override
   public crz<?> a() {
      return crz.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cvl $$0, csn $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cvl b(cnp $$0, int $$1) {
      cvl $$2 = cvl.k;
      csn $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvl $$4 = $$3.g();
         cvg $$5 = $$4.h();
         $$2 = $$4.u();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dS(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cvl.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cvl.k;
            }
         } else if (this.x.r().a(czz.f, new daj($$4), this.x).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cvl.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cvl.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cvl.k;
         }

         if ($$4.f()) {
            $$3.e(cvl.k);
         }

         $$3.c();
         if ($$4.J() == $$2.J()) {
            return cvl.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cnp $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
