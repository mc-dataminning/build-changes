import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fha extends hee {
   private static final int B = 2;
   public static final List<brv> a = ImmutableList.of(brv.a, brv.b, brv.c, brv.d);
   private static final int C = 0;
   public static final List<des> b = ImmutableList.of(des.a, des.b, des.c);
   private static final xh D = xh.c("mco.configure.world.edit.slot.name");
   static final xh E = xh.c("mco.configure.world.spawnProtection");
   private fli F;
   protected final fgi c;
   private int G;
   private int H;
   private final fff I;
   private final ffa.d J;
   private brv K;
   private des L;
   private final String M;
   private String N;
   private boolean O;
   private boolean P;
   int Q;
   private boolean R;
   private boolean S;
   fha.a T;

   public fha(fgi $$0, fff $$1, ffa.d $$2, int $$3) {
      super(xh.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.I = $$1;
      this.J = $$2;
      this.K = a(a, $$1.f, 2);
      this.L = a(b, $$1.g, 0);
      this.M = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == ffa.d.a) {
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
   public void aS_() {
      this.H = 170;
      this.G = this.n / 2 - this.H;
      int $$0 = this.n / 2 + 10;
      if (this.J != ffa.d.a) {
         xh $$1;
         if (this.J == ffa.d.c) {
            $$1 = xh.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.J == ffa.d.e) {
            $$1 = xh.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xh.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new hec($$1, this.n / 2, 26, 16711680));
      }

      this.F = this.d(new fli(this.m.h, this.G, g(1), this.H, 20, null, xh.c("mco.configure.world.edit.slot.name")));
      this.F.f(10);
      this.F.a(this.N);
      this.F.b(this::a);
      flg<Boolean> $$4 = this.c(flg.b(this.O).a($$0, g(1), this.H, 20, xh.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.O = $$1));
      this.c(flg.a(des::e).a(b).a(this.L).a(this.G, g(3), this.H, 20, xh.c("selectWorld.gameMode"), ($$0x, $$1) -> this.L = $$1));
      this.T = this.c(new fha.a($$0, g(3), this.H, this.Q, 0.0F, 16.0F));
      xh $$5 = xh.c("mco.configure.world.spawn_toggle.message");
      flg<Boolean> $$6 = flg.b(this.K != brv.a && this.P)
         .a($$0, g(5), this.H, 20, xh.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.P = $$0x));
      this.c(flg.a(brv::b).a(a).a(this.K).a(this.G, g(5), this.H, 20, xh.c("options.difficulty"), ($$1, $$2) -> {
         this.K = $$2;
         if (this.J == ffa.d.a) {
            boolean $$3 = this.K != brv.a;
            $$6.j = $$3;
            $$6.a($$3 && this.P);
         }
      }));
      this.c($$6);
      flg<Boolean> $$7 = this.c(flg.b(this.S).a(this.G, g(7), this.H, 20, xh.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.S = $$1));
      flg<Boolean> $$8 = this.c(flg.b(this.R).a($$0, g(7), this.H, 20, xh.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.R = $$1));
      if (this.J != ffa.d.a) {
         $$4.j = false;
         $$6.j = false;
         this.T.j = false;
         $$8.j = false;
         $$7.j = false;
      }

      if (this.K == brv.a) {
         $$6.j = false;
      }

      this.c(fkz.a(xh.c("mco.configure.world.buttons.done"), $$0x -> this.D()).a(this.G, g(13), this.H, 20).a());
      this.c(fkz.a(xg.e, $$0x -> this.d()).a($$0, g(13), this.H, 20).a());
   }

   private flg.b<Boolean> a(xh $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(fgu.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.d();
            }));
         }
      };
   }

   @Override
   public xh i() {
      return xg.a(this.n(), this.m());
   }

   @Override
   public void a(fkm $$0, int $$1, int $$2, float $$3) {
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
      if (this.J != ffa.d.c && this.J != ffa.d.d && this.J != ffa.d.e) {
         boolean $$2 = this.J == ffa.d.a && this.K != brv.a && this.P;
         this.c.a(new fff(this.O, $$2, this.Q, this.R, $$0, $$1, this.S, this.N, this.I.h, this.I.i));
      } else {
         this.c.a(new fff(this.I.a, this.I.b, this.I.c, this.I.d, $$0, $$1, this.I.e, this.N, this.I.h, this.I.i));
      }
   }

   class a extends fkv {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xg.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((azj.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fha.this.T.j) {
            fha.this.Q = (int)azj.d(azj.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xg.a(fha.E, (xh)(fha.this.Q == 0 ? xg.c : xh.b(String.valueOf(fha.this.Q)))));
      }
   }
}
