import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class evq extends gnd {
   private static final int v = 2;
   public static final List<blt> a = ImmutableList.of(blt.a, blt.b, blt.c, blt.d);
   private static final int w = 0;
   public static final List<cvo> b = ImmutableList.of(cvo.a, cvo.b, cvo.c);
   private static final vq x = vq.c("mco.configure.world.edit.slot.name");
   static final vq y = vq.c("mco.configure.world.spawnProtection");
   private static final vq z = vq.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private ezx A;
   protected final eux c;
   private int B;
   private int C;
   private final etv D;
   private final eto.d E;
   private blt F;
   private cvo G;
   private final String H;
   private String I;
   private boolean J;
   private boolean K;
   private boolean L;
   private boolean M;
   int N;
   private boolean O;
   private boolean P;
   evq.a Q;

   public evq(eux $$0, etv $$1, eto.d $$2, int $$3) {
      super(vq.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.D = $$1;
      this.E = $$2;
      this.F = a(a, $$1.h, 2);
      this.G = a(b, $$1.i, 0);
      this.H = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == eto.d.a) {
         this.J = $$1.a;
         this.N = $$1.e;
         this.P = $$1.g;
         this.L = $$1.b;
         this.M = $$1.c;
         this.K = $$1.d;
         this.O = $$1.f;
      } else {
         this.J = true;
         this.N = 0;
         this.P = false;
         this.L = true;
         this.M = true;
         this.K = true;
         this.O = true;
      }
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.c);
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
   public void aQ_() {
      this.C = 170;
      this.B = this.g / 2 - this.C;
      int $$0 = this.g / 2 + 10;
      if (this.E != eto.d.a) {
         vq $$1;
         if (this.E == eto.d.c) {
            $$1 = vq.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.E == eto.d.e) {
            $$1 = vq.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = vq.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gnb($$1, this.g / 2, 26, 16711680));
      }

      this.A = this.d(new ezx(this.f.h, this.B, g(1), this.C, 20, null, vq.c("mco.configure.world.edit.slot.name")));
      this.A.f(10);
      this.A.a(this.I);
      this.A.b(this::a);
      ezv<Boolean> $$4 = this.c(ezv.b(this.J).a($$0, g(1), this.C, 20, vq.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.J = $$1));
      this.c(ezv.a(cvo::e).a(b).a(this.G).a(this.B, g(3), this.C, 20, vq.c("selectWorld.gameMode"), ($$0x, $$1) -> this.G = $$1));
      vq $$5 = vq.c("mco.configure.world.spawn_toggle.message");
      ezv<Boolean> $$6 = this.c(ezv.b(this.L).a($$0, g(3), this.C, 20, vq.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.L = $$0x)));
      ezv<Boolean> $$7 = ezv.b(this.F != blt.a && this.M)
         .a($$0, g(5), this.C, 20, vq.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.M = $$0x));
      this.c(ezv.a(blt::b).a(a).a(this.F).a(this.B, g(5), this.C, 20, vq.c("options.difficulty"), ($$1, $$2) -> {
         this.F = $$2;
         if (this.E == eto.d.a) {
            boolean $$3 = this.F != blt.a;
            $$7.j = $$3;
            $$7.a($$3 && this.M);
         }
      }));
      this.c($$7);
      this.Q = this.c(new evq.a(this.B, g(7), this.C, this.N, 0.0F, 16.0F));
      ezv<Boolean> $$8 = this.c(
         ezv.b(this.K)
            .a(
               $$0,
               g(7),
               this.C,
               20,
               vq.c("mco.configure.world.spawnNPCs"),
               this.a(vq.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.K = $$0x)
            )
      );
      ezv<Boolean> $$9 = this.c(ezv.b(this.P).a(this.B, g(9), this.C, 20, vq.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.P = $$1));
      ezv<Boolean> $$10 = this.c(ezv.b(this.O).a($$0, g(9), this.C, 20, vq.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.O = $$1));
      if (this.E != eto.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.Q.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.F == blt.a) {
         $$7.j = false;
      }

      this.c(ezo.a(vq.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.B, g(13), this.C, 20).a());
      this.c(ezo.a(vp.e, $$0x -> this.f.a(this.c)).a($$0, g(13), this.C, 20).a());
   }

   private ezv.b<Boolean> a(vq $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.f.a(new fee($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.f.a(this);
            }, z, $$0, vp.i, vp.e));
         }
      };
   }

   @Override
   public vq i() {
      return vp.a(this.p(), this.o());
   }

   @Override
   public void a(ezb $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, x, this.B + this.C / 2 - this.i.a(x) / 2, g(0) - 5, -1, false);
      this.A.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.H)) {
         this.I = "";
      } else {
         this.I = $$0;
      }
   }

   private void E() {
      int $$0 = a(a, this.F, 2);
      int $$1 = a(b, this.G, 0);
      if (this.E != eto.d.c && this.E != eto.d.d && this.E != eto.d.e) {
         boolean $$2 = this.E == eto.d.a && this.F != blt.a && this.M;
         this.c.a(new etv(this.J, this.L, $$2, this.K, this.N, this.O, $$0, $$1, this.P, this.I, this.D.j, this.D.k));
      } else {
         this.c.a(new etv(this.D.a, this.D.b, this.D.c, this.D.d, this.D.e, this.D.f, $$0, $$1, this.D.g, this.I, this.D.j, this.D.k));
      }
   }

   class a extends ezk {
      private final double d;
      private final double e;

      public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
         super($$0, $$1, $$2, 20, vp.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((awi.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (evq.this.Q.j) {
            evq.this.N = (int)awi.d(awi.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(vp.a(evq.y, (vq)(evq.this.N == 0 ? vp.c : vq.b(String.valueOf(evq.this.N)))));
      }
   }
}
