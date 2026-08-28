import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjf extends hky {
   static final Logger c = LogUtils.getLogger();
   private static final wo C = wo.c("mco.selectServer.create");
   private static final wo D = wo.c("mco.selectServer.create.subtitle");
   private static final wo E = wo.c("mco.configure.world.switch.slot");
   private static final wo F = wo.c("mco.configure.world.switch.slot.subtitle");
   private static final wo G = wo.c("mco.reset.world.generate");
   private static final wo H = wo.c("mco.reset.world.title");
   private static final wo I = wo.c("mco.reset.world.warning");
   public static final wo a = wo.c("mco.create.world.reset.title");
   private static final wo J = wo.c("mco.reset.world.resetting.screen.title");
   private static final wo K = wo.c("mco.reset.world.template");
   private static final wo L = wo.c("mco.reset.world.adventure");
   private static final wo M = wo.c("mco.reset.world.experience");
   private static final wo N = wo.c("mco.reset.world.inspiration");
   private final fui O;
   private final fhj P;
   private final wo Q;
   private final int R;
   private final wo S;
   private static final aku T = aku.b("textures/gui/realms/upload.png");
   private static final aku U = aku.b("textures/gui/realms/adventure.png");
   private static final aku V = aku.b("textures/gui/realms/survival_spawn.png");
   private static final aku W = aku.b("textures/gui/realms/new_world.png");
   private static final aku X = aku.b("textures/gui/realms/experience.png");
   private static final aku Y = aku.b("textures/gui/realms/inspiration.png");
   fia Z;
   fia aa;
   fia ab;
   fia ac;
   public final int b;
   @Nullable
   private final fkh ad;
   private final Runnable ae;
   private final fse af = new fse(this);

   private fjf(fui $$0, fhj $$1, int $$2, wo $$3, wo $$4, int $$5, wo $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fjf(fui $$0, fhj $$1, int $$2, wo $$3, wo $$4, int $$5, wo $$6, @Nullable fkh $$7, Runnable $$8) {
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

   public static fjf a(fui $$0, fhj $$1, fkh $$2, Runnable $$3) {
      return new fjf($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fjf a(fui $$0, int $$1, fhj $$2, Runnable $$3) {
      return new fjf($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fjf a(fui $$0, fhj $$1, Runnable $$2) {
      return new fjf($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aR_() {
      fsi $$0 = this.af.a(fsi.d());
      $$0.c().a(9 / 3);
      $$0.a(new fpx(this.l, this.p), fsh::b);
      $$0.a(new fpx(this.Q, this.p).b(this.R), fsh::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fgi $$0 = fgi.a();

            try {
               fia $$1 = $$0.a(1, 10, fhj.d.a);
               fia $$2 = $$0.a(1, 10, fhj.d.c);
               fia $$3 = $$0.a(1, 10, fhj.d.d);
               fia $$4 = $$0.a(1, 10, fhj.d.e);
               fjf.this.m.execute(() -> {
                  fjf.this.Z = $$1;
                  fjf.this.aa = $$2;
                  fjf.this.ab = $$3;
                  fjf.this.ac = $$4;
               });
            } catch (fie var6) {
               fjf.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fsd $$1 = this.af.c(new fsd());
      fsd.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fjf.a(this.m.h, G, W, $$0x -> fgo.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fjf.a(this.m.h, fjg.a, T, $$0x -> this.m.a(new fjg(this.ad, this.P.a, this.b, this))));
      $$2.a(new fjf.a(this.m.h, K, V, $$0x -> this.m.a(new fjh(K, this::a, fhj.d.a, this.Z))));
      $$2.a(fsj.b(16), 3);
      $$2.a(new fjf.a(this.m.h, L, U, $$0x -> this.m.a(new fjh(L, this::a, fhj.d.c, this.aa))));
      $$2.a(new fjf.a(this.m.h, M, X, $$0x -> this.m.a(new fjh(M, this::a, fhj.d.d, this.ab))));
      $$2.a(new fjf.a(this.m.h, N, Y, $$0x -> this.m.a(new fjh(N, this::a, fhj.d.e, this.ac))));
      this.af.b(fop.a(wn.k, $$0x -> this.aO_()).a());
      this.af.a($$1x -> {
         fon var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public wo i() {
      return wn.a(this.n(), this.Q);
   }

   @Override
   public void aO_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fhz $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fki($$0, this.P.a, this.S, this.ae));
      }

      fgd.g();
   }

   private void a(fkf $$0) {
      List<fkf> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fkm(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fiy(this.O, $$1.toArray(new fkf[0])));
   }

   class a extends fop {
      private static final aku b = aku.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final aku v;

      a(final fnz $$0, final wo $$1, final aku $$2, final fop.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fob $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axj.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(gmf::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(gmf::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fjf.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
