import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class evf extends gmw {
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
   private final ffe G;
   private final eth H;
   private final vq I;
   private final int J;
   private final vq K;
   private static final aiy L = new aiy("textures/gui/realms/upload.png");
   private static final aiy M = new aiy("textures/gui/realms/adventure.png");
   private static final aiy N = new aiy("textures/gui/realms/survival_spawn.png");
   private static final aiy O = new aiy("textures/gui/realms/new_world.png");
   private static final aiy P = new aiy("textures/gui/realms/experience.png");
   private static final aiy Q = new aiy("textures/gui/realms/inspiration.png");
   etz R;
   etz S;
   etz T;
   etz U;
   public final int b;
   @Nullable
   private final ewj V;
   private final Runnable W;
   private final fct X = new fct(this);

   private evf(ffe $$0, eth $$1, int $$2, vq $$3, vq $$4, int $$5, vq $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public evf(ffe $$0, eth $$1, int $$2, vq $$3, vq $$4, int $$5, vq $$6, @Nullable ewj $$7, Runnable $$8) {
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

   public static evf a(ffe $$0, eth $$1, ewj $$2, Runnable $$3) {
      return new evf($$0, $$1, $$1.n, v, w, -6250336, a, $$2, $$3);
   }

   public static evf a(ffe $$0, int $$1, eth $$2, Runnable $$3) {
      return new evf($$0, $$2, $$1, x, y, -6250336, a, $$3);
   }

   public static evf a(ffe $$0, eth $$1, Runnable $$2) {
      return new evf($$0, $$1, $$1.n, z, A, -65536, B, $$2);
   }

   @Override
   public void aQ_() {
      fcx $$0 = this.X.a(fcx.d());
      $$0.c().a(9 / 3);
      $$0.a(new fao(this.e, this.i), fcw::b);
      $$0.a(new fao(this.I, this.i).b(this.J), fcw::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            esq $$0 = esq.a();

            try {
               etz $$1 = $$0.a(1, 10, eth.d.a);
               etz $$2 = $$0.a(1, 10, eth.d.c);
               etz $$3 = $$0.a(1, 10, eth.d.d);
               etz $$4 = $$0.a(1, 10, eth.d.e);
               evf.this.f.execute(() -> {
                  evf.this.R = $$1;
                  evf.this.S = $$2;
                  evf.this.T = $$3;
                  evf.this.U = $$4;
               });
            } catch (eud var6) {
               evf.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fcs $$1 = this.X.c(new fcs());
      fcs.b $$2 = $$1.d(3);
      $$2.c().a(16);
      $$2.a(new evf.a(eve.a, O, $$0x -> this.f.a(new eve(this::a, this.e))));
      $$2.a(new evf.a(evg.a, L, $$0x -> this.f.a(new evg(this.V, this.H.a, this.b, this))));
      $$2.a(new evf.a(C, N, $$0x -> this.f.a(new evh(C, this::a, eth.d.a, this.R))));
      $$2.a(new evf.a(D, M, $$0x -> this.f.a(new evh(D, this::a, eth.d.c, this.S))));
      $$2.a(new evf.a(E, P, $$0x -> this.f.a(new evh(E, this::a, eth.d.d, this.T))));
      $$2.a(new evf.a(F, Q, $$0x -> this.f.a(new evh(F, this::a, eth.d.e, this.U))));
      this.X.b(ezh.a(vp.k, $$0x -> this.d()).a());
      this.X.a($$1x -> {
         ezf var10000 = this.d($$1x);
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

   private void a(@Nullable ety $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new ewl($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(@Nullable ewa $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new ewk($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(ewh $$0) {
      List<ewh> $$1 = new ArrayList<>();
      if (this.V != null) {
         $$1.add(this.V);
      }

      if (this.b != this.H.n) {
         $$1.add(new ewp(this.H.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new eux(this.G, $$1.toArray(new ewh[0])));
   }

   class a extends ezh {
      private static final aiy b = new aiy("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int t = 56;
      private final aiy u;

      a(vq $$0, aiy $$1, ezh.c $$2) {
         super(0, 0, 60, 60, $$0, $$2, p);
         this.u = $$1;
      }

      @Override
      public void b(eyu $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(evf.this.i, this.x(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
