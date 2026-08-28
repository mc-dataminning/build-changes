import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fop extends fod {
   static final akr a = akr.b("gamemode_switcher/slot");
   static final akr b = akr.b("gamemode_switcher/selection");
   private static final akr c = akr.b("textures/gui/container/gamemode_switcher.png");
   private static final int r = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fop.a.values().length * 31 - 5;
   private static final wz z = wz.a("debug.gamemodes.select_next", wz.c("debug.gamemodes.press_f4").a(n.l));
   private final fop.a A;
   private fop.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fop.b> F = Lists.newArrayList();

   public fop() {
      super(fgg.a);
      this.A = fop.a.a(this.m());
      this.B = this.A;
   }

   private dct m() {
      fzo $$0 = fgo.Q().q;
      dct $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dct.b ? dct.a : dct.b;
      }
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < fop.a.e.length; $$0++) {
         fop.a $$1 = fop.a.e[$$0];
         this.F.add(new fop.b($$1, this.m / 2 - y / 2 + $$0 * 31, this.n / 2 - 31));
      }
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      if (!this.D()) {
         $$0.c().a();
         RenderSystem.enableBlend();
         int $$4 = this.m / 2 - 62;
         int $$5 = this.n / 2 - 31 - 27;
         $$0.a(c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.o, this.B.a(), this.m / 2, this.n / 2 - 31 - 20, -1);
         $$0.a(this.o, z, this.m / 2, this.n / 2 + 5, 16777215);
         if (!this.E) {
            this.C = $$1;
            this.D = $$2;
            this.E = true;
         }

         boolean $$6 = this.C == $$1 && this.D == $$2;

         for (fop.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.B()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fhz $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.l, this.B);
   }

   private static void a(fgo $$0, fop.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fop.a $$2 = fop.a.a($$0.q.j());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.h.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!fae.a(this.l.aM().j(), 292)) {
         this.C();
         this.l.a(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 293) {
         this.E = false;
         this.B = this.B.c();
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
      a(wz.c("gameMode.creative"), "gamemode creative", new cuq(dga.i)),
      b(wz.c("gameMode.survival"), "gamemode survival", new cuq(cut.pb)),
      c(wz.c("gameMode.adventure"), "gamemode adventure", new cuq(cut.uj)),
      d(wz.c("gameMode.spectator"), "gamemode spectator", new cuq(cut.ss));

      protected static final fop.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wz g;
      final String h;
      final cuq i;

      private a(final wz $$0, final String $$1, final cuq $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fhz $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wz a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fop.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fop.a a(dct $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fik {
      final fop.a a;
      private boolean b;

      public b(final fop.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fhz $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fmi $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fhz $$0) {
         $$0.a(fop.a, this.D(), this.E(), 26, 26);
      }

      private void b(fhz $$0) {
         $$0.a(fop.b, this.D(), this.E(), 26, 26);
      }
   }
}
