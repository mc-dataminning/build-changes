import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class eop extends gei {
   private static final int y = 2;
   public static final List<bgn> a = ImmutableList.of(bgn.a, bgn.b, bgn.c, bgn.d);
   private static final int z = 0;
   public static final List<cpj> b = ImmutableList.of(cpj.a, cpj.b, cpj.c);
   private static final tf A = tf.c("mco.configure.world.edit.slot.name");
   static final tf B = tf.c("mco.configure.world.spawnProtection");
   private static final tf C = tf.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private esq D;
   protected final enx c;
   private int E;
   private int F;
   private final emu G;
   private final emn.c H;
   private bgn I;
   private cpj J;
   private final String K;
   private String L;
   private boolean M;
   private boolean N;
   private boolean O;
   private boolean P;
   int Q;
   private boolean R;
   private boolean S;
   eop.a T;

   public eop(enx $$0, emu $$1, emn.c $$2, int $$3) {
      super(tf.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.G = $$1;
      this.H = $$2;
      this.I = a(a, $$1.h, 2);
      this.J = a(b, $$1.i, 0);
      this.K = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == emn.c.a) {
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
   public void aE_() {
      this.F = 170;
      this.E = this.g / 2 - this.F;
      int $$0 = this.g / 2 + 10;
      if (this.H != emn.c.a) {
         tf $$1;
         if (this.H == emn.c.c) {
            $$1 = tf.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.H == emn.c.e) {
            $$1 = tf.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = tf.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new geg($$1, this.g / 2, 26, 16711680));
      }

      this.D = new esq(this.f.h, this.E, h(1), this.F, 20, null, tf.c("mco.configure.world.edit.slot.name"));
      this.D.k(10);
      this.D.a(this.L);
      this.D.b(this::a);
      this.b(this.D);
      eso<Boolean> $$4 = this.d(eso.b(this.M).a($$0, h(1), this.F, 20, tf.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.M = $$1));
      this.d(eso.a(cpj::e).a(b).a(this.J).a(this.E, h(3), this.F, 20, tf.c("selectWorld.gameMode"), ($$0x, $$1) -> this.J = $$1));
      tf $$5 = tf.c("mco.configure.world.spawn_toggle.message");
      eso<Boolean> $$6 = this.d(eso.b(this.O).a($$0, h(3), this.F, 20, tf.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.O = $$0x)));
      eso<Boolean> $$7 = eso.b(this.I != bgn.a && this.P)
         .a($$0, h(5), this.F, 20, tf.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.P = $$0x));
      this.d(eso.a(bgn::b).a(a).a(this.I).a(this.E, h(5), this.F, 20, tf.c("options.difficulty"), ($$1, $$2) -> {
         this.I = $$2;
         if (this.H == emn.c.a) {
            boolean $$3 = this.I != bgn.a;
            $$7.i = $$3;
            $$7.a($$3 && this.P);
         }
      }));
      this.d($$7);
      this.T = this.d(new eop.a(this.E, h(7), this.F, this.Q, 0.0F, 16.0F));
      eso<Boolean> $$8 = this.d(
         eso.b(this.N)
            .a(
               $$0,
               h(7),
               this.F,
               20,
               tf.c("mco.configure.world.spawnNPCs"),
               this.a(tf.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.N = $$0x)
            )
      );
      eso<Boolean> $$9 = this.d(eso.b(this.S).a(this.E, h(9), this.F, 20, tf.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.S = $$1));
      eso<Boolean> $$10 = this.d(eso.b(this.R).a($$0, h(9), this.F, 20, tf.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.R = $$1));
      if (this.H != emn.c.a) {
         $$4.i = false;
         $$6.i = false;
         $$8.i = false;
         $$7.i = false;
         this.T.i = false;
         $$10.i = false;
         $$9.i = false;
      }

      if (this.I == bgn.a) {
         $$7.i = false;
      }

      this.d(esh.a(tf.c("mco.configure.world.buttons.done"), $$0x -> this.B()).a(this.E, h(13), this.F, 20).a());
      this.d(esh.a(te.e, $$0x -> this.f.a(this.c)).a($$0, h(13), this.F, 20).a());
      this.e(this.D);
   }

   private eso.b<Boolean> a(tf $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.f.a(new ews($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.f.a(this);
            }, C, $$0, te.i, te.e));
         }
      };
   }

   @Override
   public tf e() {
      return te.a(this.m(), this.l());
   }

   @Override
   public void a(erw $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 17, -1);
      $$0.a(this.i, A, this.E + this.F / 2 - this.i.a(A) / 2, h(0) - 5, -1, false);
      this.D.a($$0, $$1, $$2, $$3);
   }

   private void a(String $$0) {
      if ($$0.equals(this.K)) {
         this.L = "";
      } else {
         this.L = $$0;
      }
   }

   private void B() {
      int $$0 = a(a, this.I, 2);
      int $$1 = a(b, this.J, 0);
      if (this.H != emn.c.c && this.H != emn.c.d && this.H != emn.c.e) {
         boolean $$2 = this.H == emn.c.a && this.I != bgn.a && this.P;
         this.c.a(new emu(this.M, this.O, $$2, this.N, this.Q, this.R, $$0, $$1, this.S, this.L));
      } else {
         this.c.a(new emu(this.G.a, this.G.b, this.G.c, this.G.d, this.G.e, this.G.f, $$0, $$1, this.G.g, this.L));
      }
   }

   class a extends esd {
      private final double d;
      private final double e;

      public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
         super($$0, $$1, $$2, 20, te.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((arp.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (eop.this.T.i) {
            eop.this.Q = (int)arp.d(arp.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(te.a(eop.B, (tf)(eop.this.Q == 0 ? te.c : tf.b(String.valueOf(eop.this.Q)))));
      }

      @Override
      public void a(double $$0, double $$1) {
      }

      @Override
      public void b(double $$0, double $$1) {
      }
   }
}
