import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class esm extends gjl {
   private static final int v = 2;
   public static final List<bji> a = ImmutableList.of(bji.a, bji.b, bji.c, bji.d);
   private static final int w = 0;
   public static final List<csv> b = ImmutableList.of(csv.a, csv.b, csv.c);
   private static final vb x = vb.c("mco.configure.world.edit.slot.name");
   static final vb y = vb.c("mco.configure.world.spawnProtection");
   private static final vb z = vb.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private ewq A;
   protected final ert c;
   private int B;
   private int C;
   private final eqr D;
   private final eqk.d E;
   private bji F;
   private csv G;
   private final String H;
   private String I;
   private boolean J;
   private boolean K;
   private boolean L;
   private boolean M;
   int N;
   private boolean O;
   private boolean P;
   esm.a Q;

   public esm(ert $$0, eqr $$1, eqk.d $$2, int $$3) {
      super(vb.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.D = $$1;
      this.E = $$2;
      this.F = a(a, $$1.h, 2);
      this.G = a(b, $$1.i, 0);
      this.H = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == eqk.d.a) {
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
      if (this.E != eqk.d.a) {
         vb $$1;
         if (this.E == eqk.d.c) {
            $$1 = vb.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.E == eqk.d.e) {
            $$1 = vb.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = vb.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gjj($$1, this.g / 2, 26, 16711680));
      }

      this.A = new ewq(this.f.h, this.B, h(1), this.C, 20, null, vb.c("mco.configure.world.edit.slot.name"));
      this.A.l(10);
      this.A.a(this.I);
      this.A.b(this::a);
      this.b(this.A);
      ewo<Boolean> $$4 = this.d(ewo.b(this.J).a($$0, h(1), this.C, 20, vb.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.J = $$1));
      this.d(ewo.a(csv::e).a(b).a(this.G).a(this.B, h(3), this.C, 20, vb.c("selectWorld.gameMode"), ($$0x, $$1) -> this.G = $$1));
      vb $$5 = vb.c("mco.configure.world.spawn_toggle.message");
      ewo<Boolean> $$6 = this.d(ewo.b(this.L).a($$0, h(3), this.C, 20, vb.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.L = $$0x)));
      ewo<Boolean> $$7 = ewo.b(this.F != bji.a && this.M)
         .a($$0, h(5), this.C, 20, vb.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.M = $$0x));
      this.d(ewo.a(bji::b).a(a).a(this.F).a(this.B, h(5), this.C, 20, vb.c("options.difficulty"), ($$1, $$2) -> {
         this.F = $$2;
         if (this.E == eqk.d.a) {
            boolean $$3 = this.F != bji.a;
            $$7.i = $$3;
            $$7.a($$3 && this.M);
         }
      }));
      this.d($$7);
      this.Q = this.d(new esm.a(this.B, h(7), this.C, this.N, 0.0F, 16.0F));
      ewo<Boolean> $$8 = this.d(
         ewo.b(this.K)
            .a(
               $$0,
               h(7),
               this.C,
               20,
               vb.c("mco.configure.world.spawnNPCs"),
               this.a(vb.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.K = $$0x)
            )
      );
      ewo<Boolean> $$9 = this.d(ewo.b(this.P).a(this.B, h(9), this.C, 20, vb.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.P = $$1));
      ewo<Boolean> $$10 = this.d(ewo.b(this.O).a($$0, h(9), this.C, 20, vb.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.O = $$1));
      if (this.E != eqk.d.a) {
         $$4.i = false;
         $$6.i = false;
         $$8.i = false;
         $$7.i = false;
         this.Q.i = false;
         $$10.i = false;
         $$9.i = false;
      }

      if (this.F == bji.a) {
         $$7.i = false;
      }

      this.d(ewh.a(vb.c("mco.configure.world.buttons.done"), $$0x -> this.C()).a(this.B, h(13), this.C, 20).a());
      this.d(ewh.a(va.e, $$0x -> this.f.a(this.c)).a($$0, h(13), this.C, 20).a());
      this.e(this.A);
   }

   private ewo.b<Boolean> a(vb $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.f.a(new fav($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.f.a(this);
            }, z, $$0, va.i, va.e));
         }
      };
   }

   @Override
   public vb h() {
      return va.a(this.m(), this.l());
   }

   @Override
   public void a(evw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, x, this.B + this.C / 2 - this.i.a(x) / 2, h(0) - 5, -1, false);
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
      if (this.E != eqk.d.c && this.E != eqk.d.d && this.E != eqk.d.e) {
         boolean $$2 = this.E == eqk.d.a && this.F != bji.a && this.M;
         this.c.a(new eqr(this.J, this.L, $$2, this.K, this.N, this.O, $$0, $$1, this.P, this.I, this.D.j, this.D.k));
      } else {
         this.c.a(new eqr(this.D.a, this.D.b, this.D.c, this.D.d, this.D.e, this.D.f, $$0, $$1, this.D.g, this.I, this.D.j, this.D.k));
      }
   }

   class a extends ewd {
      private final double d;
      private final double e;

      public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
         super($$0, $$1, $$2, 20, va.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((aty.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (esm.this.Q.i) {
            esm.this.N = (int)aty.d(aty.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(va.a(esm.y, (vb)(esm.this.N == 0 ? va.c : vb.b(String.valueOf(esm.this.N)))));
      }
   }
}
