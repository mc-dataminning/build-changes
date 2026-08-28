import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fke extends hmd {
   static final Logger c = LogUtils.getLogger();
   private static final wp C = wp.c("mco.selectServer.create");
   private static final wp D = wp.c("mco.selectServer.create.subtitle");
   private static final wp E = wp.c("mco.configure.world.switch.slot");
   private static final wp F = wp.c("mco.configure.world.switch.slot.subtitle");
   private static final wp G = wp.c("mco.reset.world.generate");
   private static final wp H = wp.c("mco.reset.world.title");
   private static final wp I = wp.c("mco.reset.world.warning");
   public static final wp a = wp.c("mco.create.world.reset.title");
   private static final wp J = wp.c("mco.reset.world.resetting.screen.title");
   private static final wp K = wp.c("mco.reset.world.template");
   private static final wp L = wp.c("mco.reset.world.adventure");
   private static final wp M = wp.c("mco.reset.world.experience");
   private static final wp N = wp.c("mco.reset.world.inspiration");
   private final fvi O;
   private final fii P;
   private final wp Q;
   private final int R;
   private final wp S;
   private static final aku T = aku.b("textures/gui/realms/upload.png");
   private static final aku U = aku.b("textures/gui/realms/adventure.png");
   private static final aku V = aku.b("textures/gui/realms/survival_spawn.png");
   private static final aku W = aku.b("textures/gui/realms/new_world.png");
   private static final aku X = aku.b("textures/gui/realms/experience.png");
   private static final aku Y = aku.b("textures/gui/realms/inspiration.png");
   fiz Z;
   fiz aa;
   fiz ab;
   fiz ac;
   public final int b;
   @Nullable
   private final flg ad;
   private final Runnable ae;
   private final fte af = new fte(this);

   private fke(fvi $$0, fii $$1, int $$2, wp $$3, wp $$4, int $$5, wp $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fke(fvi $$0, fii $$1, int $$2, wp $$3, wp $$4, int $$5, wp $$6, @Nullable flg $$7, Runnable $$8) {
      super($$3);
      this.O = $$0;
      this.P = $$1;
      this.b = $$2;
      this.Q = $$4;
      this.R = $$5;
      this.S = $$6;
      this.ad = $$7;
      this.ae = $$8;
   }

   public static fke a(fvi $$0, fii $$1, flg $$2, Runnable $$3) {
      return new fke($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fke a(fvi $$0, int $$1, fii $$2, Runnable $$3) {
      return new fke($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fke a(fvi $$0, fii $$1, Runnable $$2) {
      return new fke($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aR_() {
      fti $$0 = this.af.a(fti.d());
      $$0.c().a(9 / 3);
      $$0.a(new fqx(this.l, this.p), fth::b);
      $$0.a(new fqx(this.Q, this.p).b(this.R), fth::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fhh $$0 = fhh.a();

            try {
               fiz $$1 = $$0.a(1, 10, fii.d.a);
               fiz $$2 = $$0.a(1, 10, fii.d.c);
               fiz $$3 = $$0.a(1, 10, fii.d.d);
               fiz $$4 = $$0.a(1, 10, fii.d.e);
               fke.this.m.execute(() -> {
                  fke.this.Z = $$1;
                  fke.this.aa = $$2;
                  fke.this.ab = $$3;
                  fke.this.ac = $$4;
               });
            } catch (fjd var6) {
               fke.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      ftd $$1 = this.af.c(new ftd());
      ftd.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fke.a(this.m.h, G, W, $$0x -> fhn.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fke.a(this.m.h, fkf.a, T, $$0x -> this.m.a(new fkf(this.ad, this.P.a, this.b, this))));
      $$2.a(new fke.a(this.m.h, K, V, $$0x -> this.m.a(new fkg(K, this::a, fii.d.a, this.Z))));
      $$2.a(ftj.b(16), 3);
      $$2.a(new fke.a(this.m.h, L, U, $$0x -> this.m.a(new fkg(L, this::a, fii.d.c, this.aa))));
      $$2.a(new fke.a(this.m.h, M, X, $$0x -> this.m.a(new fkg(M, this::a, fii.d.d, this.ab))));
      $$2.a(new fke.a(this.m.h, N, Y, $$0x -> this.m.a(new fkg(N, this::a, fii.d.e, this.ac))));
      this.af.b(fpq.a(wo.k, $$0x -> this.aO_()).a());
      this.af.a($$1x -> {
         fpo var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public wp i() {
      return wo.a(this.n(), this.Q);
   }

   @Override
   public void aO_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fiy $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new flh($$0, this.P.a, this.S, this.ae));
      }

      fhc.g();
   }

   private void a(fle $$0) {
      List<fle> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fll(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fjx(this.O, $$1.toArray(new fle[0])));
   }

   class a extends fpq {
      private static final aku b = aku.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final aku v;

      a(final fpa $$0, final wp $$1, final aku $$2, final fpq.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fpc $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axk.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gnh::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gnh::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fke.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
