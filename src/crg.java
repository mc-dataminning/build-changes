import com.google.common.collect.Lists;
import java.util.List;

public class crg extends cpe {
   public static final int k = 0;
   public static final int l = 1;
   private static final int p = 2;
   private static final int q = 29;
   private static final int r = 29;
   private static final int s = 38;
   private final cpq t;
   private final cpx u = cpx.a();
   private final dcd v;
   private List<cyi<czd>> w = Lists.newArrayList();
   private cua x = cua.l;
   long y;
   final cra m;
   final cra n;
   Runnable z = () -> {
   };
   public final bpw o = new bqm(1) {
      @Override
      public void e() {
         super.e();
         crg.this.a(this);
         crg.this.z.run();
      }
   };
   final cqv A = new cqv();

   public crg(int $$0, cmg $$1) {
      this($$0, $$1, cpq.a);
   }

   public crg(int $$0, cmg $$1, final cpq $$2) {
      super(cqm.y, $$0);
      this.t = $$2;
      this.v = $$1.l.dP();
      this.m = this.a(new cra(this.o, 0, 20, 33));
      this.n = this.a(new cra(this.A, 1, 143, 33) {
         @Override
         public boolean a(cua $$0) {
            return false;
         }

         @Override
         public void a(cmh $$0, cua $$1) {
            $$1.a($$0.dP(), $$0, $$1.H());
            crg.this.A.a($$0, this.j());
            cua $$2 = crg.this.m.a(1);
            if (!$$2.e()) {
               crg.this.p();
            }

            $$2.a(($$0x, $$1x) -> {
               long $$2xxx = $$0x.Z();
               if (crg.this.y != $$2xxx) {
                  $$0x.a(null, $$1x, avf.Av, avg.e, 1.0F, 1.0F);
                  crg.this.y = $$2xxx;
               }
            });
            super.a($$0, $$1);
         }

         private List<cua> j() {
            return List.of(crg.this.m.g());
         }
      });

      for (int $$3 = 0; $$3 < 3; $$3++) {
         for (int $$4 = 0; $$4 < 9; $$4++) {
            this.a(new cra($$1, $$4 + $$3 * 9 + 9, 8 + $$4 * 18, 84 + $$3 * 18));
         }
      }

      for (int $$5 = 0; $$5 < 9; $$5++) {
         this.a(new cra($$1, $$5, 8 + $$5 * 18, 142));
      }

      this.a(this.u);
   }

   public int l() {
      return this.u.b();
   }

   public List<cyi<czd>> m() {
      return this.w;
   }

   public int n() {
      return this.w.size();
   }

   public boolean o() {
      return this.m.h() && !this.w.isEmpty();
   }

   @Override
   public boolean b(cmh $$0) {
      return a(this.t, $$0, dfh.oc);
   }

   @Override
   public boolean a(cmh $$0, int $$1) {
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
   public void a(bpw $$0) {
      cua $$1 = this.m.g();
      if (!$$1.a(this.x.g())) {
         this.x = $$1.s();
         this.a($$0, $$1);
      }
   }

   private static cyw c(bpw $$0) {
      return new cyw($$0.a(0));
   }

   private void a(bpw $$0, cua $$1) {
      this.w.clear();
      this.u.a(-1);
      this.n.f(cua.l);
      if (!$$1.e()) {
         this.w = this.v.r().b(cym.f, c($$0), this.v);
      }
   }

   void p() {
      if (!this.w.isEmpty() && this.e(this.u.b())) {
         cyi<czd> $$0 = this.w.get(this.u.b());
         cua $$1 = $$0.b().a(c(this.o), this.v.H_());
         if ($$1.a(this.v.J())) {
            this.A.a($$0);
            this.n.f($$1);
         } else {
            this.n.f(cua.l);
         }
      } else {
         this.n.f(cua.l);
      }

      this.d();
   }

   @Override
   public cqm<?> a() {
      return cqm.y;
   }

   public void a(Runnable $$0) {
      this.z = $$0;
   }

   @Override
   public boolean a(cua $$0, cra $$1) {
      return $$1.c != this.A && super.a($$0, $$1);
   }

   @Override
   public cua b(cmh $$0, int $$1) {
      cua $$2 = cua.l;
      cra $$3 = this.i.get($$1);
      if ($$3 != null && $$3.h()) {
         cua $$4 = $$3.g();
         ctv $$5 = $$4.g();
         $$2 = $$4.s();
         if ($$1 == 1) {
            $$5.b($$4, $$0.dP(), $$0);
            if (!this.a($$4, 2, 38, true)) {
               return cua.l;
            }

            $$3.b($$4, $$2);
         } else if ($$1 == 0) {
            if (!this.a($$4, 2, 38, false)) {
               return cua.l;
            }
         } else if (this.v.r().a(cym.f, new cyw($$4), this.v).isPresent()) {
            if (!this.a($$4, 0, 1, false)) {
               return cua.l;
            }
         } else if ($$1 >= 2 && $$1 < 29) {
            if (!this.a($$4, 29, 38, false)) {
               return cua.l;
            }
         } else if ($$1 >= 29 && $$1 < 38 && !this.a($$4, 2, 29, false)) {
            return cua.l;
         }

         if ($$4.e()) {
            $$3.e(cua.l);
         }

         $$3.c();
         if ($$4.H() == $$2.H()) {
            return cua.l;
         }

         $$3.a($$0, $$4);
         this.d();
      }

      return $$2;
   }

   @Override
   public void a(cmh $$0) {
      super.a($$0);
      this.A.b(1);
      this.t.a(($$1, $$2) -> this.a($$0, this.o));
   }
}
