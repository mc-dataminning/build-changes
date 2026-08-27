import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.function.Consumer;

public class eos extends gex {
   private static final int y = 2;
   public static final List<bhb> a = ImmutableList.of(bhb.a, bhb.b, bhb.c, bhb.d);
   private static final int z = 0;
   public static final List<cpy> b = ImmutableList.of(cpy.a, cpy.b, cpy.c);
   private static final tl A = tl.c("mco.configure.world.edit.slot.name");
   static final tl B = tl.c("mco.configure.world.spawnProtection");
   private static final tl C = tl.c("mco.configure.world.spawn_toggle.title").a(n.m, n.r);
   private est D;
   protected final enz c;
   private int E;
   private int F;
   private final emx G;
   private final emq.c H;
   private bhb I;
   private cpy J;
   private final String K;
   private String L;
   private boolean M;
   private boolean N;
   private boolean O;
   private boolean P;
   int Q;
   private boolean R;
   private boolean S;
   eos.a T;

   public eos(enz $$0, emx $$1, emq.c $$2, int $$3) {
      super(tl.c("mco.configure.world.buttons.options"));
      this.c = $$0;
      this.G = $$1;
      this.H = $$2;
      this.I = a(a, $$1.h, 2);
      this.J = a(b, $$1.i, 0);
      this.K = $$1.b($$3);
      this.a($$1.a($$3));
      if ($$2 == emq.c.a) {
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
   public void aH_() {
      this.F = 170;
      this.E = this.g / 2 - this.F;
      int $$0 = this.g / 2 + 10;
      if (this.H != emq.c.a) {
         tl $$1;
         if (this.H == emq.c.c) {
            $$1 = tl.c("mco.configure.world.edit.subscreen.adventuremap");
         } else if (this.H == emq.c.e) {
            $$1 = tl.c("mco.configure.world.edit.subscreen.inspiration");
         } else {
            $$1 = tl.c("mco.configure.world.edit.subscreen.experience");
         }

         this.a(new gev($$1, this.g / 2, 26, 16711680));
      }

      this.D = new est(this.f.h, this.E, h(1), this.F, 20, null, tl.c("mco.configure.world.edit.slot.name"));
      this.D.l(10);
      this.D.a(this.L);
      this.D.b(this::a);
      this.b(this.D);
      esr<Boolean> $$4 = this.d(esr.b(this.M).a($$0, h(1), this.F, 20, tl.c("mco.configure.world.pvp"), ($$0x, $$1) -> this.M = $$1));
      this.d(esr.a(cpy::e).a(b).a(this.J).a(this.E, h(3), this.F, 20, tl.c("selectWorld.gameMode"), ($$0x, $$1) -> this.J = $$1));
      tl $$5 = tl.c("mco.configure.world.spawn_toggle.message");
      esr<Boolean> $$6 = this.d(esr.b(this.O).a($$0, h(3), this.F, 20, tl.c("mco.configure.world.spawnAnimals"), this.a($$5, $$0x -> this.O = $$0x)));
      esr<Boolean> $$7 = esr.b(this.I != bhb.a && this.P)
         .a($$0, h(5), this.F, 20, tl.c("mco.configure.world.spawnMonsters"), this.a($$5, $$0x -> this.P = $$0x));
      this.d(esr.a(bhb::b).a(a).a(this.I).a(this.E, h(5), this.F, 20, tl.c("options.difficulty"), ($$1, $$2) -> {
         this.I = $$2;
         if (this.H == emq.c.a) {
            boolean $$3 = this.I != bhb.a;
            $$7.i = $$3;
            $$7.a($$3 && this.P);
         }
      }));
      this.d($$7);
      this.T = this.d(new eos.a(this.E, h(7), this.F, this.Q, 0.0F, 16.0F));
      esr<Boolean> $$8 = this.d(
         esr.b(this.N)
            .a(
               $$0,
               h(7),
               this.F,
               20,
               tl.c("mco.configure.world.spawnNPCs"),
               this.a(tl.c("mco.configure.world.spawn_toggle.message.npc"), $$0x -> this.N = $$0x)
            )
      );
      esr<Boolean> $$9 = this.d(esr.b(this.S).a(this.E, h(9), this.F, 20, tl.c("mco.configure.world.forceGameMode"), ($$0x, $$1) -> this.S = $$1));
      esr<Boolean> $$10 = this.d(esr.b(this.R).a($$0, h(9), this.F, 20, tl.c("mco.configure.world.commandBlocks"), ($$0x, $$1) -> this.R = $$1));
      if (this.H != emq.c.a) {
         $$4.i = false;
         $$6.i = false;
         $$8.i = false;
         $$7.i = false;
         this.T.i = false;
         $$10.i = false;
         $$9.i = false;
      }

      if (this.I == bhb.a) {
         $$7.i = false;
      }

      this.d(esk.a(tl.c("mco.configure.world.buttons.done"), $$0x -> this.D()).a(this.E, h(13), this.F, 20).a());
      this.d(esk.a(tk.e, $$0x -> this.f.a(this.c)).a($$0, h(13), this.F, 20).a());
      this.e(this.D);
   }

   private esr.b<Boolean> a(tl $$0, Consumer<Boolean> $$1) {
      return ($$2, $$3) -> {
         if ($$3) {
            $$1.accept(true);
         } else {
            this.f.a(new ewy($$1xx -> {
               if ($$1xx) {
                  $$1.accept(false);
               }

               this.f.a(this);
            }, C, $$0, tk.i, tk.e));
         }
      };
   }

   @Override
   public tl g() {
      return tk.a(this.m(), this.l());
   }

   @Override
   public void a(erz $$0, int $$1, int $$2, float $$3) {
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

   private void D() {
      int $$0 = a(a, this.I, 2);
      int $$1 = a(b, this.J, 0);
      if (this.H != emq.c.c && this.H != emq.c.d && this.H != emq.c.e) {
         boolean $$2 = this.H == emq.c.a && this.I != bhb.a && this.P;
         this.c.a(new emx(this.M, this.O, $$2, this.N, this.Q, this.R, $$0, $$1, this.S, this.L));
      } else {
         this.c.a(new emx(this.G.a, this.G.b, this.G.c, this.G.d, this.G.e, this.G.f, $$0, $$1, this.G.g, this.L));
      }
   }

   class a extends esg {
      private final double d;
      private final double e;

      public a(int $$0, int $$1, int $$2, int $$3, float $$4, float $$5) {
         super($$0, $$1, $$2, 20, tk.a, 0.0);
         this.d = (double)$$4;
         this.e = (double)$$5;
         this.c = (double)((asb.a((float)$$3, $$4, $$5) - $$4) / ($$5 - $$4));
         this.b();
      }

      @Override
      public void a() {
         if (eos.this.T.i) {
            eos.this.Q = (int)asb.d(asb.a(this.c, 0.0, 1.0), this.d, this.e);
         }
      }

      @Override
      protected void b() {
         this.b(tk.a(eos.B, (tl)(eos.this.Q == 0 ? tk.c : tl.b(String.valueOf(eos.this.Q)))));
      }

      @Override
      public void a(double $$0, double $$1) {
      }

      @Override
      public void b(double $$0, double $$1) {
      }
   }
}
