import java.util.List;
import java.util.Optional;

public class cwy extends cuv {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final cvi v;
   final cvp w = cvp.a();
   private final dja x;
   private deh.b<deu> y = deh.b.a();
   private czd z = czd.k;
   long A;
   final cws o;
   final cws p;
   Runnable B = () -> {
   };
   public final btw q = new buk(1) {
      @Override
      public void e() {
         super.e();
         cwy.this.a(this);
         cwy.this.B.run();
      }
   };
   final cwn C = new cwn();

   public cwy(int $$0, crb $$1) {
      this($$0, $$1, cvi.a);
   }

   public cwy(int $$0, crb $$1, final cvi $$2) {
      super(cwe.y, $$0);
      this.v = $$2;
      this.x = $$1.h.dV();
      this.o = this.a(new cws(this.q, 0, 20, 33));
      this.p = this.a(new cws(this.C, 1, 143, 33) {
         @Override
         public boolean a(czd $$0) {
            return false;
         }

         @Override
         public void a(crc $$0, czd $$1) {
            $$1.a($$0.dV(), $$0, $$1.M());
            cwy.this.C.a($$0, this.j());
            czd $$2 = cwy.this.o.a(1);
            if (!$$2.f()) {
               cwy.this.f(cwy.this.w.b());
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.ae();
               if (cwy.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awn.Bz, awo.e, 1.0F, 1.0F);
                  cwy.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<czd> j() {
            return List.of(cwy.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public deh.b<deu> m() {
      return this.y;
   }

   public int n() {
      return this.y.d();
   }

   public boolean o() {
      return this.o.h() && !this.y.c();
   }

   @Override
   public boolean b(crc $$0) {
      return a(this.v, $$0, dmh.oI);
   }

   @Override
   public boolean a(crc $$0, int $$1) {
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
   public void a(btw $$0) {
      czd $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.c($$1);
      }
   }

   private void c(czd $$0) {
      this.w.a(-1);
      this.p.f(czd.k);
      if (!$$0.f()) {
         this.y = this.x.Q().a().b($$0);
      } else {
         this.y = deh.b.a();
      }
   }

   void f(int $$0) {
      Optional<ddz<deu>> $$2;
      if (!this.y.c() && this.e($$0)) {
         deh.a<deu> $$1 = this.y.e().get($$0);
         $$2 = $$1.c().c();
      } else {
         $$2 = Optional.empty();
      }

      $$2.ifPresentOrElse($$0x -> {
         this.C.a($$0x);
         this.p.f(((deu)$$0x.b()).a(new den(this.q.a(0)), this.x.F_()));
      }, () -> {
         this.p.f(czd.k);
         this.C.a(null);
      });
      this.d();
   }

   @Override
   public cwe<?> a() {
      return cwe.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(czd $$0, cws $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public czd b(crc $$0, int $$1) {
      czd $$2 = czd.k;
      cws $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         czd $$4 = $$3.g();
         cyz $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dV(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return czd.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return czd.k;
            }
         } else if (this.x.Q().a().a($$4)) {
            if (!this.a($$4, 0, 1, false)) {
               return czd.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return czd.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return czd.k;
         }

         if ($$4.f()) {
            $$3.e(czd.k);
         }

         $$3.d();
         if ($$4.M() == $$2.M()) {
            return czd.k;
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
   public void a(crc $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
