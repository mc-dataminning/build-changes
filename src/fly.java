import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fly extends fld {
   static final akh a = new akh("gamemode_switcher/slot");
   static final akh b = new akh("gamemode_switcher/selection");
   private static final akh c = new akh("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int r = 128;
   private static final int s = 26;
   private static final int u = 5;
   private static final int v = 31;
   private static final int w = 5;
   private static final int x = fly.a.values().length * 31 - 5;
   private static final wu y = wu.a("debug.gamemodes.select_next", wu.c("debug.gamemodes.press_f4").a(n.l));
   private final fly.a z;
   private fly.a A;
   private int B;
   private int C;
   private boolean D;
   private final List<fly.b> E = Lists.newArrayList();

   public fly() {
      super(fcw.a);
      this.z = fly.a.a(this.m());
      this.A = this.z;
   }

   private daa m() {
      fwf $$0 = fde.Q().q;
      daa $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == daa.b ? daa.a : daa.b;
      }
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.A = this.z;

      for (int $$0 = 0; $$0 < fly.a.e.length; $$0++) {
         fly.a $$1 = fly.a.e[$$0];
         this.E.add(new fly.b($$1, this.n / 2 - x / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
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

         for (fly.b $$7 : this.E) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.A == $$7.b);
            if (!$$6 && $$7.A()) {
               this.A = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(fer $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.m, this.A);
   }

   private static void a(fde $$0, fly.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fly.a $$2 = fly.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.h.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!ews.a(this.m.aP().i(), 292)) {
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
      a(wu.c("gameMode.creative"), "gamemode creative", new csz(ddg.i)),
      b(wu.c("gameMode.survival"), "gamemode survival", new csz(ctc.pa)),
      c(wu.c("gameMode.adventure"), "gamemode adventure", new csz(ctc.uj)),
      d(wu.c("gameMode.spectator"), "gamemode spectator", new csz(ctc.ss));

      protected static final fly.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wu g;
      final String h;
      final csz i;

      private a(wu $$0, String $$1, csz $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fer $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wu a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fly.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fly.a a(daa $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends ffc {
      final fly.a b;
      private boolean c;

      public b(fly.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(fer $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.C() + 5, this.D() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(fja $$0) {
         this.c($$0);
      }

      @Override
      public boolean A() {
         return super.A() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(fer $$0) {
         $$0.a(fly.a, this.C(), this.D(), 26, 26);
      }

      private void b(fer $$0) {
         $$0.a(fly.b, this.C(), this.D(), 26, 26);
      }
   }
}
