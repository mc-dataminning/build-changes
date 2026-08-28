import java.util.List;
import java.util.Optional;

public class cva extends csx {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final ctk v;
   final ctr w = ctr.a();
   private final dha x;
   private dcl.b<dcy> y = dcl.b.a();
   private cxk z = cxk.k;
   long A;
   final cuu o;
   final cuu p;
   Runnable B = () -> {
   };
   public final bsx q = new btl(1) {
      @Override
      public void e() {
         super.e();
         cva.this.a(this);
         cva.this.B.run();
      }
   };
   final cup C = new cup();

   public cva(int $$0, cpr $$1) {
      this($$0, $$1, ctk.a);
   }

   public cva(int $$0, cpr $$1, final ctk $$2) {
      super(cug.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dV();
      this.o = this.a(new cuu(this.q, 0, 20, 33));
      this.p = this.a(new cuu(this.C, 1, 143, 33) {
         @Override
         public boolean a(cxk $$0) {
            return false;
         }

         @Override
         public void a(cps $$0, cxk $$1) {
            $$1.a($$0.dV(), $$0, $$1.L());
            cva.this.C.a($$0, this.j());
            cxk $$2 = cva.this.o.a(1);
            if (!$$2.f()) {
               cva.this.f(cva.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ac();
               if (cva.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, axf.AT, axg.e, 1.0F, 1.0F);
                  cva.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cxk> j() {
            return List.of(cva.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dcl.b<dcy> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(cps $$0) {
      return a(this.v, $$0, dkg.ox);
   }

   @Override
   public boolean a(cps $$0, int $$1) {
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
   public void a(bsx $$0) {
      cxk $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(cxk $$0) {
      this.w.a(-1);
      this.p.f(cxk.k);
      if (!$$0.f()) {
         this.y = this.x.P().a().b($$0);
      } else {
         this.y = dcl.b.a();
      }
   }

   void f(int $$0) {
      Optional<dcd<dcy>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dcl.a<dcy> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dcy)$$0x.b()).a(new dcr(this.q.a(0)), this.x.K_()));
      }, () -> {
         this.p.f(cxk.k);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cug<?> a() {
      return cug.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cxk $$0, cuu $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cxk b(cps $$0, int $$1) {
      cxk $$2 = cxk.k;
      cuu $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cxk $$4 = $$3.g();
         cxg $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cxk.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cxk.k;
            }
         } else if (this.x.P().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return cxk.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cxk.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cxk.k;
         }

         if ($$4.f()) {
            $$3.e(cxk.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cxk.k;
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
   public void a(cps $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
