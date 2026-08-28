import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fia extends hff {
   private static final int B = 2;
   public static final List<bse> a = ImmutableList.of(bse.a, bse.b, bse.c, bse.d);
   private static final int C = 0;
   public static final List<dfc> b = ImmutableList.of(dfc.a, dfc.b, dfc.c);
   private static final xl D = xl.c("mco.configure.world.edit.slot.name");
   static final xl E = xl.c("mco.configure.world.spawnProtection");
   private fmf F;
   protected final fhj c;
   private int G;
   private int H;
   private final fgg I;
   private final fgb.d J;
   private bse K;
   private dfc L;
   private final String M;
   private String N;
   private boolean O;
   private boolean P;
   int Q;
   private boolean R;
   private boolean S;
   fia.a T;

   public fia(fhj $$0, fgg $$1, fgb.d $$2, int $$3) {
      super(xl.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.I = $$1;
      this.J = $$2;
      this.K = a(a, $$1.f, 2);
      this.L = a(b, $$1.g, 0);
      this.M = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fgb.d.a) {
         this.O = $$1.a;
         this.Q = $$1.c;
         this.S = $$1.e;
         this.P = $$1.b;
         this.R = $$1.d;
      } else {
         this.O = true;
         this.Q = 0;
         this.S = false;
         this.P = true;
         this.R = true;
      }
   }

   @Override
   public void aP_() {
      this.m.a(this.c);
   }

   private static <T> T a(List<T> $$0, int $$1, int $$2) {
      try {
         return $$0.get($$1);
      } catch (IndexOutOfBoundsException var4) {
         return $$0.get($$2);
      }
   }

   private static <T> int a(List<T> $$0, T $$1, int $$2) {
      int $$3 = $$0.indexOf($$1);
      return $$3 == -1 ? $$2 : $$3;
   }

   @Override
   public void aS_() {
      this.H = 170;
      this.G = this.n / 2 - this.H;
      int $$0 = this.n / 2 + 10;
      if (this.J != fgb.d.a) {
         xl $$1;
         if (this.J == fgb.d.c) {
            $$1 = xl.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.J == fgb.d.e) {
            $$1 = xl.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xl.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hfd($$1, this.n / 2, 26, 16711680));
      }

      this.F = this.d(new fmf(this.m.h, this.G, g(1), this.H, 20, null, xl.c("mco.configure.world.edit.slot.name")));
      this.F.f(10);
      this.F.a(this.N);
      this.F.b(this::a);
      fmd<Boolean> $$4 = this.c(fmd.b(this.O).a($$0, g(1), this.H, 20, xl.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.O = $$1));
      this.c(fmd.a(dfc::e).a(b).a(this.L).a(this.G, g(3), this.H, 20, xl.c("selectWorld.gameMode"), ($$0x, $$1) -> this.L = $$1));
      this.T = this.c(new fia.a($$0, g(3), this.H, this.Q, 0.0F, 16.0F));
      xl $$5 = xl.c("mco.configure.world.spawn_toggle.message");
      fmd<Boolean> $$6 = fmd.b(this.K != bse.a && this.P)
         .a($$0, g(5), this.H, 20, xl.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.P = $$0x));
      this.c(fmd.a(bse::b).a(a).a(this.K).a(this.G, g(5), this.H, 20, xl.c("options.difficulty"), ($$1, $$2) -> {
         this.K = $$2;
         if (this.J == fgb.d.a) {
            boolean $$3 = this.K != bse.a;
            $$6.j = $$3;
            $$6.a($$3 && this.P);
         }
      }));
      this.c($$6);
      fmd<Boolean> $$7 = this.c(fmd.b(this.S).a(this.G, g(7), this.H, 20, xl.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.S = $$1));
      fmd<Boolean> $$8 = this.c(fmd.b(this.R).a($$0, g(7), this.H, 20, xl.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.R = $$1));
      if (this.J != fgb.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.T.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.K == bse.a) {
         $$6.j = false;
      }

      this.c(flw.a(xl.c("mco.configure.world.buttons.done"), $$0x -> this.D()).a(this.G, g(13), this.H, 20).a());
      this.c(flw.a(xk.e, $$0x -> this.aP_()).a($$0, g(13), this.H, 20).a());
   }

   private fmd.b<Boolean> a(xl $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fhv.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.aP_();
            }));
         }
      };
   }

   @Override
   public xl i() {
      return xk.a(this.n(), this.m());
   }

   @Override
   public void a(flj $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, D, this.G + this.H / 2 - this.p.a(D) / 2, g(0) - 5, -1, false);
      this.F.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.M)) {
         this.N = "";
      } else {
         this.N = $$0;
      }
   }

   private void D() {
      int $$0 = a(a, this.K, 2);
      int $$1 = a(b, this.L, 0);
      if (this.J != fgb.d.c && this.J != fgb.d.d && this.J != fgb.d.e) {
         boolean $$2 = this.J == fgb.d.a && this.K != bse.a && this.P;
         this.c.a(new fgg(this.O, $$2, this.Q, this.R, $$0, $$1, this.I.h, this.S, this.N, this.I.i, this.I.j));
      } else {
         this.c.a(new fgg(this.I.a, this.I.b, this.I.c, this.I.d, $$0, $$1, this.I.h, this.I.e, this.N, this.I.i, this.I.j));
      }
   }

   class a extends fls {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xk.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((azn.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fia.this.T.j) {
            fia.this.Q = (int)azn.d(azn.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xk.a(fia.E, (xl)(fia.this.Q == 0 ? xk.c : xl.b(String.valueOf(fia.this.Q)))));
      }
   }
}
