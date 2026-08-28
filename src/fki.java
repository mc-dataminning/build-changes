import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fki extends hmd {
   private static final int C = 2;
   public static final List<bsv> a = ImmutableList.of(bsv.a, bsv.b, bsv.c, bsv.d);
   private static final int D = 0;
   public static final List<dgw> b = ImmutableList.of(dgw.a, dgw.b, dgw.c);
   private static final wp E = wp.c("mco.configure.world.edit.slot.name");
   static final wp F = wp.c("mco.configure.world.spawnProtection");
   private fpz G;
   protected final fjr c;
   private int H;
   private int I;
   private final fio J;
   private final fii.d K;
   private bsv L;
   private dgw M;
   private final String N;
   private String O;
   private boolean P;
   private boolean Q;
   int R;
   private boolean S;
   private boolean T;
   fki.a U;

   public fki(fjr $$0, fio $$1, fii.d $$2, int $$3) {
      super(wp.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.J = $$1;
      this.K = $$2;
      this.L = a(a, $$1.f, 2);
      this.M = a(b, $$1.g, 0);
      this.N = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fii.d.a) {
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
      this.I = 170;
      this.H = this.n / 2 - this.I;
      int $$0 = this.n / 2 + 10;
      if (this.K != fii.d.a) {
         wp $$1;
         if (this.K == fii.d.c) {
            $$1 = wp.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.K == fii.d.e) {
            $$1 = wp.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = wp.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hmc($$1, this.n / 2, 26, 16711680));
      }

      this.G = this.d(new fpz(this.m.h, this.H, g(1), this.I, 20, null, wp.c("mco.configure.world.edit.slot.name")));
      this.G.f(10);
      this.G.a(this.O);
      this.G.b(this::a);
      fpx<Boolean> $$4 = this.c(fpx.b(this.P).a($$0, g(1), this.I, 20, wp.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.P = $$1));
      this.c(fpx.a(dgw::e).a(b).a(this.M).a(this.H, g(3), this.I, 20, wp.c("selectWorld.gameMode"), ($$0x, $$1) -> this.M = $$1));
      this.U = this.c(new fki.a($$0, g(3), this.I, this.R, 0.0F, 16.0F));
      wp $$5 = wp.c("mco.configure.world.spawn_toggle.message");
      fpx<Boolean> $$6 = fpx.b(this.L != bsv.a && this.Q)
         .a($$0, g(5), this.I, 20, wp.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.Q = $$0x));
      this.c(fpx.a(bsv::b).a(a).a(this.L).a(this.H, g(5), this.I, 20, wp.c("options.difficulty"), ($$1, $$2) -> {
         this.L = $$2;
         if (this.K == fii.d.a) {
            boolean $$3 = this.L != bsv.a;
            $$6.j = $$3;
            $$6.a($$3 && this.Q);
         }
      }));
      this.c($$6);
      fpx<Boolean> $$7 = this.c(fpx.b(this.T).a(this.H, g(7), this.I, 20, wp.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.T = $$1));
      fpx<Boolean> $$8 = this.c(fpx.b(this.S).a($$0, g(7), this.I, 20, wp.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.S = $$1));
      if (this.K != fii.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.U.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.L == bsv.a) {
         $$6.j = false;
      }

      this.c(fpq.a(wp.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.H, g(13), this.I, 20).a());
      this.c(fpq.a(wo.e, $$0x -> this.aO_()).a($$0, g(13), this.I, 20).a());
   }

   private fpx.b<Boolean> a(wp $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fkd.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.aO_();
            }));
         }
      };
   }

   @Override
   public wp i() {
      return wo.a(this.n(), this.m());
   }

   @Override
   public void a(fpc $$0, int $$1, int $$2, float $$3) {
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
      if (this.K != fii.d.c && this.K != fii.d.d && this.K != fii.d.e) {
         boolean $$2 = this.K == fii.d.a && this.L != bsv.a && this.Q;
         this.c.a(new fio(this.P, $$2, this.R, this.S, $$0, $$1, this.J.h, this.T, this.O, this.J.i, this.J.j));
      } else {
         this.c.a(new fio(this.J.a, this.J.b, this.J.c, this.J.d, $$0, $$1, this.J.h, this.J.e, this.O, this.J.i, this.J.j));
      }
   }

   class a extends fpl {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, wo.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((ayz.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fki.this.U.j) {
            fki.this.R = (int)ayz.d(ayz.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(wo.a(fki.F, (wp)(fki.this.R == 0 ? wo.c : wp.b(String.valueOf(fki.this.R)))));
      }
   }
}
