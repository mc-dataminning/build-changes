import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fsq extends fsl<cse> {
   private static final alj G = alj.b("textures/gui/container/beacon.png");
   static final alj H = alj.b("container/beacon/button_disabled");
   static final alj I = alj.b("container/beacon/button_selected");
   static final alj J = alj.b("container/beacon/button_highlighted");
   static final alj K = alj.b("container/beacon/button");
   static final alj L = alj.b("container/beacon/confirm");
   static final alj M = alj.b("container/beacon/cancel");
   private static final xj N = xj.c("block.minecraft.beacon.primary");
   private static final xj O = xj.c("block.minecraft.beacon.secondary");
   private final List<fsq.a> P = Lists.newArrayList();
   @Nullable
   jq<bto> Q;
   @Nullable
   jq<bto> R;

   public fsq(final cse $$0, cot $$1, xj $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new csn() {
         @Override
         public void a(crz $$0x, int $$1, cwm $$2) {
         }

         @Override
         public void a(crz $$0x, int $$1, int $$2) {
            fsq.this.Q = $$0.m();
            fsq.this.R = $$0.n();
         }
      });
   }

   private <T extends fmb & fsq.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.P.clear();
      this.a(new fsq.c(this.C + 164, this.D + 107));
      this.a(new fsq.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dst.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jq<bto> $$4 = dst.a.get($$0).get($$3);
            fsq.d $$5 = new fsq.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dst.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jq<bto> $$10 = dst.a.get(3).get($$9);
         fsq.d $$11 = new fsq.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jq<bto> $$12 = dst.a.get(0).get(0);
      fsq.d $$13 = new fsq.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void F() {
      super.F();
      this.J();
   }

   @Override
   void J() {
      int $$0 = this.z.l();
      this.P.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(flq $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(flq $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gjq::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cwm(cwq.oL), $$4 + 20, $$5 + 109);
      $$0.a(new cwm(cwq.oB), $$4 + 41, $$5 + 109);
      $$0.a(new cwm(cwq.oA), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cwm(cwq.oK), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cwm(cwq.oG), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fsq.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fsq.M, xi.e);
      }

      @Override
      public void b() {
         fsq.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fsq.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fsq.L, xi.d);
      }

      @Override
      public void b() {
         fsq.this.m.L().b(new aik(Optional.ofNullable(fsq.this.Q), Optional.ofNullable(fsq.this.R)));
         fsq.this.m.t.p();
      }

      @Override
      public void a(int $$0) {
         this.j = fsq.this.z.o() && fsq.this.Q != null;
      }
   }

   class d extends fsq.e {
      private final boolean c;
      protected final int a;
      private jq<bto> d;
      private gze f;

      public d(final int $$0, final int $$1, final jq<bto> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jq<bto> $$0) {
         this.d = $$0;
         this.f = fke.Q().aG().a($$0);
         this.a(fno.a(this.b($$0), null));
      }

      protected xx b(jq<bto> $$0) {
         return xj.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fsq.this.Q = this.d;
            } else {
               fsq.this.R = this.d;
            }

            fsq.this.J();
         }
      }

      @Override
      protected void a(flq $$0) {
         $$0.a(gjq::B, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fsq.this.Q : fsq.this.R));
      }

      @Override
      protected xx aN_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends flu implements fsq.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xi.a);
      }

      protected e(int $$0, int $$1, xj $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(flq $$0, int $$1, int $$2, float $$3) {
         alj $$4;
         if (!this.j) {
            $$4 = fsq.H;
         } else if (this.a) {
            $$4 = fsq.I;
         } else if (this.B()) {
            $$4 = fsq.J;
         } else {
            $$4 = fsq.K;
         }

         $$0.a(gjq::B, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(flq var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fqb $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fsq.e {
      private final alj a;

      protected f(int $$0, int $$1, alj $$2, xj $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(flq $$0) {
         $$0.a(gjq::B, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends fsq.d {
      public g(final int $$0, final int $$1, final jq<bto> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xx b(jq<bto> $$0) {
         return xj.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fsq.this.Q != null) {
            this.k = true;
            this.a(fsq.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
