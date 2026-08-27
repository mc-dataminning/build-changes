import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class ezz extends ezd {
   static final afw a = new afw("gamemode_switcher/slot");
   static final afw b = new afw("gamemode_switcher/selection");
   private static final afw c = new afw("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = ezz.a.values().length * 31 - 5;
   private static final ui s = ui.a("debug.gamemodes.select_next", ui.c("debug.gamemodes.press_f4").a(n.l));
   private final ezz.a t;
   private ezz.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<ezz.b> y = Lists.newArrayList();

   public ezz() {
      super(erg.a);
      this.t = ezz.a.a(this.l());
      this.u = this.t;
   }

   private cqw l() {
      fjy $$0 = ero.O().q;
      cqw $$1 = $$0.k();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.l() == cqw.b ? cqw.a : cqw.b;
      }
   }

   @Override
   protected void aM_() {
      super.aM_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < ezz.a.e.length; $$0++) {
         ezz.a $$1 = ezz.a.e[$$0];
         this.y.add(new ezz.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
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

         for (ezz.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.n()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(esy $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.f, this.u);
   }

   private static void a(ero $$0, ezz.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         ezz.a $$2 = ezz.a.a($$0.q.l());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cn.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!elc.a(this.f.aM().i(), 292)) {
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
      a(ui.c("gameMode.creative"), "gamemode creative", new ckj(cuc.i)),
      b(ui.c("gameMode.survival"), "gamemode survival", new ckj(ckm.om)),
      c(ui.c("gameMode.adventure"), "gamemode adventure", new ckj(ckm.tp)),
      d(ui.c("gameMode.spectator"), "gamemode spectator", new ckj(ckm.rD));

      protected static final ezz.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final ui g;
      final String h;
      final ckj i;

      private a(ui $$0, String $$1, ckj $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(esy $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      ui a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      ezz.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static ezz.a a(cqw $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends eth {
      final ezz.a b;
      private boolean c;

      public b(ezz.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(esy $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.p() + 5, this.r() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(exc $$0) {
         this.c($$0);
      }

      @Override
      public boolean n() {
         return super.n() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(esy $$0) {
         $$0.a(ezz.a, this.p(), this.r(), 26, 26);
      }

      private void b(esy $$0) {
         $$0.a(ezz.b, this.p(), this.r(), 26, 26);
      }
   }
}
