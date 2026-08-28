import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fid extends hfq {
   static final Logger c = LogUtils.getLogger();
   private static final xj B = xj.c("mco.selectServer.create");
   private static final xj C = xj.c("mco.selectServer.create.subtitle");
   private static final xj D = xj.c("mco.configure.world.switch.slot");
   private static final xj E = xj.c("mco.configure.world.switch.slot.subtitle");
   private static final xj F = xj.c("mco.reset.world.generate");
   private static final xj G = xj.c("mco.reset.world.title");
   private static final xj H = xj.c("mco.reset.world.warning");
   public static final xj a = xj.c("mco.create.world.reset.title");
   private static final xj I = xj.c("mco.reset.world.resetting.screen.title");
   private static final xj J = xj.c("mco.reset.world.template");
   private static final xj K = xj.c("mco.reset.world.adventure");
   private static final xj L = xj.c("mco.reset.world.experience");
   private static final xj M = xj.c("mco.reset.world.inspiration");
   private final frw N;
   private final fgi O;
   private final xj P;
   private final int Q;
   private final xj R;
   private static final alj S = alj.b("textures/gui/realms/upload.png");
   private static final alj T = alj.b("textures/gui/realms/adventure.png");
   private static final alj U = alj.b("textures/gui/realms/survival_spawn.png");
   private static final alj V = alj.b("textures/gui/realms/new_world.png");
   private static final alj W = alj.b("textures/gui/realms/experience.png");
   private static final alj X = alj.b("textures/gui/realms/inspiration.png");
   fgy Y;
   fgy Z;
   fgy aa;
   fgy ab;
   public final int b;
   @Nullable
   private final fjf ac;
   private final Runnable ad;
   private final fps ae = new fps(this);

   private fid(frw $$0, fgi $$1, int $$2, xj $$3, xj $$4, int $$5, xj $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fid(frw $$0, fgi $$1, int $$2, xj $$3, xj $$4, int $$5, xj $$6, @Nullable fjf $$7, Runnable $$8) {
      super($$3);
      this.N = $$0;
      this.O = $$1;
      this.b = $$2;
      this.P = $$4;
      this.Q = $$5;
      this.R = $$6;
      this.ac = $$7;
      this.ad = $$8;
   }

   public static fid a(frw $$0, fgi $$1, fjf $$2, Runnable $$3) {
      return new fid($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fid a(frw $$0, int $$1, fgi $$2, Runnable $$3) {
      return new fid($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fid a(frw $$0, fgi $$1, Runnable $$2) {
      return new fid($$0, $$1, $$1.n, G, H, -65536, I, $$2);
   }

   @Override
   public void aR_() {
      fpw $$0 = this.ae.a(fpw.d());
      $$0.c().a(9 / 3);
      $$0.a(new fnk(this.l, this.p), fpv::b);
      $$0.a(new fnk(this.P, this.p).b(this.Q), fpv::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            ffh $$0 = ffh.a();

            try {
               fgy $$1 = $$0.a(1, 10, fgi.d.a);
               fgy $$2 = $$0.a(1, 10, fgi.d.c);
               fgy $$3 = $$0.a(1, 10, fgi.d.d);
               fgy $$4 = $$0.a(1, 10, fgi.d.e);
               fid.this.m.execute(() -> {
                  fid.this.Y = $$1;
                  fid.this.Z = $$2;
                  fid.this.aa = $$3;
                  fid.this.ab = $$4;
               });
            } catch (fhc var6) {
               fid.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fpr $$1 = this.ae.c(new fpr());
      fpr.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fid.a(this.m.h, F, V, $$0x -> ffn.a(this.m, this.N, this, this.b, this.O, this.ac)));
      $$2.a(new fid.a(this.m.h, fie.a, S, $$0x -> this.m.a(new fie(this.ac, this.O.a, this.b, this))));
      $$2.a(new fid.a(this.m.h, J, U, $$0x -> this.m.a(new fif(J, this::a, fgi.d.a, this.Y))));
      $$2.a(fpx.b(16), 3);
      $$2.a(new fid.a(this.m.h, K, T, $$0x -> this.m.a(new fif(K, this::a, fgi.d.c, this.Z))));
      $$2.a(new fid.a(this.m.h, L, W, $$0x -> this.m.a(new fif(L, this::a, fgi.d.d, this.aa))));
      $$2.a(new fid.a(this.m.h, M, X, $$0x -> this.m.a(new fif(M, this::a, fgi.d.e, this.ab))));
      this.ae.b(fmd.a(xi.k, $$0x -> this.aO_()).a());
      this.ae.a($$1x -> {
         fmb var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ae.a();
   }

   @Override
   public xj i() {
      return xi.a(this.n(), this.P);
   }

   @Override
   public void aO_() {
      this.m.a(this.N);
   }

   private void a(@Nullable fgx $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fjg($$0, this.O.a, this.R, this.ad));
      }
   }

   private void a(fjd $$0) {
      List<fjd> $$1 = new ArrayList<>();
      if (this.ac != null) {
         $$1.add(this.ac);
      }

      if (this.b != this.O.n) {
         $$1.add(new fjk(this.O.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fhw(this.N, $$1.toArray(new fjd[0])));
   }

   class a extends fmd {
      private static final alj b = alj.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alj v;

      a(final flo $$0, final xj $$1, final alj $$2, final fmd.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(flq $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = axx.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(gjq::B, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gjq::B, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fid.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
