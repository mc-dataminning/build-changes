import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class foj extends fnx {
   static final akq a = akq.b("gamemode_switcher/slot");
   static final akq b = akq.b("gamemode_switcher/selection");
   private static final akq c = akq.b("textures/gui/container/gamemode_switcher.png");
   private static final int q = 128;
   private static final int r = 128;
   private static final int s = 26;
   private static final int u = 5;
   private static final int v = 31;
   private static final int w = 5;
   private static final int x = foj.a.values().length * 31 - 5;
   private static final wy y = wy.a("debug.gamemodes.select_next", wy.c("debug.gamemodes.press_f4").a(n.l));
   private final foj.a z;
   private foj.a A;
   private int B;
   private int C;
   private boolean D;
   private final List<foj.b> E = Lists.newArrayList();

   public foj() {
      super(fga.a);
      this.z = foj.a.a(this.m());
      this.A = this.z;
   }

   private dcr m() {
      fzi $$0 = fgi.Q().q;
      dcr $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dcr.b ? dcr.a : dcr.b;
      }
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.A = this.z;

      for (int $$0 = 0; $$0 < foj.a.e.length; $$0++) {
         foj.a $$1 = foj.a.e[$$0];
         this.E.add(new foj.b($$1, this.m / 2 - x / 2 + $$0 * 31, this.n / 2 - 31));
      }
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      if (!this.E()) {
         $$0.c().a();
         RenderSystem.enableBlend();
         int $$4 = this.m / 2 - 62;
         int $$5 = this.n / 2 - 31 - 27;
         $$0.a(c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.o, this.A.a(), this.m / 2, this.n / 2 - 31 - 20, -1);
         $$0.a(this.o, y, this.m / 2, this.n / 2 + 5, 16777215);
         if (!this.D) {
            this.B = $$1;
            this.C = $$2;
            this.D = true;
         }

         boolean $$6 = this.B == $$1 && this.C == $$2;

         for (foj.b $$7 : this.E) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.A == $$7.a);
            if (!$$6 && $$7.B()) {
               this.A = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fht $$0, int $$1, int $$2, float $$3) {
   }

   private void D() {
      a(this.l, this.A);
   }

   private static void a(fgi $$0, foj.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         foj.a $$2 = foj.a.a($$0.q.j());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.h.d($$1.b());
         }
      }
   }

   private boolean E() {
      if (!ezy.a(this.l.aM().j(), 292)) {
         this.D();
         this.l.a(null);
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
      a(wy.c("gameMode.creative"), "gamemode creative", new cuo(dfy.i)),
      b(wy.c("gameMode.survival"), "gamemode survival", new cuo(cur.pb)),
      c(wy.c("gameMode.adventure"), "gamemode adventure", new cuo(cur.uj)),
      d(wy.c("gameMode.spectator"), "gamemode spectator", new cuo(cur.ss));

      protected static final foj.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wy g;
      final String h;
      final cuo i;

      private a(final wy $$0, final String $$1, final cuo $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fht $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wy a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      foj.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static foj.a a(dcr $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fie {
      final foj.a a;
      private boolean b;

      public b(final foj.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fht $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fmc $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fht $$0) {
         $$0.a(foj.a, this.D(), this.E(), 26, 26);
      }

      private void b(fht $$0) {
         $$0.a(foj.b, this.D(), this.E(), 26, 26);
      }
   }
}
