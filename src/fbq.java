import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fbq extends fau {
   static final agi a = new agi("gamemode_switcher/slot");
   static final agi b = new agi("gamemode_switcher/selection");
   private static final agi c = new agi("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = fbq.a.values().length * 31 - 5;
   private static final ur r = ur.a("debug.gamemodes.select_next", ur.c("debug.gamemodes.press_f4").a(n.l));
   private final fbq.a t;
   private fbq.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<fbq.b> y = Lists.newArrayList();

   public fbq() {
      super(esv.a);
      this.t = fbq.a.a(this.l());
      this.u = this.t;
   }

   private crx l() {
      flq $$0 = etd.N().q;
      crx $$1 = $$0.k();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.l() == crx.b ? crx.a : crx.b;
      }
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < fbq.a.e.length; $$0++) {
         fbq.a $$1 = fbq.a.e[$$0];
         this.y.add(new fbq.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(euo $$0, int $$1, int $$2, float $$3) {
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

         for (fbq.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.n()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(euo $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.f, this.u);
   }

   private static void a(etd $$0, fbq.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fbq.a $$2 = fbq.a.a($$0.q.l());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cn.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!emr.a(this.f.aL().i(), 292)) {
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
   public boolean j() {
      return false;
   }

   static enum a {
      a(ur.c("gameMode.creative"), "gamemode creative", new clj(cvc.i)),
      b(ur.c("gameMode.survival"), "gamemode survival", new clj(clm.oX)),
      c(ur.c("gameMode.adventure"), "gamemode adventure", new clj(clm.ub)),
      d(ur.c("gameMode.spectator"), "gamemode spectator", new clj(clm.sp));

      protected static final fbq.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final ur g;
      final String h;
      final clj i;

      private a(ur $$0, String $$1, clj $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(euo $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      ur a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fbq.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fbq.a a(crx $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends eux {
      final fbq.a b;
      private boolean c;

      public b(fbq.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(euo $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.p() + 5, this.r() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(eys $$0) {
         this.c($$0);
      }

      @Override
      public boolean n() {
         return super.n() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(euo $$0) {
         $$0.a(fbq.a, this.p(), this.r(), 26, 26);
      }

      private void b(euo $$0) {
         $$0.a(fbq.b, this.p(), this.r(), 26, 26);
      }
   }
}
