import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fkc extends hhp {
   private static final int C = 2;
   public static final List<btb> a = ImmutableList.of(btb.a, btb.b, btb.c, btb.d);
   private static final int D = 0;
   public static final List<dgx> b = ImmutableList.of(dgx.a, dgx.b, dgx.c);
   private static final xv E = xv.c("mco.configure.world.edit.slot.name");
   static final xv F = xv.c("mco.configure.world.spawnProtection");
   private foh G;
   protected final fjl c;
   private int H;
   private int I;
   private final fii J;
   private final fic.d K;
   private btb L;
   private dgx M;
   private final String N;
   private String O;
   private boolean P;
   private boolean Q;
   int R;
   private boolean S;
   private boolean T;
   fkc.a U;

   public fkc(fjl $$0, fii $$1, fic.d $$2, int $$3) {
      super(xv.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.J = $$1;
      this.K = $$2;
      this.L = a(a, $$1.f, 2);
      this.M = a(b, $$1.g, 0);
      this.N = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fic.d.a) {
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
   public void aT_() {
      this.I = 170;
      this.H = this.n / 2 - this.I;
      int $$0 = this.n / 2 + 10;
      if (this.K != fic.d.a) {
         xv $$1;
         if (this.K == fic.d.c) {
            $$1 = xv.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.K == fic.d.e) {
            $$1 = xv.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xv.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hho($$1, this.n / 2, 26, 16711680));
      }

      this.G = this.d(new foh(this.m.h, this.H, g(1), this.I, 20, null, xv.c("mco.configure.world.edit.slot.name")));
      this.G.f(10);
      this.G.a(this.O);
      this.G.b(this::a);
      fof<Boolean> $$4 = this.c(fof.b(this.P).a($$0, g(1), this.I, 20, xv.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.P = $$1));
      this.c(fof.a(dgx::e).a(b).a(this.M).a(this.H, g(3), this.I, 20, xv.c("selectWorld.gameMode"), ($$0x, $$1) -> this.M = $$1));
      this.U = this.c(new fkc.a($$0, g(3), this.I, this.R, 0.0F, 16.0F));
      xv $$5 = xv.c("mco.configure.world.spawn_toggle.message");
      fof<Boolean> $$6 = fof.b(this.L != btb.a && this.Q)
         .a($$0, g(5), this.I, 20, xv.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.Q = $$0x));
      this.c(fof.a(btb::b).a(a).a(this.L).a(this.H, g(5), this.I, 20, xv.c("options.difficulty"), ($$1, $$2) -> {
         this.L = $$2;
         if (this.K == fic.d.a) {
            boolean $$3 = this.L != btb.a;
            $$6.j = $$3;
            $$6.a($$3 && this.Q);
         }
      }));
      this.c($$6);
      fof<Boolean> $$7 = this.c(fof.b(this.T).a(this.H, g(7), this.I, 20, xv.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.T = $$1));
      fof<Boolean> $$8 = this.c(fof.b(this.S).a($$0, g(7), this.I, 20, xv.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.S = $$1));
      if (this.K != fic.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.U.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.L == btb.a) {
         $$6.j = false;
      }

      this.c(fny.a(xv.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.H, g(13), this.I, 20).a());
      this.c(fny.a(xu.e, $$0x -> this.aP_()).a($$0, g(13), this.I, 20).a());
   }

   private fof.b<Boolean> a(xv $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fjx.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.aP_();
            }));
         }
      };
   }

   @Override
   public xv i() {
      return xu.a(this.m(), this.l());
   }

   @Override
   public void a(fnl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, E, this.H + this.I / 2 - this.p.a(E) / 2, g(0) - 5, -1, false);
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
      if (this.K != fic.d.c && this.K != fic.d.d && this.K != fic.d.e) {
         boolean $$2 = this.K == fic.d.a && this.L != btb.a && this.Q;
         this.c.a(new fii(this.P, $$2, this.R, this.S, $$0, $$1, this.J.h, this.T, this.O, this.J.i, this.J.j));
      } else {
         this.c.a(new fii(this.J.a, this.J.b, this.J.c, this.J.d, $$0, $$1, this.J.h, this.J.e, this.O, this.J.i, this.J.j));
      }
   }

   class a extends fnu {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xu.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((bae.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fkc.this.U.j) {
            fkc.this.R = (int)bae.d(bae.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xu.a(fkc.F, (xv)(fkc.this.R == 0 ? xu.c : xv.b(String.valueOf(fkc.this.R)))));
      }
   }
}
