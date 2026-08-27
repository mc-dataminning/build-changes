import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class eza extends eyf {
   static final aeu a = new aeu("gamemode_switcher/slot");
   static final aeu b = new aeu("gamemode_switcher/selection");
   private static final aeu c = new aeu("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = eza.a.values().length * 31 - 5;
   private static final ti s = ti.a("debug.gamemodes.select_next", ti.c("debug.gamemodes.press_f4").a(n.l));
   private final eza.a t;
   private eza.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<eza.b> y = Lists.newArrayList();

   public eza() {
      super(eqi.a);
      this.t = eza.a.a(this.l());
      this.u = this.t;
   }

   private cpn l() {
      fiy $$0 = eqq.O().q;
      cpn $$1 = $$0.k();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.l() == cpn.b ? cpn.a : cpn.b;
      }
   }

   @Override
   protected void aD_() {
      super.aD_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < eza.a.e.length; $$0++) {
         eza.a $$1 = eza.a.e[$$0];
         this.y.add(new eza.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
      if (!this.D()) {
         $$0.c().a();
         RenderSystem.enableBlend();
         int $$4 = this.g / 2 - 62;
         int $$5 = this.h / 2 - 31 - 27;
         $$0.a(c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.i, this.u.a(), this.g / 2, this.h / 2 - 31 - 20, -1);
         $$0.a(this.i, s, this.g / 2, this.h / 2 + 5, 16777215);
         if (!this.x) {
            this.v = $$1;
            this.w = $$2;
            this.x = true;
         }

         boolean $$6 = this.v == $$1 && this.w == $$2;

         for (eza.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.o()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(esa $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.f, this.u);
   }

   private static void a(eqq $$0, eza.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         eza.a $$2 = eza.a.a($$0.q.l());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cl.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!ekf.a(this.f.aM().i(), 292)) {
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
      a(ti.c("gameMode.creative"), "gamemode creative", new cja(csr.i)),
      b(ti.c("gameMode.survival"), "gamemode survival", new cja(cjd.om)),
      c(ti.c("gameMode.adventure"), "gamemode adventure", new cja(cjd.tp)),
      d(ti.c("gameMode.spectator"), "gamemode spectator", new cja(cjd.rD));

      protected static final eza.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final ti g;
      final String h;
      final cja i;

      private a(ti $$0, String $$1, cja $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(esa $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      ti a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      eza.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static eza.a a(cpn $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends esj {
      final eza.a b;
      private boolean c;

      public b(eza.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(esa $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.r() + 5, this.t() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(ewd $$0) {
         this.c($$0);
      }

      @Override
      public boolean o() {
         return super.o() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(esa $$0) {
         $$0.a(eza.a, this.r(), this.t(), 26, 26);
      }

      private void b(esa $$0) {
         $$0.a(eza.b, this.r(), this.t(), 26, 26);
      }
   }
}
