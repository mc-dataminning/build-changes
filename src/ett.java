import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class ett extends gld {
   private static final int v = 2;
   public static final List<bjz> a = ImmutableList.of(bjz.a, bjz.b, bjz.c, bjz.d);
   private static final int w = 0;
   public static final List<ctu> b = ImmutableList.of(ctu.a, ctu.b, ctu.c);
   private static final vg x = vg.c("mco.configure.world.edit.slot.name");
   static final vg y = vg.c("mco.configure.world.spawnProtection");
   private static final vg z = vg.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private eya A;
   protected final eta c;
   private int B;
   private int C;
   private final ery D;
   private final err.d E;
   private bjz F;
   private ctu G;
   private final String H;
   private String I;
   private boolean J;
   private boolean K;
   private boolean L;
   private boolean M;
   int N;
   private boolean O;
   private boolean P;
   ett.a Q;

   public ett(eta $$0, ery $$1, err.d $$2, int $$3) {
      super(vg.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.D = $$1;
      this.E = $$2;
      this.F = a(a, $$1.h, 2);
      this.G = a(b, $$1.i, 0);
      this.H = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == err.d.a) {
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
   public void aP_() {
      this.C = 170;
      this.B = this.g / 2 - this.C;
      int $$0 = this.g / 2 + 10;
      if (this.E != err.d.a) {
         vg $$1;
         if (this.E == err.d.c) {
            $$1 = vg.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.E == err.d.e) {
            $$1 = vg.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = vg.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new glb($$1, this.g / 2, 26, 16711680));
      }

      this.A = new eya(this.f.h, this.B, g(1), this.C, 20, null, vg.c("mco.configure.world.edit.slot.name"));
      this.A.f(10);
      this.A.a(this.I);
      this.A.b(this::a);
      this.b(this.A);
      exy<Boolean> $$4 = this.d(exy.b(this.J).a($$0, g(1), this.C, 20, vg.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.J = $$1));
      this.d(exy.a(ctu::e).a(b).a(this.G).a(this.B, g(3), this.C, 20, vg.c("selectWorld.gameMode"), ($$0x, $$1) -> this.G = $$1));
      vg $$5 = vg.c("mco.configure.world.spawn_toggle.message");
      exy<Boolean> $$6 = this.d(exy.b(this.L).a($$0, g(3), this.C, 20, vg.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.L = $$0x)));
      exy<Boolean> $$7 = exy.b(this.F != bjz.a && this.M)
         .a($$0, g(5), this.C, 20, vg.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.M = $$0x));
      this.d(exy.a(bjz::b).a(a).a(this.F).a(this.B, g(5), this.C, 20, vg.c("options.difficulty"), ($$1, $$2) -> {
         this.F = $$2;
         if (this.E == err.d.a) {
            boolean $$3 = this.F != bjz.a;
            $$7.j = $$3;
            $$7.a($$3 && this.M);
         }
      }));
      this.d($$7);
      this.Q = this.d(new ett.a(this.B, g(7), this.C, this.N, 0.0F, 16.0F));
      exy<Boolean> $$8 = this.d(
         exy.b(this.K)
            .a(
               $$0,
               g(7),
               this.C,
               20,
               vg.c("mco.configure.world.spawnNPCs"),
               this.a(vg.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.K = $$0x)
            )
      );
      exy<Boolean> $$9 = this.d(exy.b(this.P).a(this.B, g(9), this.C, 20, vg.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.P = $$1));
      exy<Boolean> $$10 = this.d(exy.b(this.O).a($$0, g(9), this.C, 20, vg.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.O = $$1));
      if (this.E != err.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.Q.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.F == bjz.a) {
         $$7.j = false;
      }

      this.d(exr.a(vg.c("mco.configure.world.buttons.done"), $$0x -> this.E()).a(this.B, g(13), this.C, 20).a());
      this.d(exr.a(vf.e, $$0x -> this.f.a(this.c)).a($$0, g(13), this.C, 20).a());
      this.e(this.A);
   }

   private exy.b<Boolean> a(vg $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.f.a(new fcf($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.f.a(this);
            }, z, $$0, vf.i, vf.e));
         }
      };
   }

   @Override
   public vg i() {
      return vf.a(this.p(), this.o());
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
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
      if (this.E != err.d.c && this.E != err.d.d && this.E != err.d.e) {
         boolean $$2 = this.E == err.d.a && this.F != bjz.a && this.M;
         this.c.a(new ery(this.J, this.L, $$2, this.K, this.N, this.O, $$0, $$1, this.P, this.I, this.D.j, this.D.k));
      } else {
         this.c.a(new ery(this.D.a, this.D.b, this.D.c, this.D.d, this.D.e, this.D.f, $$0, $$1, this.D.g, this.I, this.D.j, this.D.k));
      }
   }

   class a extends exn {
      private final double d;
      private final double e;

      public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
         super($$0, $$1, $$2, 20, vf.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((aup.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (ett.this.Q.j) {
            ett.this.N = (int)aup.d(aup.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(vf.a(ett.y, (vg)(ett.this.N == 0 ? vf.c : vg.b(String.valueOf(ett.this.N)))));
      }
   }
}
