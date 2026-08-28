import java.util.List;
import java.util.Optional;

public class cve extends ctb {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cto v;
   final ctv w = ctv.a();
   private final dhh x;
   private dcq.b<ddd> y = dcq.b.a();
   private cxo z = cxo.j;
   long A;
   final cuy o;
   final cuy p;
   Runnable B = () -> {
   };
   public final btb q = new btp(1) {
      @Override
      public void e() {
         super.e();
         cve.this.a(this);
         cve.this.B.run();
      }
   };
   final cut C = new cut();

   public cve(int $$0, cpv $$1) {
      this($$0, $$1, cto.a);
   }

   public cve(int $$0, cpv $$1, final cto $$2) {
      super(cuk.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dW();
      this.o = this.a(new cuy(this.q, 0, 20, 33));
      this.p = this.a(new cuy(this.C, 1, 143, 33) {
         @Override
         public boolean a(cxo $$0) {
            return false;
         }

         @Override
         public void a(cpw $$0, cxo $$1) {
            $$1.a($$0.dW(), $$0, $$1.L());
            cve.this.C.a($$0, this.j());
            cxo $$2 = cve.this.o.a(1);
            if (!$$2.f()) {
               cve.this.f(cve.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ac();
               if (cve.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, axf.AU, axg.e, 1.0F, 1.0F);
                  cve.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cxo> j() {
            return List.of(cve.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dcq.b<ddd> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cpw $$0) {
      return a(this.v, $$0, dkn.ox);
   }

   @Override
   public boolean a(cpw $$0, int $$1) {
      if (this.e($$1)) {
         this.w.a($$1);
         this.f($$1);
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.y.d();
   }

   @Override
   public void a(btb $$0) {
      cxo $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cxo $$0) {
      this.w.a(-1);
      this.p.f(cxo.j);
      if (!$$0.f()) {
         this.y = this.x.P().a().b($$0);
      } else {
         this.y = dcq.b.a();
      }
   }

   void f(int $$0) {
      Optional<dci<ddd>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dcq.a<ddd> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((ddd)$$0x.b()).a(new dcw(this.q.a(0)), this.x.K_()));
      }, () -> {
         this.p.f(cxo.j);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cuk<?> a() {
      return cuk.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cxo $$0, cuy $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cxo b(cpw $$0, int $$1) {
      cxo $$2 = cxo.j;
      cuy $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxo $$4 = $$3.g();
         cxk $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dW(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cxo.j;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cxo.j;
            }
         } else if (this.x.P().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cxo.j;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cxo.j;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cxo.j;
         }

         if ($$4.f()) {
            $$3.e(cxo.j);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cxo.j;
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
   public void a(cpw $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
