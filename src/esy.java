import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esy extends gkc {
   static final Logger c = LogUtils.getLogger();
   static final ahd v = new ahd("widget/slot_frame");
   private static final vd w = vd.c("mco.selectServer.create");
   private static final vd x = vd.c("mco.selectServer.create.subtitle");
   private static final vd y = vd.c("mco.configure.world.switch.slot");
   private static final vd z = vd.c("mco.configure.world.switch.slot.subtitle");
   private static final vd A = vd.c("mco.reset.world.title");
   private static final vd B = vd.c("mco.reset.world.warning");
   public static final vd a = vd.c("mco.create.world.reset.title");
   private static final vd C = vd.c("mco.reset.world.resetting.screen.title");
   private static final vd D = vd.c("mco.reset.world.template");
   private static final vd E = vd.c("mco.reset.world.adventure");
   private static final vd F = vd.c("mco.reset.world.experience");
   private static final vd G = vd.c("mco.reset.world.inspiration");
   private final fct H;
   private final era I;
   private final vd J;
   private final int K;
   private final vd L;
   private static final ahd M = new ahd("textures/gui/realms/upload.png");
   private static final ahd N = new ahd("textures/gui/realms/adventure.png");
   private static final ahd O = new ahd("textures/gui/realms/survival_spawn.png");
   private static final ahd P = new ahd("textures/gui/realms/new_world.png");
   private static final ahd Q = new ahd("textures/gui/realms/experience.png");
   private static final ahd R = new ahd("textures/gui/realms/inspiration.png");
   ers S;
   ers T;
   ers U;
   ers V;
   public final int b;
   @Nullable
   private final eui W;
   private final Runnable X;
   private final fai Y = new fai(this);

   private esy(fct $$0, era $$1, int $$2, vd $$3, vd $$4, int $$5, vd $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public esy(fct $$0, era $$1, int $$2, vd $$3, vd $$4, int $$5, vd $$6, @Nullable eui $$7, Runnable $$8) {
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

   public static esy a(fct $$0, era $$1, eui $$2, Runnable $$3) {
      return new esy($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static esy a(fct $$0, int $$1, era $$2, Runnable $$3) {
      return new esy($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static esy a(fct $$0, era $$1, Runnable $$2) {
      return new esy($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aN_() {
      fam $$0 = fam.d();
      $$0.a(new eyf(this.e, this.i), fal::b);
      $$0.a(fan.b(3));
      $$0.a(new eyf(this.J, this.i).b(this.K), fal::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eqj $$0 = eqj.a();

            try {
               ers $$1 = $$0.a(1, 10, era.d.a);
               ers $$2 = $$0.a(1, 10, era.d.c);
               ers $$3 = $$0.a(1, 10, era.d.d);
               ers $$4 = $$0.a(1, 10, era.d.e);
               esy.this.f.execute(() -> {
                  esy.this.S = $$1;
                  esy.this.T = $$2;
                  esy.this.U = $$3;
                  esy.this.V = $$4;
               });
            } catch (erw var6) {
               esy.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new esy.a(this.a(1), g(0) + 10, esx.a, P, $$0x -> this.f.a(new esx(this::a, this.e))));
      this.d(new esy.a(this.a(2), g(0) + 10, esz.a, M, $$0x -> this.f.a(new esz(this.I.a, this.b, this))));
      this.d(new esy.a(this.a(3), g(0) + 10, D, O, $$0x -> this.f.a(new eta(D, this::a, era.d.a, this.S))));
      this.d(new esy.a(this.a(1), g(6) + 20, E, N, $$0x -> this.f.a(new eta(E, this::a, era.d.c, this.T))));
      this.d(new esy.a(this.a(2), g(6) + 20, F, Q, $$0x -> this.f.a(new eta(F, this::a, era.d.d, this.U))));
      this.d(new esy.a(this.a(3), g(6) + 20, G, R, $$0x -> this.f.a(new eta(G, this::a, era.d.e, this.V))));
      this.Y.b(ewy.a(vc.k, $$0x -> this.aE_()).a());
      this.Y.a($$1 -> {
         eww var10000 = this.d($$1);
      });
      this.Y.a();
   }

   @Override
   public vd h() {
      return vc.a(this.o(), this.J);
   }

   @Override
   public void aE_() {
      this.f.a(this.H);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(@Nullable err $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eua)(new eud($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable ett $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eua)(new euc($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(eua $$0) {
      List<eua> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new euh(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new esq(this.H, $$1.toArray(new eua[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new esq(this.H, new euh(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends ewy {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final ahd t;

      a(int $$0, int $$1, vd $$2, ahd $$3, ewy.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(ewm $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.z();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.B();
         int $$6 = this.C();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(esy.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(esy.this.i, this.x(), $$5 + 30, $$6, $$7);
      }
   }
}
