import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fmh extends hol {
   private static final int C = 2;
   public static final List<btv> a = ImmutableList.of(btv.a, btv.b, btv.c, btv.d);
   private static final int D = 0;
   public static final List<dim> b = ImmutableList.of(dim.a, dim.b, dim.c);
   private static final ww E = ww.c("mco.configure.world.edit.slot.name");
   static final ww F = ww.c("mco.configure.world.spawnProtection");
   private frz G;
   protected final flq c;
   private int H;
   private int I;
   private final fkn J;
   private final fkh.d K;
   private btv L;
   private dim M;
   private final String N;
   private String O;
   private boolean P;
   private boolean Q;
   int R;
   private boolean S;
   private boolean T;
   fmh.a U;

   public fmh(flq $$0, fkn $$1, fkh.d $$2, int $$3) {
      super(ww.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.J = $$1;
      this.K = $$2;
      this.L = a(a, $$1.f, 2);
      this.M = a(b, $$1.g, 0);
      this.N = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fkh.d.a) {
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
   public void aK_() {
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
   public void aN_() {
      this.I = 170;
      this.H = this.n / 2 - this.I;
      int $$0 = this.n / 2 + 10;
      if (this.K != fkh.d.a) {
         ww $$1;
         if (this.K == fkh.d.c) {
            $$1 = ww.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.K == fkh.d.e) {
            $$1 = ww.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = ww.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hok($$1, this.n / 2, 26, 16711680));
      }

      this.G = this.d(new frz(this.m.h, this.H, g(1), this.I, 20, null, ww.c("mco.configure.world.edit.slot.name")));
      this.G.f(10);
      this.G.a(this.O);
      this.G.b(this::a);
      frx<Boolean> $$4 = this.c(frx.b(this.P).a($$0, g(1), this.I, 20, ww.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.P = $$1));
      this.c(frx.a(dim::e).a(b).a(this.M).a(this.H, g(3), this.I, 20, ww.c("selectWorld.gameMode"), ($$0x, $$1) -> this.M = $$1));
      this.U = this.c(new fmh.a($$0, g(3), this.I, this.R, 0.0F, 16.0F));
      ww $$5 = ww.c("mco.configure.world.spawn_toggle.message");
      frx<Boolean> $$6 = frx.b(this.L != btv.a && this.Q)
         .a($$0, g(5), this.I, 20, ww.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.Q = $$0x));
      this.c(frx.a(btv::b).a(a).a(this.L).a(this.H, g(5), this.I, 20, ww.c("options.difficulty"), ($$1, $$2) -> {
         this.L = $$2;
         if (this.K == fkh.d.a) {
            boolean $$3 = this.L != btv.a;
            $$6.j = $$3;
            $$6.a($$3 && this.Q);
         }
      }));
      this.c($$6);
      frx<Boolean> $$7 = this.c(frx.b(this.T).a(this.H, g(7), this.I, 20, ww.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.T = $$1));
      frx<Boolean> $$8 = this.c(frx.b(this.S).a($$0, g(7), this.I, 20, ww.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.S = $$1));
      if (this.K != fkh.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.U.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.L == btv.a) {
         $$6.j = false;
      }

      this.c(frq.a(ww.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.H, g(13), this.I, 20).a());
      this.c(frq.a(wv.e, $$0x -> this.aK_()).a($$0, g(13), this.I, 20).a());
   }

   private frx.b<Boolean> a(ww $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fmc.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.aK_();
            }));
         }
      };
   }

   @Override
   public ww i() {
      return wv.a(this.n(), this.m());
   }

   @Override
   public void a(frc $$0, int $$1, int $$2, float $$3) {
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
      if (this.K != fkh.d.c && this.K != fkh.d.d && this.K != fkh.d.e) {
         boolean $$2 = this.K == fkh.d.a && this.L != btv.a && this.Q;
         this.c.a(new fkn(this.P, $$2, this.R, this.S, $$0, $$1, this.J.h, this.T, this.O, this.J.i, this.J.j));
      } else {
         this.c.a(new fkn(this.J.a, this.J.b, this.J.c, this.J.d, $$0, $$1, this.J.h, this.J.e, this.O, this.J.i, this.J.j));
      }
   }

   class a extends frl {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, wv.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((azk.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fmh.this.U.j) {
            fmh.this.R = (int)azk.d(azk.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(wv.a(fmh.F, (ww)(fmh.this.R == 0 ? wv.c : ww.b(String.valueOf(fmh.this.R)))));
      }
   }
}
