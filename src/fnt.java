import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fnt extends fmy {
   static final alb a = new alb("gamemode_switcher/slot");
   static final alb b = new alb("gamemode_switcher/selection");
   private static final alb c = new alb("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int r = 128;
   private static final int s = 26;
   private static final int u = 5;
   private static final int v = 31;
   private static final int w = 5;
   private static final int x = fnt.a.values().length * 31 - 5;
   private static final xl y = xl.a("debug.gamemodes.select_next", xl.c("debug.gamemodes.press_f4").a(n.l));
   private final fnt.a z;
   private fnt.a A;
   private int B;
   private int C;
   private boolean D;
   private final List<fnt.b> E = Lists.newArrayList();

   public fnt() {
      super(fes.a);
      this.z = fnt.a.a(this.m());
      this.A = this.z;
   }

   private dbq m() {
      fxz $$0 = ffa.Q().q;
      dbq $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dbq.b ? dbq.a : dbq.b;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.A = this.z;

      for (int $$0 = 0; $$0 < fnt.a.e.length; $$0++) {
         fnt.a $$1 = fnt.a.e[$$0];
         this.E.add(new fnt.b($$1, this.n / 2 - x / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
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

         for (fnt.b $$7 : this.E) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.A == $$7.a);
            if (!$$6 && $$7.A()) {
               this.A = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fgm $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.m, this.A);
   }

   private static void a(ffa $$0, fnt.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fnt.a $$2 = fnt.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.cz.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!eyo.a(this.m.aO().i(), 292)) {
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
      a(xl.c("gameMode.creative"), "gamemode creative", new cuk(dew.i)),
      b(xl.c("gameMode.survival"), "gamemode survival", new cuk(cun.pa)),
      c(xl.c("gameMode.adventure"), "gamemode adventure", new cuk(cun.uj)),
      d(xl.c("gameMode.spectator"), "gamemode spectator", new cuk(cun.ss));

      protected static final fnt.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xl g;
      final String h;
      final cuk i;

      private a(final xl $$0, final String $$1, final cuk $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fgm $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xl a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fnt.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fnt.a a(dbq $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fgx {
      final fnt.a a;
      private boolean b;

      public b(final fnt.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fgm $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.C() + 5, this.D() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fkv $$0) {
         this.c($$0);
      }

      @Override
      public boolean A() {
         return super.A() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fgm $$0) {
         $$0.a(fnt.a, this.C(), this.D(), 26, 26);
      }

      private void b(fgm $$0) {
         $$0.a(fnt.b, this.C(), this.D(), 26, 26);
      }
   }
}
