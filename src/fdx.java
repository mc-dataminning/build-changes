import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fdx extends fdb {
   static final ahg a = new ahg("gamemode_switcher/slot");
   static final ahg b = new ahg("gamemode_switcher/selection");
   private static final ahg c = new ahg("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = fdx.a.values().length * 31 - 5;
   private static final vf r = vf.a("debug.gamemodes.select_next", vf.c("debug.gamemodes.press_f4").a(n.l));
   private final fdx.a t;
   private fdx.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<fdx.b> y = Lists.newArrayList();

   public fdx() {
      super(eva.a);
      this.t = fdx.a.a(this.n());
      this.u = this.t;
   }

   private ctm n() {
      fnz $$0 = evi.O().q;
      ctm $$1 = $$0.k();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.l() == ctm.b ? ctm.a : ctm.b;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < fdx.a.e.length; $$0++) {
         fdx.a $$1 = fdx.a.e[$$0];
         this.y.add(new fdx.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      if (!this.E()) {
         $$0.c().a();
         RenderSystem.enableBlend();
         int $$4 = this.g / 2 - 62;
         int $$5 = this.h / 2 - 31 - 27;
         $$0.a(c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.u.a(), this.g / 2, this.h / 2 - 31 - 20, -1);
         $$0.a(this.i, r, this.g / 2, this.h / 2 + 5, 16777215);
         if (!this.x) {
            this.v = $$1;
            this.w = $$2;
            this.x = true;
         }

         boolean $$6 = this.v == $$1 && this.w == $$2;

         for (fdx.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.z()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(ewu $$0, int $$1, int $$2, float $$3) {
   }

   private void D() {
      a(this.f, this.u);
   }

   private static void a(evi $$0, fdx.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fdx.a $$2 = fdx.a.a($$0.q.l());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cn.d($$1.b());
         }
      }
   }

   private boolean E() {
      if (!eow.a(this.f.aM().i(), 292)) {
         this.D();
         this.f.a(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 293) {
         this.x = false;
         this.u = this.u.c();
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
      a(vf.c("gameMode.creative"), "gamemode creative", new cmy(cws.i)),
      b(vf.c("gameMode.survival"), "gamemode survival", new cmy(cnb.oX)),
      c(vf.c("gameMode.adventure"), "gamemode adventure", new cmy(cnb.uc)),
      d(vf.c("gameMode.spectator"), "gamemode spectator", new cmy(cnb.sp));

      protected static final fdx.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final vf g;
      final String h;
      final cmy i;

      private a(vf $$0, String $$1, cmy $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(ewu $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      vf a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fdx.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fdx.a a(ctm $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends exe {
      final fdx.a b;
      private boolean c;

      public b(fdx.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(ewu $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.B() + 5, this.C() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(faz $$0) {
         this.c($$0);
      }

      @Override
      public boolean z() {
         return super.z() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(ewu $$0) {
         $$0.a(fdx.a, this.B(), this.C(), 26, 26);
      }

      private void b(ewu $$0) {
         $$0.a(fdx.b, this.B(), this.C(), 26, 26);
      }
   }
}
