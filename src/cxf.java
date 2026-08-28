import java.util.List;
import java.util.Optional;

public class cxf extends cvc {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cvp v;
   final cvw w = cvw.a();
   private final djh x;
   private deo.b<dfb> y = deo.b.a();
   private czk z = czk.k;
   long A;
   final cwz o;
   final cwz p;
   Runnable B = () -> {
   };
   public final btz q = new bun(1) {
      @Override
      public void e() {
         super.e();
         cxf.this.a(this);
         cxf.this.B.run();
      }
   };
   final cwu C = new cwu();

   public cxf(int $$0, cri $$1) {
      this($$0, $$1, cvp.a);
   }

   public cxf(int $$0, cri $$1, final cvp $$2) {
      super(cwl.y, $$0);
      this.v = $$2;
      this.x = $$1.h.dU();
      this.o = this.a(new cwz(this.q, 0, 20, 33));
      this.p = this.a(new cwz(this.C, 1, 143, 33) {
         @Override
         public boolean a(czk $$0) {
            return false;
         }

         @Override
         public void a(crj $$0, czk $$1) {
            $$1.a($$0.dU(), $$0, $$1.M());
            cxf.this.C.a($$0, this.j());
            czk $$2 = cxf.this.o.a(1);
            if (!$$2.f()) {
               cxf.this.f(cxf.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ae();
               if (cxf.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awn.Bz, awo.e, 1.0F, 1.0F);
                  cxf.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<czk> j() {
            return List.of(cxf.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public deo.b<dfb> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(crj $$0) {
      return a(this.v, $$0, dmo.oI);
   }

   @Override
   public boolean a(crj $$0, int $$1) {
      if (this.w.b() == $$1) {
         return false;
      } else {
         if (this.e($$1)) {
            this.w.a($$1);
            this.f($$1);
         }

         return true;
      }
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.y.d();
   }

   @Override
   public void a(btz $$0) {
      czk $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(czk $$0) {
      this.w.a(-1);
      this.p.f(czk.k);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = deo.b.a();
      }
   }

   void f(int $$0) {
      Optional<deg<dfb>> $$2;
      if (!this.y.c() && this.e($$0)) {
         deo.a<dfb> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dfb)$$0x.b()).a(new deu(this.q.a(0)), this.x.F_()));
      }, () -> {
         this.p.f(czk.k);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cwl<?> a() {
      return cwl.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(czk $$0, cwz $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public czk b(crj $$0, int $$1) {
      czk $$2 = czk.k;
      cwz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czk $$4 = $$3.g();
         czg $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dU(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return czk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return czk.k;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return czk.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return czk.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return czk.k;
         }

         if ($$4.f()) {
            $$3.e(czk.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return czk.k;
         }

         $$3.a($$0, $$4);
         if ($$1 == 1) {
            $$0.a($$4, false);
         }

         this.d();
      }

      return $$2;
   }

   @Override
   public void a(crj $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
