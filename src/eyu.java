import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class eyu extends exz {
   static final aer a = new aer("gamemode_switcher/slot");
   static final aer b = new aer("gamemode_switcher/selection");
   private static final aer c = new aer("textures/gui/container/gamemode_switcher.png");
   private static final int k = 128;
   private static final int l = 128;
   private static final int m = 26;
   private static final int n = 5;
   private static final int o = 31;
   private static final int p = 5;
   private static final int q = eyu.a.values().length * 31 - 5;
   private static final tf s = tf.a("debug.gamemodes.select_next", tf.c("debug.gamemodes.press_f4").a(n.l));
   private final eyu.a t;
   private eyu.a u;
   private int v;
   private int w;
   private boolean x;
   private final List<eyu.b> y = Lists.newArrayList();

   public eyu() {
      super(eqe.a);
      this.t = eyu.a.a(this.l());
      this.u = this.t;
   }

   private cpj l() {
      fio $$0 = eqm.O().t;
      cpj $$1 = $$0.k();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.l() == cpj.b ? cpj.a : cpj.b;
      }
   }

   @Override
   protected void aE_() {
      super.aE_();
      this.u = this.t;

      for (int $$0 = 0; $$0 < eyu.a.e.length; $$0++) {
         eyu.a $$1 = eyu.a.e[$$0];
         this.y.add(new eyu.b($$1, this.g / 2 - q / 2 + $$0 * 31, this.h / 2 - 31));
      }
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      if (!this.C()) {
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

         for (eyu.b $$7 : this.y) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.u == $$7.b);
            if (!$$6 && $$7.n()) {
               this.u = $$7.b;
            }
         }
      }
   }

   @Override
   public void b(erw $$0, int $$1, int $$2, float $$3) {
   }

   private void B() {
      a(this.f, this.u);
   }

   private static void a(eqm $$0, eyu.a $$1) {
      if ($$0.t != null && $$0.v != null) {
         eyu.a $$2 = eyu.a.a($$0.t.l());
         if ($$0.v.l(2) && $$1 != $$2) {
            $$0.v.cl.d($$1.b());
         }
      }
   }

   private boolean C() {
      if (!ekb.a(this.f.aN().i(), 292)) {
         this.B();
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
      a(tf.c("gameMode.creative"), "gamemode creative", new ciy(csn.i)),
      b(tf.c("gameMode.survival"), "gamemode survival", new ciy(cjb.om)),
      c(tf.c("gameMode.adventure"), "gamemode adventure", new ciy(cjb.tp)),
      d(tf.c("gameMode.spectator"), "gamemode spectator", new ciy(cjb.rD));

      protected static final eyu.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final tf g;
      final String h;
      final ciy i;

      private a(tf $$0, String $$1, ciy $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(erw $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      tf a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      eyu.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static eyu.a a(cpj $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends esf {
      final eyu.a b;
      private boolean c;

      public b(eyu.a $$1, int $$2, int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.b = $$1;
      }

      @Override
      public void b(erw $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.b.a($$0, this.p() + 5, this.r() + 5);
         if (this.c) {
            this.b($$0);
         }
      }

      @Override
      public void a(evx $$0) {
         this.c($$0);
      }

      @Override
      public boolean n() {
         return super.n() || this.c;
      }

      public void b(boolean $$0) {
         this.c = $$0;
      }

      private void a(erw $$0) {
         $$0.a(eyu.a, this.p(), this.r(), 26, 26);
      }

      private void b(erw $$0) {
         $$0.a(eyu.b, this.p(), this.r(), 26, 26);
      }
   }
}
