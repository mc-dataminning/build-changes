import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class eti extends gkn {
   private static final int v = 2;
   public static final List<bjx> a = ImmutableList.of(bjx.a, bjx.b, bjx.c, bjx.d);
   private static final int w = 0;
   public static final List<ctl> b = ImmutableList.of(ctl.a, ctl.b, ctl.c);
   private static final vf x = vf.c("mco.configure.world.edit.slot.name");
   static final vf y = vf.c("mco.configure.world.spawnProtection");
   private static final vf z = vf.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private exn A;
   protected final esp c;
   private int B;
   private int C;
   private final ern D;
   private final erg.d E;
   private bjx F;
   private ctl G;
   private final String H;
   private String I;
   private boolean J;
   private boolean K;
   private boolean L;
   private boolean M;
   int N;
   private boolean O;
   private boolean P;
   eti.a Q;

   public eti(esp $$0, ern $$1, erg.d $$2, int $$3) {
      super(vf.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.D = $$1;
      this.E = $$2;
      this.F = a(a, $$1.h, 2);
      this.G = a(b, $$1.i, 0);
      this.H = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == erg.d.a) {
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
   public void aN_() {
      this.C = 170;
      this.B = this.g / 2 - this.C;
      int $$0 = this.g / 2 + 10;
      if (this.E != erg.d.a) {
         vf $$1;
         if (this.E == erg.d.c) {
            $$1 = vf.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.E == erg.d.e) {
            $$1 = vf.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = vf.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gkl($$1, this.g / 2, 26, 16711680));
      }

      this.A = new exn(this.f.h, this.B, g(1), this.C, 20, null, vf.c("mco.configure.world.edit.slot.name"));
      this.A.f(10);
      this.A.a(this.I);
      this.A.b(this::a);
      this.b(this.A);
      exl<Boolean> $$4 = this.d(exl.b(this.J).a($$0, g(1), this.C, 20, vf.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.J = $$1));
      this.d(exl.a(ctl::e).a(b).a(this.G).a(this.B, g(3), this.C, 20, vf.c("selectWorld.gameMode"), ($$0x, $$1) -> this.G = $$1));
      vf $$5 = vf.c("mco.configure.world.spawn_toggle.message");
      exl<Boolean> $$6 = this.d(exl.b(this.L).a($$0, g(3), this.C, 20, vf.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.L = $$0x)));
      exl<Boolean> $$7 = exl.b(this.F != bjx.a && this.M)
         .a($$0, g(5), this.C, 20, vf.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.M = $$0x));
      this.d(exl.a(bjx::b).a(a).a(this.F).a(this.B, g(5), this.C, 20, vf.c("options.difficulty"), ($$1, $$2) -> {
         this.F = $$2;
         if (this.E == erg.d.a) {
            boolean $$3 = this.F != bjx.a;
            $$7.j = $$3;
            $$7.a($$3 && this.M);
         }
      }));
      this.d($$7);
      this.Q = this.d(new eti.a(this.B, g(7), this.C, this.N, 0.0F, 16.0F));
      exl<Boolean> $$8 = this.d(
         exl.b(this.K)
            .a(
               $$0,
               g(7),
               this.C,
               20,
               vf.c("mco.configure.world.spawnNPCs"),
               this.a(vf.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.K = $$0x)
            )
      );
      exl<Boolean> $$9 = this.d(exl.b(this.P).a(this.B, g(9), this.C, 20, vf.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.P = $$1));
      exl<Boolean> $$10 = this.d(exl.b(this.O).a($$0, g(9), this.C, 20, vf.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.O = $$1));
      if (this.E != erg.d.a) {
         $$4.j = false;
         $$6.j = false;
         $$8.j = false;
         $$7.j = false;
         this.Q.j = false;
         $$10.j = false;
         $$9.j = false;
      }

      if (this.F == bjx.a) {
         $$7.j = false;
      }

      this.d(exe.a(vf.c("mco.configure.world.buttons.done"), $$0x -> this.C()).a(this.B, g(13), this.C, 20).a());
      this.d(exe.a(ve.e, $$0x -> this.f.a(this.c)).a($$0, g(13), this.C, 20).a());
      this.e(this.A);
   }

   private exl.b<Boolean> a(vf $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.f.a(new fbs($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.f.a(this);
            }, z, $$0, ve.i, ve.e));
         }
      };
   }

   @Override
   public vf h() {
      return ve.a(this.o(), this.n());
   }

   @Override
   public void a(ews $$0, int $$1, int $$2, float $$3) {
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

   private void C() {
      int $$0 = a(a, this.F, 2);
      int $$1 = a(b, this.G, 0);
      if (this.E != erg.d.c && this.E != erg.d.d && this.E != erg.d.e) {
         boolean $$2 = this.E == erg.d.a && this.F != bjx.a && this.M;
         this.c.a(new ern(this.J, this.L, $$2, this.K, this.N, this.O, $$0, $$1, this.P, this.I, this.D.j, this.D.k));
      } else {
         this.c.a(new ern(this.D.a, this.D.b, this.D.c, this.D.d, this.D.e, this.D.f, $$0, $$1, this.D.g, this.I, this.D.j, this.D.k));
      }
   }

   class a extends exa {
      private final double d;
      private final double e;

      public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
         super($$0, $$1, $$2, 20, ve.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((aun.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (eti.this.Q.j) {
            eti.this.N = (int)aun.d(aun.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(ve.a(eti.y, (vf)(eti.this.N == 0 ? ve.c : vf.b(String.valueOf(eti.this.N)))));
      }
   }
}
