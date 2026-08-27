import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fas extends gsq {
   static final Logger c = LogUtils.getLogger();
   private static final ws B = ws.c("mco.selectServer.create");
   private static final ws C = ws.c("mco.selectServer.create.subtitle");
   private static final ws D = ws.c("mco.configure.world.switch.slot");
   private static final ws E = ws.c("mco.configure.world.switch.slot.subtitle");
   private static final ws F = ws.c("mco.reset.world.title");
   private static final ws G = ws.c("mco.reset.world.warning");
   public static final ws a = ws.c("mco.create.world.reset.title");
   private static final ws H = ws.c("mco.reset.world.resetting.screen.title");
   private static final ws I = ws.c("mco.reset.world.template");
   private static final ws J = ws.c("mco.reset.world.adventure");
   private static final ws K = ws.c("mco.reset.world.experience");
   private static final ws L = ws.c("mco.reset.world.inspiration");
   private final fkt M;
   private final eyu N;
   private final ws O;
   private final int P;
   private final ws Q;
   private static final akf R = new akf("textures/gui/realms/upload.png");
   private static final akf S = new akf("textures/gui/realms/adventure.png");
   private static final akf T = new akf("textures/gui/realms/survival_spawn.png");
   private static final akf U = new akf("textures/gui/realms/new_world.png");
   private static final akf V = new akf("textures/gui/realms/experience.png");
   private static final akf W = new akf("textures/gui/realms/inspiration.png");
   ezm X;
   ezm Y;
   ezm Z;
   ezm aa;
   public final int b;
   @Nullable
   private final fbw ab;
   private final Runnable ac;
   private final fih ad = new fih(this);

   private fas(fkt $$0, eyu $$1, int $$2, ws $$3, ws $$4, int $$5, ws $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fas(fkt $$0, eyu $$1, int $$2, ws $$3, ws $$4, int $$5, ws $$6, @Nullable fbw $$7, Runnable $$8) {
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

   public static fas a(fkt $$0, eyu $$1, fbw $$2, Runnable $$3) {
      return new fas($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fas a(fkt $$0, int $$1, eyu $$2, Runnable $$3) {
      return new fas($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fas a(fkt $$0, eyu $$1, Runnable $$2) {
      return new fas($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aM_() {
      fil $$0 = this.ad.a(fil.d());
      $$0.c().a(9 / 3);
      $$0.a(new fgb(this.l, this.p), fik::b);
      $$0.a(new fgb(this.O, this.p).b(this.P), fik::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eyd $$0 = eyd.a();

            try {
               ezm $$1 = $$0.a(1, 10, eyu.d.a);
               ezm $$2 = $$0.a(1, 10, eyu.d.c);
               ezm $$3 = $$0.a(1, 10, eyu.d.d);
               ezm $$4 = $$0.a(1, 10, eyu.d.e);
               fas.this.m.execute(() -> {
                  fas.this.X = $$1;
                  fas.this.Y = $$2;
                  fas.this.Z = $$3;
                  fas.this.aa = $$4;
               });
            } catch (ezq var6) {
               fas.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fig $$1 = this.ad.c(new fig());
      fig.b $$2 = $$1.d(3);
      $$2.c().a(16);
      $$2.a(new fas.a(far.a, U, $$0x -> this.m.a(new far(this::a, this.l))));
      $$2.a(new fas.a(fat.a, R, $$0x -> this.m.a(new fat(this.ab, this.N.a, this.b, this))));
      $$2.a(new fas.a(I, T, $$0x -> this.m.a(new fau(I, this::a, eyu.d.a, this.X))));
      $$2.a(new fas.a(J, S, $$0x -> this.m.a(new fau(J, this::a, eyu.d.c, this.Y))));
      $$2.a(new fas.a(K, V, $$0x -> this.m.a(new fau(K, this::a, eyu.d.d, this.Z))));
      $$2.a(new fas.a(L, W, $$0x -> this.m.a(new fau(L, this::a, eyu.d.e, this.aa))));
      this.ad.b(feu.a(wr.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         fes var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public ws i() {
      return wr.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable ezl $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fby($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fbn $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fbx($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fbu $$0) {
      List<fbu> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fcc(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fak(this.M, $$1.toArray(new fbu[0])));
   }

   class a extends feu {
      private static final akf b = new akf("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akf v;

      a(ws $$0, akf $$1, feu.c $$2) {
         super(0, 0, 60, 60, $$0, $$2, q);
         this.v = $$1;
      }

      @Override
      public void b(feh $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(fas.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
