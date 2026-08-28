import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fqm extends fqi<cqv> {
   private static final alb G = alb.b("textures/gui/container/beacon.png");
   static final alb H = alb.b("container/beacon/button_disabled");
   static final alb I = alb.b("container/beacon/button_selected");
   static final alb J = alb.b("container/beacon/button_highlighted");
   static final alb K = alb.b("container/beacon/button");
   static final alb L = alb.b("container/beacon/confirm");
   static final alb M = alb.b("container/beacon/cancel");
   private static final xd N = xd.c("block.minecraft.beacon.primary");
   private static final xd O = xd.c("block.minecraft.beacon.secondary");
   private final List<fqm.a> P = Lists.newArrayList();
   @Nullable
   jn<bso> Q;
   @Nullable
   jn<bso> R;

   public fqm(final cqv $$0, cno $$1, xd $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new cre() {
         @Override
         public void a(cqq $$0x, int $$1, cvl $$2) {
         }

         @Override
         public void a(cqq $$0x, int $$1, int $$2) {
            fqm.this.Q = $$0.m();
            fqm.this.R = $$0.n();
         }
      });
   }

   private <T extends fjy & fqm.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.P.clear();
      this.a(new fqm.c(this.C + 164, this.D + 107));
      this.a(new fqm.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dqz.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jn<bso> $$4 = dqz.a.get($$0).get($$3);
            fqm.d $$5 = new fqm.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dqz.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jn<bso> $$10 = dqz.a.get(3).get($$9);
         fqm.d $$11 = new fqm.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jn<bso> $$12 = dqz.a.get(0).get(0);
      fqm.d $$13 = new fqm.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void D() {
      super.D();
      this.F();
   }

   void F() {
      int $$0 = this.z.l();
      this.P.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fjn $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fjn $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(ghe::C, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cvl(cvo.oL), $$4 + 20, $$5 + 109);
      $$0.a(new cvl(cvo.oB), $$4 + 41, $$5 + 109);
      $$0.a(new cvl(cvo.oA), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cvl(cvo.oK), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cvl(cvo.oG), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fqm.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fqm.M, xc.e);
      }

      @Override
      public void b() {
         fqm.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fqm.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fqm.L, xc.d);
      }

      @Override
      public void b() {
         fqm.this.m.L().b(new aie(Optional.ofNullable(fqm.this.Q), Optional.ofNullable(fqm.this.R)));
         fqm.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
         this.j = fqm.this.z.o() && fqm.this.Q != null;
      }
   }

   class d extends fqm.e {
      private final boolean c;
      protected final int a;
      private jn<bso> d;
      private gwk f;

      public d(final int $$0, final int $$1, final jn<bso> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jn<bso> $$0) {
         this.d = $$0;
         this.f = fib.Q().aF().a($$0);
         this.a(fll.a(this.b($$0), null));
      }

      protected xr b(jn<bso> $$0) {
         return xd.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fqm.this.Q = this.d;
            } else {
               fqm.this.R = this.d;
            }

            fqm.this.F();
         }
      }

      @Override
      protected void a(fjn $$0) {
         $$0.a(ghe::C, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fqm.this.Q : fqm.this.R));
      }

      @Override
      protected xr aQ_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fjr implements fqm.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xc.a);
      }

      protected e(int $$0, int $$1, xd $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fjn $$0, int $$1, int $$2, float $$3) {
         alb $$4;
         if (!this.j) {
            $$4 = fqm.H;
         } else if (this.a) {
            $$4 = fqm.I;
         } else if (this.B()) {
            $$4 = fqm.J;
         } else {
            $$4 = fqm.K;
         }

         $$0.a(ghe::C, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fjn var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fnx $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fqm.e {
      private final alb a;

      protected f(int $$0, int $$1, alb $$2, xd $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fjn $$0) {
         $$0.a(ghe::C, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends fqm.d {
      public g(final int $$0, final int $$1, final jn<bso> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xr b(jn<bso> $$0) {
         return xd.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fqm.this.Q != null) {
            this.k = true;
            this.a(fqm.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
