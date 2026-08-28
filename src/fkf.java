import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fkf extends hhw {
   static final Logger c = LogUtils.getLogger();
   private static final xv C = xv.c("mco.selectServer.create");
   private static final xv D = xv.c("mco.selectServer.create.subtitle");
   private static final xv E = xv.c("mco.configure.world.switch.slot");
   private static final xv F = xv.c("mco.configure.world.switch.slot.subtitle");
   private static final xv G = xv.c("mco.reset.world.generate");
   private static final xv H = xv.c("mco.reset.world.title");
   private static final xv I = xv.c("mco.reset.world.warning");
   public static final xv a = xv.c("mco.create.world.reset.title");
   private static final xv J = xv.c("mco.reset.world.resetting.screen.title");
   private static final xv K = xv.c("mco.reset.world.template");
   private static final xv L = xv.c("mco.reset.world.adventure");
   private static final xv M = xv.c("mco.reset.world.experience");
   private static final xv N = xv.c("mco.reset.world.inspiration");
   private final fty O;
   private final fij P;
   private final xv Q;
   private final int R;
   private final xv S;
   private static final alz T = alz.b("textures/gui/realms/upload.png");
   private static final alz U = alz.b("textures/gui/realms/adventure.png");
   private static final alz V = alz.b("textures/gui/realms/survival_spawn.png");
   private static final alz W = alz.b("textures/gui/realms/new_world.png");
   private static final alz X = alz.b("textures/gui/realms/experience.png");
   private static final alz Y = alz.b("textures/gui/realms/inspiration.png");
   fja Z;
   fja aa;
   fja ab;
   fja ac;
   public final int b;
   @Nullable
   private final flh ad;
   private final Runnable ae;
   private final fru af = new fru(this);

   private fkf(fty $$0, fij $$1, int $$2, xv $$3, xv $$4, int $$5, xv $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fkf(fty $$0, fij $$1, int $$2, xv $$3, xv $$4, int $$5, xv $$6, @Nullable flh $$7, Runnable $$8) {
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

   public static fkf a(fty $$0, fij $$1, flh $$2, Runnable $$3) {
      return new fkf($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fkf a(fty $$0, int $$1, fij $$2, Runnable $$3) {
      return new fkf($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fkf a(fty $$0, fij $$1, Runnable $$2) {
      return new fkf($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aT_() {
      fry $$0 = this.af.a(fry.d());
      $$0.c().a(9 / 3);
      $$0.a(new fpn(this.l, this.p), frx::b);
      $$0.a(new fpn(this.Q, this.p).b(this.R), frx::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fhi $$0 = fhi.a();

            try {
               fja $$1 = $$0.a(1, 10, fij.d.a);
               fja $$2 = $$0.a(1, 10, fij.d.c);
               fja $$3 = $$0.a(1, 10, fij.d.d);
               fja $$4 = $$0.a(1, 10, fij.d.e);
               fkf.this.m.execute(() -> {
                  fkf.this.Z = $$1;
                  fkf.this.aa = $$2;
                  fkf.this.ab = $$3;
                  fkf.this.ac = $$4;
               });
            } catch (fje var6) {
               fkf.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      frt $$1 = this.af.c(new frt());
      frt.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fkf.a(this.m.h, G, W, $$0x -> fho.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fkf.a(this.m.h, fkg.a, T, $$0x -> this.m.a(new fkg(this.ad, this.P.a, this.b, this))));
      $$2.a(new fkf.a(this.m.h, K, V, $$0x -> this.m.a(new fkh(K, this::a, fij.d.a, this.Z))));
      $$2.a(frz.b(16), 3);
      $$2.a(new fkf.a(this.m.h, L, U, $$0x -> this.m.a(new fkh(L, this::a, fij.d.c, this.aa))));
      $$2.a(new fkf.a(this.m.h, M, X, $$0x -> this.m.a(new fkh(M, this::a, fij.d.d, this.ab))));
      $$2.a(new fkf.a(this.m.h, N, Y, $$0x -> this.m.a(new fkh(N, this::a, fij.d.e, this.ac))));
      this.af.b(fof.a(xu.k, $$0x -> this.aP_()).a());
      this.af.a($$1x -> {
         fod var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public xv i() {
      return xu.a(this.m(), this.Q);
   }

   @Override
   public void aP_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fiz $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fli($$0, this.P.a, this.S, this.ae));
      }

      fhd.g();
   }

   private void a(flf $$0) {
      List<flf> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new flm(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fjy(this.O, $$1.toArray(new flf[0])));
   }

   class a extends fof {
      private static final alz b = alz.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alz v;

      a(final fnq $$0, final xv $$1, final alz $$2, final fof.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fns $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = ayp.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(glv::C, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(glv::C, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fkf.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
