import com.google.common.collect.Lists;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

public class fik extends fig<clt> {
   private static final ajh x = new ajh("textures/gui/container/beacon.png");
   static final ajh y = new ajh("container/beacon/button_disabled");
   static final ajh z = new ajh("container/beacon/button_selected");
   static final ajh A = new ajh("container/beacon/button_highlighted");
   static final ajh B = new ajh("container/beacon/button");
   static final ajh C = new ajh("container/beacon/confirm");
   static final ajh D = new ajh("container/beacon/cancel");
   private static final vu E = vu.c("block.minecraft.beacon.primary");
   private static final vu F = vu.c("block.minecraft.beacon.secondary");
   private final List<fik.a> G = Lists.newArrayList();
   @Nullable
   il<boi> H;
   @Nullable
   il<boi> I;

   public fik(final clt $$0, cit $$1, vu $$2) {
      super($$0, $$1, $$2);
      this.c = 230;
      this.k = 219;
      $$0.a(new cmc() {
         @Override
         public void a(clq $$0x, int $$1, cqm $$2) {
         }

         @Override
         public void a(clq $$0x, int $$1, int $$2) {
            fik.this.H = $$0.m();
            fik.this.I = $$0.n();
         }
      });
   }

   private <T extends fbg & fik.a> void a(T $$0) {
      this.c($$0);
      this.G.add($$0);
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.G.clear();
      this.a(new fik.c(this.t + 164, this.u + 107));
      this.a(new fik.b(this.t + 190, this.u + 107));

      for (int $$0 = 0; $$0 <= 2; $$0++) {
         int $$1 = dkd.a.get($$0).size();
         int $$2 = $$1 * 22 + ($$1 - 1) * 2;

         for (int $$3 = 0; $$3 < $$1; $$3++) {
            il<boi> $$4 = dkd.a.get($$0).get($$3);
            fik.d $$5 = new fik.d(this.t + 76 + $$3 * 24 - $$2 / 2, this.u + 22 + $$0 * 25, $$4, true, $$0);
            $$5.j = false;
            this.a($$5);
         }
      }

      int $$6 = 3;
      int $$7 = dkd.a.get(3).size() + 1;
      int $$8 = $$7 * 22 + ($$7 - 1) * 2;

      for (int $$9 = 0; $$9 < $$7 - 1; $$9++) {
         il<boi> $$10 = dkd.a.get(3).get($$9);
         fik.d $$11 = new fik.d(this.t + 167 + $$9 * 24 - $$8 / 2, this.u + 47, $$10, false, 3);
         $$11.j = false;
         this.a($$11);
      }

      il<boi> $$12 = dkd.a.get(0).get(0);
      fik.d $$13 = new fik.g(this.t + 167 + ($$7 - 1) * 24 - $$8 / 2, this.u + 47, $$12);
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
   protected void b(fav $$0, int $$1, int $$2) {
      $$0.a(this.i, E, 62, 10, 14737632);
      $$0.a(this.i, F, 169, 10, 14737632);
   }

   @Override
   protected void a(fav $$0, float $$1, int $$2, int $$3) {
      int $$4 = (this.g - this.c) / 2;
      int $$5 = (this.h - this.k) / 2;
      $$0.a(x, $$4, $$5, 0, 0, this.c, this.k);
      $$0.c().a();
      $$0.c().a(0.0F, 0.0F, 100.0F);
      $$0.a(new cqm(cqp.oI), $$4 + 20, $$5 + 109);
      $$0.a(new cqm(cqp.oy), $$4 + 41, $$5 + 109);
      $$0.a(new cqm(cqp.ox), $$4 + 41 + 22, $$5 + 109);
      $$0.a(new cqm(cqp.oH), $$4 + 42 + 44, $$5 + 109);
      $$0.a(new cqm(cqp.oD), $$4 + 42 + 66, $$5 + 109);
      $$0.c().b();
   }

   @Override
   public void a(fav $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   interface a {
      void a(int var1);
   }

   class b extends fik.f {
      public b(int $$0, int $$1) {
         super($$0, $$1, fik.D, vt.e);
      }

      @Override
      public void b() {
         fik.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
      }
   }

   class c extends fik.f {
      public c(int $$0, int $$1) {
         super($$0, $$1, fik.C, vt.d);
      }

      @Override
      public void b() {
         fik.this.f.L().b(new agk(Optional.ofNullable(fik.this.H), Optional.ofNullable(fik.this.I)));
         fik.this.f.s.r();
      }

      @Override
      public void a(int $$0) {
         this.j = fik.this.p.o() && fik.this.H != null;
      }
   }

   class d extends fik.e {
      private final boolean c;
      protected final int a;
      private il<boi> d;
      private gjc f;

      public d(int $$0, int $$1, il<boi> $$2, boolean $$3, int $$4) {
         super($$0, $$1);
         this.c = $$3;
         this.a = $$4;
         this.a($$2);
      }

      protected void a(il<boi> $$0) {
         this.d = $$0;
         this.f = ezi.Q().aG().a($$0);
         this.a(fct.a(this.b($$0), null));
      }

      protected wi b(il<boi> $$0) {
         return vu.c($$0.a().d());
      }

      @Override
      public void b() {
         if (!this.a()) {
            if (this.c) {
               fik.this.H = this.d;
            } else {
               fik.this.I = this.d;
            }

            fik.this.I();
         }
      }

      @Override
      protected void a(fav $$0) {
         $$0.a(this.B() + 2, this.C() + 2, 0, 18, 18, this.f);
      }

      @Override
      public void a(int $$0) {
         this.j = this.a < $$0;
         this.b(this.d.equals(this.c ? fik.this.H : fik.this.I));
      }

      @Override
      protected wi aL_() {
         return this.b(this.d);
      }
   }

   abstract static class e extends faz implements fik.a {
      private boolean a;

      protected e(int $$0, int $$1) {
         super($$0, $$1, 22, 22, vt.a);
      }

      protected e(int $$0, int $$1, vu $$2) {
         super($$0, $$1, 22, 22, $$2);
      }

      @Override
      public void b(fav $$0, int $$1, int $$2, float $$3) {
         ajh $$4;
         if (!this.j) {
            $$4 = fik.y;
         } else if (this.a) {
            $$4 = fik.z;
         } else if (this.z()) {
            $$4 = fik.A;
         } else {
            $$4 = fik.B;
         }

         $$0.a($$4, this.B(), this.C(), this.g, this.h);
         this.a($$0);
      }

      protected abstract void a(fav var1);

      public boolean a() {
         return this.a;
      }

      public void b(boolean $$0) {
         this.a = $$0;
      }

      @Override
      public void a(ffe $$0) {
         this.c($$0);
      }
   }

   abstract static class f extends fik.e {
      private final ajh a;

      protected f(int $$0, int $$1, ajh $$2, vu $$3) {
         super($$0, $$1, $$3);
         this.a = $$2;
      }

      @Override
      protected void a(fav $$0) {
         $$0.a(this.a, this.B() + 2, this.C() + 2, 18, 18);
      }
   }

   class g extends fik.d {
      public g(int $$0, int $$1, il<boi> $$2) {
         super($$0, $$1, $$2, false, 3);
      }

      @Override
      protected wi b(il<boi> $$0) {
         return vu.c($$0.a().d()).f(" II");
      }

      @Override
      public void a(int $$0) {
         if (fik.this.H != null) {
            this.k = true;
            this.a(fik.this.H);
            super.a($$0);
         } else {
            this.k = false;
         }
      }
   }
}
