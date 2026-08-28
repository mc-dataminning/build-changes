import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fep extends gwq {
   private static final int B = 2;
   public static final List<bqo> a = ImmutableList.of(bqo.a, bqo.b, bqo.c, bqo.d);
   private static final int C = 0;
   public static final List<dct> b = ImmutableList.of(dct.a, dct.b, dct.c);
   private static final wz D = wz.c("mco.configure.world.edit.slot.name");
   static final wz E = wz.c("mco.configure.world.spawnProtection");
   private fiv F;
   protected final fdx c;
   private int G;
   private int H;
   private final fcu I;
   private final fcp.d J;
   private bqo K;
   private dct L;
   private final String M;
   private String N;
   private boolean O;
   private boolean P;
   private boolean Q;
   private boolean R;
   int S;
   private boolean T;
   private boolean U;
   fep.a V;

   public fep(fdx $$0, fcu $$1, fcp.d $$2, int $$3) {
      super(wz.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.I = $$1;
      this.J = $$2;
      this.K = a(a, $$1.h, 2);
      this.L = a(b, $$1.i, 0);
      this.M = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fcp.d.a) {
         this.O = $$1.a;
         this.S = $$1.e;
         this.U = $$1.g;
         this.Q = $$1.b;
         this.R = $$1.c;
         this.P = $$1.d;
         this.T = $$1.f;
      } else {
         this.O = true;
         this.S = 0;
         this.U = false;
         this.Q = true;
         this.R = true;
         this.P = true;
         this.T = true;
      }
   }

   @Override
   public void d() {
      this.l.a(this.c);
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
      this.H = 170;
      this.G = this.m / 2 - this.H;
      int $$0 = this.m / 2 + 10;
      if (this.J != fcp.d.a) {
         wz $$1;
         if (this.J == fcp.d.c) {
            $$1 = wz.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.J == fcp.d.e) {
            $$1 = wz.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = wz.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gwo($$1, this.m / 2, 26, 16711680));
      }

      this.F = this.d(new fiv(this.l.h, this.G, g(1), this.H, 20, null, wz.c("mco.configure.world.edit.slot.name")));
      this.F.f(10);
      this.F.a(this.N);
      this.F.b(this::a);
      fit<Boolean> $$4 = this.c(fit.b(this.O).a($$0, g(1), this.H, 20, wz.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.O = $$1));
      this.c(fit.a(dct::e).a(b).a(this.L).a(this.G, g(3), this.H, 20, wz.c("selectWorld.gameMode"), ($$0x, $$1) -> this.L = $$1));
      wz $$5 = wz.c("mco.configure.world.spawn_toggle.message");
      fit<Boolean> $$6 = this.c(fit.b(this.Q).a($$0, g(3), this.H, 20, wz.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.Q = $$0x)));
      fit<Boolean> $$7 = fit.b(this.K != bqo.a && this.R)
         .a($$0, g(5), this.H, 20, wz.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.R = $$0x));
      this.c(fit.a(bqo::b).a(a).a(this.K).a(this.G, g(5), this.H, 20, wz.c("options.difficulty"), ($$1, $$2) -> {
         this.K = $$2;
         if (this.J == fcp.d.a) {
            boolean $$3 = this.K != bqo.a;
            $$7.j = $$3;
            $$7.a($$3 && this.R);
         }
      }));
      this.c($$7);
      this.V = this.c(new fep.a(this.G, g(7), this.H, this.S, 0.0F, 16.0F));
      fit<Boolean> $$8 = this.c(
         fit.b(this.P)
            .a(
               $$0,
               g(7),
               this.H,
               20,
               wz.c("mco.configure.world.spawnNPCs"),
               this.a(wz.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.P = $$0x)
            )
      );
      fit<Boolean> $$9 = this.c(fit.b(this.U).a(this.G, g(9), this.H, 20, wz.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.U = $$1));
      fit<Boolean> $$10 = this.c(fit.b(this.T).a($$0, g(9), this.H, 20, wz.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.T = $$1));
      if (this.J != fcp.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.V.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.K == bqo.a) {
         $$7.j = false;
      }

      this.c(fim.a(wz.c("mco.configure.world.buttons.done"), $$0x -> this.C()).a(this.G, g(13), this.H, 20).a());
      this.c(fim.a(wy.e, $$0x -> this.d()).a($$0, g(13), this.H, 20).a());
   }

   private fit.b<Boolean> a(wz $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.l.a(fej.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.d();
            }));
         }
      };
   }

   @Override
   public wz i() {
      return wy.a(this.n(), this.m());
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, -1);
      $$0.a(this.o, D, this.G + this.H / 2 - this.o.a(D) / 2, g(0) - 5, -1, false);
      this.F.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.M)) {
         this.N = "";
      } else {
         this.N = $$0;
      }
   }

   private void C() {
      int $$0 = a(a, this.K, 2);
      int $$1 = a(b, this.L, 0);
      if (this.J != fcp.d.c && this.J != fcp.d.d && this.J != fcp.d.e) {
         boolean $$2 = this.J == fcp.d.a && this.K != bqo.a && this.R;
         this.c.a(new fcu(this.O, this.Q, $$2, this.P, this.S, this.T, $$0, $$1, this.U, this.N, this.I.j, this.I.k));
      } else {
         this.c.a(new fcu(this.I.a, this.I.b, this.I.c, this.I.d, this.I.e, this.I.f, $$0, $$1, this.I.g, this.N, this.I.j, this.I.k));
      }
   }

   class a extends fii {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, wy.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((ayo.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fep.this.V.j) {
            fep.this.S = (int)ayo.d(ayo.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(wy.a(fep.E, (wz)(fep.this.S == 0 ? wy.c : wz.b(String.valueOf(fep.this.S)))));
      }
   }
}
