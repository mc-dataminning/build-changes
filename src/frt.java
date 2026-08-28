import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class frt extends frp<crt> {
   private static final ali G = ali.b("textures/gui/container/beacon.png");
   static final ali H = ali.b("container/beacon/button_disabled");
   static final ali I = ali.b("container/beacon/button_selected");
   static final ali J = ali.b("container/beacon/button_highlighted");
   static final ali K = ali.b("container/beacon/button");
   static final ali L = ali.b("container/beacon/confirm");
   static final ali M = ali.b("container/beacon/cancel");
   private static final xi N = xi.c("block.minecraft.beacon.primary");
   private static final xi O = xi.c("block.minecraft.beacon.secondary");
   private final List<frt.a> P = Lists.newArrayList();
   @Nullable
   jq<bth> Q;
   @Nullable
   jq<bth> R;

   public frt(final crt $$0, col $$1, xi $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new csc() {
         @Override
         public void a(cro $$0x, int $$1, cwb $$2) {
         }

         @Override
         public void a(cro $$0x, int $$1, int $$2) {
            frt.this.Q = $$0.m();
            frt.this.R = $$0.n();
         }
      });
   }

   private <T extends flf & frt.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.P.clear();
      this.a(new frt.c(this.C + 164, this.D + 107));
      this.a(new frt.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dsh.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jq<bth> $$4 = dsh.a.get($$0).get($$3);
            frt.d $$5 = new frt.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dsh.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jq<bth> $$10 = dsh.a.get(3).get($$9);
         frt.d $$11 = new frt.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jq<bth> $$12 = dsh.a.get(0).get(0);
      frt.d $$13 = new frt.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fku $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fku $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(gir::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cwb(cwf.oL), $$4 + 20, $$5 + 109);
      $$0.a(new cwb(cwf.oB), $$4 + 41, $$5 + 109);
      $$0.a(new cwb(cwf.oA), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cwb(cwf.oK), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cwb(cwf.oG), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends frt.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, frt.M, xh.e);
      }

      @Override
      public void b() {
         frt.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends frt.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, frt.L, xh.d);
      }

      @Override
      public void b() {
         frt.this.m.L().b(new aij(Optional.ofNullable(frt.this.Q), Optional.ofNullable(frt.this.R)));
         frt.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
         this.j = frt.this.z.o() && frt.this.Q != null;
      }
   }

   class d extends frt.e {
      private final boolean c;
      protected final int a;
      private jq<bth> d;
      private gyd f;

      public d(final int $$0, final int $$1, final jq<bth> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jq<bth> $$0) {
         this.d = $$0;
         this.f = fji.Q().aG().a($$0);
         this.a(fms.a(this.b($$0), null));
      }

      protected xw b(jq<bth> $$0) {
         return xi.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               frt.this.Q = this.d;
            } else {
               frt.this.R = this.d;
            }

            frt.this.F();
         }
      }

      @Override
      protected void a(fku $$0) {
         $$0.a(gir::B, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? frt.this.Q : frt.this.R));
      }

      @Override
      protected xw aO_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fky implements frt.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xh.a);
      }

      protected e(int $$0, int $$1, xi $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fku $$0, int $$1, int $$2, float $$3) {
         ali $$4;
         if (!this.j) {
            $$4 = frt.H;
         } else if (this.a) {
            $$4 = frt.I;
         } else if (this.B()) {
            $$4 = frt.J;
         } else {
            $$4 = frt.K;
         }

         $$0.a(gir::B, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fku var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fpf $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends frt.e {
      private final ali a;

      protected f(int $$0, int $$1, ali $$2, xi $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fku $$0) {
         $$0.a(gir::B, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends frt.d {
      public g(final int $$0, final int $$1, final jq<bth> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xw b(jq<bth> $$0) {
         return xi.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (frt.this.Q != null) {
            this.k = true;
            this.a(frt.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
