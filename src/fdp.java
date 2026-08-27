import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fdp extends fct {
   static final ahd a = new ahd("gamemode_switcher/slot");
   static final ahd b = new ahd("gamemode_switcher/selection");
   private static final ahd c = new ahd("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = fdp.a.values().length * 31 - 5;
   private static final vd r = vd.a("debug.gamemodes.select_next", vd.c("debug.gamemodes.press_f4").a(n.l));
   private final fdp.a t;
   private fdp.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<fdp.b> y = Lists.newArrayList();

   public fdp() {
      super(eus.a);
      this.t = fdp.a.a(this.n());
      this.u = this.t;
   }

   private ctf n() {
      fnr $$0 = eva.N().q;
      ctf $$1 = $$0.k();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.l() == ctf.b ? ctf.a : ctf.b;
      }
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < fdp.a.e.length; $$0++) {
         fdp.a $$1 = fdp.a.e[$$0];
         this.y.add(new fdp.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      if (!this.D()) {
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

         for (fdp.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.z()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(ewm $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.f, this.u);
   }

   private static void a(eva $$0, fdp.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fdp.a $$2 = fdp.a.a($$0.q.l());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cn.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!eoo.a(this.f.aL().i(), 292)) {
         this.C();
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
      a(vd.c("gameMode.creative"), "gamemode creative", new cmr(cwl.i)),
      b(vd.c("gameMode.survival"), "gamemode survival", new cmr(cmu.oX)),
      c(vd.c("gameMode.adventure"), "gamemode adventure", new cmr(cmu.uc)),
      d(vd.c("gameMode.spectator"), "gamemode spectator", new cmr(cmu.sp));

      protected static final fdp.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final vd g;
      final String h;
      final cmr i;

      private a(vd $$0, String $$1, cmr $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(ewm $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      vd a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fdp.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fdp.a a(ctf $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends eww {
      final fdp.a b;
      private boolean c;

      public b(fdp.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(ewm $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.B() + 5, this.C() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(far $$0) {
         this.c($$0);
      }

      @Override
      public boolean z() {
         return super.z() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(ewm $$0) {
         $$0.a(fdp.a, this.B(), this.C(), 26, 26);
      }

      private void b(ewm $$0) {
         $$0.a(fdp.b, this.B(), this.C(), 26, 26);
      }
   }
}
