import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eoo extends gex {
   static final Logger c = LogUtils.getLogger();
   static final aez y = new aez("widget/slot_frame");
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
   private final eye K;
   private final emq L;
   private final tl M;
   private final int N;
   private final tl O;
   private static final aez P = new aez("textures/gui/realms/upload.png");
   private static final aez Q = new aez("textures/gui/realms/adventure.png");
   private static final aez R = new aez("textures/gui/realms/survival_spawn.png");
   private static final aez S = new aez("textures/gui/realms/new_world.png");
   private static final aez T = new aez("textures/gui/realms/experience.png");
   private static final aez U = new aez("textures/gui/realms/inspiration.png");
   eni V;
   eni W;
   eni X;
   eni Y;
   public final int b;
   private final Runnable Z;
   private final evu aa = new evu(this);

   private eoo(eye $$0, emq $$1, int $$2, tl $$3, tl $$4, int $$5, tl $$6, Runnable $$7) {
      super($$3);
      this.K = $$0;
      this.L = $$1;
      this.b = $$2;
      this.M = $$4;
      this.N = $$5;
      this.O = $$6;
      this.Z = $$7;
   }

   public static eoo a(eye $$0, emq $$1, Runnable $$2) {
      return new eoo($$0, $$1, $$1.n, z, A, -6250336, a, $$2);
   }

   public static eoo a(eye $$0, int $$1, emq $$2, Runnable $$3) {
      return new eoo($$0, $$2, $$1, B, C, -6250336, a, $$3);
   }

   public static eoo b(eye $$0, emq $$1, Runnable $$2) {
      return new eoo($$0, $$1, $$1.n, D, E, -65536, F, $$2);
   }

   @Override
   public void aH_() {
      evy $$0 = evy.d();
      $$0.a(new etr(this.e, this.i), evx::b);
      $$0.a(evz.b(3));
      $$0.a(new etr(this.M, this.i).i(this.N), evx::b);
      this.aa.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            elz $$0 = elz.a();

            try {
               eni $$1 = $$0.a(1, 10, emq.c.a);
               eni $$2 = $$0.a(1, 10, emq.c.c);
               eni $$3 = $$0.a(1, 10, emq.c.d);
               eni $$4 = $$0.a(1, 10, emq.c.e);
               eoo.this.f.execute(() -> {
                  eoo.this.V = $$1;
                  eoo.this.W = $$2;
                  eoo.this.X = $$3;
                  eoo.this.Y = $$4;
               });
            } catch (enm var6) {
               eoo.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new eoo.a(this.a(1), h(0) + 10, eon.a, S, $$0x -> this.f.a(new eon(this::a, this.e))));
      this.d(new eoo.a(this.a(2), h(0) + 10, eop.a, P, $$0x -> this.f.a(new eop(this.L.a, this.b, this))));
      this.d(new eoo.a(this.a(3), h(0) + 10, G, R, $$0x -> this.f.a(new eoq(G, this::a, emq.c.a, this.V))));
      this.d(new eoo.a(this.a(1), h(6) + 20, H, Q, $$0x -> this.f.a(new eoq(H, this::a, emq.c.c, this.W))));
      this.d(new eoo.a(this.a(2), h(6) + 20, I, T, $$0x -> this.f.a(new eoq(I, this::a, emq.c.d, this.X))));
      this.d(new eoo.a(this.a(3), h(6) + 20, J, U, $$0x -> this.f.a(new eoq(J, this::a, emq.c.e, this.Y))));
      this.aa.b(esk.a(tk.k, $$0x -> this.az_()).a());
      this.aa.a($$1 -> {
         esi var10000 = this.d($$1);
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

   private void a(epp $$0) {
      this.f.a(new eog(this.K, $$0));
   }

   @Override
   public void a(Runnable $$0) {
      this.a((epp)(new epw(this.L.a, this.b, () -> this.f.execute($$0))));
   }

   private void a(@Nullable enh $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epp)(new eps($$0, this.L.a, this.O, this.Z))));
      }
   }

   private void a(@Nullable epj $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epp)(new epr($$0, this.L.a, this.O, this.Z))));
      }
   }

   private void b(Runnable $$0) {
      if (this.b == -1) {
         $$0.run();
      } else {
         this.a($$0);
      }
   }

   class a extends esk {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final aez s;

      a(int $$0, int $$1, tl $$2, aez $$3, esk.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, o);
         this.s = $$3;
      }

      @Override
      public void b(erz $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.o();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.r();
         int $$6 = this.t();
         $$0.a(this.s, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(eoo.y, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(eoo.this.i, this.m(), $$5 + 30, $$6, $$7);
      }
   }
}
