import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fks extends fjx {
   static final ajv a = new ajv("gamemode_switcher/slot");
   static final ajv b = new ajv("gamemode_switcher/selection");
   private static final ajv c = new ajv("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int o = 128;
   private static final int p = 26;
   private static final int q = 5;
   private static final int r = 31;
   private static final int s = 5;
   private static final int u = fks.a.values().length * 31 - 5;
   private static final wi v = wi.a("debug.gamemodes.select_next", wi.c("debug.gamemodes.press_f4").a(n.l));
   private final fks.a w;
   private fks.a x;
   private int y;
   private int z;
   private boolean A;
   private final List<fks.b> B = Lists.newArrayList();

   public fks() {
      super(fbq.a);
      this.w = fks.a.a(this.m());
      this.x = this.w;
   }

   private czd m() {
      fuz $$0 = fby.Q().q;
      czd $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == czd.b ? czd.a : czd.b;
      }
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.x = this.w;

      for (int $$0 = 0; $$0 < fks.a.e.length; $$0++) {
         fks.a $$1 = fks.a.e[$$0];
         this.B.add(new fks.b($$1, this.k / 2 - u / 2 + $$0 * 31, this.l / 2 - 31));
      }
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      if (!this.D()) {
         $$0.c().a();
         RenderSystem.enableBlend();
         int $$4 = this.k / 2 - 62;
         int $$5 = this.l / 2 - 31 - 27;
         $$0.a(c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.m, this.x.a(), this.k / 2, this.l / 2 - 31 - 20, -1);
         $$0.a(this.m, v, this.k / 2, this.l / 2 + 5, 16777215);
         if (!this.A) {
            this.y = $$1;
            this.z = $$2;
            this.A = true;
         }

         boolean $$6 = this.y == $$1 && this.z == $$2;

         for (fks.b $$7 : this.B) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.x == $$7.b);
            if (!$$6 && $$7.A()) {
               this.x = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(fdl $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.j, this.x);
   }

   private static void a(fby $$0, fks.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fks.a $$2 = fks.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.cv.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!evm.a(this.j.aO().i(), 292)) {
         this.C();
         this.j.a(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 293) {
         this.A = false;
         this.x = this.x.c();
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
      a(wi.c("gameMode.creative"), "gamemode creative", new crs(dcj.i)),
      b(wi.c("gameMode.survival"), "gamemode survival", new crs(crv.oZ)),
      c(wi.c("gameMode.adventure"), "gamemode adventure", new crs(crv.uh)),
      d(wi.c("gameMode.spectator"), "gamemode spectator", new crs(crv.sr));

      protected static final fks.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wi g;
      final String h;
      final crs i;

      private a(wi $$0, String $$1, crs $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fdl $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wi a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fks.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fks.a a(czd $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fdw {
      final fks.a b;
      private boolean c;

      public b(fks.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(fdl $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.C() + 5, this.D() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(fhu $$0) {
         this.c($$0);
      }

      @Override
      public boolean A() {
         return super.A() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(fdl $$0) {
         $$0.a(fks.a, this.C(), this.D(), 26, 26);
      }

      private void b(fdl $$0) {
         $$0.a(fks.b, this.C(), this.D(), 26, 26);
      }
   }
}
