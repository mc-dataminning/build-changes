import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbx extends gty {
   static final Logger c = LogUtils.getLogger();
   private static final wx B = wx.c("mco.selectServer.create");
   private static final wx C = wx.c("mco.selectServer.create.subtitle");
   private static final wx D = wx.c("mco.configure.world.switch.slot");
   private static final wx E = wx.c("mco.configure.world.switch.slot.subtitle");
   private static final wx F = wx.c("mco.reset.world.title");
   private static final wx G = wx.c("mco.reset.world.warning");
   public static final wx a = wx.c("mco.create.world.reset.title");
   private static final wx H = wx.c("mco.reset.world.resetting.screen.title");
   private static final wx I = wx.c("mco.reset.world.template");
   private static final wx J = wx.c("mco.reset.world.adventure");
   private static final wx K = wx.c("mco.reset.world.experience");
   private static final wx L = wx.c("mco.reset.world.inspiration");
   private final fly M;
   private final ezz N;
   private final wx O;
   private final int P;
   private final wx Q;
   private static final akm R = new akm("textures/gui/realms/upload.png");
   private static final akm S = new akm("textures/gui/realms/adventure.png");
   private static final akm T = new akm("textures/gui/realms/survival_spawn.png");
   private static final akm U = new akm("textures/gui/realms/new_world.png");
   private static final akm V = new akm("textures/gui/realms/experience.png");
   private static final akm W = new akm("textures/gui/realms/inspiration.png");
   far X;
   far Y;
   far Z;
   far aa;
   public final int b;
   @Nullable
   private final fdb ab;
   private final Runnable ac;
   private final fjm ad = new fjm(this);

   private fbx(fly $$0, ezz $$1, int $$2, wx $$3, wx $$4, int $$5, wx $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fbx(fly $$0, ezz $$1, int $$2, wx $$3, wx $$4, int $$5, wx $$6, @Nullable fdb $$7, Runnable $$8) {
      super($$3);
      this.M = $$0;
      this.N = $$1;
      this.b = $$2;
      this.O = $$4;
      this.P = $$5;
      this.Q = $$6;
      this.ab = $$7;
      this.ac = $$8;
   }

   public static fbx a(fly $$0, ezz $$1, fdb $$2, Runnable $$3) {
      return new fbx($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fbx a(fly $$0, int $$1, ezz $$2, Runnable $$3) {
      return new fbx($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fbx a(fly $$0, ezz $$1, Runnable $$2) {
      return new fbx($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aM_() {
      fjq $$0 = this.ad.a(fjq.d());
      $$0.c().a(9 / 3);
      $$0.a(new fhg(this.l, this.p), fjp::b);
      $$0.a(new fhg(this.O, this.p).b(this.P), fjp::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            ezi $$0 = ezi.a();

            try {
               far $$1 = $$0.a(1, 10, ezz.d.a);
               far $$2 = $$0.a(1, 10, ezz.d.c);
               far $$3 = $$0.a(1, 10, ezz.d.d);
               far $$4 = $$0.a(1, 10, ezz.d.e);
               fbx.this.m.execute(() -> {
                  fbx.this.X = $$1;
                  fbx.this.Y = $$2;
                  fbx.this.Z = $$3;
                  fbx.this.aa = $$4;
               });
            } catch (fav var6) {
               fbx.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fjl $$1 = this.ad.c(new fjl());
      fjl.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fbx.a(this.m.h, fbw.a, U, $$0x -> this.m.a(new fbw(this::a, this.l))));
      $$2.a(new fbx.a(this.m.h, fby.a, R, $$0x -> this.m.a(new fby(this.ab, this.N.a, this.b, this))));
      $$2.a(new fbx.a(this.m.h, I, T, $$0x -> this.m.a(new fbz(I, this::a, ezz.d.a, this.X))));
      $$2.a(fjr.b(16), 3);
      $$2.a(new fbx.a(this.m.h, J, S, $$0x -> this.m.a(new fbz(J, this::a, ezz.d.c, this.Y))));
      $$2.a(new fbx.a(this.m.h, K, V, $$0x -> this.m.a(new fbz(K, this::a, ezz.d.d, this.Z))));
      $$2.a(new fbx.a(this.m.h, L, W, $$0x -> this.m.a(new fbz(L, this::a, ezz.d.e, this.aa))));
      this.ad.b(ffz.a(ww.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         ffx var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public wx i() {
      return ww.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable faq $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fdd($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fcs $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fdc($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fcz $$0) {
      List<fcz> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fdh(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fbp(this.M, $$1.toArray(new fcz[0])));
   }

   class a extends ffz {
      private static final akm b = new akm("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akm v;

      a(ffk $$0, wx $$1, akm $$2, ffz.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(ffm $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.A();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.C();
         int $$6 = this.D();
         $$0.a(this.v, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(fbx.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
