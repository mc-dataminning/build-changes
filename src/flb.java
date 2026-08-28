import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class flb extends hne {
   static final Logger c = LogUtils.getLogger();
   private static final wv C = wv.c("mco.selectServer.create");
   private static final wv D = wv.c("mco.selectServer.create.subtitle");
   private static final wv E = wv.c("mco.configure.world.switch.slot");
   private static final wv F = wv.c("mco.configure.world.switch.slot.subtitle");
   private static final wv G = wv.c("mco.reset.world.generate");
   private static final wv H = wv.c("mco.reset.world.title");
   private static final wv I = wv.c("mco.reset.world.warning");
   public static final wv a = wv.c("mco.create.world.reset.title");
   private static final wv J = wv.c("mco.reset.world.resetting.screen.title");
   private static final wv K = wv.c("mco.reset.world.template");
   private static final wv L = wv.c("mco.reset.world.adventure");
   private static final wv M = wv.c("mco.reset.world.experience");
   private static final wv N = wv.c("mco.reset.world.inspiration");
   private final fwf O;
   private final fjf P;
   private final wv Q;
   private final int R;
   private final wv S;
   private static final ald T = ald.b("textures/gui/realms/upload.png");
   private static final ald U = ald.b("textures/gui/realms/adventure.png");
   private static final ald V = ald.b("textures/gui/realms/survival_spawn.png");
   private static final ald W = ald.b("textures/gui/realms/new_world.png");
   private static final ald X = ald.b("textures/gui/realms/experience.png");
   private static final ald Y = ald.b("textures/gui/realms/inspiration.png");
   fjw Z;
   fjw aa;
   fjw ab;
   fjw ac;
   public final int b;
   @Nullable
   private final fmd ad;
   private final Runnable ae;
   private final fub af = new fub(this);

   private flb(fwf $$0, fjf $$1, int $$2, wv $$3, wv $$4, int $$5, wv $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public flb(fwf $$0, fjf $$1, int $$2, wv $$3, wv $$4, int $$5, wv $$6, @Nullable fmd $$7, Runnable $$8) {
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

   public static flb a(fwf $$0, fjf $$1, fmd $$2, Runnable $$3) {
      return new flb($$0, $$1, $$1.p, C, D, -6250336, a, $$2, $$3);
   }

   public static flb a(fwf $$0, int $$1, fjf $$2, Runnable $$3) {
      return new flb($$0, $$2, $$1, E, F, -6250336, a, $$3);
   }

   public static flb a(fwf $$0, fjf $$1, Runnable $$2) {
      return new flb($$0, $$1, $$1.p, H, I, -65536, J, $$2);
   }

   @Override
   public void aN_() {
      fuf $$0 = this.af.a(fuf.d());
      $$0.c().a(9 / 3);
      $$0.a(new fru(this.l, this.p), fue::b);
      $$0.a(new fru(this.Q, this.p).b(this.R), fue::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fie $$0 = fie.a();

            try {
               fjw $$1 = $$0.a(1, 10, fjf.d.a);
               fjw $$2 = $$0.a(1, 10, fjf.d.c);
               fjw $$3 = $$0.a(1, 10, fjf.d.d);
               fjw $$4 = $$0.a(1, 10, fjf.d.e);
               flb.this.m.execute(() -> {
                  flb.this.Z = $$1;
                  flb.this.aa = $$2;
                  flb.this.ab = $$3;
                  flb.this.ac = $$4;
               });
            } catch (fka var6) {
               flb.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fua $$1 = this.af.c(new fua());
      fua.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new flb.a(this.m.h, G, W, $$0x -> fik.a(this.m, this.O, this, this.b, this.P, this.ad)));
      $$2.a(new flb.a(this.m.h, flc.a, T, $$0x -> this.m.a(new flc(this.ad, this.P.a, this.b, this))));
      $$2.a(new flb.a(this.m.h, K, V, $$0x -> this.m.a(new fld(K, this::a, fjf.d.a, this.Z))));
      $$2.a(fug.b(16), 3);
      $$2.a(new flb.a(this.m.h, L, U, $$0x -> this.m.a(new fld(L, this::a, fjf.d.c, this.aa))));
      $$2.a(new flb.a(this.m.h, M, X, $$0x -> this.m.a(new fld(M, this::a, fjf.d.d, this.ab))));
      $$2.a(new flb.a(this.m.h, N, Y, $$0x -> this.m.a(new fld(N, this::a, fjf.d.e, this.ac))));
      this.af.b(fqn.a(wu.k, $$0x -> this.aK_()).a());
      this.af.a($$1x -> {
         fql var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.af.a();
   }

   @Override
   public wv i() {
      return wu.a(this.n(), this.Q);
   }

   @Override
   public void aK_() {
      this.m.a(this.O);
   }

   private void a(@Nullable fjv $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fme($$0, this.P.a, this.S, this.ae));
      }

      fhz.g();
   }

   private void a(fmb $$0) {
      List<fmb> $$1 = new ArrayList<>();
      if (this.ad != null) {
         $$1.add(this.ad);
      }

      if (this.b != this.P.p) {
         $$1.add(new fmi(this.P.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fku(this.O, $$1.toArray(new fmb[0])));
   }

   class a extends fqn {
      private static final ald b = ald.b("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ald v;

      a(final fpx $$0, final wv $$1, final ald $$2, final fqn.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fpz $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.D();
         int $$5 = -1;
         if ($$4) {
            $$5 = axu.a(1.0F, 0.56F, 0.56F, 0.56F);
         }

         int $$6 = this.F();
         int $$7 = this.G();
         $$0.a(goi::H, this.v, $$6 + 2, $$7 + 2, 0.0F, 0.0F, 56, 56, 56, 56, 56, 56, $$5);
         $$0.a(goi::H, b, $$6, $$7, 60, 60, $$5);
         int $$8 = $$4 ? -6250336 : -1;
         $$0.a(flb.this.p, this.B(), $$6 + 28, $$7 - 14, $$8);
      }
   }
}
