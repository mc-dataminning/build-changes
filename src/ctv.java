import com.google.common.collect.Lists;
import java.util.List;

public class ctv extends crs {
   public static final int m = 0;
   public static final int n = 1;
   private static final int r = 2;
   private static final int s = 29;
   private static final int t = 29;
   private static final int u = 38;
   private final csf v;
   private final csm w = csm.a();
   private final dff x;
   private List<dav<dbp>> y = Lists.newArrayList();
   private cwf z = cwf.k;
   long A;
   final ctp o;
   final ctp p;
   Runnable B = () -> {
   };
   public final bsa q = new bso(1) {
      @Override
      public void e() {
         super.e();
         ctv.this.a(this);
         ctv.this.B.run();
      }
   };
   final ctk C = new ctk();

   public ctv(int $$0, coq $$1) {
      this($$0, $$1, csf.a);
   }

   public ctv(int $$0, coq $$1, final csf $$2) {
      super(ctb.y, $$0);
      this.v = $$2;
      this.x = $$1.k.dY();
      this.o = this.a(new ctp(this.q, 0, 20, 33));
      this.p = this.a(new ctp(this.C, 1, 143, 33) {
         @Override
         public boolean a(cwf $$0) {
            return false;
         }

         @Override
         public void a(cor $$0, cwf $$1) {
            $$1.a($$0.dY(), $$0, $$1.L());
            ctv.this.C.a($$0, this.j());
            cwf $$2 = ctv.this.o.a(1);
            if (!$$2.f()) {
               ctv.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.aa();
               if (ctv.this.A != $$2xxx) {
                  $$0x.a(null, $$1x, awo.Az, awp.e, 1.0F, 1.0F);
                  ctv.this.A = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cwf> j() {
            return List.of(ctv.this.o.g());
         }
      });
      this.c($$1, 8, 84);
      this.a(this.w);
   }

   public int l() {
      return this.w.b();
   }

   public List<dav<dbp>> m() {
      return this.y;
   }

   public int n() {
      return this.y.size();
   }

   public boolean o() {
      return this.o.h() && !this.y.isEmpty();
   }

   @Override
   public boolean b(cor $$0) {
      return a(this.v, $$0, dil.oc);
   }

   @Override
   public boolean a(cor $$0, int $$1) {
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
   public void a(bsa $$0) {
      cwf $$1 = this.o.g();
      if (!$$1.a(this.z.h())) {
         this.z = $$1.v();
         this.a($$0, $$1);
      }
   }

   private static dbi c(bsa $$0) {
      return new dbi($$0.a(0));
   }

   private void a(bsa $$0, cwf $$1) {
      this.y.clear();
      this.w.a(-1);
      this.p.f(cwf.k);
      if (!$$1.f()) {
         this.y = this.x.r().b(daz.f, c($$0), this.x);
      }
   }

   void p() {
      if (!this.y.isEmpty() && this.e(this.w.b())) {
         dav<dbp> $$0 = this.y.get(this.w.b());
         cwf $$1 = $$0.b().a(c(this.q), this.x.H_());
         if ($$1.a(this.x.J())) {
            this.C.a($$0);
            this.p.f($$1);
         } else {
            this.p.f(cwf.k);
         }
      } else {
         this.p.f(cwf.k);
      }

      this.d();
   }

   @Override
   public ctb<?> a() {
      return ctb.y;
   }

   public void a(Runnable $$0) {
      this.B = $$0;
   }

   @Override
   public boolean a(cwf $$0, ctp $$1) {
      return $$1.c != this.C && super.a($$0, $$1);
   }

   @Override
   public cwf b(cor $$0, int $$1) {
      cwf $$2 = cwf.k;
      ctp $$3 = this.k.get($$1);
      if ($$3 != null && $$3.h()) {
         cwf $$4 = $$3.g();
         cwb $$5 = $$4.h();
         $$2 = $$4.v();
         if ($$1 == 1) {
            $$5.a($$4, $$0.dY(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cwf.k;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cwf.k;
            }
         } else if (this.x.r().a(daz.f, new dbi($$4), this.x).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cwf.k;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cwf.k;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cwf.k;
         }

         if ($$4.f()) {
            $$3.e(cwf.k);
         }

         $$3.c();
         if ($$4.L() == $$2.L()) {
            return cwf.k;
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
   public void a(cor $$0) {
      super.a($$0);
      this.C.b(1);
      this.v.a(($$1, $$2) -> this.a($$0, this.q));
   }
}
