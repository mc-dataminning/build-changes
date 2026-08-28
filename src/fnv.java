import com.google.common.collect.Lists;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;

public class fnv extends fnj {
   static final akk a = new akk("gamemode_switcher/slot");
   static final akk b = new akk("gamemode_switcher/selection");
   private static final akk c = new akk("textures/gui/container/gamemode_switcher.png");
   private static final int q = 128;
   private static final int r = 128;
   private static final int s = 26;
   private static final int u = 5;
   private static final int v = 31;
   private static final int w = 5;
   private static final int x = fnv.a.values().length * 31 - 5;
   private static final wu y = wu.a("debug.gamemodes.select_next", wu.c("debug.gamemodes.press_f4").a(n.l));
   private final fnv.a z;
   private fnv.a A;
   private int B;
   private int C;
   private boolean D;
   private final List<fnv.b> E = Lists.newArrayList();

   public fnv() {
      super(ffl.a);
      this.z = fnv.a.a(this.m());
      this.A = this.z;
   }

   private dcc m() {
      fys $$0 = fft.Q().q;
      dcc $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dcc.b ? dcc.a : dcc.b;
      }
   }

   @Override
   protected void aP_() {
      super.aP_();
      this.A = this.z;

      for (int $$0 = 0; $$0 < fnv.a.e.length; $$0++) {
         fnv.a $$1 = fnv.a.e[$$0];
         this.E.add(new fnv.b($$1, this.m / 2 - x / 2 + $$0 * 31, this.n / 2 - 31));
      }
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      if (!this.F()) {
         $$0.c().a();
         RenderSystem.enableBlend();
         int $$4 = this.m / 2 - 62;
         int $$5 = this.n / 2 - 31 - 27;
         $$0.a(c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.o, this.A.a(), this.m / 2, this.n / 2 - 31 - 20, -1);
         $$0.a(this.o, y, this.m / 2, this.n / 2 + 5, 16777215);
         if (!this.D) {
            this.B = $$1;
            this.C = $$2;
            this.D = true;
         }

         boolean $$6 = this.B == $$1 && this.C == $$2;

         for (fnv.b $$7 : this.E) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.A == $$7.a);
            if (!$$6 && $$7.B()) {
               this.A = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fhf $$0, int $$1, int $$2, float $$3) {
   }

   private void E() {
      a(this.l, this.A);
   }

   private static void a(fft $$0, fnv.a $$1) {
      if ($$0.q != null && $$0.s != null) {
         fnv.a $$2 = fnv.a.a($$0.q.j());
         if ($$0.s.l(2) && $$1 != $$2) {
            $$0.s.cB.d($$1.b());
         }
      }
   }

   private boolean F() {
      if (!ezh.a(this.l.aO().i(), 292)) {
         this.E();
         this.l.a(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 293) {
         this.D = false;
         this.A = this.A.c();
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
      a(wu.c("gameMode.creative"), "gamemode creative", new cuc(dfj.i)),
      b(wu.c("gameMode.survival"), "gamemode survival", new cuc(cuf.pb)),
      c(wu.c("gameMode.adventure"), "gamemode adventure", new cuc(cuf.uj)),
      d(wu.c("gameMode.spectator"), "gamemode spectator", new cuc(cuf.ss));

      protected static final fnv.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final wu g;
      final String h;
      final cuc i;

      private a(final wu $$0, final String $$1, final cuc $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fhf $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      wu a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fnv.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fnv.a a(dcc $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fhq {
      final fnv.a a;
      private boolean b;

      public b(final fnv.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fhf $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(flo $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fhf $$0) {
         $$0.a(fnv.a, this.D(), this.E(), 26, 26);
      }

      private void b(fhf $$0) {
         $$0.a(fnv.b, this.D(), this.E(), 26, 26);
      }
   }
}
