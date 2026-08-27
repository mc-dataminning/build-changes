import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etf extends gko {
   static final Logger c = LogUtils.getLogger();
   static final ahg v = new ahg("widget/slot_frame");
   private static final vf w = vf.c("mco.selectServer.create");
   private static final vf x = vf.c("mco.selectServer.create.subtitle");
   private static final vf y = vf.c("mco.configure.world.switch.slot");
   private static final vf z = vf.c("mco.configure.world.switch.slot.subtitle");
   private static final vf A = vf.c("mco.reset.world.title");
   private static final vf B = vf.c("mco.reset.world.warning");
   public static final vf a = vf.c("mco.create.world.reset.title");
   private static final vf C = vf.c("mco.reset.world.resetting.screen.title");
   private static final vf D = vf.c("mco.reset.world.template");
   private static final vf E = vf.c("mco.reset.world.adventure");
   private static final vf F = vf.c("mco.reset.world.experience");
   private static final vf G = vf.c("mco.reset.world.inspiration");
   private final fda H;
   private final erh I;
   private final vf J;
   private final int K;
   private final vf L;
   private static final ahg M = new ahg("textures/gui/realms/upload.png");
   private static final ahg N = new ahg("textures/gui/realms/adventure.png");
   private static final ahg O = new ahg("textures/gui/realms/survival_spawn.png");
   private static final ahg P = new ahg("textures/gui/realms/new_world.png");
   private static final ahg Q = new ahg("textures/gui/realms/experience.png");
   private static final ahg R = new ahg("textures/gui/realms/inspiration.png");
   erz S;
   erz T;
   erz U;
   erz V;
   public final int b;
   @Nullable
   private final eup W;
   private final Runnable X;
   private final fap Y = new fap(this);

   private etf(fda $$0, erh $$1, int $$2, vf $$3, vf $$4, int $$5, vf $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public etf(fda $$0, erh $$1, int $$2, vf $$3, vf $$4, int $$5, vf $$6, @Nullable eup $$7, Runnable $$8) {
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

   public static etf a(fda $$0, erh $$1, eup $$2, Runnable $$3) {
      return new etf($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static etf a(fda $$0, int $$1, erh $$2, Runnable $$3) {
      return new etf($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static etf a(fda $$0, erh $$1, Runnable $$2) {
      return new etf($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aN_() {
      fat $$0 = fat.d();
      $$0.a(new eym(this.e, this.i), fas::b);
      $$0.a(fau.b(3));
      $$0.a(new eym(this.J, this.i).b(this.K), fas::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eqq $$0 = eqq.a();

            try {
               erz $$1 = $$0.a(1, 10, erh.d.a);
               erz $$2 = $$0.a(1, 10, erh.d.c);
               erz $$3 = $$0.a(1, 10, erh.d.d);
               erz $$4 = $$0.a(1, 10, erh.d.e);
               etf.this.f.execute(() -> {
                  etf.this.S = $$1;
                  etf.this.T = $$2;
                  etf.this.U = $$3;
                  etf.this.V = $$4;
               });
            } catch (esd var6) {
               etf.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new etf.a(this.a(1), g(0) + 10, ete.a, P, $$0x -> this.f.a(new ete(this::a, this.e))));
      this.d(new etf.a(this.a(2), g(0) + 10, etg.a, M, $$0x -> this.f.a(new etg(this.I.a, this.b, this))));
      this.d(new etf.a(this.a(3), g(0) + 10, D, O, $$0x -> this.f.a(new eth(D, this::a, erh.d.a, this.S))));
      this.d(new etf.a(this.a(1), g(6) + 20, E, N, $$0x -> this.f.a(new eth(E, this::a, erh.d.c, this.T))));
      this.d(new etf.a(this.a(2), g(6) + 20, F, Q, $$0x -> this.f.a(new eth(F, this::a, erh.d.d, this.U))));
      this.d(new etf.a(this.a(3), g(6) + 20, G, R, $$0x -> this.f.a(new eth(G, this::a, erh.d.e, this.V))));
      this.Y.b(exf.a(ve.k, $$0x -> this.aE_()).a());
      this.Y.a($$1 -> {
         exd var10000 = this.d($$1);
      });
      this.Y.a();
   }

   @Override
   public vf h() {
      return ve.a(this.o(), this.J);
   }

   @Override
   public void aE_() {
      this.f.a(this.H);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(@Nullable ery $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((euh)(new euk($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable eua $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((euh)(new euj($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(euh $$0) {
      List<euh> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new euo(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new esx(this.H, $$1.toArray(new euh[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new esx(this.H, new euo(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends exf {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final ahg t;

      a(int $$0, int $$1, vf $$2, ahg $$3, exf.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(ewt $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.z();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.B();
         int $$6 = this.C();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(etf.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(etf.this.i, this.x(), $$5 + 30, $$6, $$7);
      }
   }
}
