import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class ezh extends eym {
   static final aey a = new aey("gamemode_switcher/slot");
   static final aey b = new aey("gamemode_switcher/selection");
   private static final aey c = new aey("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = ezh.a.values().length * 31 - 5;
   private static final tn s = tn.a("debug.gamemodes.select_next", tn.c("debug.gamemodes.press_f4").a(n.l));
   private final ezh.a t;
   private ezh.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<ezh.b> y = Lists.newArrayList();

   public ezh() {
      super(eqp.a);
      this.t = ezh.a.a(this.l());
      this.u = this.t;
   }

   private cpu l() {
      fjf $$0 = eqx.O().q;
      cpu $$1 = $$0.k();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.l() == cpu.b ? cpu.a : cpu.b;
      }
   }

   @Override
   protected void aH_() {
      super.aH_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < ezh.a.e.length; $$0++) {
         ezh.a $$1 = ezh.a.e[$$0];
         this.y.add(new ezh.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(esh $$0, int $$1, int $$2, float $$3) {
      if (!this.E()) {
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

         for (ezh.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.o()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(esh $$0, int $$1, int $$2, float $$3) {
   }

   private void D() {
      a(this.f, this.u);
   }

   private static void a(eqx $$0, ezh.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         ezh.a $$2 = ezh.a.a($$0.q.l());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cn.d($$1.b());
         }
      }
   }

   private boolean E() {
      if (!ekm.a(this.f.aM().i(), 292)) {
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
   public boolean j() {
      return false;
   }

   static enum a {
      a(tn.c("gameMode.creative"), "gamemode creative", new cjh(csy.i)),
      b(tn.c("gameMode.survival"), "gamemode survival", new cjh(cjk.om)),
      c(tn.c("gameMode.adventure"), "gamemode adventure", new cjh(cjk.tp)),
      d(tn.c("gameMode.spectator"), "gamemode spectator", new cjh(cjk.rD));

      protected static final ezh.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final tn g;
      final String h;
      final cjh i;

      private a(tn $$0, String $$1, cjh $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(esh $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      tn a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      ezh.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static ezh.a a(cpu $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends esq {
      final ezh.a b;
      private boolean c;

      public b(ezh.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.r() + 5, this.t() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(ewk $$0) {
         this.c($$0);
      }

      @Override
      public boolean o() {
         return super.o() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(esh $$0) {
         $$0.a(ezh.a, this.r(), this.t(), 26, 26);
      }

      private void b(esh $$0) {
         $$0.a(ezh.b, this.r(), this.t(), 26, 26);
      }
   }
}
