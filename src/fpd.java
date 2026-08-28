import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpd extends hro {
   static final Logger c = LogUtils.getLogger();
   private static final xc C = xc.c("mco.selectServer.create");
   private static final xc D = xc.c("mco.selectServer.create.subtitle");
   private static final xc E = xc.c("mco.configure.world.switch.slot");
   private static final xc F = xc.c("mco.configure.world.switch.slot.subtitle");
   private static final xc G = xc.c("mco.reset.world.generate");
   private static final xc H = xc.c("mco.reset.world.title");
   private static final xc I = xc.c("mco.reset.world.warning");
   public static final xc a = xc.c("mco.create.world.reset.title");
   private static final xc J = xc.c("mco.reset.world.resetting.screen.title");
   private static final xc K = xc.c("mco.reset.world.template");
   private static final xc L = xc.c("mco.reset.world.adventure");
   private static final xc M = xc.c("mco.reset.world.experience");
   private static final xc N = xc.c("mco.reset.world.inspiration");
   private final gaf O;
   private final fng P;
   private final xc Q;
   private final int R;
   private final xc S;
   private static final alk T = alk.b("textures/gui/realms/upload.png");
   private static final alk U = alk.b("textures/gui/realms/adventure.png");
   private static final alk V = alk.b("textures/gui/realms/survival_spawn.png");
   private static final alk W = alk.b("textures/gui/realms/new_world.png");
   private static final alk X = alk.b("textures/gui/realms/experience.png");
   private static final alk Y = alk.b("textures/gui/realms/inspiration.png");
   fnx Z;
   fnx aa;
   fnx ab;
   fnx ac;
   public final int b;
   @Nullable
   private final fqf ad;
   private final Runnable ae;
   private final fyb af = new fyb(this);

   private fpd(gaf $$0, fng $$1, int $$2, xc $$3, xc $$4, int $$5, xc $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fpd(gaf $$0, fng $$1, int $$2, xc $$3, xc $$4, int $$5, xc $$6, @Nullable fqf $$7, Runnable $$8) {
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

   public static fpd a(gaf $$0, fng $$1, fqf $$2, Runnable $$3) {
      return new fpd($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fpd a(gaf $$0, int $$1, fng $$2, Runnable $$3) {
      return new fpd($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fpd a(gaf $$0, fng $$1, Runnable $$2) {
      return new fpd($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aS_() {
      fyf $$0 = this.af.a(fyf.d());
      $$0.c().a(9 / 3);
      $$0.a(new fvu(this.l, this.p), fye::b);
      $$0.a(new fvu(this.Q, this.p).b(this.R), fye::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fmf $$0 = fmf.a();

            try {
               fnx $$1 = $$0.a(1, 10, fng.d.a);
               fnx $$2 = $$0.a(1, 10, fng.d.c);
               fnx $$3 = $$0.a(1, 10, fng.d.d);
               fnx $$4 = $$0.a(1, 10, fng.d.e);
               fpd.this.m.execute(() -> {
                  fpd.this.Z = $$1;
                  fpd.this.aa = $$2;
                  fpd.this.ab = $$3;
                  fpd.this.ac = $$4;
               });
            } catch (fob var6) {
               fpd.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fya $$1 = this.af.c(new fya());
      fya.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fpd.a(this.m.h, G, W, $$0x -> fml.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fpd.a(this.m.h, fpe.a, T, $$0x -> this.m.a(new fpe(this.ad, this.P.a, this.b, this))));
      $$2.a(new fpd.a(this.m.h, K, V, $$0x -> this.m.a(new fpf(K, this::a, fng.d.a, this.Z))));
      $$2.a(fyg.b(16), 3);
      $$2.a(new fpd.a(this.m.h, L, U, $$0x -> this.m.a(new fpf(L, this::a, fng.d.c, this.aa))));
      $$2.a(new fpd.a(this.m.h, M, X, $$0x -> this.m.a(new fpf(M, this::a, fng.d.d, this.ab))));
      $$2.a(new fpd.a(this.m.h, N, Y, $$0x -> this.m.a(new fpf(N, this::a, fng.d.e, this.ac))));
      this.af.b(fun.a(xb.k, $$0x -> this.aP_()).a());
      this.af.a($$1x -> {
         ful var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public xc i() {
      return xb.a(this.n(), this.Q);
   }

   @Override
   public void aP_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fnw $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fqg($$0, this.P.a, this.S, this.ae));
      }

      fma.g();
   }

   private void a(fqd $$0) {
      List<fqd> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fqk(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fow(this.O, $$1.toArray(new fqd[0])));
   }

   class a extends fun {
      private static final alk b = alk.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alk v;

      a(final ftx $$0, final xc $$1, final alk $$2, final fun.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(ftz $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = aya.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gsn::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gsn::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fpd.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
