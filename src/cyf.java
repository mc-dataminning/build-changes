import java.util.List;
import java.util.Optional;

public class cyf extends cwb {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cwo v;
   final cwv w = cwv.a();
   private final dkj x;
   private dfo.b<dgb> y = dfo.b.a();
   private dak z = dak.l;
   long A;
   final cxz o;
   final cxz p;
   Runnable B = () -> {
   };
   public final buv q = new bvj(1) {
      @Override
      public void e() {
         super.e();
         cyf.this.a(this);
         cyf.this.B.run();
      }
   };
   final cxu C = new cxu();

   public cyf(int $$0, csh $$1) {
      this($$0, $$1, cwo.a);
   }

   public cyf(int $$0, csh $$1, final cwo $$2) {
      super(cxk.y, $$0);
      this.v = $$2;
      this.x = $$1.h.dV();
      this.o = this.a(new cxz(this.q, 0, 20, 33));
      this.p = this.a(new cxz(this.C, 1, 143, 33) {
         @Override
         public boolean a(dak $$0) {
            return false;
         }

         @Override
         public void a(csi $$0, dak $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cyf.this.C.a($$0, this.j());
            dak $$2 = cyf.this.o.a(1);
            if (!$$2.f()) {
               cyf.this.f(cyf.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ae();
               if (cyf.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awy.Bz, awz.e, 1.0F, 1.0F);
                  cyf.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<dak> j() {
            return List.of(cyf.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public dfo.b<dgb> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(csi $$0) {
      return a(this.v, $$0, dnq.oI);
   }

   @Override
   public boolean a(csi $$0, int $$1) {
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
   public void a(buv $$0) {
      dak $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.b($$1);
      }
   }

   private void b(dak $$0) {
      this.w.a(-1);
      this.p.f(dak.l);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = dfo.b.a();
      }
   }

   void f(int $$0) {
      Optional<dfg<dgb>> $$2;
      if (!this.y.c() && this.e($$0)) {
         dfo.a<dgb> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((dgb)$$0x.b()).a(new dfu(this.q.a(0)), this.x.J_()));
      }, () -> {
         this.p.f(dak.l);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cxk<?> a() {
      return cxk.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(dak $$0, cxz $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public dak b(csi $$0, int $$1) {
      dak $$2 = dak.l;
      cxz $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         dak $$4 = $$3.g();
         dag $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return dak.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return dak.l;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return dak.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return dak.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return dak.l;
         }

         if ($$4.f()) {
            $$3.e(dak.l);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return dak.l;
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
   public void a(csi $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
