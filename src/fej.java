import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fej extends gwj {
   private static final int A = 2;
   public static final List<bqn> a = ImmutableList.of(bqn.a, bqn.b, bqn.c, bqn.d);
   private static final int B = 0;
   public static final List<dcr> b = ImmutableList.of(dcr.a, dcr.b, dcr.c);
   private static final wy C = wy.c("mco.configure.world.edit.slot.name");
   static final wy D = wy.c("mco.configure.world.spawnProtection");
   private fip E;
   protected final fdr c;
   private int F;
   private int G;
   private final fco H;
   private final fcj.d I;
   private bqn J;
   private dcr K;
   private final String L;
   private String M;
   private boolean N;
   private boolean O;
   private boolean P;
   private boolean Q;
   int R;
   private boolean S;
   private boolean T;
   fej.a U;

   public fej(fdr $$0, fco $$1, fcj.d $$2, int $$3) {
      super(wy.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.H = $$1;
      this.I = $$2;
      this.J = a(a, $$1.h, 2);
      this.K = a(b, $$1.i, 0);
      this.L = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == fcj.d.a) {
         this.N = $$1.a;
         this.R = $$1.e;
         this.T = $$1.g;
         this.P = $$1.b;
         this.Q = $$1.c;
         this.O = $$1.d;
         this.S = $$1.f;
      } else {
         this.N = true;
         this.R = 0;
         this.T = false;
         this.P = true;
         this.Q = true;
         this.O = true;
         this.S = true;
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
   public void aP_() {
      this.G = 170;
      this.F = this.m / 2 - this.G;
      int $$0 = this.m / 2 + 10;
      if (this.I != fcj.d.a) {
         wy $$1;
         if (this.I == fcj.d.c) {
            $$1 = wy.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.I == fcj.d.e) {
            $$1 = wy.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = wy.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gwh($$1, this.m / 2, 26, 16711680));
      }

      this.E = this.d(new fip(this.l.h, this.F, g(1), this.G, 20, null, wy.c("mco.configure.world.edit.slot.name")));
      this.E.f(10);
      this.E.a(this.M);
      this.E.b(this::a);
      fin<Boolean> $$4 = this.c(fin.b(this.N).a($$0, g(1), this.G, 20, wy.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.N = $$1));
      this.c(fin.a(dcr::e).a(b).a(this.K).a(this.F, g(3), this.G, 20, wy.c("selectWorld.gameMode"), ($$0x, $$1) -> this.K = $$1));
      wy $$5 = wy.c("mco.configure.world.spawn_toggle.message");
      fin<Boolean> $$6 = this.c(fin.b(this.P).a($$0, g(3), this.G, 20, wy.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.P = $$0x)));
      fin<Boolean> $$7 = fin.b(this.J != bqn.a && this.Q)
         .a($$0, g(5), this.G, 20, wy.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.Q = $$0x));
      this.c(fin.a(bqn::b).a(a).a(this.J).a(this.F, g(5), this.G, 20, wy.c("options.difficulty"), ($$1, $$2) -> {
         this.J = $$2;
         if (this.I == fcj.d.a) {
            boolean $$3 = this.J != bqn.a;
            $$7.j = $$3;
            $$7.a($$3 && this.Q);
         }
      }));
      this.c($$7);
      this.U = this.c(new fej.a(this.F, g(7), this.G, this.R, 0.0F, 16.0F));
      fin<Boolean> $$8 = this.c(
         fin.b(this.O)
            .a(
               $$0,
               g(7),
               this.G,
               20,
               wy.c("mco.configure.world.spawnNPCs"),
               this.a(wy.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.O = $$0x)
            )
      );
      fin<Boolean> $$9 = this.c(fin.b(this.T).a(this.F, g(9), this.G, 20, wy.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.T = $$1));
      fin<Boolean> $$10 = this.c(fin.b(this.S).a($$0, g(9), this.G, 20, wy.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.S = $$1));
      if (this.I != fcj.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.U.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.J == bqn.a) {
         $$7.j = false;
      }

      this.c(fig.a(wy.c("mco.configure.world.buttons.done"), $$0x -> this.D()).a(this.F, g(13), this.G, 20).a());
      this.c(fig.a(wx.e, $$0x -> this.d()).a($$0, g(13), this.G, 20).a());
   }

   private fin.b<Boolean> a(wy $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.l.a(fed.b(this, $$0, $$1xx -> {
               $$1.accept(false);
               $$1xx.d();
            }));
         }
      };
   }

   @Override
   public wy i() {
      return wx.a(this.n(), this.m());
   }

   @Override
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 17, -1);
      $$0.a(this.o, C, this.F + this.G / 2 - this.o.a(C) / 2, g(0) - 5, -1, false);
      this.E.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.L)) {
         this.M = "";
      } else {
         this.M = $$0;
      }
   }

   private void D() {
      int $$0 = a(a, this.J, 2);
      int $$1 = a(b, this.K, 0);
      if (this.I != fcj.d.c && this.I != fcj.d.d && this.I != fcj.d.e) {
         boolean $$2 = this.I == fcj.d.a && this.J != bqn.a && this.Q;
         this.c.a(new fco(this.N, this.P, $$2, this.O, this.R, this.S, $$0, $$1, this.T, this.M, this.H.j, this.H.k));
      } else {
         this.c.a(new fco(this.H.a, this.H.b, this.H.c, this.H.d, this.H.e, this.H.f, $$0, $$1, this.H.g, this.M, this.H.j, this.H.k));
      }
   }

   class a extends fic {
      private final double d;
      private final double e;

      public a(final int $$0, final int $$1, final int $$2, final int $$3, final float $$4, final float $$5) {
         super($$0, $$1, $$2, 20, wx.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((ayn.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fej.this.U.j) {
            fej.this.R = (int)ayn.d(ayn.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(wx.a(fej.D, (wy)(fej.this.R == 0 ? wx.c : wy.b(String.valueOf(fej.this.R)))));
      }
   }
}
