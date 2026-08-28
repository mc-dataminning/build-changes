import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fra extends fqw<cre> {
   private static final ale G = ale.b("textures/gui/container/beacon.png");
   static final ale H = ale.b("container/beacon/button_disabled");
   static final ale I = ale.b("container/beacon/button_selected");
   static final ale J = ale.b("container/beacon/button_highlighted");
   static final ale K = ale.b("container/beacon/button");
   static final ale L = ale.b("container/beacon/confirm");
   static final ale M = ale.b("container/beacon/cancel");
   private static final xe N = xe.c("block.minecraft.beacon.primary");
   private static final xe O = xe.c("block.minecraft.beacon.secondary");
   private final List<fra.a> P = Lists.newArrayList();
   @Nullable
   jo<bsw> Q;
   @Nullable
   jo<bsw> R;

   public fra(final cre $$0, cnw $$1, xe $$2) {
      super($$0, $$1, $$2);
      this.s = 230;
      this.u = 219;
      $$0.a(new crn() {
         @Override
         public void a(cqz $$0x, int $$1, cvs $$2) {
         }

         @Override
         public void a(cqz $$0x, int $$1, int $$2) {
            fra.this.Q = $$0.m();
            fra.this.R = $$0.n();
         }
      });
   }

   private <T extends fkm & fra.a> void a(T $$0) {
      this.c($$0);
      this.P.add($$0);
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.P.clear();
      this.a(new fra.c(this.C + 164, this.D + 107));
      this.a(new fra.b(this.C + 190, this.D + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = drq.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jo<bsw> $$4 = drq.a.get($$0).get($$3);
            fra.d $$5 = new fra.d(this.C + 76 + $$3 * 24 - $$2 / 2, this.D + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = drq.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jo<bsw> $$10 = drq.a.get(3).get($$9);
         fra.d $$11 = new fra.d(this.C + 167 + $$9 * 24 - $$8 / 2, this.D + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jo<bsw> $$12 = drq.a.get(0).get(0);
      fra.d $$13 = new fra.g(this.C + 167 + ($$7 - 1) * 24 - $$8 / 2, this.D + 47, $$12);
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
   protected void b(fkb $$0, int $$1, int $$2) {
      $$0.a(this.p, N, 62, 10, 14737632);
      $$0.a(this.p, O, 169, 10, 14737632);
   }

   @Override
   protected void a(fkb $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.n - this.s) / 2;
      int $$5 = (this.o - this.u) / 2;
      $$0.a(ghv::B, G, $$4, $$5, 0.0F, 0.0F, this.s, this.u, 256, 256);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cvs(cvw.oL), $$4 + 20, $$5 + 109);
      $$0.a(new cvs(cvw.oB), $$4 + 41, $$5 + 109);
      $$0.a(new cvs(cvw.oA), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cvs(cvw.oK), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cvs(cvw.oG), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fkb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fra.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fra.M, xd.e);
      }

      @Override
      public void b() {
         fra.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fra.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fra.L, xd.d);
      }

      @Override
      public void b() {
         fra.this.m.L().b(new aif(Optional.ofNullable(fra.this.Q), Optional.ofNullable(fra.this.R)));
         fra.this.m.t.s();
      }

      @Override
      public void a(int $$0) {
         this.j = fra.this.z.o() && fra.this.Q != null;
      }
   }

   class d extends fra.e {
      private final boolean c;
      protected final int a;
      private jo<bsw> d;
      private gxg f;

      public d(final int $$0, final int $$1, final jo<bsw> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jo<bsw> $$0) {
         this.d = $$0;
         this.f = fip.Q().aG().a($$0);
         this.a(flz.a(this.b($$0), null));
      }

      protected xs b(jo<bsw> $$0) {
         return xe.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fra.this.Q = this.d;
            } else {
               fra.this.R = this.d;
            }

            fra.this.F();
         }
      }

      @Override
      protected void a(fkb $$0) {
         $$0.a(ghv::B, this.f, this.D() + 2, this.E() + 2, 18, 18);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fra.this.Q : fra.this.R));
      }

      @Override
      protected xs aP_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fkf implements fra.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, xd.a);
      }

      protected e(int $$0, int $$1, xe $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fkb $$0, int $$1, int $$2, float $$3) {
         ale $$4;
         if (!this.j) {
            $$4 = fra.H;
         } else if (this.a) {
            $$4 = fra.I;
         } else if (this.B()) {
            $$4 = fra.J;
         } else {
            $$4 = fra.K;
         }

         $$0.a(ghv::B, $$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fkb var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fol $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fra.e {
      private final ale a;

      protected f(int $$0, int $$1, ale $$2, xe $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fkb $$0) {
         $$0.a(ghv::B, this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends fra.d {
      public g(final int $$0, final int $$1, final jo<bsw> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xs b(jo<bsw> $$0) {
         return xe.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fra.this.Q != null) {
            this.k = true;
            this.a(fra.this.Q);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
