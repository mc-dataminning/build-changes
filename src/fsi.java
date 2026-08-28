import com.google.common.collect.Lists;
import java.util.List;

public class fsi extends frw {
   static final alj a = alj.b("gamemode_switcher/slot");
   static final alj b = alj.b("gamemode_switcher/selection");
   private static final alj c = alj.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fsi.a.values().length * 31 - 5;
   private static final xj z = xj.a("debug.gamemodes.select_next", xj.c("debug.gamemodes.press_f4").a(n.l));
   private final fsi.a A;
   private fsi.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fsi.b> F = Lists.newArrayList();

   public fsi() {
      super(fjv.a);
      this.A = fsi.a.a(this.m());
      this.B = this.A;
   }

   private dfj m() {
      gdq $$0 = fke.Q().r;
      dfj $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dfj.b ? dfj.a : dfj.b;
      }
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < fsi.a.e.length; $$0++) {
         fsi.a $$1 = fsi.a.e[$$0];
         this.F.add(new fsi.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
      if (!this.G()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(gjq::B, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
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

         for (fsi.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.B()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(flq $$0, int $$1, int $$2, float $$3) {
   }

   private void F() {
      a(this.m, this.B);
   }

   private static void a(fke $$0, fsi.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         fsi.a $$2 = fsi.a.a($$0.r.j());
         if ($$0.t.s(2) && $$1 != $$2) {
            $$0.t.i.d($$1.b());
         }
      }
   }

   private boolean G() {
      if (!fdm.a(this.m.aO().h(), 292)) {
         this.F();
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
      a(xj.c("gameMode.creative"), "gamemode creative", new cwm(dis.i)),
      b(xj.c("gameMode.survival"), "gamemode survival", new cwm(cwq.pc)),
      c(xj.c("gameMode.adventure"), "gamemode adventure", new cwm(cwq.uB)),
      d(xj.c("gameMode.spectator"), "gamemode spectator", new cwm(cwq.sJ));

      protected static final fsi.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xj g;
      final String h;
      final cwm i;

      private a(final xj $$0, final String $$1, final cwm $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(flq $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xj a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fsi.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fsi.a a(dfj $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fmb {
      final fsi.a a;
      private boolean b;

      public b(final fsi.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(flq $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fqb $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(flq $$0) {
         $$0.a(gjq::B, fsi.a, this.D(), this.E(), 26, 26);
      }

      private void b(flq $$0) {
         $$0.a(gjq::B, fsi.b, this.D(), this.E(), 26, 26);
      }
   }
}
