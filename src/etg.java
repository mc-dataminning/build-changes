import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class etg extends gkp {
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
   private final fdb H;
   private final eri I;
   private final vf J;
   private final int K;
   private final vf L;
   private static final ahg M = new ahg("textures/gui/realms/upload.png");
   private static final ahg N = new ahg("textures/gui/realms/adventure.png");
   private static final ahg O = new ahg("textures/gui/realms/survival_spawn.png");
   private static final ahg P = new ahg("textures/gui/realms/new_world.png");
   private static final ahg Q = new ahg("textures/gui/realms/experience.png");
   private static final ahg R = new ahg("textures/gui/realms/inspiration.png");
   esa S;
   esa T;
   esa U;
   esa V;
   public final int b;
   @Nullable
   private final euq W;
   private final Runnable X;
   private final faq Y = new faq(this);

   private etg(fdb $$0, eri $$1, int $$2, vf $$3, vf $$4, int $$5, vf $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public etg(fdb $$0, eri $$1, int $$2, vf $$3, vf $$4, int $$5, vf $$6, @Nullable euq $$7, Runnable $$8) {
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

   public static etg a(fdb $$0, eri $$1, euq $$2, Runnable $$3) {
      return new etg($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static etg a(fdb $$0, int $$1, eri $$2, Runnable $$3) {
      return new etg($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static etg a(fdb $$0, eri $$1, Runnable $$2) {
      return new etg($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aN_() {
      fau $$0 = fau.d();
      $$0.a(new eyn(this.e, this.i), fat::b);
      $$0.a(fav.b(3));
      $$0.a(new eyn(this.J, this.i).b(this.K), fat::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eqr $$0 = eqr.a();

            try {
               esa $$1 = $$0.a(1, 10, eri.d.a);
               esa $$2 = $$0.a(1, 10, eri.d.c);
               esa $$3 = $$0.a(1, 10, eri.d.d);
               esa $$4 = $$0.a(1, 10, eri.d.e);
               etg.this.f.execute(() -> {
                  etg.this.S = $$1;
                  etg.this.T = $$2;
                  etg.this.U = $$3;
                  etg.this.V = $$4;
               });
            } catch (ese var6) {
               etg.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new etg.a(this.a(1), g(0) + 10, etf.a, P, $$0x -> this.f.a(new etf(this::a, this.e))));
      this.d(new etg.a(this.a(2), g(0) + 10, eth.a, M, $$0x -> this.f.a(new eth(this.I.a, this.b, this))));
      this.d(new etg.a(this.a(3), g(0) + 10, D, O, $$0x -> this.f.a(new eti(D, this::a, eri.d.a, this.S))));
      this.d(new etg.a(this.a(1), g(6) + 20, E, N, $$0x -> this.f.a(new eti(E, this::a, eri.d.c, this.T))));
      this.d(new etg.a(this.a(2), g(6) + 20, F, Q, $$0x -> this.f.a(new eti(F, this::a, eri.d.d, this.U))));
      this.d(new etg.a(this.a(3), g(6) + 20, G, R, $$0x -> this.f.a(new eti(G, this::a, eri.d.e, this.V))));
      this.Y.b(exg.a(ve.k, $$0x -> this.aE_()).a());
      this.Y.a($$1 -> {
         exe var10000 = this.d($$1);
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

   private void a(@Nullable erz $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eui)(new eul($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable eub $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eui)(new euk($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(eui $$0) {
      List<eui> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new eup(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new esy(this.H, $$1.toArray(new eui[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new esy(this.H, new eup(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends exg {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final ahg t;

      a(int $$0, int $$1, vf $$2, ahg $$3, exg.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(ewu $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.z();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.B();
         int $$6 = this.C();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(etg.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(etg.this.i, this.x(), $$5 + 30, $$6, $$7);
      }
   }
}
