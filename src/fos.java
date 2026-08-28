import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fos extends hrc {
   private static final int C = 2;
   public static final List<buz> a = ImmutableList.of(buz.a, buz.b, buz.c, buz.d);
   private static final int D = 0;
   public static final List<dkg> b = ImmutableList.of(dkg.a, dkg.b, dkg.c);
   private static final xg E = xg.c("mco.configure.world.edit.slot.name");
   static final xg F = xg.c("mco.configure.world.spawnProtection");
   private fuh G;
   protected final foa c;
   private int H;
   private int I;
   private final fmx J;
   private final fmr.d K;
   private buz L;
   private dkg M;
   private final String N;
   private String O;
   private boolean P;
   private boolean Q;
   int R;
   private boolean S;
   private boolean T;
   fos.a U;

   public fos(foa $$0, fmx $$1, fmr.d $$2, int $$3) {
      super(xg.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.J = $$1;
      this.K = $$2;
      this.L = a(a, $$1.f, 2);
      this.M = a(b, $$1.g, 0);
      this.N = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fmr.d.a) {
         this.P = $$1.a;
         this.R = $$1.c;
         this.T = $$1.e;
         this.Q = $$1.b;
         this.S = $$1.d;
      } else {
         this.P = true;
         this.R = 0;
         this.T = false;
         this.Q = true;
         this.S = true;
      }
   }

   @Override
   public void aQ_() {
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
   public void aT_() {
      this.I = 170;
      this.H = this.n / 2 - this.I;
      int $$0 = this.n / 2 + 10;
      if (this.K != fmr.d.a) {
         xg $$1;
         if (this.K == fmr.d.c) {
            $$1 = xg.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.K == fmr.d.e) {
            $$1 = xg.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xg.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hrb($$1, this.n / 2, 26, 16711680));
      }

      this.G = this.d(new fuh(this.m.h, this.H, g(1), this.I, 20, null, xg.c("mco.configure.world.edit.slot.name")));
      this.G.a(this.O);
      this.G.b(this::a);
      fuf<Boolean> $$4 = this.c(fuf.b(this.P).a($$0, g(1), this.I, 20, xg.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.P = $$1));
      this.c(fuf.a(dkg::e).a(b).a(this.M).a(this.H, g(3), this.I, 20, xg.c("selectWorld.gameMode"), ($$0x, $$1) -> this.M = $$1));
      this.U = this.c(new fos.a($$0, g(3), this.I, this.R, 0.0F, 16.0F));
      xg $$5 = xg.c("mco.configure.world.spawn_toggle.message");
      fuf<Boolean> $$6 = fuf.b(this.L != buz.a && this.Q)
         .a($$0, g(5), this.I, 20, xg.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.Q = $$0x));
      this.c(fuf.a(buz::b).a(a).a(this.L).a(this.H, g(5), this.I, 20, xg.c("options.difficulty"), ($$1, $$2) -> {
         this.L = $$2;
         if (this.K == fmr.d.a) {
            boolean $$3 = this.L != buz.a;
            $$6.j = $$3;
            $$6.a($$3 && this.Q);
         }
      }));
      this.c($$6);
      fuf<Boolean> $$7 = this.c(fuf.b(this.T).a(this.H, g(7), this.I, 20, xg.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.T = $$1));
      fuf<Boolean> $$8 = this.c(fuf.b(this.S).a($$0, g(7), this.I, 20, xg.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.S = $$1));
      if (this.K != fmr.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.U.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.L == buz.a) {
         $$6.j = false;
      }

      this.c(fty.a(xg.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.H, g(13), this.I, 20).a());
      this.c(fty.a(xf.e, $$0x -> this.aQ_()).a($$0, g(13), this.I, 20).a());
   }

   private fuf.b<Boolean> a(xg $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fom.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.aQ_();
            }));
         }
      };
   }

   @Override
   public xg i() {
      return xf.a(this.n(), this.m());
   }

   @Override
   public void a(ftk $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.b(this.p, E, this.H + this.I / 2 - this.p.a(E) / 2, g(0) - 5, -1);
      this.G.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.N)) {
         this.O = "";
      } else {
         this.O = $$0;
      }
   }

   private void E() {
      int $$0 = a(a, this.L, 2);
      int $$1 = a(b, this.M, 0);
      if (this.K != fmr.d.c && this.K != fmr.d.d && this.K != fmr.d.e) {
         boolean $$2 = this.K == fmr.d.a && this.L != buz.a && this.Q;
         this.c.a(new fmx(this.P, $$2, this.R, this.S, $$0, $$1, this.J.h, this.T, this.O, this.J.i, this.J.j));
      } else {
         this.c.a(new fmx(this.J.a, this.J.b, this.J.c, this.J.d, $$0, $$1, this.J.h, this.J.e, this.O, this.J.i, this.J.j));
      }
   }

   class a extends ftt {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xf.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((azz.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fos.this.U.j) {
            fos.this.R = (int)azz.d(azz.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xf.a(fos.F, (xg)(fos.this.R == 0 ? xf.c : xg.b(String.valueOf(fos.this.R)))));
      }
   }
}
