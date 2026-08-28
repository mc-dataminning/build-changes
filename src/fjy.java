import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fjy extends hhp {
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
   private final ftr O;
   private final fic P;
   private final xv Q;
   private final int R;
   private final xv S;
   private static final alz T = alz.b("textures/gui/realms/upload.png");
   private static final alz U = alz.b("textures/gui/realms/adventure.png");
   private static final alz V = alz.b("textures/gui/realms/survival_spawn.png");
   private static final alz W = alz.b("textures/gui/realms/new_world.png");
   private static final alz X = alz.b("textures/gui/realms/experience.png");
   private static final alz Y = alz.b("textures/gui/realms/inspiration.png");
   fit Z;
   fit aa;
   fit ab;
   fit ac;
   public final int b;
   @Nullable
   private final fla ad;
   private final Runnable ae;
   private final frn af = new frn(this);

   private fjy(ftr $$0, fic $$1, int $$2, xv $$3, xv $$4, int $$5, xv $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fjy(ftr $$0, fic $$1, int $$2, xv $$3, xv $$4, int $$5, xv $$6, @Nullable fla $$7, Runnable $$8) {
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

   public static fjy a(ftr $$0, fic $$1, fla $$2, Runnable $$3) {
      return new fjy($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static fjy a(ftr $$0, int $$1, fic $$2, Runnable $$3) {
      return new fjy($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static fjy a(ftr $$0, fic $$1, Runnable $$2) {
      return new fjy($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aT_() {
      frr $$0 = this.af.a(frr.d());
      $$0.c().a(9 / 3);
      $$0.a(new fpg(this.l, this.p), frq::b);
      $$0.a(new fpg(this.Q, this.p).b(this.R), frq::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fhb $$0 = fhb.a();

            try {
               fit $$1 = $$0.a(1, 10, fic.d.a);
               fit $$2 = $$0.a(1, 10, fic.d.c);
               fit $$3 = $$0.a(1, 10, fic.d.d);
               fit $$4 = $$0.a(1, 10, fic.d.e);
               fjy.this.m.execute(() -> {
                  fjy.this.Z = $$1;
                  fjy.this.aa = $$2;
                  fjy.this.ab = $$3;
                  fjy.this.ac = $$4;
               });
            } catch (fix var6) {
               fjy.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      frm $$1 = this.af.c(new frm());
      frm.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fjy.a(this.m.h, G, W, $$0x -> fhh.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new fjy.a(this.m.h, fjz.a, T, $$0x -> this.m.a(new fjz(this.ad, this.P.a, this.b, this))));
      $$2.a(new fjy.a(this.m.h, K, V, $$0x -> this.m.a(new fka(K, this::a, fic.d.a, this.Z))));
      $$2.a(frs.b(16), 3);
      $$2.a(new fjy.a(this.m.h, L, U, $$0x -> this.m.a(new fka(L, this::a, fic.d.c, this.aa))));
      $$2.a(new fjy.a(this.m.h, M, X, $$0x -> this.m.a(new fka(M, this::a, fic.d.d, this.ab))));
      $$2.a(new fjy.a(this.m.h, N, Y, $$0x -> this.m.a(new fka(N, this::a, fic.d.e, this.ac))));
      this.af.b(fny.a(xu.k, $$0x -> this.aP_()).a());
      this.af.a($$1x -> {
         fnw var10000 = this.c($$1x);
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

   private void a(@Nullable fis $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new flb($$0, this.P.a, this.S, this.ae));
      }

      fgw.g();
   }

   private void a(fky $$0) {
      List<fky> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new flf(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fjr(this.O, $$1.toArray(new fky[0])));
   }

   class a extends fny {
      private static final alz b = alz.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final alz v;

      a(final fnj $$0, final xv $$1, final alz $$2, final fny.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fnl $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         int $$5 = -1;
         if ($$4) {
            $$5 = ayp.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.D();
         int $$7 = this.E();
         $$0.a(glo::B, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(glo::B, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(fjy.this.p, this.z(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
