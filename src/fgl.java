import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fgl extends hdk {
   private static final int B = 2;
   public static final List<brm> a = ImmutableList.of(brm.a, brm.b, brm.c, brm.d);
   private static final int C = 0;
   public static final List<ded> b = ImmutableList.of(ded.a, ded.b, ded.c);
   private static final xd D = xd.c("mco.configure.world.edit.slot.name");
   static final xd E = xd.c("mco.configure.world.spawnProtection");
   private fkt F;
   protected final fft c;
   private int G;
   private int H;
   private final feq I;
   private final fel.d J;
   private brm K;
   private ded L;
   private final String M;
   private String N;
   private boolean O;
   private boolean P;
   int Q;
   private boolean R;
   private boolean S;
   fgl.a T;

   public fgl(fft $$0, feq $$1, fel.d $$2, int $$3) {
      super(xd.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.I = $$1;
      this.J = $$2;
      this.K = a(a, $$1.f, 2);
      this.L = a(b, $$1.g, 0);
      this.M = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fel.d.a) {
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
   public void d() {
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
      if (this.J != fel.d.a) {
         xd $$1;
         if (this.J == fel.d.c) {
            $$1 = xd.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.J == fel.d.e) {
            $$1 = xd.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xd.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hdi($$1, this.n / 2, 26, 16711680));
      }

      this.F = this.d(new fkt(this.m.h, this.G, g(1), this.H, 20, null, xd.c("mco.configure.world.edit.slot.name")));
      this.F.f(10);
      this.F.a(this.N);
      this.F.b(this::a);
      fkr<Boolean> $$4 = this.c(fkr.b(this.O).a($$0, g(1), this.H, 20, xd.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.O = $$1));
      this.c(fkr.a(ded::e).a(b).a(this.L).a(this.G, g(3), this.H, 20, xd.c("selectWorld.gameMode"), ($$0x, $$1) -> this.L = $$1));
      this.T = this.c(new fgl.a($$0, g(3), this.H, this.Q, 0.0F, 16.0F));
      xd $$5 = xd.c("mco.configure.world.spawn_toggle.message");
      fkr<Boolean> $$6 = fkr.b(this.K != brm.a && this.P)
         .a($$0, g(5), this.H, 20, xd.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.P = $$0x));
      this.c(fkr.a(brm::b).a(a).a(this.K).a(this.G, g(5), this.H, 20, xd.c("options.difficulty"), ($$1, $$2) -> {
         this.K = $$2;
         if (this.J == fel.d.a) {
            boolean $$3 = this.K != brm.a;
            $$6.j = $$3;
            $$6.a($$3 && this.P);
         }
      }));
      this.c($$6);
      fkr<Boolean> $$7 = this.c(fkr.b(this.S).a(this.G, g(7), this.H, 20, xd.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.S = $$1));
      fkr<Boolean> $$8 = this.c(fkr.b(this.R).a($$0, g(7), this.H, 20, xd.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.R = $$1));
      if (this.J != fel.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.T.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.K == brm.a) {
         $$6.j = false;
      }

      this.c(fkk.a(xd.c("mco.configure.world.buttons.done"), $$0x -> this.D()).a(this.G, g(13), this.H, 20).a());
      this.c(fkk.a(xc.e, $$0x -> this.d()).a($$0, g(13), this.H, 20).a());
   }

   private fkr.b<Boolean> a(xd $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fgf.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.d();
            }));
         }
      };
   }

   @Override
   public xd i() {
      return xc.a(this.n(), this.m());
   }

   @Override
   public void a(fjx $$0, int $$1, int $$2, float $$3) {
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
      if (this.J != fel.d.c && this.J != fel.d.d && this.J != fel.d.e) {
         boolean $$2 = this.J == fel.d.a && this.K != brm.a && this.P;
         this.c.a(new feq(this.O, $$2, this.Q, this.R, $$0, $$1, this.S, this.N, this.I.h, this.I.i));
      } else {
         this.c.a(new feq(this.I.a, this.I.b, this.I.c, this.I.d, $$0, $$1, this.I.e, this.N, this.I.h, this.I.i));
      }
   }

   class a extends fkg {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xc.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((azd.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fgl.this.T.j) {
            fgl.this.Q = (int)azd.d(azd.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xc.a(fgl.E, (xd)(fgl.this.Q == 0 ? xc.c : xd.b(String.valueOf(fgl.this.Q)))));
      }
   }
}
