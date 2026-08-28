import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fdi extends gvh {
   private static final int B = 2;
   public static final List<bqs> a = ImmutableList.of(bqs.a, bqs.b, bqs.c, bqs.d);
   private static final int C = 0;
   public static final List<dbw> b = ImmutableList.of(dbw.a, dbw.b, dbw.c);
   private static final xp D = xp.c("mco.configure.world.edit.slot.name");
   static final xp E = xp.c("mco.configure.world.spawnProtection");
   private static final xp F = xp.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private fho G;
   protected final fcp c;
   private int H;
   private int I;
   private final fbn J;
   private final fbg.d K;
   private bqs L;
   private dbw M;
   private final String N;
   private String O;
   private boolean P;
   private boolean Q;
   private boolean R;
   private boolean S;
   int T;
   private boolean U;
   private boolean V;
   fdi.a W;

   public fdi(fcp $$0, fbn $$1, fbg.d $$2, int $$3) {
      super(xp.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.J = $$1;
      this.K = $$2;
      this.L = a(a, $$1.h, 2);
      this.M = a(b, $$1.i, 0);
      this.N = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fbg.d.a) {
         this.P = $$1.a;
         this.T = $$1.e;
         this.V = $$1.g;
         this.R = $$1.b;
         this.S = $$1.c;
         this.Q = $$1.d;
         this.U = $$1.f;
      } else {
         this.P = true;
         this.T = 0;
         this.V = false;
         this.R = true;
         this.S = true;
         this.Q = true;
         this.U = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.m.a(this.c);
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
   public void aM_() {
      this.I = 170;
      this.H = this.n / 2 - this.I;
      int $$0 = this.n / 2 + 10;
      if (this.K != fbg.d.a) {
         xp $$1;
         if (this.K == fbg.d.c) {
            $$1 = xp.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.K == fbg.d.e) {
            $$1 = xp.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xp.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gvf($$1, this.n / 2, 26, 16711680));
      }

      this.G = this.d(new fho(this.m.h, this.H, g(1), this.I, 20, null, xp.c("mco.configure.world.edit.slot.name")));
      this.G.f(10);
      this.G.a(this.O);
      this.G.b(this::a);
      fhm<Boolean> $$4 = this.c(fhm.b(this.P).a($$0, g(1), this.I, 20, xp.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.P = $$1));
      this.c(fhm.a(dbw::e).a(b).a(this.M).a(this.H, g(3), this.I, 20, xp.c("selectWorld.gameMode"), ($$0x, $$1) -> this.M = $$1));
      xp $$5 = xp.c("mco.configure.world.spawn_toggle.message");
      fhm<Boolean> $$6 = this.c(fhm.b(this.R).a($$0, g(3), this.I, 20, xp.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.R = $$0x)));
      fhm<Boolean> $$7 = fhm.b(this.L != bqs.a && this.S)
         .a($$0, g(5), this.I, 20, xp.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.S = $$0x));
      this.c(fhm.a(bqs::b).a(a).a(this.L).a(this.H, g(5), this.I, 20, xp.c("options.difficulty"), ($$1, $$2) -> {
         this.L = $$2;
         if (this.K == fbg.d.a) {
            boolean $$3 = this.L != bqs.a;
            $$7.j = $$3;
            $$7.a($$3 && this.S);
         }
      }));
      this.c($$7);
      this.W = this.c(new fdi.a(this.H, g(7), this.I, this.T, 0.0F, 16.0F));
      fhm<Boolean> $$8 = this.c(
         fhm.b(this.Q)
            .a(
               $$0,
               g(7),
               this.I,
               20,
               xp.c("mco.configure.world.spawnNPCs"),
               this.a(xp.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.Q = $$0x)
            )
      );
      fhm<Boolean> $$9 = this.c(fhm.b(this.V).a(this.H, g(9), this.I, 20, xp.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.V = $$1));
      fhm<Boolean> $$10 = this.c(fhm.b(this.U).a($$0, g(9), this.I, 20, xp.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.U = $$1));
      if (this.K != fbg.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.W.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.L == bqs.a) {
         $$7.j = false;
      }

      this.c(fhf.a(xp.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.H, g(13), this.I, 20).a());
      this.c(fhf.a(xo.e, $$0x -> this.m.a(this.c)).a($$0, g(13), this.I, 20).a());
   }

   private fhm.b<Boolean> a(xp $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(new flw($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.m.a(this);
            }, F, $$0, xo.i, xo.e));
         }
      };
   }

   @Override
   public xp i() {
      return xo.a(this.n(), this.m());
   }

   @Override
   public void a(fgs $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 17, -1);
      $$0.a(this.p, D, this.H + this.I / 2 - this.p.a(D) / 2, g(0) - 5, -1, false);
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
      if (this.K != fbg.d.c && this.K != fbg.d.d && this.K != fbg.d.e) {
         boolean $$2 = this.K == fbg.d.a && this.L != bqs.a && this.S;
         this.c.a(new fbn(this.P, this.R, $$2, this.Q, this.T, this.U, $$0, $$1, this.V, this.O, this.J.j, this.J.k));
      } else {
         this.c.a(new fbn(this.J.a, this.J.b, this.J.c, this.J.d, this.J.e, this.J.f, $$0, $$1, this.J.g, this.O, this.J.j, this.J.k));
      }
   }

   class a extends fhb {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xo.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((ayz.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fdi.this.W.j) {
            fdi.this.T = (int)ayz.d(ayz.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xo.a(fdi.E, (xp)(fdi.this.T == 0 ? xo.c : xp.b(String.valueOf(fdi.this.T)))));
      }
   }
}
