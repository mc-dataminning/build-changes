import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fdc extends gvb {
   private static final int B = 2;
   public static final List<bqm> a = ImmutableList.of(bqm.a, bqm.b, bqm.c, bqm.d);
   private static final int C = 0;
   public static final List<dbq> b = ImmutableList.of(dbq.a, dbq.b, dbq.c);
   private static final xl D = xl.c("mco.configure.world.edit.slot.name");
   static final xl E = xl.c("mco.configure.world.spawnProtection");
   private static final xl F = xl.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private fhi G;
   protected final fcj c;
   private int H;
   private int I;
   private final fbh J;
   private final fba.d K;
   private bqm L;
   private dbq M;
   private final String N;
   private String O;
   private boolean P;
   private boolean Q;
   private boolean R;
   private boolean S;
   int T;
   private boolean U;
   private boolean V;
   fdc.a W;

   public fdc(fcj $$0, fbh $$1, fba.d $$2, int $$3) {
      super(xl.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.J = $$1;
      this.K = $$2;
      this.L = a(a, $$1.h, 2);
      this.M = a(b, $$1.i, 0);
      this.N = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fba.d.a) {
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
   public void aN_() {
      this.I = 170;
      this.H = this.n / 2 - this.I;
      int $$0 = this.n / 2 + 10;
      if (this.K != fba.d.a) {
         xl $$1;
         if (this.K == fba.d.c) {
            $$1 = xl.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.K == fba.d.e) {
            $$1 = xl.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = xl.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new guz($$1, this.n / 2, 26, 16711680));
      }

      this.G = this.d(new fhi(this.m.h, this.H, g(1), this.I, 20, null, xl.c("mco.configure.world.edit.slot.name")));
      this.G.f(10);
      this.G.a(this.O);
      this.G.b(this::a);
      fhg<Boolean> $$4 = this.c(fhg.b(this.P).a($$0, g(1), this.I, 20, xl.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.P = $$1));
      this.c(fhg.a(dbq::e).a(b).a(this.M).a(this.H, g(3), this.I, 20, xl.c("selectWorld.gameMode"), ($$0x, $$1) -> this.M = $$1));
      xl $$5 = xl.c("mco.configure.world.spawn_toggle.message");
      fhg<Boolean> $$6 = this.c(fhg.b(this.R).a($$0, g(3), this.I, 20, xl.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.R = $$0x)));
      fhg<Boolean> $$7 = fhg.b(this.L != bqm.a && this.S)
         .a($$0, g(5), this.I, 20, xl.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.S = $$0x));
      this.c(fhg.a(bqm::b).a(a).a(this.L).a(this.H, g(5), this.I, 20, xl.c("options.difficulty"), ($$1, $$2) -> {
         this.L = $$2;
         if (this.K == fba.d.a) {
            boolean $$3 = this.L != bqm.a;
            $$7.j = $$3;
            $$7.a($$3 && this.S);
         }
      }));
      this.c($$7);
      this.W = this.c(new fdc.a(this.H, g(7), this.I, this.T, 0.0F, 16.0F));
      fhg<Boolean> $$8 = this.c(
         fhg.b(this.Q)
            .a(
               $$0,
               g(7),
               this.I,
               20,
               xl.c("mco.configure.world.spawnNPCs"),
               this.a(xl.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.Q = $$0x)
            )
      );
      fhg<Boolean> $$9 = this.c(fhg.b(this.V).a(this.H, g(9), this.I, 20, xl.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.V = $$1));
      fhg<Boolean> $$10 = this.c(fhg.b(this.U).a($$0, g(9), this.I, 20, xl.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.U = $$1));
      if (this.K != fba.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.W.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.L == bqm.a) {
         $$7.j = false;
      }

      this.c(fgz.a(xl.c("mco.configure.world.buttons.done"), $$0x -> this.C()).a(this.H, g(13), this.I, 20).a());
      this.c(fgz.a(xk.e, $$0x -> this.m.a(this.c)).a($$0, g(13), this.I, 20).a());
   }

   private fhg.b<Boolean> a(xl $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(new flq($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.m.a(this);
            }, F, $$0, xk.i, xk.e));
         }
      };
   }

   @Override
   public xl i() {
      return xk.a(this.n(), this.m());
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
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

   private void C() {
      int $$0 = a(a, this.L, 2);
      int $$1 = a(b, this.M, 0);
      if (this.K != fba.d.c && this.K != fba.d.d && this.K != fba.d.e) {
         boolean $$2 = this.K == fba.d.a && this.L != bqm.a && this.S;
         this.c.a(new fbh(this.P, this.R, $$2, this.Q, this.T, this.U, $$0, $$1, this.V, this.O, this.J.j, this.J.k));
      } else {
         this.c.a(new fbh(this.J.a, this.J.b, this.J.c, this.J.d, this.J.e, this.J.f, $$0, $$1, this.J.g, this.O, this.J.j, this.J.k));
      }
   }

   class a extends fgv {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, xk.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((ayu.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fdc.this.W.j) {
            fdc.this.T = (int)ayu.d(ayu.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(xk.a(fdc.E, (xl)(fdc.this.T == 0 ? xk.c : xl.b(String.valueOf(fdc.this.T)))));
      }
   }
}
