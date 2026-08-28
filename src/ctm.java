import com.google.common.collect.Lists;
import java.util.List;

public class ctm extends crj {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final crw v;
   private final csd w = csd.a();
   private final dev x;
   private List<dal<dbg>> y = Lists.newArrayList();
   private cvx z = cvx.k;
   long A;
   final ctg o;
   final ctg p;
   Runnable B = () -> {
   };
   public final brr q = new bsf(1) {
      @Override
      public void e() {
         super.e();
         ctm.this.a(this);
         ctm.this.B.run();
      }
   };
   final ctb C = new ctb();

   public ctm(int $$0, cog $$1) {
      this($$0, $$1, crw.a);
   }

   public ctm(int $$0, cog $$1, final crw $$2) {
      super(css.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dX();
      this.o = this.a(new ctg(this.q, 0, 20, 33));
      this.p = this.a(new ctg(this.C, 1, 143, 33) {
         @Override
         public boolean a(cvx $$0) {
            return false;
         }

         @Override
         public void a(coh $$0, cvx $$1) {
            $$1.a($$0.dX(), $$0, $$1.L());
            ctm.this.C.a($$0, this.j());
            cvx $$2 = ctm.this.o.a(1);
            if (!$$2.f()) {
               ctm.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.aa();
               if (ctm.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awk.Az, awl.e, 1.0F, 1.0F);
                  ctm.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cvx> j() {
            return List.of(ctm.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public List<dal<dbg>> m() {
      return this.y;
   }

   public int n() {
      return this.y.size();
   }

   public boolean o() {
      return this.o.h() && !this.y.isEmpty();
   }

   @Override
   public boolean b(coh $$0) {
      return a(this.v, $$0, dia.oc);
   }

   @Override
   public boolean a(coh $$0, int $$1) {
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
   public void a(brr $$0) {
      cvx $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.a($$0, $$1);
      }
   }

   private static daz c(brr $$0) {
      return new daz($$0.a(0));
   }

   private void a(brr $$0, cvx $$1) {
      this.y.clear();
      this.w.a(-1);
      this.p.f(cvx.k);
      if (!$$1.f()) {
         this.y = this.x.r().b(dap.f, c($$0), this.x);
      }
   }

   void p() {
      if (!this.y.isEmpty() && this.e(this.w.b())) {
         dal<dbg> $$0 = this.y.get(this.w.b());
         cvx $$1 = $$0.b().a(c(this.q), this.x.H_());
         if ($$1.a(this.x.J())) {
            this.C.a($$0);
            this.p.f($$1);
         } else {
            this.p.f(cvx.k);
         }
      } else {
         this.p.f(cvx.k);
      }

      this.d();
   }

   @Override
   public css<?> a() {
      return css.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cvx $$0, ctg $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cvx b(coh $$0, int $$1) {
      cvx $$2 = cvx.k;
      ctg $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cvx $$4 = $$3.g();
         cvt $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dX(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cvx.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cvx.k;
            }
         } else if (this.x.r().a(dap.f, new daz($$4), this.x).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cvx.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cvx.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cvx.k;
         }

         if ($$4.f()) {
            $$3.e(cvx.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cvx.k;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(coh $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
