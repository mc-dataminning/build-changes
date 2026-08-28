import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fji extends hlf {
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
   private final fum O;
   private final fhm P;
   private final wp Q;
   private final int R;
   private final wp S;
   private static final akv T = akv.b("textures/gui/realms/upload.png");
   private static final akv U = akv.b("textures/gui/realms/adventure.png");
   private static final akv V = akv.b("textures/gui/realms/survival_spawn.png");
   private static final akv W = akv.b("textures/gui/realms/new_world.png");
   private static final akv X = akv.b("textures/gui/realms/experience.png");
   private static final akv Y = akv.b("textures/gui/realms/inspiration.png");
   fid Z;
   fid aa;
   fid ab;
   fid ac;
   public final int b;
   @Nullable
   private final fkk ad;
   private final Runnable ae;
   private final fsi af = new fsi(this);

   private fji(fum $$0, fhm $$1, int $$2, wp $$3, wp $$4, int $$5, wp $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fji(fum $$0, fhm $$1, int $$2, wp $$3, wp $$4, int $$5, wp $$6, @Nullable fkk $$7, Runnable $$8) {
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

   public static fji a(fum $$0, fhm $$1, fkk $$2, Runnable $$3) {
      return new fji($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fji a(fum $$0, int $$1, fhm $$2, Runnable $$3) {
      return new fji($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fji a(fum $$0, fhm $$1, Runnable $$2) {
      return new fji($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aR_() {
      fsm $$0 = this.af.a(fsm.d());
      $$0.c().a(9 / 3);
      $$0.a(new fqb(this.l, this.p), fsl::b);
      $$0.a(new fqb(this.Q, this.p).b(this.R), fsl::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fgl $$0 = fgl.a();

            try {
               fid $$1 = $$0.a(1, 10, fhm.d.a);
               fid $$2 = $$0.a(1, 10, fhm.d.c);
               fid $$3 = $$0.a(1, 10, fhm.d.d);
               fid $$4 = $$0.a(1, 10, fhm.d.e);
               fji.this.m.execute(() -> {
                  fji.this.Z = $$1;
                  fji.this.aa = $$2;
                  fji.this.ab = $$3;
                  fji.this.ac = $$4;
               });
            } catch (fih var6) {
               fji.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fsh $$1 = this.af.c(new fsh());
      fsh.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fji.a(this.m.h, G, W, $$0x -> fgr.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fji.a(this.m.h, fjj.a, T, $$0x -> this.m.a(new fjj(this.ad, this.P.a, this.b, this))));
      $$2.a(new fji.a(this.m.h, K, V, $$0x -> this.m.a(new fjk(K, this::a, fhm.d.a, this.Z))));
      $$2.a(fsn.b(16), 3);
      $$2.a(new fji.a(this.m.h, L, U, $$0x -> this.m.a(new fjk(L, this::a, fhm.d.c, this.aa))));
      $$2.a(new fji.a(this.m.h, M, X, $$0x -> this.m.a(new fjk(M, this::a, fhm.d.d, this.ab))));
      $$2.a(new fji.a(this.m.h, N, Y, $$0x -> this.m.a(new fjk(N, this::a, fhm.d.e, this.ac))));
      this.af.b(fou.a(wo.k, $$0x -> this.aO_()).a());
      this.af.a($$1x -> {
         fos var10000 = this.c($$1x);
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

   private void a(@Nullable fic $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fkl($$0, this.P.a, this.S, this.ae));
      }

      fgg.g();
   }

   private void a(fki $$0) {
      List<fki> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fkp(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fjb(this.O, $$1.toArray(new fki[0])));
   }

   class a extends fou {
      private static final akv b = akv.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akv v;

      a(final fod $$0, final wp $$1, final akv $$2, final fou.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fof $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axk.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gmj::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gmj::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fji.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
