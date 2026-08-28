import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fox extends fot<cpy> {
   private static final akr E = akr.b("textures/gui/container/beacon.png");
   static final akr F = akr.b("container/beacon/button_disabled");
   static final akr G = akr.b("container/beacon/button_selected");
   static final akr H = akr.b("container/beacon/button_highlighted");
   static final akr I = akr.b("container/beacon/button");
   static final akr J = akr.b("container/beacon/confirm");
   static final akr K = akr.b("container/beacon/cancel");
   private static final wz L = wz.c("block.minecraft.beacon.primary");
   private static final wz M = wz.c("block.minecraft.beacon.secondary");
   private final List<fox.a> N = Lists.newArrayList();
   @Nullable
   jm<brx> O;
   @Nullable
   jm<brx> P;

   public fox(final cpy $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.r = 219;
      $$0.a(new cqh() {
         @Override
         public void a(cpu $$0x, int $$1, cuq $$2) {
         }

         @Override
         public void a(cpu $$0x, int $$1, int $$2) {
            fox.this.O = $$0.m();
            fox.this.P = $$0.n();
         }
      });
   }

   private <T extends fik & fox.a> void a(T $$0) {
      this.c($$0);
      this.N.add($$0);
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.N.clear();
      this.a(new fox.c(this.A + 164, this.B + 107));
      this.a(new fox.b(this.A + 190, this.B + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dqc.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            jm<brx> $$4 = dqc.a.get($$0).get($$3);
            fox.d $$5 = new fox.d(this.A + 76 + $$3 * 24 - $$2 / 2, this.B + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dqc.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         jm<brx> $$10 = dqc.a.get(3).get($$9);
         fox.d $$11 = new fox.d(this.A + 167 + $$9 * 24 - $$8 / 2, this.B + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      jm<brx> $$12 = dqc.a.get(0).get(0);
      fox.d $$13 = new fox.g(this.A + 167 + ($$7 - 1) * 24 - $$8 / 2, this.B + 47, $$12);
      $$13.k = false;
      this.a($$13);
   }

   @Override
   public void C() {
      super.C();
      this.E();
   }

   void E() {
      int $$0 = this.x.l();
      this.N.forEach($$1 -> $$1.a($$0));
   }

   @Override
   protected void b(fhz $$0, int $$1, int $$2) {
      $$0.a(this.o, L, 62, 10, 14737632);
      $$0.a(this.o, M, 169, 10, 14737632);
   }

   @Override
   protected void a(fhz $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.m - this.c) / 2;
      int $$5 = (this.n - this.r) / 2;
      $$0.a(E, $$4, $$5, 0, 0, this.c, this.r);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cuq(cut.oK), $$4 + 20, $$5 + 109);
      $$0.a(new cuq(cut.oA), $$4 + 41, $$5 + 109);
      $$0.a(new cuq(cut.oz), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cuq(cut.oJ), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cuq(cut.oF), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fox.f {
      public b(final int $$0, final int $$1) {
         super($$0, $$1, fox.K, wy.e);
      }

      @Override
      public void b() {
         fox.this.l.s.s();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fox.f {
      public c(final int $$0, final int $$1) {
         super($$0, $$1, fox.J, wy.d);
      }

      @Override
      public void b() {
         fox.this.l.L().b(new ahu(Optional.ofNullable(fox.this.O), Optional.ofNullable(fox.this.P)));
         fox.this.l.s.s();
      }

      @Override
      public void a(int $$0) {
         this.j = fox.this.x.o() && fox.this.O != null;
      }
   }

   class d extends fox.e {
      private final boolean c;
      protected final int a;
      private jm<brx> d;
      private gql f;

      public d(final int $$0, final int $$1, final jm<brx> $$2, final boolean $$3, final int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(jm<brx> $$0) {
         this.d = $$0;
         this.f = fgo.Q().aE().a($$0);
         this.a(fjx.a(this.b($$0), null));
      }

      protected xn b(jm<brx> $$0) {
         return wz.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fox.this.O = this.d;
            } else {
               fox.this.P = this.d;
            }

            fox.this.E();
         }
      }

      @Override
      protected void a(fhz $$0) {
         $$0.a(this.D() + 2, this.E() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fox.this.O : fox.this.P));
      }

      @Override
      protected xn aQ_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends fid implements fox.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, wy.a);
      }

      protected e(int $$0, int $$1, wz $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fhz $$0, int $$1, int $$2, float $$3) {
         akr $$4;
         if (!this.j) {
            $$4 = fox.F;
         } else if (this.a) {
            $$4 = fox.G;
         } else if (this.B()) {
            $$4 = fox.H;
         } else {
            $$4 = fox.I;
         }

         $$0.a($$4, this.D(), this.E(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fhz var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(fmi $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fox.e {
      private final akr a;

      protected f(int $$0, int $$1, akr $$2, wz $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fhz $$0) {
         $$0.a(this.a, this.D() + 2, this.E() + 2, 18, 18);
      }
   }

   class g extends fox.d {
      public g(final int $$0, final int $$1, final jm<brx> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected xn b(jm<brx> $$0) {
         return wz.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fox.this.O != null) {
            this.k = true;
            this.a(fox.this.O);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
