import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class exg extends gpe {
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
   private final fhh G;
   private final evi H;
   private final vu I;
   private final int J;
   private final vu K;
   private static final ajh L = new ajh("textures/gui/realms/upload.png");
   private static final ajh M = new ajh("textures/gui/realms/adventure.png");
   private static final ajh N = new ajh("textures/gui/realms/survival_spawn.png");
   private static final ajh O = new ajh("textures/gui/realms/new_world.png");
   private static final ajh P = new ajh("textures/gui/realms/experience.png");
   private static final ajh Q = new ajh("textures/gui/realms/inspiration.png");
   ewa R;
   ewa S;
   ewa T;
   ewa U;
   public final int b;
   @Nullable
   private final eyk V;
   private final Runnable W;
   private final fev X = new fev(this);

   private exg(fhh $$0, evi $$1, int $$2, vu $$3, vu $$4, int $$5, vu $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public exg(fhh $$0, evi $$1, int $$2, vu $$3, vu $$4, int $$5, vu $$6, @Nullable eyk $$7, Runnable $$8) {
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

   public static exg a(fhh $$0, evi $$1, eyk $$2, Runnable $$3) {
      return new exg($$0, $$1, $$1.n, v, w, -6250336, a, $$2, $$3);
   }

   public static exg a(fhh $$0, int $$1, evi $$2, Runnable $$3) {
      return new exg($$0, $$2, $$1, x, y, -6250336, a, $$3);
   }

   public static exg a(fhh $$0, evi $$1, Runnable $$2) {
      return new exg($$0, $$1, $$1.n, z, A, -65536, B, $$2);
   }

   @Override
   public void aO_() {
      fez $$0 = this.X.a(fez.d());
      $$0.c().a(9 / 3);
      $$0.a(new fcp(this.e, this.i), fey::b);
      $$0.a(new fcp(this.I, this.i).b(this.J), fey::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eur $$0 = eur.a();

            try {
               ewa $$1 = $$0.a(1, 10, evi.d.a);
               ewa $$2 = $$0.a(1, 10, evi.d.c);
               ewa $$3 = $$0.a(1, 10, evi.d.d);
               ewa $$4 = $$0.a(1, 10, evi.d.e);
               exg.this.f.execute(() -> {
                  exg.this.R = $$1;
                  exg.this.S = $$2;
                  exg.this.T = $$3;
                  exg.this.U = $$4;
               });
            } catch (ewe var6) {
               exg.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      feu $$1 = this.X.c(new feu());
      feu.b $$2 = $$1.d(3);
      $$2.c().a(16);
      $$2.a(new exg.a(exf.a, O, $$0x -> this.f.a(new exf(this::a, this.e))));
      $$2.a(new exg.a(exh.a, L, $$0x -> this.f.a(new exh(this.V, this.H.a, this.b, this))));
      $$2.a(new exg.a(C, N, $$0x -> this.f.a(new exi(C, this::a, evi.d.a, this.R))));
      $$2.a(new exg.a(D, M, $$0x -> this.f.a(new exi(D, this::a, evi.d.c, this.S))));
      $$2.a(new exg.a(E, P, $$0x -> this.f.a(new exi(E, this::a, evi.d.d, this.T))));
      $$2.a(new exg.a(F, Q, $$0x -> this.f.a(new exi(F, this::a, evi.d.e, this.U))));
      this.X.b(fbi.a(vt.k, $$0x -> this.d()).a());
      this.X.a($$1x -> {
         fbg var10000 = this.c($$1x);
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

   private void a(@Nullable evz $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new eym($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(@Nullable eyb $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new eyl($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(eyi $$0) {
      List<eyi> $$1 = new ArrayList<>();
      if (this.V != null) {
         $$1.add(this.V);
      }

      if (this.b != this.H.n) {
         $$1.add(new eyq(this.H.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new ewy(this.G, $$1.toArray(new eyi[0])));
   }

   class a extends fbi {
      private static final ajh b = new ajh("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int t = 56;
      private final ajh u;

      a(vu $$0, ajh $$1, fbi.c $$2) {
         super(0, 0, 60, 60, $$0, $$2, p);
         this.u = $$1;
      }

      @Override
      public void b(fav $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(exg.this.i, this.x(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
