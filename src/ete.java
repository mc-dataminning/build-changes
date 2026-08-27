import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ete extends gkn {
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
   private final fcz H;
   private final erg I;
   private final vf J;
   private final int K;
   private final vf L;
   private static final ahg M = new ahg("textures/gui/realms/upload.png");
   private static final ahg N = new ahg("textures/gui/realms/adventure.png");
   private static final ahg O = new ahg("textures/gui/realms/survival_spawn.png");
   private static final ahg P = new ahg("textures/gui/realms/new_world.png");
   private static final ahg Q = new ahg("textures/gui/realms/experience.png");
   private static final ahg R = new ahg("textures/gui/realms/inspiration.png");
   ery S;
   ery T;
   ery U;
   ery V;
   public final int b;
   @Nullable
   private final euo W;
   private final Runnable X;
   private final fao Y = new fao(this);

   private ete(fcz $$0, erg $$1, int $$2, vf $$3, vf $$4, int $$5, vf $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public ete(fcz $$0, erg $$1, int $$2, vf $$3, vf $$4, int $$5, vf $$6, @Nullable euo $$7, Runnable $$8) {
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

   public static ete a(fcz $$0, erg $$1, euo $$2, Runnable $$3) {
      return new ete($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static ete a(fcz $$0, int $$1, erg $$2, Runnable $$3) {
      return new ete($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static ete a(fcz $$0, erg $$1, Runnable $$2) {
      return new ete($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aN_() {
      fas $$0 = fas.d();
      $$0.a(new eyl(this.e, this.i), far::b);
      $$0.a(fat.b(3));
      $$0.a(new eyl(this.J, this.i).b(this.K), far::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eqp $$0 = eqp.a();

            try {
               ery $$1 = $$0.a(1, 10, erg.d.a);
               ery $$2 = $$0.a(1, 10, erg.d.c);
               ery $$3 = $$0.a(1, 10, erg.d.d);
               ery $$4 = $$0.a(1, 10, erg.d.e);
               ete.this.f.execute(() -> {
                  ete.this.S = $$1;
                  ete.this.T = $$2;
                  ete.this.U = $$3;
                  ete.this.V = $$4;
               });
            } catch (esc var6) {
               ete.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new ete.a(this.a(1), g(0) + 10, etd.a, P, $$0x -> this.f.a(new etd(this::a, this.e))));
      this.d(new ete.a(this.a(2), g(0) + 10, etf.a, M, $$0x -> this.f.a(new etf(this.I.a, this.b, this))));
      this.d(new ete.a(this.a(3), g(0) + 10, D, O, $$0x -> this.f.a(new etg(D, this::a, erg.d.a, this.S))));
      this.d(new ete.a(this.a(1), g(6) + 20, E, N, $$0x -> this.f.a(new etg(E, this::a, erg.d.c, this.T))));
      this.d(new ete.a(this.a(2), g(6) + 20, F, Q, $$0x -> this.f.a(new etg(F, this::a, erg.d.d, this.U))));
      this.d(new ete.a(this.a(3), g(6) + 20, G, R, $$0x -> this.f.a(new etg(G, this::a, erg.d.e, this.V))));
      this.Y.b(exe.a(ve.k, $$0x -> this.aE_()).a());
      this.Y.a($$1 -> {
         exc var10000 = this.d($$1);
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

   private void a(@Nullable erx $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eug)(new euj($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable etz $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eug)(new eui($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(eug $$0) {
      List<eug> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new eun(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new esw(this.H, $$1.toArray(new eug[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new esw(this.H, new eun(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends exe {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final ahg t;

      a(int $$0, int $$1, vf $$2, ahg $$3, exe.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(ews $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.z();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.B();
         int $$6 = this.C();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(ete.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(ete.this.i, this.x(), $$5 + 30, $$6, $$7);
      }
   }
}
