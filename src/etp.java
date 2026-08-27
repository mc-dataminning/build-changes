import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etp extends gld {
   static final Logger c = LogUtils.getLogger();
   static final ahh v = new ahh("widget/slot_frame");
   private static final vg w = vg.c("mco.selectServer.create");
   private static final vg x = vg.c("mco.selectServer.create.subtitle");
   private static final vg y = vg.c("mco.configure.world.switch.slot");
   private static final vg z = vg.c("mco.configure.world.switch.slot.subtitle");
   private static final vg A = vg.c("mco.reset.world.title");
   private static final vg B = vg.c("mco.reset.world.warning");
   public static final vg a = vg.c("mco.create.world.reset.title");
   private static final vg C = vg.c("mco.reset.world.resetting.screen.title");
   private static final vg D = vg.c("mco.reset.world.template");
   private static final vg E = vg.c("mco.reset.world.adventure");
   private static final vg F = vg.c("mco.reset.world.experience");
   private static final vg G = vg.c("mco.reset.world.inspiration");
   private final fdm H;
   private final err I;
   private final vg J;
   private final int K;
   private final vg L;
   private static final ahh M = new ahh("textures/gui/realms/upload.png");
   private static final ahh N = new ahh("textures/gui/realms/adventure.png");
   private static final ahh O = new ahh("textures/gui/realms/survival_spawn.png");
   private static final ahh P = new ahh("textures/gui/realms/new_world.png");
   private static final ahh Q = new ahh("textures/gui/realms/experience.png");
   private static final ahh R = new ahh("textures/gui/realms/inspiration.png");
   esj S;
   esj T;
   esj U;
   esj V;
   public final int b;
   @Nullable
   private final euz W;
   private final Runnable X;
   private final fbb Y = new fbb(this);

   private etp(fdm $$0, err $$1, int $$2, vg $$3, vg $$4, int $$5, vg $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public etp(fdm $$0, err $$1, int $$2, vg $$3, vg $$4, int $$5, vg $$6, @Nullable euz $$7, Runnable $$8) {
      super($$3);
      this.H = $$0;
      this.I = $$1;
      this.b = $$2;
      this.J = $$4;
      this.K = $$5;
      this.L = $$6;
      this.W = $$7;
      this.X = $$8;
   }

   public static etp a(fdm $$0, err $$1, euz $$2, Runnable $$3) {
      return new etp($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static etp a(fdm $$0, int $$1, err $$2, Runnable $$3) {
      return new etp($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static etp a(fdm $$0, err $$1, Runnable $$2) {
      return new etp($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aP_() {
      fbf $$0 = fbf.d();
      $$0.a(new eyy(this.e, this.i), fbe::b);
      $$0.a(fbg.b(3));
      $$0.a(new eyy(this.J, this.i).b(this.K), fbe::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            era $$0 = era.a();

            try {
               esj $$1 = $$0.a(1, 10, err.d.a);
               esj $$2 = $$0.a(1, 10, err.d.c);
               esj $$3 = $$0.a(1, 10, err.d.d);
               esj $$4 = $$0.a(1, 10, err.d.e);
               etp.this.f.execute(() -> {
                  etp.this.S = $$1;
                  etp.this.T = $$2;
                  etp.this.U = $$3;
                  etp.this.V = $$4;
               });
            } catch (esn var6) {
               etp.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new etp.a(this.a(1), g(0) + 10, eto.a, P, $$0x -> this.f.a(new eto(this::a, this.e))));
      this.d(new etp.a(this.a(2), g(0) + 10, etq.a, M, $$0x -> this.f.a(new etq(this.I.a, this.b, this))));
      this.d(new etp.a(this.a(3), g(0) + 10, D, O, $$0x -> this.f.a(new etr(D, this::a, err.d.a, this.S))));
      this.d(new etp.a(this.a(1), g(6) + 20, E, N, $$0x -> this.f.a(new etr(E, this::a, err.d.c, this.T))));
      this.d(new etp.a(this.a(2), g(6) + 20, F, Q, $$0x -> this.f.a(new etr(F, this::a, err.d.d, this.U))));
      this.d(new etp.a(this.a(3), g(6) + 20, G, R, $$0x -> this.f.a(new etr(G, this::a, err.d.e, this.V))));
      this.Y.b(exr.a(vf.k, $$0x -> this.d()).a());
      this.Y.a($$1 -> {
         exp var10000 = this.d($$1);
      });
      this.Y.a();
   }

   @Override
   public vg i() {
      return vf.a(this.p(), this.J);
   }

   @Override
   public void d() {
      this.f.a(this.H);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(@Nullable esi $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eur)(new euu($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable euk $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eur)(new eut($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(eur $$0) {
      List<eur> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new euy(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new eth(this.H, $$1.toArray(new eur[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new eth(this.H, new euy(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends exr {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final ahh t;

      a(int $$0, int $$1, vg $$2, ahh $$3, exr.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(exe $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.z();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.B();
         int $$6 = this.C();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(etp.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(etp.this.i, this.x(), $$5 + 30, $$6, $$7);
      }
   }
}
