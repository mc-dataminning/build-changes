import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fdv extends gvs {
   private static final int A = 2;
   public static final List<bqd> a = ImmutableList.of(bqd.a, bqd.b, bqd.c, bqd.d);
   private static final int B = 0;
   public static final List<dcc> b = ImmutableList.of(dcc.a, dcc.b, dcc.c);
   private static final wu C = wu.c("mco.configure.world.edit.slot.name");
   static final wu D = wu.c("mco.configure.world.spawnProtection");
   private static final wu E = wu.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private fib F;
   protected final fdd c;
   private int G;
   private int H;
   private final fca I;
   private final fbt.d J;
   private bqd K;
   private dcc L;
   private final String M;
   private String N;
   private boolean O;
   private boolean P;
   private boolean Q;
   private boolean R;
   int S;
   private boolean T;
   private boolean U;
   fdv.a V;

   public fdv(fdd $$0, fca $$1, fbt.d $$2, int $$3) {
      super(wu.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.I = $$1;
      this.J = $$2;
      this.K = a(a, $$1.h, 2);
      this.L = a(b, $$1.i, 0);
      this.M = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fbt.d.a) {
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
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.l.a(this.c);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
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
   public void aP_() {
      this.H = 170;
      this.G = this.m / 2 - this.H;
      int $$0 = this.m / 2 + 10;
      if (this.J != fbt.d.a) {
         wu $$1;
         if (this.J == fbt.d.c) {
            $$1 = wu.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.J == fbt.d.e) {
            $$1 = wu.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = wu.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gvq($$1, this.m / 2, 26, 16711680));
      }

      this.F = this.d(new fib(this.l.h, this.G, g(1), this.H, 20, null, wu.c("mco.configure.world.edit.slot.name")));
      this.F.f(10);
      this.F.a(this.N);
      this.F.b(this::a);
      fhz<Boolean> $$4 = this.c(fhz.b(this.O).a($$0, g(1), this.H, 20, wu.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.O = $$1));
      this.c(fhz.a(dcc::e).a(b).a(this.L).a(this.G, g(3), this.H, 20, wu.c("selectWorld.gameMode"), ($$0x, $$1) -> this.L = $$1));
      wu $$5 = wu.c("mco.configure.world.spawn_toggle.message");
      fhz<Boolean> $$6 = this.c(fhz.b(this.Q).a($$0, g(3), this.H, 20, wu.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.Q = $$0x)));
      fhz<Boolean> $$7 = fhz.b(this.K != bqd.a && this.R)
         .a($$0, g(5), this.H, 20, wu.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.R = $$0x));
      this.c(fhz.a(bqd::b).a(a).a(this.K).a(this.G, g(5), this.H, 20, wu.c("options.difficulty"), ($$1, $$2) -> {
         this.K = $$2;
         if (this.J == fbt.d.a) {
            boolean $$3 = this.K != bqd.a;
            $$7.j = $$3;
            $$7.a($$3 && this.R);
         }
      }));
      this.c($$7);
      this.V = this.c(new fdv.a(this.G, g(7), this.H, this.S, 0.0F, 16.0F));
      fhz<Boolean> $$8 = this.c(
         fhz.b(this.P)
            .a(
               $$0,
               g(7),
               this.H,
               20,
               wu.c("mco.configure.world.spawnNPCs"),
               this.a(wu.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.P = $$0x)
            )
      );
      fhz<Boolean> $$9 = this.c(fhz.b(this.U).a(this.G, g(9), this.H, 20, wu.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.U = $$1));
      fhz<Boolean> $$10 = this.c(fhz.b(this.T).a($$0, g(9), this.H, 20, wu.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.T = $$1));
      if (this.J != fbt.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.V.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.K == bqd.a) {
         $$7.j = false;
      }

      this.c(fhs.a(wu.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.G, g(13), this.H, 20).a());
      this.c(fhs.a(wt.e, $$0x -> this.l.a(this.c)).a($$0, g(13), this.H, 20).a());
   }

   private fhz.b<Boolean> a(wu $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.l.a(new fmh($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.l.a(this);
            }, E, $$0, wt.i, wt.e));
         }
      };
   }

   @Override
   public wu i() {
      return wt.a(this.n(), this.m());
   }

   @Override
   public void a(fhf $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, -1);
      $$0.a(this.o, C, this.G + this.H / 2 - this.o.a(C) / 2, g(0) - 5, -1, false);
      this.F.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.M)) {
         this.N = "";
      } else {
         this.N = $$0;
      }
   }

   private void E() {
      int $$0 = a(a, this.K, 2);
      int $$1 = a(b, this.L, 0);
      if (this.J != fbt.d.c && this.J != fbt.d.d && this.J != fbt.d.e) {
         boolean $$2 = this.J == fbt.d.a && this.K != bqd.a && this.R;
         this.c.a(new fca(this.O, this.Q, $$2, this.P, this.S, this.T, $$0, $$1, this.U, this.N, this.I.j, this.I.k));
      } else {
         this.c.a(new fca(this.I.a, this.I.b, this.I.c, this.I.d, this.I.e, this.I.f, $$0, $$1, this.I.g, this.N, this.I.j, this.I.k));
      }
   }

   class a extends fho {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, wt.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((ayg.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fdv.this.V.j) {
            fdv.this.S = (int)ayg.d(ayg.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(wt.a(fdv.D, (wu)(fdv.this.S == 0 ? wt.c : wu.b(String.valueOf(fdv.this.S)))));
      }
   }
}
