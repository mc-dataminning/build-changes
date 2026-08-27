import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exe extends gpb {
   static final Logger c = LogUtils.getLogger();
   private static final vu v = vu.c("mco.selectServer.create");
   private static final vu w = vu.c("mco.selectServer.create.subtitle");
   private static final vu x = vu.c("mco.configure.world.switch.slot");
   private static final vu y = vu.c("mco.configure.world.switch.slot.subtitle");
   private static final vu z = vu.c("mco.reset.world.title");
   private static final vu A = vu.c("mco.reset.world.warning");
   public static final vu a = vu.c("mco.create.world.reset.title");
   private static final vu B = vu.c("mco.reset.world.resetting.screen.title");
   private static final vu C = vu.c("mco.reset.world.template");
   private static final vu D = vu.c("mco.reset.world.adventure");
   private static final vu E = vu.c("mco.reset.world.experience");
   private static final vu F = vu.c("mco.reset.world.inspiration");
   private final fhf G;
   private final evg H;
   private final vu I;
   private final int J;
   private final vu K;
   private static final ajh L = new ajh("textures/gui/realms/upload.png");
   private static final ajh M = new ajh("textures/gui/realms/adventure.png");
   private static final ajh N = new ajh("textures/gui/realms/survival_spawn.png");
   private static final ajh O = new ajh("textures/gui/realms/new_world.png");
   private static final ajh P = new ajh("textures/gui/realms/experience.png");
   private static final ajh Q = new ajh("textures/gui/realms/inspiration.png");
   evy R;
   evy S;
   evy T;
   evy U;
   public final int b;
   @Nullable
   private final eyi V;
   private final Runnable W;
   private final fet X = new fet(this);

   private exe(fhf $$0, evg $$1, int $$2, vu $$3, vu $$4, int $$5, vu $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public exe(fhf $$0, evg $$1, int $$2, vu $$3, vu $$4, int $$5, vu $$6, @Nullable eyi $$7, Runnable $$8) {
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

   public static exe a(fhf $$0, evg $$1, eyi $$2, Runnable $$3) {
      return new exe($$0, $$1, $$1.n, v, w, -6250336, a, $$2, $$3);
   }

   public static exe a(fhf $$0, int $$1, evg $$2, Runnable $$3) {
      return new exe($$0, $$2, $$1, x, y, -6250336, a, $$3);
   }

   public static exe a(fhf $$0, evg $$1, Runnable $$2) {
      return new exe($$0, $$1, $$1.n, z, A, -65536, B, $$2);
   }

   @Override
   public void aO_() {
      fex $$0 = this.X.a(fex.d());
      $$0.c().a(9 / 3);
      $$0.a(new fcn(this.e, this.i), few::b);
      $$0.a(new fcn(this.I, this.i).b(this.J), few::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eup $$0 = eup.a();

            try {
               evy $$1 = $$0.a(1, 10, evg.d.a);
               evy $$2 = $$0.a(1, 10, evg.d.c);
               evy $$3 = $$0.a(1, 10, evg.d.d);
               evy $$4 = $$0.a(1, 10, evg.d.e);
               exe.this.f.execute(() -> {
                  exe.this.R = $$1;
                  exe.this.S = $$2;
                  exe.this.T = $$3;
                  exe.this.U = $$4;
               });
            } catch (ewc var6) {
               exe.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fes $$1 = this.X.c(new fes());
      fes.b $$2 = $$1.d(3);
      $$2.c().a(16);
      $$2.a(new exe.a(exd.a, O, $$0x -> this.f.a(new exd(this::a, this.e))));
      $$2.a(new exe.a(exf.a, L, $$0x -> this.f.a(new exf(this.V, this.H.a, this.b, this))));
      $$2.a(new exe.a(C, N, $$0x -> this.f.a(new exg(C, this::a, evg.d.a, this.R))));
      $$2.a(new exe.a(D, M, $$0x -> this.f.a(new exg(D, this::a, evg.d.c, this.S))));
      $$2.a(new exe.a(E, P, $$0x -> this.f.a(new exg(E, this::a, evg.d.d, this.T))));
      $$2.a(new exe.a(F, Q, $$0x -> this.f.a(new exg(F, this::a, evg.d.e, this.U))));
      this.X.b(fbg.a(vt.k, $$0x -> this.d()).a());
      this.X.a($$1x -> {
         fbe var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.X.a();
   }

   @Override
   public vu i() {
      return vt.a(this.p(), this.I);
   }

   @Override
   public void d() {
      this.f.a(this.G);
   }

   private void a(@Nullable evx $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new eyk($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(@Nullable exz $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new eyj($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(eyg $$0) {
      List<eyg> $$1 = new ArrayList<>();
      if (this.V != null) {
         $$1.add(this.V);
      }

      if (this.b != this.H.n) {
         $$1.add(new eyo(this.H.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new eww(this.G, $$1.toArray(new eyg[0])));
   }

   class a extends fbg {
      private static final ajh b = new ajh("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int t = 56;
      private final ajh u;

      a(vu $$0, ajh $$1, fbg.c $$2) {
         super(0, 0, 60, 60, $$0, $$2, p);
         this.u = $$1;
      }

      @Override
      public void b(fat $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(exe.this.i, this.x(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
