import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fei extends fdm {
   static final ahh a = new ahh("gamemode_switcher/slot");
   static final ahh b = new ahh("gamemode_switcher/selection");
   private static final ahh c = new ahh("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = fei.a.values().length * 31 - 5;
   private static final vg r = vg.a("debug.gamemodes.select_next", vg.c("debug.gamemodes.press_f4").a(n.l));
   private final fei.a t;
   private fei.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<fei.b> y = Lists.newArrayList();

   public fei() {
      super(evj.a);
      this.t = fei.a.a(this.o());
      this.u = this.t;
   }

   private ctu o() {
      fol $$0 = evr.O().q;
      ctu $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == ctu.b ? ctu.a : ctu.b;
      }
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < fei.a.e.length; $$0++) {
         fei.a $$1 = fei.a.e[$$0];
         this.y.add(new fei.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      if (!this.H()) {
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

         for (fei.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.z()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(exe $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.f, this.u);
   }

   private static void a(evr $$0, fei.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fei.a $$2 = fei.a.a($$0.q.j());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cr.d($$1.b());
         }
      }
   }

   private boolean H() {
      if (!epf.a(this.f.aM().i(), 292)) {
         this.E();
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
   public boolean m() {
      return false;
   }

   static enum a {
      a(vg.c("gameMode.creative"), "gamemode creative", new cng(cxa.i)),
      b(vg.c("gameMode.survival"), "gamemode survival", new cng(cnj.oZ)),
      c(vg.c("gameMode.adventure"), "gamemode adventure", new cng(cnj.uf)),
      d(vg.c("gameMode.spectator"), "gamemode spectator", new cng(cnj.sr));

      protected static final fei.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final vg g;
      final String h;
      final cng i;

      private a(vg $$0, String $$1, cng $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(exe $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      vg a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fei.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fei.a a(ctu $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends exp {
      final fei.a b;
      private boolean c;

      public b(fei.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(exe $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.B() + 5, this.C() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(fbk $$0) {
         this.c($$0);
      }

      @Override
      public boolean z() {
         return super.z() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(exe $$0) {
         $$0.a(fei.a, this.B(), this.C(), 26, 26);
      }

      private void b(exe $$0) {
         $$0.a(fei.b, this.B(), this.C(), 26, 26);
      }
   }
}
