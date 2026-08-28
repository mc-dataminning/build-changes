import com.google.common.collect.Lists;
import java.util.List;

public class fsb extends frp {
   static final all a = all.b("gamemode_switcher/slot");
   static final all b = all.b("gamemode_switcher/selection");
   private static final all c = all.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fsb.a.values().length * 31 - 5;
   private static final xl z = xl.a("debug.gamemodes.select_next", xl.c("debug.gamemodes.press_f4").a(n.l));
   private final fsb.a A;
   private fsb.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fsb.b> F = Lists.newArrayList();

   public fsb() {
      super(fjo.a);
      this.A = fsb.a.a(this.m());
      this.B = this.A;
   }

   private dfc m() {
      gdh $$0 = fjx.Q().r;
      dfc $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dfc.b ? dfc.a : dfc.b;
      }
   }

   @Override
   protected void aS_() {
      super.aS_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < fsb.a.e.length; $$0++) {
         fsb.a $$1 = fsb.a.e[$$0];
         this.F.add(new fsb.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      if (!this.E()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(gjh::B, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.p, this.B.a(), this.n / 2, this.o / 2 - 31 - 20, -1);
         $$0.a(this.p, z, this.n / 2, this.o / 2 + 5, 16777215);
         if (!this.E) {
            this.C = $$1;
            this.D = $$2;
            this.E = true;
         }

         boolean $$6 = this.C == $$1 && this.D == $$2;

         for (fsb.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.B()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(flj $$0, int $$1, int $$2, float $$3) {
   }

   private void D() {
      a(this.m, this.B);
   }

   private static void a(fjx $$0, fsb.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         fsb.a $$2 = fsb.a.a($$0.r.j());
         if ($$0.t.l(2) && $$1 != $$2) {
            $$0.t.j.d($$1.b());
         }
      }
   }

   private boolean E() {
      if (!fdf.a(this.m.aO().h(), 292)) {
         this.D();
         this.m.a(null);
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
      a(xl.c("gameMode.creative"), "gamemode creative", new cwf(dil.i)),
      b(xl.c("gameMode.survival"), "gamemode survival", new cwf(cwj.pc)),
      c(xl.c("gameMode.adventure"), "gamemode adventure", new cwf(cwj.uB)),
      d(xl.c("gameMode.spectator"), "gamemode spectator", new cwf(cwj.sJ));

      protected static final fsb.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xl g;
      final String h;
      final cwf i;

      private a(final xl $$0, final String $$1, final cwf $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(flj $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xl a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fsb.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fsb.a a(dfc $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends flu {
      final fsb.a a;
      private boolean b;

      public b(final fsb.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(flj $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fpu $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(flj $$0) {
         $$0.a(gjh::B, fsb.a, this.D(), this.E(), 26, 26);
      }

      private void b(flj $$0) {
         $$0.a(gjh::B, fsb.b, this.D(), this.E(), 26, 26);
      }
   }
}
