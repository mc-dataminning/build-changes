import com.google.common.collect.Lists;
import java.util.List;

public class frm extends fra {
   static final ali a = ali.b("gamemode_switcher/slot");
   static final ali b = ali.b("gamemode_switcher/selection");
   private static final ali c = ali.b("textures/gui/container/gamemode_switcher.png");
   private static final int d = 128;
   private static final int s = 128;
   private static final int u = 26;
   private static final int v = 5;
   private static final int w = 31;
   private static final int x = 5;
   private static final int y = frm.a.values().length * 31 - 5;
   private static final xi z = xi.a("debug.gamemodes.select_next", xi.c("debug.gamemodes.press_f4").a(n.l));
   private final frm.a A;
   private frm.a B;
   private int C;
   private int D;
   private boolean E;
   private final List<frm.b> F = Lists.newArrayList();

   public frm() {
      super(fiz.a);
      this.A = frm.a.a(this.m());
      this.B = this.A;
   }

   private dey m() {
      gcr $$0 = fji.Q().r;
      dey $$1 = $$0.i();
      if ($$1 != null) {
         return $$1;
      } else {
         return $$0.j() == dey.b ? dey.a : dey.b;
      }
   }

   @Override
   protected void aR_() {
      super.aR_();
      this.B = this.A;

      for (int $$0 = 0; $$0 < frm.a.e.length; $$0++) {
         frm.a $$1 = frm.a.e[$$0];
         this.F.add(new frm.b($$1, this.n / 2 - y / 2 + $$0 * 31, this.o / 2 - 31));
      }
   }

   @Override
   public void a(fku $$0, int $$1, int $$2, float $$3) {
      if (!this.E()) {
         $$0.c().a();
         int $$4 = this.n / 2 - 62;
         int $$5 = this.o / 2 - 31 - 27;
         $$0.a(gir::B, c, $$4, $$5, 0.0F, 0.0F, 125, 75, 128, 128);
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

         for (frm.b $$7 : this.F) {
            $$7.a($$0, $$1, $$2, $$3);
            $$7.b(this.B == $$7.a);
            if (!$$6 && $$7.B()) {
               this.B = $$7.a;
            }
         }
      }
   }

   @Override
   public void b(fku $$0, int $$1, int $$2, float $$3) {
   }

   private void D() {
      a(this.m, this.B);
   }

   private static void a(fji $$0, frm.a $$1) {
      if ($$0.r != null && $$0.t != null) {
         frm.a $$2 = frm.a.a($$0.r.j());
         if ($$0.t.l(2) && $$1 != $$2) {
            $$0.t.j.d($$1.b());
         }
      }
   }

   private boolean E() {
      if (!fcw.a(this.m.aO().h(), 292)) {
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
      a(xi.c("gameMode.creative"), "gamemode creative", new cwb(dig.i)),
      b(xi.c("gameMode.survival"), "gamemode survival", new cwb(cwf.pc)),
      c(xi.c("gameMode.adventure"), "gamemode adventure", new cwb(cwf.ul)),
      d(xi.c("gameMode.spectator"), "gamemode spectator", new cwb(cwf.st));

      protected static final frm.a[] e = values();
      private static final int j = 16;
      protected static final int f = 5;
      final xi g;
      final String h;
      final cwb i;

      private a(final xi $$0, final String $$1, final cwb $$2) {
         this.g = $$0;
         this.h = $$1;
         this.i = $$2;
      }

      void a(fku $$0, int $$1, int $$2) {
         $$0.a(this.i, $$1, $$2);
      }

      xi a() {
         return this.g;
      }

      String b() {
         return this.h;
      }

      frm.a c() {
         return switch (this) {
            case a -> b;
            case b -> c;
            case c -> d;
            case d -> a;
         };
      }

      static frm.a a(dey $$0) {
         return switch ($$0) {
            case d -> d;
            case a -> b;
            case b -> a;
            case c -> c;
         };
      }
   }

   public class b extends flf {
      final frm.a a;
      private boolean b;

      public b(final frm.a $$1, final int $$2, final int $$3) {
         super($$2, $$3, 26, 26, $$1.a());
         this.a = $$1;
      }

      @Override
      public void b(fku $$0, int $$1, int $$2, float $$3) {
         this.a($$0);
         this.a.a($$0, this.D() + 5, this.E() + 5);
         if (this.b) {
            this.b($$0);
         }
      }

      @Override
      public void a(fpf $$0) {
         this.c($$0);
      }

      @Override
      public boolean B() {
         return super.B() || this.b;
      }

      public void b(boolean $$0) {
         this.b = $$0;
      }

      private void a(fku $$0) {
         $$0.a(gir::B, frm.a, this.D(), this.E(), 26, 26);
      }

      private void b(fku $$0) {
         $$0.a(gir::B, frm.b, this.D(), this.E(), 26, 26);
      }
   }
}
