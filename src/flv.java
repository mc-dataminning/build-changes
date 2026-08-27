import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class flv extends flr<cnk> {
   private static final akf D = new akf("textures/gui/container/beacon.png");
   static final akf E = new akf("container/beacon/button_disabled");
   static final akf F = new akf("container/beacon/button_selected");
   static final akf G = new akf("container/beacon/button_highlighted");
   static final akf H = new akf("container/beacon/button");
   static final akf I = new akf("container/beacon/confirm");
   static final akf J = new akf("container/beacon/cancel");
   private static final ws K = ws.c("block.minecraft.beacon.primary");
   private static final ws L = ws.c("block.minecraft.beacon.secondary");
   private final List<flv.a> M = Lists.newArrayList();
   @Nullable
   iv<bpv> N;
   @Nullable
   iv<bpv> O;

   public flv(final cnk $$0, ckk $$1, ws $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.d = 219;
      $$0.a(new cnt() {
         @Override
         public void a(cnh $$0x, int $$1, csd $$2) {
         }

         @Override
         public void a(cnh $$0x, int $$1, int $$2) {
            flv.this.N = $$0.m();
            flv.this.O = $$0.n();
         }
      });
   }

   private <T extends fes & flv.a> void a(T $$0) {
      this.c($$0);
      this.M.add($$0);
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.M.clear();
      this.a(new flv.c(this.z + 164, this.A + 107));
      this.a(new flv.b(this.z + 190, this.A + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dmy.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            iv<bpv> $$4 = dmy.a.get($$0).get($$3);
            flv.d $$5 = new flv.d(this.z + 76 + $$3 * 24 - $$2 / 2, this.A + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dmy.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         iv<bpv> $$10 = dmy.a.get(3).get($$9);
         flv.d $$11 = new flv.d(this.z + 167 + $$9 * 24 - $$8 / 2, this.A + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      iv<bpv> $$12 = dmy.a.get(0).get(0);
      flv.d $$13 = new flv.g(this.z + 167 + ($$7 - 1) * 24 - $$8 / 2, this.A + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   void E() {
      int $$0 = this.w.l();
      this.M.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(feh $$0, int $$1, int $$2) {
      $$0.a(this.p, K, 62, 10, 14737632);
      $$0.a(this.p, L, 169, 10, 14737632);
   }

   @Override
   protected void a(feh $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.c) / 2;
      int $$5 = (this.o - this.d) / 2;
      $$0.a(D, $$4, $$5, 0, 0, this.c, this.d);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new csd(csg.oJ), $$4 + 20, $$5 + 109);
      $$0.a(new csd(csg.oz), $$4 + 41, $$5 + 109);
      $$0.a(new csd(csg.oy), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new csd(csg.oI), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new csd(csg.oE), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends flv.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, flv.J, wr.e);
      }

      @Override
      public void b() {
         flv.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends flv.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, flv.I, wr.d);
      }

      @Override
      public void b() {
         flv.this.m.L().b(new ahi(Optional.ofNullable(flv.this.N), Optional.ofNullable(flv.this.O)));
         flv.this.m.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = flv.this.w.o() && flv.this.N != null;
      }
   }

   class d extends flv.e {
      private final boolean c;
      protected final int a;
      private iv<bpv> d;
      private gmo f;

      public d(int $$0, int $$1, iv<bpv> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(iv<bpv> $$0) {
         this.d = $$0;
         this.f = fcu.Q().aG().a($$0);
         this.a(fgf.a(this.b($$0), null));
      }

      protected xg b(iv<bpv> $$0) {
         return ws.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               flv.this.N = this.d;
            } else {
               flv.this.O = this.d;
            }

            flv.this.E();
         }
      }

      @Override
      protected void a(feh $$0) {
         $$0.a(this.C() + 2, this.D() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? flv.this.N : flv.this.O));
      }

      @Override
      protected xg aK_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fel implements flv.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wr.a);
      }

      protected e(int $$0, int $$1, ws $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(feh $$0, int $$1, int $$2, float $$3) {
         akf $$4;
         if (!this.j) {
            $$4 = flv.E;
         } else if (this.a) {
            $$4 = flv.F;
         } else if (this.A()) {
            $$4 = flv.G;
         } else {
            $$4 = flv.H;
         }

         $$0.a($$4, this.C(), this.D(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(feh var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fiq $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends flv.e {
      private final akf a;

      protected f(int $$0, int $$1, akf $$2, ws $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(feh $$0) {
         $$0.a(this.a, this.C() + 2, this.D() + 2, 18, 18);
      }
   }

   class g extends flv.d {
      public g(int $$0, int $$1, iv<bpv> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xg b(iv<bpv> $$0) {
         return ws.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (flv.this.N != null) {
            this.k = true;
            this.a(flv.this.N);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
