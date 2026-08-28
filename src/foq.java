import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class foq extends fom<cpw> {
   private static final akq D = akq.b("textures/gui/container/beacon.png");
   static final akq E = akq.b("container/beacon/button_disabled");
   static final akq F = akq.b("container/beacon/button_selected");
   static final akq G = akq.b("container/beacon/button_highlighted");
   static final akq H = akq.b("container/beacon/button");
   static final akq I = akq.b("container/beacon/confirm");
   static final akq J = akq.b("container/beacon/cancel");
   private static final wy K = wy.c("block.minecraft.beacon.primary");
   private static final wy L = wy.c("block.minecraft.beacon.secondary");
   private final List<foq.a> M = Lists.newArrayList();
   @Nullable
   jm<brw> N;
   @Nullable
   jm<brw> O;

   public foq(final cpw $$0, cmu $$1, wy $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.q = 219;
      $$0.a(new cqf() {
         @Override
         public void a(cps $$0x, int $$1, cuo $$2) {
         }

         @Override
         public void a(cps $$0x, int $$1, int $$2) {
            foq.this.N = $$0.m();
            foq.this.O = $$0.n();
         }
      });
   }

   private <T extends fie & foq.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.M.clear();
      this.a(new foq.c(this.z + 164, this.A + 107));
      this.a(new foq.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dqa.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jm<brw> $$4 = dqa.a.get($$0).get($$3);
            foq.d $$5 = new foq.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dqa.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jm<brw> $$10 = dqa.a.get(3).get($$9);
         foq.d $$11 = new foq.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jm<brw> $$12 = dqa.a.get(0).get(0);
      foq.d $$13 = new foq.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void D() {
      super.D();
      this.F();
   }

   void F() {
      int $$0 = this.w.l();
      this.M.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fht $$0, int $$1, int $$2) {
      $$0.a(this.o, K, 62, 10, 14737632);
      $$0.a(this.o, L, 169, 10, 14737632);
   }

   @Override
   protected void a(fht $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.q) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.q);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cuo(cur.oK), $$4 + 20, $$5 + 109);
      $$0.a(new cuo(cur.oA), $$4 + 41, $$5 + 109);
      $$0.a(new cuo(cur.oz), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cuo(cur.oJ), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cuo(cur.oF), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends foq.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, foq.J, wx.e);
      }

      @Override
      public void b() {
         foq.this.l.s.s();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends foq.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, foq.I, wx.d);
      }

      @Override
      public void b() {
         foq.this.l.L().b(new aht(Optional.ofNullable(foq.this.N), Optional.ofNullable(foq.this.O)));
         foq.this.l.s.s();
      }

      @Override
      public void a(int $$0) {
         this.j = foq.this.w.o() && foq.this.N != null;
      }
   }

   class d extends foq.e {
      private final boolean c;
      protected final int a;
      private jm<brw> d;
      private gqf f;

      public d(final int $$0, final int $$1, final jm<brw> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jm<brw> $$0) {
         this.d = $$0;
         this.f = fgi.Q().aE().a($$0);
         this.a(fjr.a(this.b($$0), null));
      }

      protected xm b(jm<brw> $$0) {
         return wy.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               foq.this.N = this.d;
            } else {
               foq.this.O = this.d;
            }

            foq.this.F();
         }
      }

      @Override
      protected void a(fht $$0) {
         $$0.a(this.D() + 2, this.E() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? foq.this.N : foq.this.O));
      }

      @Override
      protected xm aM_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fhx implements foq.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wx.a);
      }

      protected e(int $$0, int $$1, wy $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fht $$0, int $$1, int $$2, float $$3) {
         akq $$4;
         if (!this.j) {
            $$4 = foq.E;
         } else if (this.a) {
            $$4 = foq.F;
         } else if (this.B()) {
            $$4 = foq.G;
         } else {
            $$4 = foq.H;
         }

         $$0.a($$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fht var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fmc $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends foq.e {
      private final akq a;

      protected f(int $$0, int $$1, akq $$2, wy $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fht $$0) {
         $$0.a(this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends foq.d {
      public g(final int $$0, final int $$1, final jm<brw> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xm b(jm<brw> $$0) {
         return wy.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (foq.this.N != null) {
            this.k = true;
            this.a(foq.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
