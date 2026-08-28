import com.google.common.collect.Lists;
import java.util.List;

public class fqf extends fpt {
   static final alb a = alb.b("gamemode_switcher/slot");
   static final alb b = alb.b("gamemode_switcher/selection");
   private static final alb c = alb.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = fqf.a.values().length * 31 - 5;
   private static final xd z = xd.a("debug.gamemodes.select_next", xd.c("debug.gamemodes.press_f4").a(n.l));
   private final fqf.a A;
   private fqf.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<fqf.b> F = Lists.newArrayList();

   public fqf() {
      super(fhs.a);
      this.A = fqf.a.a(this.m());
      this.B = this.A;
   }

   private ddp m() {
      gbg $$0 = fib.Q().r;
      ddp $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == ddp.b ? ddp.a : ddp.b;
      }
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < fqf.a.e.length; $$0++) {
         fqf.a $$1 = fqf.a.e[$$0];
         this.F.add(new fqf.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fjn $$0, int $$1, int $$2, float $$3) {
      if (!this.E()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(ghe::C, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
         $$0.c().b();
         super.a($$0, $$1, $$2, $$3);
         $$0.a(this.p, this.B.a(), this.n / 2, this.o / 2 - 31 - 20, -1);
         $$0.a(this.p, z, this.n / 2, this.o / 2 + 5, 16777215);
         if (!this.E) {
            this.C = $$1;
            this.D = $$2;
            this.E = true;
         }

         boolean $$6 = this.C == $$1 && this.D == $$2;

         for (fqf.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.B()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fjn $$0, int $$1, int $$2, float $$3) {
   }

   private void D() {
      a(this.m, this.B);
   }

   private static void a(fib $$0, fqf.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         fqf.a $$2 = fqf.a.a($$0.r.j());
         if ($$0.t.l(2) && $$1 != $$2) {
            $$0.t.cx.d($$1.b());
         }
      }
   }

   private boolean E() {
      if (!fbk.a(this.m.aO().i(), 292)) {
         this.D();
         this.m.a(null);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 293) {
         this.E = false;
         this.B = this.B.c();
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
      a(xd.c("gameMode.creative"), "gamemode creative", new cvl(dgx.i)),
      b(xd.c("gameMode.survival"), "gamemode survival", new cvl(cvo.pc)),
      c(xd.c("gameMode.adventure"), "gamemode adventure", new cvl(cvo.ul)),
      d(xd.c("gameMode.spectator"), "gamemode spectator", new cvl(cvo.st));

      protected static final fqf.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xd g;
      final String h;
      final cvl i;

      private a(final xd $$0, final String $$1, final cvl $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fjn $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xd a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      fqf.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static fqf.a a(ddp $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends fjy {
      final fqf.a a;
      private boolean b;

      public b(final fqf.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fjn $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fnx $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fjn $$0) {
         $$0.a(ghe::C, fqf.a, this.D(), this.E(), 26, 26);
      }

      private void b(fjn $$0) {
         $$0.a(ghe::C, fqf.b, this.D(), this.E(), 26, 26);
      }
   }
}
