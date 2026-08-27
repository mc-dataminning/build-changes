import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eop extends gew {
   static final Logger c = LogUtils.getLogger();
   static final aeu y = new aeu("widget/slot_frame");
   private static final ti z = ti.c("mco.selectServer.create");
   private static final ti A = ti.c("mco.selectServer.create.subtitle");
   private static final ti B = ti.c("mco.configure.world.switch.slot");
   private static final ti C = ti.c("mco.configure.world.switch.slot.subtitle");
   private static final ti D = ti.c("mco.reset.world.title");
   private static final ti E = ti.c("mco.reset.world.warning");
   public static final ti a = ti.c("mco.create.world.reset.title");
   private static final ti F = ti.c("mco.reset.world.resetting.screen.title");
   private static final ti G = ti.c("mco.reset.world.template");
   private static final ti H = ti.c("mco.reset.world.adventure");
   private static final ti I = ti.c("mco.reset.world.experience");
   private static final ti J = ti.c("mco.reset.world.inspiration");
   private final eyf K;
   private final emr L;
   private final ti M;
   private final int N;
   private final ti O;
   private static final aeu P = new aeu("textures/gui/realms/upload.png");
   private static final aeu Q = new aeu("textures/gui/realms/adventure.png");
   private static final aeu R = new aeu("textures/gui/realms/survival_spawn.png");
   private static final aeu S = new aeu("textures/gui/realms/new_world.png");
   private static final aeu T = new aeu("textures/gui/realms/experience.png");
   private static final aeu U = new aeu("textures/gui/realms/inspiration.png");
   enj V;
   enj W;
   enj X;
   enj Y;
   public final int b;
   private final Runnable Z;
   private final evu aa = new evu(this);

   private eop(eyf $$0, emr $$1, int $$2, ti $$3, ti $$4, int $$5, ti $$6, Runnable $$7) {
      super($$3);
      this.K = $$0;
      this.L = $$1;
      this.b = $$2;
      this.M = $$4;
      this.N = $$5;
      this.O = $$6;
      this.Z = $$7;
   }

   public static eop a(eyf $$0, emr $$1, Runnable $$2) {
      return new eop($$0, $$1, $$1.n, z, A, -6250336, a, $$2);
   }

   public static eop a(eyf $$0, int $$1, emr $$2, Runnable $$3) {
      return new eop($$0, $$2, $$1, B, C, -6250336, a, $$3);
   }

   public static eop b(eyf $$0, emr $$1, Runnable $$2) {
      return new eop($$0, $$1, $$1.n, D, E, -65536, F, $$2);
   }

   @Override
   public void aD_() {
      evy $$0 = evy.d();
      $$0.a(new etr(this.e, this.i), evx::b);
      $$0.a(evz.b(3));
      $$0.a(new etr(this.M, this.i).i(this.N), evx::b);
      this.aa.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            ema $$0 = ema.a();

            try {
               enj $$1 = $$0.a(1, 10, emr.c.a);
               enj $$2 = $$0.a(1, 10, emr.c.c);
               enj $$3 = $$0.a(1, 10, emr.c.d);
               enj $$4 = $$0.a(1, 10, emr.c.e);
               eop.this.f.execute(() -> {
                  eop.this.V = $$1;
                  eop.this.W = $$2;
                  eop.this.X = $$3;
                  eop.this.Y = $$4;
               });
            } catch (enn var6) {
               eop.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new eop.a(this.a(1), h(0) + 10, eoo.a, S, $$0x -> this.f.a(new eoo(this::a, this.e))));
      this.d(new eop.a(this.a(2), h(0) + 10, eoq.a, P, $$0x -> this.f.a(new eoq(this.L.a, this.b, this))));
      this.d(new eop.a(this.a(3), h(0) + 10, G, R, $$0x -> this.f.a(new eor(G, this::a, emr.c.a, this.V))));
      this.d(new eop.a(this.a(1), h(6) + 20, H, Q, $$0x -> this.f.a(new eor(H, this::a, emr.c.c, this.W))));
      this.d(new eop.a(this.a(2), h(6) + 20, I, T, $$0x -> this.f.a(new eor(I, this::a, emr.c.d, this.X))));
      this.d(new eop.a(this.a(3), h(6) + 20, J, U, $$0x -> this.f.a(new eor(J, this::a, emr.c.e, this.Y))));
      this.aa.b(esl.a(th.k, $$0x -> this.au_()).a());
      this.aa.a($$1 -> {
         esj var10000 = this.d($$1);
      });
      this.aa.a();
   }

   @Override
   public ti g() {
      return th.a(this.m(), this.M);
   }

   @Override
   public void au_() {
      this.f.a(this.K);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(epq $$0) {
      this.f.a(new eoh(this.K, $$0));
   }

   @Override
   public void a(Runnable $$0) {
      this.a((epq)(new epx(this.L.a, this.b, () -> this.f.execute($$0))));
   }

   private void a(@Nullable eni $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epq)(new ept($$0, this.L.a, this.O, this.Z))));
      }
   }

   private void a(@Nullable epk $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epq)(new eps($$0, this.L.a, this.O, this.Z))));
      }
   }

   private void b(Runnable $$0) {
      if (this.b == -1) {
         $$0.run();
      } else {
         this.a($$0);
      }
   }

   class a extends esl {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final aeu s;

      a(int $$0, int $$1, ti $$2, aeu $$3, esl.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, o);
         this.s = $$3;
      }

      @Override
      public void b(esa $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.o();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.r();
         int $$6 = this.t();
         $$0.a(this.s, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(eop.y, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(eop.this.i, this.m(), $$5 + 30, $$6, $$7);
      }
   }
}
