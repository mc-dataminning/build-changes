import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fmu extends flz {
   static final akn a = new akn("gamemode_switcher/slot");
   static final akn b = new akn("gamemode_switcher/selection");
   private static final akn c = new akn("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int r = 128;
   private static final int s = 26;
   private static final int u = 5;
   private static final int v = 31;
   private static final int w = 5;
   private static final int x = fmu.a.values().length * 31 - 5;
   private static final wx y = wx.a("debug.gamemodes.select_next", wx.c("debug.gamemodes.press_f4").a(n.l));
   private final fmu.a z;
   private fmu.a A;
   private int B;
   private int C;
   private boolean D;
   private final List<fmu.b> E = Lists.newArrayList();

   public fmu() {
      super(fdt.a);
      this.z = fmu.a.a(this.m());
      this.A = this.z;
   }

   private daw m() {
      fxa $$0 = feb.Q().q;
      daw $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == daw.b ? daw.a : daw.b;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.A = this.z;

      for (int $$0 = 0; $$0 < fmu.a.e.length; $$0++) {
         fmu.a $$1 = fmu.a.e[$$0];
         this.E.add(new fmu.b($$1, this.n / 2 - x / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
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

         for (fmu.b $$7 : this.E) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.A == $$7.a);
            if (!$$6 && $$7.A()) {
               this.A = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(ffn $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.m, this.A);
   }

   private static void a(feb $$0, fmu.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fmu.a $$2 = fmu.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.cz.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!exp.a(this.m.aO().i(), 292)) {
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
      a(wx.c("gameMode.creative"), "gamemode creative", new ctq(dec.i)),
      b(wx.c("gameMode.survival"), "gamemode survival", new ctq(ctt.pa)),
      c(wx.c("gameMode.adventure"), "gamemode adventure", new ctq(ctt.uj)),
      d(wx.c("gameMode.spectator"), "gamemode spectator", new ctq(ctt.ss));

      protected static final fmu.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wx g;
      final String h;
      final ctq i;

      private a(wx $$0, String $$1, ctq $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(ffn $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wx a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fmu.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fmu.a a(daw $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends ffy {
      final fmu.a a;
      private boolean b;

      public b(fmu.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(ffn $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.C() + 5, this.D() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fjw $$0) {
         this.c($$0);
      }

      @Override
      public boolean A() {
         return super.A() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(ffn $$0) {
         $$0.a(fmu.a, this.C(), this.D(), 26, 26);
      }

      private void b(ffn $$0) {
         $$0.a(fmu.b, this.C(), this.D(), 26, 26);
      }
   }
}
