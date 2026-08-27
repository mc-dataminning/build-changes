import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class evt extends evp<cbi> {
   static final acq w = new acq("textures/gui/container/beacon.png");
   private static final sw x = sw.c("block.minecraft.beacon.primary");
   private static final sw y = sw.c("block.minecraft.beacon.secondary");
   private final List<evt.a> z = Lists.newArrayList();
   @Nullable
   bey A;
   @Nullable
   bey C;

   public evt(final cbi $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cbr() {
         @Override
         public void a(cbf $$0x, int $$1, cfz $$2) {
         }

         @Override
         public void a(cbf $$0x, int $$1, int $$2) {
            evt.this.A = $$0.m();
            evt.this.C = $$0.n();
         }
      });
   }

   private <T extends epf & evt.a> void a(T $$0) {
      this.d($$0);
      this.z.add($$0);
   }

   @Override
   protected void b() {
      super.b();
      this.z.clear();
      this.a(new evt.c(this.s + 164, this.t + 107));
      this.a(new evt.b(this.s + 190, this.t + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = czi.a[$$0].length;
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            bey $$4 = czi.a[$$0][$$3];
            evt.d $$5 = new evt.d(this.s + 76 + $$3 * 24 - $$2 / 2, this.t + 22 + $$0 * 25, $$4, true, $$0);
            $$5.r = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = czi.a[3].length + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         bey $$10 = czi.a[3][$$9];
         evt.d $$11 = new evt.d(this.s + 167 + $$9 * 24 - $$8 / 2, this.t + 47, $$10, false, 3);
         $$11.r = false;
         this.a($$11);
      }

      evt.d $$12 = new evt.g(this.s + 167 + ($$7 - 1) * 24 - $$8 / 2, this.t + 47, czi.a[0][0]);
      $$12.s = false;
      this.a($$12);
   }

   @Override
   public void B() {
      super.B();
      this.D();
   }

   void D() {
      int $$0 = this.p.l();
      this.z.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(eox $$0, int $$1, int $$2) {
      $$0.a(this.i, x, 62, 10, 14737632);
      $$0.a(this.i, y, 169, 10, 14737632);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cfz(cgc.nV), $$4 + 20, $$5 + 109);
      $$0.a(new cfz(cgc.nL), $$4 + 41, $$5 + 109);
      $$0.a(new cfz(cgc.nK), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cfz(cgc.nU), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cfz(cgc.nQ), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.a($$0);
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends evt.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, 112, 220, sv.e);
      }

      @Override
      public void c() {
         evt.this.f.t.q();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends evt.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, 90, 220, sv.d);
      }

      @Override
      public void c() {
         evt.this.f.I().a(new aan(Optional.ofNullable(evt.this.A), Optional.ofNullable(evt.this.C)));
         evt.this.f.t.q();
      }

      @Override
      public void a(int $$0) {
         this.r = evt.this.p.o() && evt.this.A != null;
      }
   }

   class d extends evt.e {
      private final boolean c;
      protected final int a;
      private bey d;
      private fuv e;

      public d(int $$0, int $$1, bey $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(bey $$0) {
         this.d = $$0;
         this.e = enn.N().aF().a($$0);
         this.a(eqp.a(this.b($$0), null));
      }

      protected tj b(bey $$0) {
         return sw.c($$0.d());
      }

      @Override
      public void c() {
         if (!this.a()) {
            if (this.c) {
               evt.this.A = this.d;
            } else {
               evt.this.C = this.d;
            }

            evt.this.D();
         }
      }

      @Override
      protected void a(eox $$0) {
         $$0.a(this.p() + 2, this.r() + 2, 0, 18, 18, this.e);
      }

      @Override
      public void a(int $$0) {
         this.r = this.a < $$0;
         this.b(this.d == (this.c ? evt.this.A : evt.this.C));
      }

      @Override
      protected tj aE_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends eoz implements evt.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, sv.a);
      }

      protected e(int $$0, int $$1, sw $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(eox $$0, int $$1, int $$2, float $$3) {
         int $$4 = 219;
         int $$5 = 0;
         if (!this.r) {
            $$5 += this.o * 2;
         } else if (this.a) {
            $$5 += this.o * 1;
         } else if (this.n()) {
            $$5 += this.o * 3;
         }

         $$0.a(evt.w, this.p(), this.r(), $$5, 219, this.o, this.p);
         this.a($$0);
      }

      protected abstract void a(eox var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(esp $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends evt.e {
      private final int a;
      private final int b;

      protected f(int $$0, int $$1, int $$2, int $$3, sw $$4) {
         super($$0, $$1, $$4);
         this.a = $$2;
         this.b = $$3;
      }

      @Override
      protected void a(eox $$0) {
         $$0.a(evt.w, this.p() + 2, this.r() + 2, this.a, this.b, 18, 18);
      }
   }

   class g extends evt.d {
      public g(int $$0, int $$1, bey $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected tj b(bey $$0) {
         return sw.c($$0.d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (evt.this.A != null) {
            this.s = true;
            this.a(evt.this.A);
            super.a($$0);
         } else {
            this.s = false;
         }
      }
   }
}
