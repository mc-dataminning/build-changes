import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fhd extends fgh {
   static final ajc a = new ajc("gamemode_switcher/slot");
   static final ajc b = new ajc("gamemode_switcher/selection");
   private static final ajc c = new ajc("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = fhd.a.values().length * 31 - 5;
   private static final vs r = vs.a("debug.gamemodes.select_next", vs.c("debug.gamemodes.press_f4").a(n.l));
   private final fhd.a t;
   private fhd.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<fhd.b> y = Lists.newArrayList();

   public fhd() {
      super(eyc.a);
      this.t = fhd.a.a(this.o());
      this.u = this.t;
   }

   private cwb o() {
      fri $$0 = eyk.P().q;
      cwb $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == cwb.b ? cwb.a : cwb.b;
      }
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < fhd.a.e.length; $$0++) {
         fhd.a $$1 = fhd.a.e[$$0];
         this.y.add(new fhd.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
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

         for (fhd.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.z()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(ezx $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.f, this.u);
   }

   private static void a(eyk $$0, fhd.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fhd.a $$2 = fhd.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.cr.d($$1.b());
         }
      }
   }

   private boolean H() {
      if (!ery.a(this.f.aN().i(), 292)) {
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
      a(vs.c("gameMode.creative"), "gamemode creative", new cpq(czh.i)),
      b(vs.c("gameMode.survival"), "gamemode survival", new cpq(cpt.oZ)),
      c(vs.c("gameMode.adventure"), "gamemode adventure", new cpq(cpt.uf)),
      d(vs.c("gameMode.spectator"), "gamemode spectator", new cpq(cpt.sr));

      protected static final fhd.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final vs g;
      final String h;
      final cpq i;

      private a(vs $$0, String $$1, cpq $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(ezx $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      vs a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fhd.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fhd.a a(cwb $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fai {
      final fhd.a b;
      private boolean c;

      public b(fhd.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.B() + 5, this.C() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(fef $$0) {
         this.c($$0);
      }

      @Override
      public boolean z() {
         return super.z() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(ezx $$0) {
         $$0.a(fhd.a, this.B(), this.C(), 26, 26);
      }

      private void b(ezx $$0) {
         $$0.a(fhd.b, this.B(), this.C(), 26, 26);
      }
   }
}
