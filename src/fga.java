import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fga extends ffe {
   static final aiy a = new aiy("gamemode_switcher/slot");
   static final aiy b = new aiy("gamemode_switcher/selection");
   private static final aiy c = new aiy("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = fga.a.values().length * 31 - 5;
   private static final vq r = vq.a("debug.gamemodes.select_next", vq.c("debug.gamemodes.press_f4").a(n.l));
   private final fga.a t;
   private fga.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<fga.b> y = Lists.newArrayList();

   public fga() {
      super(ewz.a);
      this.t = fga.a.a(this.o());
      this.u = this.t;
   }

   private cvk o() {
      fqe $$0 = exh.O().q;
      cvk $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == cvk.b ? cvk.a : cvk.b;
      }
   }

   @Override
   protected void aQ_() {
      super.aQ_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < fga.a.e.length; $$0++) {
         fga.a $$1 = fga.a.e[$$0];
         this.y.add(new fga.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
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

         for (fga.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.z()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(eyu $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.f, this.u);
   }

   private static void a(exh $$0, fga.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fga.a $$2 = fga.a.a($$0.q.j());
         if ($$0.s.m(2) && $$1 != $$2) {
            $$0.s.cq.d($$1.b());
         }
      }
   }

   private boolean H() {
      if (!eqv.a(this.f.aM().i(), 292)) {
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
      a(vq.c("gameMode.creative"), "gamemode creative", new coz(cyq.i)),
      b(vq.c("gameMode.survival"), "gamemode survival", new coz(cpc.oZ)),
      c(vq.c("gameMode.adventure"), "gamemode adventure", new coz(cpc.uf)),
      d(vq.c("gameMode.spectator"), "gamemode spectator", new coz(cpc.sr));

      protected static final fga.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final vq g;
      final String h;
      final coz i;

      private a(vq $$0, String $$1, coz $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(eyu $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      vq a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fga.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fga.a a(cvk $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends ezf {
      final fga.a b;
      private boolean c;

      public b(fga.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(eyu $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.B() + 5, this.C() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(fdc $$0) {
         this.c($$0);
      }

      @Override
      public boolean z() {
         return super.z() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(eyu $$0) {
         $$0.a(fga.a, this.B(), this.C(), 26, 26);
      }

      private void b(eyu $$0) {
         $$0.a(fga.b, this.B(), this.C(), 26, 26);
      }
   }
}
