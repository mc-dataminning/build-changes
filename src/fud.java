import com.google.common.collect.Lists;
import java.util.List;

public class fud extends ftr {
   static final alp a = alp.b("gamemode_switcher/slot");
   static final alp b = alp.b("gamemode_switcher/selection");
   private static final alp c = alp.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fud.a.values().length * 31 - 5;
   private static final xk z = xk.a("debug.gamemodes.select_next", xk.c("debug.gamemodes.press_f4").a(n.l));
   private final fud.a A;
   private fud.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fud.b> F = Lists.newArrayList();

   public fud() {
      super(flq.a);
      this.A = fud.a.a(this.l());
      this.B = this.A;
   }

   private dgw l() {
      gfp $$0 = flz.Q().r;
      dgw $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dgw.b ? dgw.a : dgw.b;
      }
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < fud.a.e.length; $$0++) {
         fud.a $$1 = fud.a.e[$$0];
         this.F.add(new fud.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      if (!this.F()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(glq::H, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
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

         for (fud.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.B()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fnl $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.m, this.B);
   }

   private static void a(flz $$0, fud.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         fud.a $$2 = fud.a.a($$0.r.j());
         if ($$0.t.s(2) && $$1 != $$2) {
            $$0.t.j.d($$1.b());
         }
      }
   }

   private boolean F() {
      if (!ffg.a(this.m.aO().h(), 292)) {
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
         this.E = false;
         this.B = this.B.c();
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   @Override
   public boolean j() {
      return false;
   }

   static enum a {
      a(xk.c("gameMode.creative"), "gamemode creative", new cxg(dkf.i)),
      b(xk.c("gameMode.survival"), "gamemode survival", new cxg(cxk.pG)),
      c(xk.c("gameMode.adventure"), "gamemode adventure", new cxg(cxk.vi)),
      d(xk.c("gameMode.spectator"), "gamemode spectator", new cxg(cxk.tp));

      protected static final fud.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xk g;
      final String h;
      final cxg i;

      private a(final xk $$0, final String $$1, final cxg $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fnl $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xk a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fud.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fud.a a(dgw $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fnw {
      final fud.a a;
      private boolean b;

      public b(final fud.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fnl $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(frw $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fnl $$0) {
         $$0.a(glq::H, fud.a, this.D(), this.E(), 26, 26);
      }

      private void b(fnl $$0) {
         $$0.a(glq::H, fud.b, this.D(), this.E(), 26, 26);
      }
   }
}
