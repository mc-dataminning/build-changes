import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fbd extends fah {
   static final agg a = new agg("gamemode_switcher/slot");
   static final agg b = new agg("gamemode_switcher/selection");
   private static final agg c = new agg("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = fbd.a.values().length * 31 - 5;
   private static final ur r = ur.a("debug.gamemodes.select_next", ur.c("debug.gamemodes.press_f4").a(n.l));
   private final fbd.a t;
   private fbd.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<fbd.b> y = Lists.newArrayList();

   public fbd() {
      super(esj.a);
      this.t = fbd.a.a(this.l());
      this.u = this.t;
   }

   private crp l() {
      fld $$0 = esr.N().q;
      crp $$1 = $$0.k();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.l() == crp.b ? crp.a : crp.b;
      }
   }

   @Override
   protected void aO_() {
      super.aO_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < fbd.a.e.length; $$0++) {
         fbd.a $$1 = fbd.a.e[$$0];
         this.y.add(new fbd.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(eub $$0, int $$1, int $$2, float $$3) {
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

         for (fbd.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.n()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(eub $$0, int $$1, int $$2, float $$3) {
   }

   private void C() {
      a(this.f, this.u);
   }

   private static void a(esr $$0, fbd.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fbd.a $$2 = fbd.a.a($$0.q.l());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cn.d($$1.b());
         }
      }
   }

   private boolean D() {
      if (!emf.a(this.f.aL().i(), 292)) {
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
      a(ur.c("gameMode.creative"), "gamemode creative", new clb(cuv.i)),
      b(ur.c("gameMode.survival"), "gamemode survival", new clb(cle.om)),
      c(ur.c("gameMode.adventure"), "gamemode adventure", new clb(cle.tq)),
      d(ur.c("gameMode.spectator"), "gamemode spectator", new clb(cle.rE));

      protected static final fbd.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final ur g;
      final String h;
      final clb i;

      private a(ur $$0, String $$1, clb $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(eub $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      ur a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fbd.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fbd.a a(crp $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends euk {
      final fbd.a b;
      private boolean c;

      public b(fbd.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(eub $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.p() + 5, this.r() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(eyf $$0) {
         this.c($$0);
      }

      @Override
      public boolean n() {
         return super.n() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(eub $$0) {
         $$0.a(fbd.a, this.p(), this.r(), 26, 26);
      }

      private void b(eub $$0) {
         $$0.a(fbd.b, this.p(), this.r(), 26, 26);
      }
   }
}
