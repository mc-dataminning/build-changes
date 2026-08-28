import java.util.List;
import java.util.Optional;

public class cxi extends cvf {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cvs v;
   final cvz w = cvz.a();
   private final djm x;
   private der.b<dfe> y = der.b.a();
   private czn z = czn.k;
   long A;
   final cxc o;
   final cxc p;
   Runnable B = () -> {
   };
   public final btz q = new bun(1) {
      @Override
      public void e() {
         super.e();
         cxi.this.a(this);
         cxi.this.B.run();
      }
   };
   final cwx C = new cwx();

   public cxi(int $$0, crl $$1) {
      this($$0, $$1, cvs.a);
   }

   public cxi(int $$0, crl $$1, final cvs $$2) {
      super(cwo.y, $$0);
      this.v = $$2;
      this.x = $$1.h.dU();
      this.o = this.a(new cxc(this.q, 0, 20, 33));
      this.p = this.a(new cxc(this.C, 1, 143, 33) {
         @Override
         public boolean a(czn $$0) {
            return false;
         }

         @Override
         public void a(crm $$0, czn $$1) {
            $$1.a($$0.dU(), $$0, $$1.M());
            cxi.this.C.a($$0, this.j());
            czn $$2 = cxi.this.o.a(1);
            if (!$$2.f()) {
               cxi.this.f(cxi.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ae();
               if (cxi.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awn.Bz, awo.e, 1.0F, 1.0F);
                  cxi.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<czn> j() {
            return List.of(cxi.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public der.b<dfe> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(crm $$0) {
      return a(this.v, $$0, dmt.oI);
   }

   @Override
   public boolean a(crm $$0, int $$1) {
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
      czn $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(czn $$0) {
      this.w.a(-1);
      this.p.f(czn.k);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = der.b.a();
      }
   }

   void f(int $$0) {
      Optional<dej<dfe>> $$2;
      if (!this.y.c() && this.e($$0)) {
         der.a<dfe> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dfe)$$0x.b()).a(new dex(this.q.a(0)), this.x.F_()));
      }, () -> {
         this.p.f(czn.k);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cwo<?> a() {
      return cwo.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(czn $$0, cxc $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public czn b(crm $$0, int $$1) {
      czn $$2 = czn.k;
      cxc $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czn $$4 = $$3.g();
         czj $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dU(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return czn.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return czn.k;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return czn.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return czn.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return czn.k;
         }

         if ($$4.f()) {
            $$3.e(czn.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return czn.k;
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
   public void a(crm $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
