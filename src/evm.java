import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evm extends gnd {
   static final Logger c = LogUtils.getLogger();
   private static final vq v = vq.c("mco.selectServer.create");
   private static final vq w = vq.c("mco.selectServer.create.subtitle");
   private static final vq x = vq.c("mco.configure.world.switch.slot");
   private static final vq y = vq.c("mco.configure.world.switch.slot.subtitle");
   private static final vq z = vq.c("mco.reset.world.title");
   private static final vq A = vq.c("mco.reset.world.warning");
   public static final vq a = vq.c("mco.create.world.reset.title");
   private static final vq B = vq.c("mco.reset.world.resetting.screen.title");
   private static final vq C = vq.c("mco.reset.world.template");
   private static final vq D = vq.c("mco.reset.world.adventure");
   private static final vq E = vq.c("mco.reset.world.experience");
   private static final vq F = vq.c("mco.reset.world.inspiration");
   private final ffl G;
   private final eto H;
   private final vq I;
   private final int J;
   private final vq K;
   private static final aiy L = new aiy("textures/gui/realms/upload.png");
   private static final aiy M = new aiy("textures/gui/realms/adventure.png");
   private static final aiy N = new aiy("textures/gui/realms/survival_spawn.png");
   private static final aiy O = new aiy("textures/gui/realms/new_world.png");
   private static final aiy P = new aiy("textures/gui/realms/experience.png");
   private static final aiy Q = new aiy("textures/gui/realms/inspiration.png");
   eug R;
   eug S;
   eug T;
   eug U;
   public final int b;
   @Nullable
   private final ewq V;
   private final Runnable W;
   private final fda X = new fda(this);

   private evm(ffl $$0, eto $$1, int $$2, vq $$3, vq $$4, int $$5, vq $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public evm(ffl $$0, eto $$1, int $$2, vq $$3, vq $$4, int $$5, vq $$6, @Nullable ewq $$7, Runnable $$8) {
      super($$3);
      this.G = $$0;
      this.H = $$1;
      this.b = $$2;
      this.I = $$4;
      this.J = $$5;
      this.K = $$6;
      this.V = $$7;
      this.W = $$8;
   }

   public static evm a(ffl $$0, eto $$1, ewq $$2, Runnable $$3) {
      return new evm($$0, $$1, $$1.n, v, w, -6250336, a, $$2, $$3);
   }

   public static evm a(ffl $$0, int $$1, eto $$2, Runnable $$3) {
      return new evm($$0, $$2, $$1, x, y, -6250336, a, $$3);
   }

   public static evm a(ffl $$0, eto $$1, Runnable $$2) {
      return new evm($$0, $$1, $$1.n, z, A, -65536, B, $$2);
   }

   @Override
   public void aQ_() {
      fde $$0 = this.X.a(fde.d());
      $$0.c().a(9 / 3);
      $$0.a(new fav(this.e, this.i), fdd::b);
      $$0.a(new fav(this.I, this.i).b(this.J), fdd::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            esx $$0 = esx.a();

            try {
               eug $$1 = $$0.a(1, 10, eto.d.a);
               eug $$2 = $$0.a(1, 10, eto.d.c);
               eug $$3 = $$0.a(1, 10, eto.d.d);
               eug $$4 = $$0.a(1, 10, eto.d.e);
               evm.this.f.execute(() -> {
                  evm.this.R = $$1;
                  evm.this.S = $$2;
                  evm.this.T = $$3;
                  evm.this.U = $$4;
               });
            } catch (euk var6) {
               evm.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fcz $$1 = this.X.c(new fcz());
      fcz.b $$2 = $$1.d(3);
      $$2.c().a(16);
      $$2.a(new evm.a(evl.a, O, $$0x -> this.f.a(new evl(this::a, this.e))));
      $$2.a(new evm.a(evn.a, L, $$0x -> this.f.a(new evn(this.V, this.H.a, this.b, this))));
      $$2.a(new evm.a(C, N, $$0x -> this.f.a(new evo(C, this::a, eto.d.a, this.R))));
      $$2.a(new evm.a(D, M, $$0x -> this.f.a(new evo(D, this::a, eto.d.c, this.S))));
      $$2.a(new evm.a(E, P, $$0x -> this.f.a(new evo(E, this::a, eto.d.d, this.T))));
      $$2.a(new evm.a(F, Q, $$0x -> this.f.a(new evo(F, this::a, eto.d.e, this.U))));
      this.X.b(ezo.a(vp.k, $$0x -> this.d()).a());
      this.X.a($$1x -> {
         ezm var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.X.a();
   }

   @Override
   public vq i() {
      return vp.a(this.p(), this.I);
   }

   @Override
   public void d() {
      this.f.a(this.G);
   }

   private void a(@Nullable euf $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new ews($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(@Nullable ewh $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new ewr($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(ewo $$0) {
      List<ewo> $$1 = new ArrayList<>();
      if (this.V != null) {
         $$1.add(this.V);
      }

      if (this.b != this.H.n) {
         $$1.add(new eww(this.H.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new eve(this.G, $$1.toArray(new ewo[0])));
   }

   class a extends ezo {
      private static final aiy b = new aiy("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int t = 56;
      private final aiy u;

      a(vq $$0, aiy $$1, ezo.c $$2) {
         super(0, 0, 60, 60, $$0, $$2, p);
         this.u = $$1;
      }

      @Override
      public void b(ezb $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.z();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.B();
         int $$6 = this.C();
         $$0.a(this.u, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(evm.this.i, this.x(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
