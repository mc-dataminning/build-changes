import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eou extends gfb {
   static final Logger c = LogUtils.getLogger();
   static final aew y = new aew("widget/slot_frame");
   private static final tl z = tl.c("mco.selectServer.create");
   private static final tl A = tl.c("mco.selectServer.create.subtitle");
   private static final tl B = tl.c("mco.configure.world.switch.slot");
   private static final tl C = tl.c("mco.configure.world.switch.slot.subtitle");
   private static final tl D = tl.c("mco.reset.world.title");
   private static final tl E = tl.c("mco.reset.world.warning");
   public static final tl a = tl.c("mco.create.world.reset.title");
   private static final tl F = tl.c("mco.reset.world.resetting.screen.title");
   private static final tl G = tl.c("mco.reset.world.template");
   private static final tl H = tl.c("mco.reset.world.adventure");
   private static final tl I = tl.c("mco.reset.world.experience");
   private static final tl J = tl.c("mco.reset.world.inspiration");
   private final eyk K;
   private final emw L;
   private final tl M;
   private final int N;
   private final tl O;
   private static final aew P = new aew("textures/gui/realms/upload.png");
   private static final aew Q = new aew("textures/gui/realms/adventure.png");
   private static final aew R = new aew("textures/gui/realms/survival_spawn.png");
   private static final aew S = new aew("textures/gui/realms/new_world.png");
   private static final aew T = new aew("textures/gui/realms/experience.png");
   private static final aew U = new aew("textures/gui/realms/inspiration.png");
   eno V;
   eno W;
   eno X;
   eno Y;
   public final int b;
   private final Runnable Z;
   private final evz aa = new evz(this);

   private eou(eyk $$0, emw $$1, int $$2, tl $$3, tl $$4, int $$5, tl $$6, Runnable $$7) {
      super($$3);
      this.K = $$0;
      this.L = $$1;
      this.b = $$2;
      this.M = $$4;
      this.N = $$5;
      this.O = $$6;
      this.Z = $$7;
   }

   public static eou a(eyk $$0, emw $$1, Runnable $$2) {
      return new eou($$0, $$1, $$1.n, z, A, -6250336, a, $$2);
   }

   public static eou a(eyk $$0, int $$1, emw $$2, Runnable $$3) {
      return new eou($$0, $$2, $$1, B, C, -6250336, a, $$3);
   }

   public static eou b(eyk $$0, emw $$1, Runnable $$2) {
      return new eou($$0, $$1, $$1.n, D, E, -65536, F, $$2);
   }

   @Override
   public void aH_() {
      ewd $$0 = ewd.d();
      $$0.a(new etw(this.e, this.i), ewc::b);
      $$0.a(ewe.b(3));
      $$0.a(new etw(this.M, this.i).i(this.N), ewc::b);
      this.aa.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            emf $$0 = emf.a();

            try {
               eno $$1 = $$0.a(1, 10, emw.c.a);
               eno $$2 = $$0.a(1, 10, emw.c.c);
               eno $$3 = $$0.a(1, 10, emw.c.d);
               eno $$4 = $$0.a(1, 10, emw.c.e);
               eou.this.f.execute(() -> {
                  eou.this.V = $$1;
                  eou.this.W = $$2;
                  eou.this.X = $$3;
                  eou.this.Y = $$4;
               });
            } catch (ens var6) {
               eou.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new eou.a(this.a(1), h(0) + 10, eot.a, S, $$0x -> this.f.a(new eot(this::a, this.e))));
      this.d(new eou.a(this.a(2), h(0) + 10, eov.a, P, $$0x -> this.f.a(new eov(this.L.a, this.b, this))));
      this.d(new eou.a(this.a(3), h(0) + 10, G, R, $$0x -> this.f.a(new eow(G, this::a, emw.c.a, this.V))));
      this.d(new eou.a(this.a(1), h(6) + 20, H, Q, $$0x -> this.f.a(new eow(H, this::a, emw.c.c, this.W))));
      this.d(new eou.a(this.a(2), h(6) + 20, I, T, $$0x -> this.f.a(new eow(I, this::a, emw.c.d, this.X))));
      this.d(new eou.a(this.a(3), h(6) + 20, J, U, $$0x -> this.f.a(new eow(J, this::a, emw.c.e, this.Y))));
      this.aa.b(esq.a(tk.k, $$0x -> this.az_()).a());
      this.aa.a($$1 -> {
         eso var10000 = this.d($$1);
      });
      this.aa.a();
   }

   @Override
   public tl g() {
      return tk.a(this.m(), this.M);
   }

   @Override
   public void az_() {
      this.f.a(this.K);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(epv $$0) {
      this.f.a(new eom(this.K, $$0));
   }

   @Override
   public void a(Runnable $$0) {
      this.a((epv)(new eqc(this.L.a, this.b, () -> this.f.execute($$0))));
   }

   private void a(@Nullable enn $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epv)(new epy($$0, this.L.a, this.O, this.Z))));
      }
   }

   private void a(@Nullable epp $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epv)(new epx($$0, this.L.a, this.O, this.Z))));
      }
   }

   private void b(Runnable $$0) {
      if (this.b == -1) {
         $$0.run();
      } else {
         this.a($$0);
      }
   }

   class a extends esq {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final aew s;

      a(int $$0, int $$1, tl $$2, aew $$3, esq.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, o);
         this.s = $$3;
      }

      @Override
      public void b(esf $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.o();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.r();
         int $$6 = this.t();
         $$0.a(this.s, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(eou.y, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(eou.this.i, this.m(), $$5 + 30, $$6, $$7);
      }
   }
}
