import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class fbg extends gtb {
   private static final int B = 2;
   public static final List<bpj> a = ImmutableList.of(bpj.a, bpj.b, bpj.c, bpj.d);
   private static final int C = 0;
   public static final List<daa> b = ImmutableList.of(daa.a, daa.b, daa.c);
   private static final wu D = wu.c("mco.configure.world.edit.slot.name");
   static final wu E = wu.c("mco.configure.world.spawnProtection");
   private static final wu F = wu.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private ffn G;
   protected final fan c;
   private int H;
   private int I;
   private final ezl J;
   private final eze.d K;
   private bpj L;
   private daa M;
   private final String N;
   private String O;
   private boolean P;
   private boolean Q;
   private boolean R;
   private boolean S;
   int T;
   private boolean U;
   private boolean V;
   fbg.a W;

   public fbg(fan $$0, ezl $$1, eze.d $$2, int $$3) {
      super(wu.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.J = $$1;
      this.K = $$2;
      this.L = a(a, $$1.h, 2);
      this.M = a(b, $$1.i, 0);
      this.N = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == eze.d.a) {
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
      if (this.K != eze.d.a) {
         wu $$1;
         if (this.K == eze.d.c) {
            $$1 = wu.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.K == eze.d.e) {
            $$1 = wu.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = wu.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gsz($$1, this.n / 2, 26, 16711680));
      }

      this.G = this.d(new ffn(this.m.h, this.H, g(1), this.I, 20, null, wu.c("mco.configure.world.edit.slot.name")));
      this.G.f(10);
      this.G.a(this.O);
      this.G.b(this::a);
      ffl<Boolean> $$4 = this.c(ffl.b(this.P).a($$0, g(1), this.I, 20, wu.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.P = $$1));
      this.c(ffl.a(daa::e).a(b).a(this.M).a(this.H, g(3), this.I, 20, wu.c("selectWorld.gameMode"), ($$0x, $$1) -> this.M = $$1));
      wu $$5 = wu.c("mco.configure.world.spawn_toggle.message");
      ffl<Boolean> $$6 = this.c(ffl.b(this.R).a($$0, g(3), this.I, 20, wu.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.R = $$0x)));
      ffl<Boolean> $$7 = ffl.b(this.L != bpj.a && this.S)
         .a($$0, g(5), this.I, 20, wu.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.S = $$0x));
      this.c(ffl.a(bpj::b).a(a).a(this.L).a(this.H, g(5), this.I, 20, wu.c("options.difficulty"), ($$1, $$2) -> {
         this.L = $$2;
         if (this.K == eze.d.a) {
            boolean $$3 = this.L != bpj.a;
            $$7.j = $$3;
            $$7.a($$3 && this.S);
         }
      }));
      this.c($$7);
      this.W = this.c(new fbg.a(this.H, g(7), this.I, this.T, 0.0F, 16.0F));
      ffl<Boolean> $$8 = this.c(
         ffl.b(this.Q)
            .a(
               $$0,
               g(7),
               this.I,
               20,
               wu.c("mco.configure.world.spawnNPCs"),
               this.a(wu.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.Q = $$0x)
            )
      );
      ffl<Boolean> $$9 = this.c(ffl.b(this.V).a(this.H, g(9), this.I, 20, wu.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.V = $$1));
      ffl<Boolean> $$10 = this.c(ffl.b(this.U).a($$0, g(9), this.I, 20, wu.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.U = $$1));
      if (this.K != eze.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.W.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.L == bpj.a) {
         $$7.j = false;
      }

      this.c(ffe.a(wu.c("mco.configure.world.buttons.done"), $$0x -> this.C()).a(this.H, g(13), this.I, 20).a());
      this.c(ffe.a(wt.e, $$0x -> this.m.a(this.c)).a($$0, g(13), this.I, 20).a());
   }

   private ffl.b<Boolean> a(wu $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.m.a(new fjv($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.m.a(this);
            }, F, $$0, wt.i, wt.e));
         }
      };
   }

   @Override
   public wu i() {
      return wt.a(this.n(), this.m());
   }

   @Override
   public void a(fer $$0, int $$1, int $$2, float $$3) {
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
      if (this.K != eze.d.c && this.K != eze.d.d && this.K != eze.d.e) {
         boolean $$2 = this.K == eze.d.a && this.L != bpj.a && this.S;
         this.c.a(new ezl(this.P, this.R, $$2, this.Q, this.T, this.U, $$0, $$1, this.V, this.O, this.J.j, this.J.k));
      } else {
         this.c.a(new ezl(this.J.a, this.J.b, this.J.c, this.J.d, this.J.e, this.J.f, $$0, $$1, this.J.g, this.O, this.J.j, this.J.k));
      }
   }

   class a extends ffa {
      private final double d;
      private final double e;

      public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
         super($$0, $$1, $$2, 20, wt.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((axz.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (fbg.this.W.j) {
            fbg.this.T = (int)axz.d(axz.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(wt.a(fbg.E, (wu)(fbg.this.T == 0 ? wt.c : wu.b(String.valueOf(fbg.this.T)))));
      }
   }
}
