import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eow extends gfd {
   static final Logger c = LogUtils.getLogger();
   static final aey y = new aey("widget/slot_frame");
   private static final tn z = tn.c("mco.selectServer.create");
   private static final tn A = tn.c("mco.selectServer.create.subtitle");
   private static final tn B = tn.c("mco.configure.world.switch.slot");
   private static final tn C = tn.c("mco.configure.world.switch.slot.subtitle");
   private static final tn D = tn.c("mco.reset.world.title");
   private static final tn E = tn.c("mco.reset.world.warning");
   public static final tn a = tn.c("mco.create.world.reset.title");
   private static final tn F = tn.c("mco.reset.world.resetting.screen.title");
   private static final tn G = tn.c("mco.reset.world.template");
   private static final tn H = tn.c("mco.reset.world.adventure");
   private static final tn I = tn.c("mco.reset.world.experience");
   private static final tn J = tn.c("mco.reset.world.inspiration");
   private final eym K;
   private final emy L;
   private final tn M;
   private final int N;
   private final tn O;
   private static final aey P = new aey("textures/gui/realms/upload.png");
   private static final aey Q = new aey("textures/gui/realms/adventure.png");
   private static final aey R = new aey("textures/gui/realms/survival_spawn.png");
   private static final aey S = new aey("textures/gui/realms/new_world.png");
   private static final aey T = new aey("textures/gui/realms/experience.png");
   private static final aey U = new aey("textures/gui/realms/inspiration.png");
   enq V;
   enq W;
   enq X;
   enq Y;
   public final int b;
   private final Runnable Z;
   private final ewb aa = new ewb(this);

   private eow(eym $$0, emy $$1, int $$2, tn $$3, tn $$4, int $$5, tn $$6, Runnable $$7) {
      super($$3);
      this.K = $$0;
      this.L = $$1;
      this.b = $$2;
      this.M = $$4;
      this.N = $$5;
      this.O = $$6;
      this.Z = $$7;
   }

   public static eow a(eym $$0, emy $$1, Runnable $$2) {
      return new eow($$0, $$1, $$1.n, z, A, -6250336, a, $$2);
   }

   public static eow a(eym $$0, int $$1, emy $$2, Runnable $$3) {
      return new eow($$0, $$2, $$1, B, C, -6250336, a, $$3);
   }

   public static eow b(eym $$0, emy $$1, Runnable $$2) {
      return new eow($$0, $$1, $$1.n, D, E, -65536, F, $$2);
   }

   @Override
   public void aH_() {
      ewf $$0 = ewf.d();
      $$0.a(new ety(this.e, this.i), ewe::b);
      $$0.a(ewg.b(3));
      $$0.a(new ety(this.M, this.i).i(this.N), ewe::b);
      this.aa.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            emh $$0 = emh.a();

            try {
               enq $$1 = $$0.a(1, 10, emy.c.a);
               enq $$2 = $$0.a(1, 10, emy.c.c);
               enq $$3 = $$0.a(1, 10, emy.c.d);
               enq $$4 = $$0.a(1, 10, emy.c.e);
               eow.this.f.execute(() -> {
                  eow.this.V = $$1;
                  eow.this.W = $$2;
                  eow.this.X = $$3;
                  eow.this.Y = $$4;
               });
            } catch (enu var6) {
               eow.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new eow.a(this.a(1), h(0) + 10, eov.a, S, $$0x -> this.f.a(new eov(this::a, this.e))));
      this.d(new eow.a(this.a(2), h(0) + 10, eox.a, P, $$0x -> this.f.a(new eox(this.L.a, this.b, this))));
      this.d(new eow.a(this.a(3), h(0) + 10, G, R, $$0x -> this.f.a(new eoy(G, this::a, emy.c.a, this.V))));
      this.d(new eow.a(this.a(1), h(6) + 20, H, Q, $$0x -> this.f.a(new eoy(H, this::a, emy.c.c, this.W))));
      this.d(new eow.a(this.a(2), h(6) + 20, I, T, $$0x -> this.f.a(new eoy(I, this::a, emy.c.d, this.X))));
      this.d(new eow.a(this.a(3), h(6) + 20, J, U, $$0x -> this.f.a(new eoy(J, this::a, emy.c.e, this.Y))));
      this.aa.b(ess.a(tm.k, $$0x -> this.az_()).a());
      this.aa.a($$1 -> {
         esq var10000 = this.d($$1);
      });
      this.aa.a();
   }

   @Override
   public tn g() {
      return tm.a(this.m(), this.M);
   }

   @Override
   public void az_() {
      this.f.a(this.K);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(epx $$0) {
      this.f.a(new eoo(this.K, $$0));
   }

   @Override
   public void a(Runnable $$0) {
      this.a((epx)(new eqe(this.L.a, this.b, () -> this.f.execute($$0))));
   }

   private void a(@Nullable enp $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epx)(new eqa($$0, this.L.a, this.O, this.Z))));
      }
   }

   private void a(@Nullable epr $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epx)(new epz($$0, this.L.a, this.O, this.Z))));
      }
   }

   private void b(Runnable $$0) {
      if (this.b == -1) {
         $$0.run();
      } else {
         this.a($$0);
      }
   }

   class a extends ess {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final aey s;

      a(int $$0, int $$1, tn $$2, aey $$3, ess.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, o);
         this.s = $$3;
      }

      @Override
      public void b(esh $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.o();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.r();
         int $$6 = this.t();
         $$0.a(this.s, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(eow.y, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(eow.this.i, this.m(), $$5 + 30, $$6, $$7);
      }
   }
}
