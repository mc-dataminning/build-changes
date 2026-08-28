import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fnu extends hqd {
   private static final int C = 2;
   public static final List<bud> a = ImmutableList.of(bud.a, bud.b, bud.c, bud.d);
   private static final int D = 0;
   public static final List<djj> b = ImmutableList.of(djj.a, djj.b, djj.c);
   private static final wy E = wy.c("mco.configure.world.edit.slot.name");
   static final wy F = wy.c("mco.configure.world.spawnProtection");
   private ftj G;
   protected final fnd c;
   private int H;
   private int I;
   private final fma J;
   private final flu.d K;
   private bud L;
   private djj M;
   private final String N;
   private String O;
   private boolean P;
   private boolean Q;
   int R;
   private boolean S;
   private boolean T;
   fnu.a U;

   public fnu(fnd $$0, fma $$1, flu.d $$2, int $$3) {
      super(wy.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.J = $$1;
      this.K = $$2;
      this.L = a(a, $$1.f, 2);
      this.M = a(b, $$1.g, 0);
      this.N = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == flu.d.a) {
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
   public void aL_() {
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
   public void aO_() {
      this.I = 170;
      this.H = this.n / 2 - this.I;
      int $$0 = this.n / 2 + 10;
      if (this.K != flu.d.a) {
         wy $$1;
         if (this.K == flu.d.c) {
            $$1 = wy.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.K == flu.d.e) {
            $$1 = wy.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = wy.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hqc($$1, this.n / 2, 26, 16711680));
      }

      this.G = this.d(new ftj(this.m.h, this.H, g(1), this.I, 20, null, wy.c("mco.configure.world.edit.slot.name")));
      this.G.f(10);
      this.G.a(this.O);
      this.G.b(this::a);
      fth<Boolean> $$4 = this.c(fth.b(this.P).a($$0, g(1), this.I, 20, wy.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.P = $$1));
      this.c(fth.a(djj::e).a(b).a(this.M).a(this.H, g(3), this.I, 20, wy.c("selectWorld.gameMode"), ($$0x, $$1) -> this.M = $$1));
      this.U = this.c(new fnu.a($$0, g(3), this.I, this.R, 0.0F, 16.0F));
      wy $$5 = wy.c("mco.configure.world.spawn_toggle.message");
      fth<Boolean> $$6 = fth.b(this.L != bud.a && this.Q)
         .a($$0, g(5), this.I, 20, wy.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.Q = $$0x));
      this.c(fth.a(bud::b).a(a).a(this.L).a(this.H, g(5), this.I, 20, wy.c("options.difficulty"), ($$1, $$2) -> {
         this.L = $$2;
         if (this.K == flu.d.a) {
            boolean $$3 = this.L != bud.a;
            $$6.j = $$3;
            $$6.a($$3 && this.Q);
         }
      }));
      this.c($$6);
      fth<Boolean> $$7 = this.c(fth.b(this.T).a(this.H, g(7), this.I, 20, wy.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.T = $$1));
      fth<Boolean> $$8 = this.c(fth.b(this.S).a($$0, g(7), this.I, 20, wy.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.S = $$1));
      if (this.K != flu.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.U.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.L == bud.a) {
         $$6.j = false;
      }

      this.c(fta.a(wy.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.H, g(13), this.I, 20).a());
      this.c(fta.a(wx.e, $$0x -> this.aL_()).a($$0, g(13), this.I, 20).a());
   }

   private fth.b<Boolean> a(wy $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fnp.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.aL_();
            }));
         }
      };
   }

   @Override
   public wy i() {
      return wx.a(this.n(), this.m());
   }

   @Override
   public void a(fsm $$0, int $$1, int $$2, float $$3) {
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
      if (this.K != flu.d.c && this.K != flu.d.d && this.K != flu.d.e) {
         boolean $$2 = this.K == flu.d.a && this.L != bud.a && this.Q;
         this.c.a(new fma(this.P, $$2, this.R, this.S, $$0, $$1, this.J.h, this.T, this.O, this.J.i, this.J.j));
      } else {
         this.c.a(new fma(this.J.a, this.J.b, this.J.c, this.J.d, $$0, $$1, this.J.h, this.J.e, this.O, this.J.i, this.J.j));
      }
   }

   class a extends fsv {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, wx.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((azm.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fnu.this.U.j) {
            fnu.this.R = (int)azm.d(azm.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(wx.a(fnu.F, (wy)(fnu.this.R == 0 ? wx.c : wy.b(String.valueOf(fnu.this.R)))));
      }
   }
}
