import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fkj extends fjo {
   static final ajt a = new ajt("gamemode_switcher/slot");
   static final ajt b = new ajt("gamemode_switcher/selection");
   private static final ajt c = new ajt("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int o = 128;
   private static final int p = 26;
   private static final int q = 5;
   private static final int r = 31;
   private static final int s = 5;
   private static final int u = fkj.a.values().length * 31 - 5;
   private static final wg v = wg.a("debug.gamemodes.select_next", wg.c("debug.gamemodes.press_f4").a(n.l));
   private final fkj.a w;
   private fkj.a x;
   private int y;
   private int z;
   private boolean A;
   private final List<fkj.b> B = Lists.newArrayList();

   public fkj() {
      super(fbh.a);
      this.w = fkj.a.a(this.m());
      this.x = this.w;
   }

   private cyu m() {
      fuq $$0 = fbp.Q().q;
      cyu $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == cyu.b ? cyu.a : cyu.b;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.x = this.w;

      for (int $$0 = 0; $$0 < fkj.a.e.length; $$0++) {
         fkj.a $$1 = fkj.a.e[$$0];
         this.B.add(new fkj.b($$1, this.k / 2 - u / 2 + $$0 * 31, this.l / 2 - 31));
      }
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
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

         for (fkj.b $$7 : this.B) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.x == $$7.b);
            if (!$$6 && $$7.A()) {
               this.x = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(fdc $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.j, this.x);
   }

   private static void a(fbp $$0, fkj.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fkj.a $$2 = fkj.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.ct.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!evd.a(this.j.aO().i(), 292)) {
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
      a(wg.c("gameMode.creative"), "gamemode creative", new crj(dca.i)),
      b(wg.c("gameMode.survival"), "gamemode survival", new crj(crm.oZ)),
      c(wg.c("gameMode.adventure"), "gamemode adventure", new crj(crm.uh)),
      d(wg.c("gameMode.spectator"), "gamemode spectator", new crj(crm.sr));

      protected static final fkj.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wg g;
      final String h;
      final crj i;

      private a(wg $$0, String $$1, crj $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fdc $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wg a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fkj.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fkj.a a(cyu $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fdn {
      final fkj.a b;
      private boolean c;

      public b(fkj.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(fdc $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.C() + 5, this.D() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(fhl $$0) {
         this.c($$0);
      }

      @Override
      public boolean A() {
         return super.A() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(fdc $$0) {
         $$0.a(fkj.a, this.C(), this.D(), 26, 26);
      }

      private void b(fdc $$0) {
         $$0.a(fkj.b, this.C(), this.D(), 26, 26);
      }
   }
}
