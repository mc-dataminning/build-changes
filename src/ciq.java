import com.google.common.collect.Lists;
import java.util.List;

public class ciq extends cgr {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final chc t;
   private final chj u = chj.a();
   private final csf v;
   private List<cov<cpm>> w = Lists.newArrayList();
   private clo x = clo.b;
   long y;
   final cim m;
   final cim n;
   Runnable z = () -> {
   };
   public final biu o = new bjj(1) {
      @Override
      public void e() {
         super.e();
         ciq.this.a(this);
         ciq.this.z.run();
      }
   };
   final cih A = new cih();

   public ciq(int $$0, cdy $$1) {
      this($$0, $$1, chc.a);
   }

   public ciq(int $$0, cdy $$1, final chc $$2) {
      super(chy.y, $$0);
      this.t = $$2;
      this.v = $$1.m.dN();
      this.m = this.a(new cim(this.o, 0, 20, 33));
      this.n = this.a(new cim(this.A, 1, 143, 33) {
         @Override
         public boolean a(clo $$0) {
            return false;
         }

         @Override
         public void a(cdz $$0, clo $$1) {
            $$1.a($$0.dN(), $$0, $$1.L());
            ciq.this.A.a($$0, this.i());
            clo $$2 = ciq.this.m.a(1);
            if (!$$2.b()) {
               ciq.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.W();
               if (ciq.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, aqv.zd, aqw.e, 1.0F, 1.0F);
                  ciq.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<clo> i() {
            return List.of(ciq.this.m.f());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cim($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cim($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cov<cpm>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.g() && !this.w.isEmpty();
   }

   @Override
   public boolean a(cdz $$0) {
      return a(this.t, $$0, cvh.oc);
   }

   @Override
   public boolean b(cdz $$0, int $$1) {
      if (this.e($$1)) {
         this.u.a($$1);
         this.p();
      }

      return true;
   }

   private boolean e(int $$0) {
      return $$0 >= 0 && $$0 < this.w.size();
   }

   @Override
   public void a(biu $$0) {
      clo $$1 = this.m.f();
      if (!$$1.a(this.x.d())) {
         this.x = $$1.p();
         this.a($$0, $$1);
      }
   }

   private void a(biu $$0, clo $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(clo.b);
      if (!$$1.b()) {
         this.w = this.v.q().b(coy.f, $$0, this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cov<cpm> $$0 = this.w.get(this.u.b());
         clo $$1 = $$0.b().a(this.o, this.v.I_());
         if ($$1.a(this.v.H())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(clo.b);
         }
      } else {
         this.n.f(clo.b);
      }

      this.d();
   }

   @Override
   public chy<?> a() {
      return chy.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(clo $$0, cim $$1) {
      return $$1.d != this.A && super.a($$0, $$1);
   }

   @Override
   public clo a(cdz $$0, int $$1) {
      clo $$2 = clo.b;
      cim $$3 = this.i.get($$1);
      if ($$3 != null && $$3.g()) {
         clo $$4 = $$3.f();
         clj $$5 = $$4.d();
         $$2 = $$4.p();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dN(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return clo.b;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return clo.b;
            }
         } else if (this.v.q().a(coy.f, new bjj($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return clo.b;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return clo.b;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return clo.b;
         }

         if ($$4.b()) {
            $$3.e(clo.b);
         }

         $$3.b();
         if ($$4.L() == $$2.L()) {
            return clo.b;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void b(cdz $$0) {
      super.b($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
