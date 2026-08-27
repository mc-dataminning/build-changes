import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fed extends fdz<cid> {
   private static final ahg x = new ahg("textures/gui/container/beacon.png");
   static final ahg y = new ahg("container/beacon/button_disabled");
   static final ahg z = new ahg("container/beacon/button_selected");
   static final ahg A = new ahg("container/beacon/button_highlighted");
   static final ahg B = new ahg("container/beacon/button");
   static final ahg C = new ahg("container/beacon/confirm");
   static final ahg D = new ahg("container/beacon/cancel");
   private static final vf E = vf.c("block.minecraft.beacon.primary");
   private static final vf F = vf.c("block.minecraft.beacon.secondary");
   private final List<fed.a> G = Lists.newArrayList();
   @Nullable
   blf H;
   @Nullable
   blf I;

   public fed(final cid $$0, cfg $$1, vf $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cim() {
         @Override
         public void a(cia $$0x, int $$1, cmx $$2) {
         }

         @Override
         public void a(cia $$0x, int $$1, int $$2) {
            fed.this.H = $$0.m();
            fed.this.I = $$0.n();
         }
      });
   }

   private <T extends exd & fed.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.G.clear();
      this.a(new fed.c(this.t + 164, this.u + 107));
      this.a(new fed.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dgp.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            blf $$4 = dgp.a[$$0][$$3];
            fed.d $$5 = new fed.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dgp.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         blf $$10 = dgp.a[3][$$9];
         fed.d $$11 = new fed.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      fed.d $$12 = new fed.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, dgp.a[0][0]);
      $$12.k = false;
      this.a($$12);
   }

   @Override
   public void D() {
      super.D();
      this.H();
   }

   void H() {
      int $$0 = this.p.l();
      this.G.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(ewt $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(ewt $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cmx(cna.oG), $$4 + 20, $$5 + 109);
      $$0.a(new cmx(cna.ow), $$4 + 41, $$5 + 109);
      $$0.a(new cmx(cna.ov), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cmx(cna.oF), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cmx(cna.oB), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fed.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fed.D, ve.e);
      }

      @Override
      public void b() {
         fed.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fed.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fed.C, ve.d);
      }

      @Override
      public void b() {
         fed.this.f.J().b(new aeu(Optional.ofNullable(fed.this.H), Optional.ofNullable(fed.this.I)));
         fed.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fed.this.p.o() && fed.this.H != null;
      }
   }

   class d extends fed.e {
      private final boolean c;
      protected final int a;
      private blf d;
      private gem f;

      public d(int $$0, int $$1, blf $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(blf $$0) {
         this.d = $$0;
         this.f = evh.O().aE().a($$0);
         this.a(eyq.a(this.b($$0), null));
      }

      protected vt b(blf $$0) {
         return vf.c($$0.d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fed.this.H = this.d;
            } else {
               fed.this.I = this.d;
            }

            fed.this.H();
         }
      }

      @Override
      protected void a(ewt $$0) {
         $$0.a(this.B() + 2, this.C() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d == (this.c ? fed.this.H : fed.this.I));
      }

      @Override
      protected vt aK_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends eww implements fed.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, ve.a);
      }

      protected e(int $$0, int $$1, vf $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(ewt $$0, int $$1, int $$2, float $$3) {
         ahg $$4;
         if (!this.j) {
            $$4 = fed.y;
         } else if (this.a) {
            $$4 = fed.z;
         } else if (this.z()) {
            $$4 = fed.A;
         } else {
            $$4 = fed.B;
         }

         $$0.a($$4, this.B(), this.C(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(ewt var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fay $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fed.e {
      private final ahg a;

      protected f(int $$0, int $$1, ahg $$2, vf $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(ewt $$0) {
         $$0.a(this.a, this.B() + 2, this.C() + 2, 18, 18);
      }
   }

   class g extends fed.d {
      public g(int $$0, int $$1, blf $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected vt b(blf $$0) {
         return vf.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fed.this.H != null) {
            this.k = true;
            this.a(fed.this.H);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
