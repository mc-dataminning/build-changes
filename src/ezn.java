import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezn extends grl {
   static final Logger c = LogUtils.getLogger();
   private static final wg y = wg.c("mco.selectServer.create");
   private static final wg z = wg.c("mco.selectServer.create.subtitle");
   private static final wg A = wg.c("mco.configure.world.switch.slot");
   private static final wg B = wg.c("mco.configure.world.switch.slot.subtitle");
   private static final wg C = wg.c("mco.reset.world.title");
   private static final wg D = wg.c("mco.reset.world.warning");
   public static final wg a = wg.c("mco.create.world.reset.title");
   private static final wg E = wg.c("mco.reset.world.resetting.screen.title");
   private static final wg F = wg.c("mco.reset.world.template");
   private static final wg G = wg.c("mco.reset.world.adventure");
   private static final wg H = wg.c("mco.reset.world.experience");
   private static final wg I = wg.c("mco.reset.world.inspiration");
   private final fjo J;
   private final exp K;
   private final wg L;
   private final int M;
   private final wg N;
   private static final ajt O = new ajt("textures/gui/realms/upload.png");
   private static final ajt P = new ajt("textures/gui/realms/adventure.png");
   private static final ajt Q = new ajt("textures/gui/realms/survival_spawn.png");
   private static final ajt R = new ajt("textures/gui/realms/new_world.png");
   private static final ajt S = new ajt("textures/gui/realms/experience.png");
   private static final ajt T = new ajt("textures/gui/realms/inspiration.png");
   eyh U;
   eyh V;
   eyh W;
   eyh X;
   public final int b;
   @Nullable
   private final far Y;
   private final Runnable Z;
   private final fhc aa = new fhc(this);

   private ezn(fjo $$0, exp $$1, int $$2, wg $$3, wg $$4, int $$5, wg $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public ezn(fjo $$0, exp $$1, int $$2, wg $$3, wg $$4, int $$5, wg $$6, @Nullable far $$7, Runnable $$8) {
      super($$3);
      this.J = $$0;
      this.K = $$1;
      this.b = $$2;
      this.L = $$4;
      this.M = $$5;
      this.N = $$6;
      this.Y = $$7;
      this.Z = $$8;
   }

   public static ezn a(fjo $$0, exp $$1, far $$2, Runnable $$3) {
      return new ezn($$0, $$1, $$1.n, y, z, -6250336, a, $$2, $$3);
   }

   public static ezn a(fjo $$0, int $$1, exp $$2, Runnable $$3) {
      return new ezn($$0, $$2, $$1, A, B, -6250336, a, $$3);
   }

   public static ezn a(fjo $$0, exp $$1, Runnable $$2) {
      return new ezn($$0, $$1, $$1.n, C, D, -65536, E, $$2);
   }

   @Override
   public void aN_() {
      fhg $$0 = this.aa.a(fhg.d());
      $$0.c().a(9 / 3);
      $$0.a(new few(this.i, this.m), fhf::b);
      $$0.a(new few(this.L, this.m).b(this.M), fhf::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            ewy $$0 = ewy.a();

            try {
               eyh $$1 = $$0.a(1, 10, exp.d.a);
               eyh $$2 = $$0.a(1, 10, exp.d.c);
               eyh $$3 = $$0.a(1, 10, exp.d.d);
               eyh $$4 = $$0.a(1, 10, exp.d.e);
               ezn.this.j.execute(() -> {
                  ezn.this.U = $$1;
                  ezn.this.V = $$2;
                  ezn.this.W = $$3;
                  ezn.this.X = $$4;
               });
            } catch (eyl var6) {
               ezn.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fhb $$1 = this.aa.c(new fhb());
      fhb.b $$2 = $$1.d(3);
      $$2.c().a(16);
      $$2.a(new ezn.a(ezm.a, R, $$0x -> this.j.a(new ezm(this::a, this.i))));
      $$2.a(new ezn.a(ezo.a, O, $$0x -> this.j.a(new ezo(this.Y, this.K.a, this.b, this))));
      $$2.a(new ezn.a(F, Q, $$0x -> this.j.a(new ezp(F, this::a, exp.d.a, this.U))));
      $$2.a(new ezn.a(G, P, $$0x -> this.j.a(new ezp(G, this::a, exp.d.c, this.V))));
      $$2.a(new ezn.a(H, S, $$0x -> this.j.a(new ezp(H, this::a, exp.d.d, this.W))));
      $$2.a(new ezn.a(I, T, $$0x -> this.j.a(new ezp(I, this::a, exp.d.e, this.X))));
      this.aa.b(fdp.a(wf.k, $$0x -> this.d()).a());
      this.aa.a($$1x -> {
         fdn var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.aa.a();
   }

   @Override
   public wg i() {
      return wf.a(this.n(), this.L);
   }

   @Override
   public void d() {
      this.j.a(this.J);
   }

   private void a(@Nullable eyg $$0) {
      this.j.a(this);
      if ($$0 != null) {
         this.a(new fat($$0, this.K.a, this.N, this.Z));
      }
   }

   private void a(@Nullable fai $$0) {
      this.j.a(this);
      if ($$0 != null) {
         this.a(new fas($$0, this.K.a, this.N, this.Z));
      }
   }

   private void a(fap $$0) {
      List<fap> $$1 = new ArrayList<>();
      if (this.Y != null) {
         $$1.add(this.Y);
      }

      if (this.b != this.K.n) {
         $$1.add(new fax(this.K.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.j.a(new ezf(this.J, $$1.toArray(new fap[0])));
   }

   class a extends fdp {
      private static final ajt b = new ajt("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ajt v;

      a(wg $$0, ajt $$1, fdp.c $$2) {
         super(0, 0, 60, 60, $$0, $$2, q);
         this.v = $$1;
      }

      @Override
      public void b(fdc $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.A();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.C();
         int $$6 = this.D();
         $$0.a(this.v, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(ezn.this.m, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
