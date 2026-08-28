import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fih extends hfq {
   private static final int B = 2;
   public static final List<bsh> a = ImmutableList.of(bsh.a, bsh.b, bsh.c, bsh.d);
   private static final int C = 0;
   public static final List<dfj> b = ImmutableList.of(dfj.a, dfj.b, dfj.c);
   private static final xj D = xj.c("mco.configure.world.edit.slot.name");
   static final xj E = xj.c("mco.configure.world.spawnProtection");
   private fmm F;
   protected final fhq c;
   private int G;
   private int H;
   private final fgn I;
   private final fgi.d J;
   private bsh K;
   private dfj L;
   private final String M;
   private String N;
   private boolean O;
   private boolean P;
   int Q;
   private boolean R;
   private boolean S;
   fih.a T;

   public fih(fhq $$0, fgn $$1, fgi.d $$2, int $$3) {
      super(xj.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.I = $$1;
      this.J = $$2;
      this.K = a(a, $$1.f, 2);
      this.L = a(b, $$1.g, 0);
      this.M = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fgi.d.a) {
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
   public void aO_() {
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
   public void aR_() {
      this.H = 170;
      this.G = this.n / 2 - this.H;
      int $$0 = this.n / 2 + 10;
      if (this.J != fgi.d.a) {
         xj $$1;
         if (this.J == fgi.d.c) {
            $$1 = xj.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.J == fgi.d.e) {
            $$1 = xj.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xj.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hfo($$1, this.n / 2, 26, 16711680));
      }

      this.F = this.d(new fmm(this.m.h, this.G, g(1), this.H, 20, null, xj.c("mco.configure.world.edit.slot.name")));
      this.F.f(10);
      this.F.a(this.N);
      this.F.b(this::a);
      fmk<Boolean> $$4 = this.c(fmk.b(this.O).a($$0, g(1), this.H, 20, xj.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.O = $$1));
      this.c(fmk.a(dfj::e).a(b).a(this.L).a(this.G, g(3), this.H, 20, xj.c("selectWorld.gameMode"), ($$0x, $$1) -> this.L = $$1));
      this.T = this.c(new fih.a($$0, g(3), this.H, this.Q, 0.0F, 16.0F));
      xj $$5 = xj.c("mco.configure.world.spawn_toggle.message");
      fmk<Boolean> $$6 = fmk.b(this.K != bsh.a && this.P)
         .a($$0, g(5), this.H, 20, xj.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.P = $$0x));
      this.c(fmk.a(bsh::b).a(a).a(this.K).a(this.G, g(5), this.H, 20, xj.c("options.difficulty"), ($$1, $$2) -> {
         this.K = $$2;
         if (this.J == fgi.d.a) {
            boolean $$3 = this.K != bsh.a;
            $$6.j = $$3;
            $$6.a($$3 && this.P);
         }
      }));
      this.c($$6);
      fmk<Boolean> $$7 = this.c(fmk.b(this.S).a(this.G, g(7), this.H, 20, xj.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.S = $$1));
      fmk<Boolean> $$8 = this.c(fmk.b(this.R).a($$0, g(7), this.H, 20, xj.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.R = $$1));
      if (this.J != fgi.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.T.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.K == bsh.a) {
         $$6.j = false;
      }

      this.c(fmd.a(xj.c("mco.configure.world.buttons.done"), $$0x -> this.F()).a(this.G, g(13), this.H, 20).a());
      this.c(fmd.a(xi.e, $$0x -> this.aO_()).a($$0, g(13), this.H, 20).a());
   }

   private fmk.b<Boolean> a(xj $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fic.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.aO_();
            }));
         }
      };
   }

   @Override
   public xj i() {
      return xi.a(this.n(), this.m());
   }

   @Override
   public void a(flq $$0, int $$1, int $$2, float $$3) {
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

   private void F() {
      int $$0 = a(a, this.K, 2);
      int $$1 = a(b, this.L, 0);
      if (this.J != fgi.d.c && this.J != fgi.d.d && this.J != fgi.d.e) {
         boolean $$2 = this.J == fgi.d.a && this.K != bsh.a && this.P;
         this.c.a(new fgn(this.O, $$2, this.Q, this.R, $$0, $$1, this.I.h, this.S, this.N, this.I.i, this.I.j));
      } else {
         this.c.a(new fgn(this.I.a, this.I.b, this.I.c, this.I.d, $$0, $$1, this.I.h, this.I.e, this.N, this.I.i, this.I.j));
      }
   }

   class a extends flz {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xi.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((azm.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fih.this.T.j) {
            fih.this.Q = (int)azm.d(azm.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xi.a(fih.E, (xj)(fih.this.Q == 0 ? xi.c : xj.b(String.valueOf(fih.this.Q)))));
      }
   }
}
