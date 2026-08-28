import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fnz extends fne {
   static final alf a = new alf("gamemode_switcher/slot");
   static final alf b = new alf("gamemode_switcher/selection");
   private static final alf c = new alf("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int r = 128;
   private static final int s = 26;
   private static final int u = 5;
   private static final int v = 31;
   private static final int w = 5;
   private static final int x = fnz.a.values().length * 31 - 5;
   private static final xp y = xp.a("debug.gamemodes.select_next", xp.c("debug.gamemodes.press_f4").a(n.l));
   private final fnz.a z;
   private fnz.a A;
   private int B;
   private int C;
   private boolean D;
   private final List<fnz.b> E = Lists.newArrayList();

   public fnz() {
      super(fey.a);
      this.z = fnz.a.a(this.m());
      this.A = this.z;
   }

   private dbw m() {
      fyf $$0 = ffg.Q().q;
      dbw $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dbw.b ? dbw.a : dbw.b;
      }
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.A = this.z;

      for (int $$0 = 0; $$0 < fnz.a.e.length; $$0++) {
         fnz.a $$1 = fnz.a.e[$$0];
         this.E.add(new fnz.b($$1, this.n / 2 - x / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      if (!this.F()) {
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

         for (fnz.b $$7 : this.E) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.A == $$7.a);
            if (!$$6 && $$7.A()) {
               this.A = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fgs $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.m, this.A);
   }

   private static void a(ffg $$0, fnz.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fnz.a $$2 = fnz.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.cz.d($$1.b());
         }
      }
   }

   private boolean F() {
      if (!eyu.a(this.m.aO().i(), 292)) {
         this.E();
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
      a(xp.c("gameMode.creative"), "gamemode creative", new cuq(dfc.i)),
      b(xp.c("gameMode.survival"), "gamemode survival", new cuq(cut.pa)),
      c(xp.c("gameMode.adventure"), "gamemode adventure", new cuq(cut.uj)),
      d(xp.c("gameMode.spectator"), "gamemode spectator", new cuq(cut.ss));

      protected static final fnz.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xp g;
      final String h;
      final cuq i;

      private a(final xp $$0, final String $$1, final cuq $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fgs $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xp a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fnz.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fnz.a a(dbw $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fhd {
      final fnz.a a;
      private boolean b;

      public b(final fnz.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fgs $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.C() + 5, this.D() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(flb $$0) {
         this.c($$0);
      }

      @Override
      public boolean A() {
         return super.A() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fgs $$0) {
         $$0.a(fnz.a, this.C(), this.D(), 26, 26);
      }

      private void b(fgs $$0) {
         $$0.a(fnz.b, this.C(), this.D(), 26, 26);
      }
   }
}
