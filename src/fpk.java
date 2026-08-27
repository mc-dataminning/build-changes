import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fpk extends fon {
   static final akt a = new akt("gamemode_switcher/slot");
   static final akt b = new akt("gamemode_switcher/selection");
   private static final akt c = new akt("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int r = 128;
   private static final int s = 26;
   private static final int u = 5;
   private static final int v = 31;
   private static final int w = 5;
   private static final int x = fpk.a.values().length * 31 - 5;
   private static final xe y = xe.a("debug.gamemodes.select_next", xe.c("debug.gamemodes.press_f4").a(n.l));
   private final fpk.a z;
   private fpk.a A;
   private int B;
   private int C;
   private boolean D;
   private final List<fpk.b> E = Lists.newArrayList();

   public fpk() {
      super(fgb.a);
      this.z = fpk.a.a(this.B());
      this.A = this.z;
   }

   private dbx B() {
      fzw $$0 = fgj.Q().q;
      dbx $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dbx.b ? dbx.a : dbx.b;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.A = this.z;

      for (int $$0 = 0; $$0 < fpk.a.e.length; $$0++) {
         fpk.a $$1 = fpk.a.e[$$0];
         this.E.add(new fpk.b($$1, this.n / 2 - x / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      if (!this.D()) {
         $$0.c().a();
         RenderSystem.enableBlend();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.p, this.A.a(), this.n / 2, this.o / 2 - 31 - 20, -1);
         $$0.a(this.p, y, this.n / 2, this.o / 2 + 5, 16777215);
         if (!this.D) {
            this.B = $$1;
            this.C = $$2;
            this.D = true;
         }

         boolean $$6 = this.B == $$1 && this.C == $$2;

         for (fpk.b $$7 : this.E) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.A == $$7.b);
            if (!$$6 && $$7.A()) {
               this.A = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(fia $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.m, this.A);
   }

   private static void a(fgj $$0, fpk.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fpk.a $$2 = fpk.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.h.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!ezx.a(this.m.aP().i(), 292)) {
         this.C();
         this.m.a(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 293) {
         this.D = false;
         this.A = this.A.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean k() {
      return false;
   }

   static enum a {
      a(xe.c("gameMode.creative"), "gamemode creative", new cuh(dfe.k)),
      b(xe.c("gameMode.survival"), "gamemode survival", new cuh(cuk.qt)),
      c(xe.c("gameMode.adventure"), "gamemode adventure", new cuh(cuk.vU)),
      d(xe.c("gameMode.spectator"), "gamemode spectator", new cuh(cuk.tP));

      protected static final fpk.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xe g;
      final String h;
      final cuh i;

      private a(xe $$0, String $$1, cuh $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fia $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xe a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fpk.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fpk.a a(dbx $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fil {
      final fpk.a b;
      private boolean c;

      public b(fpk.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(fia $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.C() + 5, this.D() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(fmj $$0) {
         this.c($$0);
      }

      @Override
      public boolean A() {
         return super.A() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(fia $$0) {
         $$0.a(fpk.a, this.C(), this.D(), 26, 26);
      }

      private void b(fia $$0) {
         $$0.a(fpk.b, this.C(), this.D(), 26, 26);
      }
   }
}
