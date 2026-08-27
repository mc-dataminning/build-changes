import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class ezr extends grl {
   private static final int y = 2;
   public static final List<bnx> a = ImmutableList.of(bnx.a, bnx.b, bnx.c, bnx.d);
   private static final int z = 0;
   public static final List<cyu> b = ImmutableList.of(cyu.a, cyu.b, cyu.c);
   private static final wg A = wg.c("mco.configure.world.edit.slot.name");
   static final wg B = wg.c("mco.configure.world.spawnProtection");
   private static final wg C = wg.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private fdy D;
   protected final eyy c;
   private int E;
   private int F;
   private final exw G;
   private final exp.d H;
   private bnx I;
   private cyu J;
   private final String K;
   private String L;
   private boolean M;
   private boolean N;
   private boolean O;
   private boolean P;
   int Q;
   private boolean R;
   private boolean S;
   ezr.a T;

   public ezr(eyy $$0, exw $$1, exp.d $$2, int $$3) {
      super(wg.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.G = $$1;
      this.H = $$2;
      this.I = a(a, $$1.h, 2);
      this.J = a(b, $$1.i, 0);
      this.K = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == exp.d.a) {
         this.M = $$1.a;
         this.Q = $$1.e;
         this.S = $$1.g;
         this.O = $$1.b;
         this.P = $$1.c;
         this.N = $$1.d;
         this.R = $$1.f;
      } else {
         this.M = true;
         this.Q = 0;
         this.S = false;
         this.O = true;
         this.P = true;
         this.N = true;
         this.R = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.j.a(this.c);
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
   public void aN_() {
      this.F = 170;
      this.E = this.k / 2 - this.F;
      int $$0 = this.k / 2 + 10;
      if (this.H != exp.d.a) {
         wg $$1;
         if (this.H == exp.d.c) {
            $$1 = wg.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.H == exp.d.e) {
            $$1 = wg.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = wg.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new grj($$1, this.k / 2, 26, 16711680));
      }

      this.D = this.d(new fdy(this.j.h, this.E, g(1), this.F, 20, null, wg.c("mco.configure.world.edit.slot.name")));
      this.D.f(10);
      this.D.a(this.L);
      this.D.b(this::a);
      fdw<Boolean> $$4 = this.c(fdw.b(this.M).a($$0, g(1), this.F, 20, wg.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.M = $$1));
      this.c(fdw.a(cyu::e).a(b).a(this.J).a(this.E, g(3), this.F, 20, wg.c("selectWorld.gameMode"), ($$0x, $$1) -> this.J = $$1));
      wg $$5 = wg.c("mco.configure.world.spawn_toggle.message");
      fdw<Boolean> $$6 = this.c(fdw.b(this.O).a($$0, g(3), this.F, 20, wg.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.O = $$0x)));
      fdw<Boolean> $$7 = fdw.b(this.I != bnx.a && this.P)
         .a($$0, g(5), this.F, 20, wg.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.P = $$0x));
      this.c(fdw.a(bnx::b).a(a).a(this.I).a(this.E, g(5), this.F, 20, wg.c("options.difficulty"), ($$1, $$2) -> {
         this.I = $$2;
         if (this.H == exp.d.a) {
            boolean $$3 = this.I != bnx.a;
            $$7.j = $$3;
            $$7.a($$3 && this.P);
         }
      }));
      this.c($$7);
      this.T = this.c(new ezr.a(this.E, g(7), this.F, this.Q, 0.0F, 16.0F));
      fdw<Boolean> $$8 = this.c(
         fdw.b(this.N)
            .a(
               $$0,
               g(7),
               this.F,
               20,
               wg.c("mco.configure.world.spawnNPCs"),
               this.a(wg.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.N = $$0x)
            )
      );
      fdw<Boolean> $$9 = this.c(fdw.b(this.S).a(this.E, g(9), this.F, 20, wg.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.S = $$1));
      fdw<Boolean> $$10 = this.c(fdw.b(this.R).a($$0, g(9), this.F, 20, wg.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.R = $$1));
      if (this.H != exp.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.T.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.I == bnx.a) {
         $$7.j = false;
      }

      this.c(fdp.a(wg.c("mco.configure.world.buttons.done"), $$0x -> this.C()).a(this.E, g(13), this.F, 20).a());
      this.c(fdp.a(wf.e, $$0x -> this.j.a(this.c)).a($$0, g(13), this.F, 20).a());
   }

   private fdw.b<Boolean> a(wg $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.j.a(new fig($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.j.a(this);
            }, C, $$0, wf.i, wf.e));
         }
      };
   }

   @Override
   public wg i() {
      return wf.a(this.n(), this.m());
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 17, -1);
      $$0.a(this.m, A, this.E + this.F / 2 - this.m.a(A) / 2, g(0) - 5, -1, false);
      this.D.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.K)) {
         this.L = "";
      } else {
         this.L = $$0;
      }
   }

   private void C() {
      int $$0 = a(a, this.I, 2);
      int $$1 = a(b, this.J, 0);
      if (this.H != exp.d.c && this.H != exp.d.d && this.H != exp.d.e) {
         boolean $$2 = this.H == exp.d.a && this.I != bnx.a && this.P;
         this.c.a(new exw(this.M, this.O, $$2, this.N, this.Q, this.R, $$0, $$1, this.S, this.L, this.G.j, this.G.k));
      } else {
         this.c.a(new exw(this.G.a, this.G.b, this.G.c, this.G.d, this.G.e, this.G.f, $$0, $$1, this.G.g, this.L, this.G.j, this.G.k));
      }
   }

   class a extends fdl {
      private final double d;
      private final double e;

      public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
         super($$0, $$1, $$2, 20, wf.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((axk.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (ezr.this.T.j) {
            ezr.this.Q = (int)axk.d(axk.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(wf.a(ezr.B, (wg)(ezr.this.Q == 0 ? wf.c : wg.b(String.valueOf(ezr.this.Q)))));
      }
   }
}
