import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fgh extends fgd<cke> {
   private static final aiy x = new aiy("textures/gui/container/beacon.png");
   static final aiy y = new aiy("container/beacon/button_disabled");
   static final aiy z = new aiy("container/beacon/button_selected");
   static final aiy A = new aiy("container/beacon/button_highlighted");
   static final aiy B = new aiy("container/beacon/button");
   static final aiy C = new aiy("container/beacon/confirm");
   static final aiy D = new aiy("container/beacon/cancel");
   private static final vq E = vq.c("block.minecraft.beacon.primary");
   private static final vq F = vq.c("block.minecraft.beacon.secondary");
   private final List<fgh.a> G = Lists.newArrayList();
   @Nullable
   ij<bmz> H;
   @Nullable
   ij<bmz> I;

   public fgh(final cke $$0, chg $$1, vq $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new ckn() {
         @Override
         public void a(ckb $$0x, int $$1, coz $$2) {
         }

         @Override
         public void a(ckb $$0x, int $$1, int $$2) {
            fgh.this.H = $$0.m();
            fgh.this.I = $$0.n();
         }
      });
   }

   private <T extends ezf & fgh.a> void a(T $$0) {
      this.d($$0);
      this.G.add($$0);
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.G.clear();
      this.a(new fgh.c(this.t + 164, this.u + 107));
      this.a(new fgh.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dio.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            ij<bmz> $$4 = dio.a.get($$0).get($$3);
            fgh.d $$5 = new fgh.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dio.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         ij<bmz> $$10 = dio.a.get(3).get($$9);
         fgh.d $$11 = new fgh.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      ij<bmz> $$12 = dio.a.get(0).get(0);
      fgh.d $$13 = new fgh.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void E() {
      super.E();
      this.I();
   }

   void I() {
      int $$0 = this.p.l();
      this.G.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(eyu $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(eyu $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new coz(cpc.oI), $$4 + 20, $$5 + 109);
      $$0.a(new coz(cpc.oy), $$4 + 41, $$5 + 109);
      $$0.a(new coz(cpc.ox), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new coz(cpc.oH), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new coz(cpc.oD), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fgh.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fgh.D, vp.e);
      }

      @Override
      public void b() {
         fgh.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fgh.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fgh.C, vp.d);
      }

      @Override
      public void b() {
         fgh.this.f.J().b(new agc(Optional.ofNullable(fgh.this.H), Optional.ofNullable(fgh.this.I)));
         fgh.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fgh.this.p.o() && fgh.this.H != null;
      }
   }

   class d extends fgh.e {
      private final boolean c;
      protected final int a;
      private ij<bmz> d;
      private ggu f;

      public d(int $$0, int $$1, ij<bmz> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(ij<bmz> $$0) {
         this.d = $$0;
         this.f = exh.O().aE().a($$0);
         this.a(fas.a(this.b($$0), null));
      }

      protected we b(ij<bmz> $$0) {
         return vq.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fgh.this.H = this.d;
            } else {
               fgh.this.I = this.d;
            }

            fgh.this.I();
         }
      }

      @Override
      protected void a(eyu $$0) {
         $$0.a(this.B() + 2, this.C() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fgh.this.H : fgh.this.I));
      }

      @Override
      protected we aN_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends eyy implements fgh.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, vp.a);
      }

      protected e(int $$0, int $$1, vq $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(eyu $$0, int $$1, int $$2, float $$3) {
         aiy $$4;
         if (!this.j) {
            $$4 = fgh.y;
         } else if (this.a) {
            $$4 = fgh.z;
         } else if (this.z()) {
            $$4 = fgh.A;
         } else {
            $$4 = fgh.B;
         }

         $$0.a($$4, this.B(), this.C(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(eyu var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fdc $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fgh.e {
      private final aiy a;

      protected f(int $$0, int $$1, aiy $$2, vq $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(eyu $$0) {
         $$0.a(this.a, this.B() + 2, this.C() + 2, 18, 18);
      }
   }

   class g extends fgh.d {
      public g(int $$0, int $$1, ij<bmz> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected we b(ij<bmz> $$0) {
         return vq.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fgh.this.H != null) {
            this.k = true;
            this.a(fgh.this.H);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
