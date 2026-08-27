import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fbc extends gtb {
   static final Logger c = LogUtils.getLogger();
   private static final wu B = wu.c("mco.selectServer.create");
   private static final wu C = wu.c("mco.selectServer.create.subtitle");
   private static final wu D = wu.c("mco.configure.world.switch.slot");
   private static final wu E = wu.c("mco.configure.world.switch.slot.subtitle");
   private static final wu F = wu.c("mco.reset.world.title");
   private static final wu G = wu.c("mco.reset.world.warning");
   public static final wu a = wu.c("mco.create.world.reset.title");
   private static final wu H = wu.c("mco.reset.world.resetting.screen.title");
   private static final wu I = wu.c("mco.reset.world.template");
   private static final wu J = wu.c("mco.reset.world.adventure");
   private static final wu K = wu.c("mco.reset.world.experience");
   private static final wu L = wu.c("mco.reset.world.inspiration");
   private final fld M;
   private final eze N;
   private final wu O;
   private final int P;
   private final wu Q;
   private static final akh R = new akh("textures/gui/realms/upload.png");
   private static final akh S = new akh("textures/gui/realms/adventure.png");
   private static final akh T = new akh("textures/gui/realms/survival_spawn.png");
   private static final akh U = new akh("textures/gui/realms/new_world.png");
   private static final akh V = new akh("textures/gui/realms/experience.png");
   private static final akh W = new akh("textures/gui/realms/inspiration.png");
   ezw X;
   ezw Y;
   ezw Z;
   ezw aa;
   public final int b;
   @Nullable
   private final fcg ab;
   private final Runnable ac;
   private final fir ad = new fir(this);

   private fbc(fld $$0, eze $$1, int $$2, wu $$3, wu $$4, int $$5, wu $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fbc(fld $$0, eze $$1, int $$2, wu $$3, wu $$4, int $$5, wu $$6, @Nullable fcg $$7, Runnable $$8) {
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

   public static fbc a(fld $$0, eze $$1, fcg $$2, Runnable $$3) {
      return new fbc($$0, $$1, $$1.n, B, C, -6250336, a, $$2, $$3);
   }

   public static fbc a(fld $$0, int $$1, eze $$2, Runnable $$3) {
      return new fbc($$0, $$2, $$1, D, E, -6250336, a, $$3);
   }

   public static fbc a(fld $$0, eze $$1, Runnable $$2) {
      return new fbc($$0, $$1, $$1.n, F, G, -65536, H, $$2);
   }

   @Override
   public void aM_() {
      fiv $$0 = this.ad.a(fiv.d());
      $$0.c().a(9 / 3);
      $$0.a(new fgl(this.l, this.p), fiu::b);
      $$0.a(new fgl(this.O, this.p).b(this.P), fiu::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eyn $$0 = eyn.a();

            try {
               ezw $$1 = $$0.a(1, 10, eze.d.a);
               ezw $$2 = $$0.a(1, 10, eze.d.c);
               ezw $$3 = $$0.a(1, 10, eze.d.d);
               ezw $$4 = $$0.a(1, 10, eze.d.e);
               fbc.this.m.execute(() -> {
                  fbc.this.X = $$1;
                  fbc.this.Y = $$2;
                  fbc.this.Z = $$3;
                  fbc.this.aa = $$4;
               });
            } catch (faa var6) {
               fbc.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fiq $$1 = this.ad.c(new fiq());
      fiq.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fbc.a(this.m.h, fbb.a, U, $$0x -> this.m.a(new fbb(this::a, this.l))));
      $$2.a(new fbc.a(this.m.h, fbd.a, R, $$0x -> this.m.a(new fbd(this.ab, this.N.a, this.b, this))));
      $$2.a(new fbc.a(this.m.h, I, T, $$0x -> this.m.a(new fbe(I, this::a, eze.d.a, this.X))));
      $$2.a(fiw.b(16), 3);
      $$2.a(new fbc.a(this.m.h, J, S, $$0x -> this.m.a(new fbe(J, this::a, eze.d.c, this.Y))));
      $$2.a(new fbc.a(this.m.h, K, V, $$0x -> this.m.a(new fbe(K, this::a, eze.d.d, this.Z))));
      $$2.a(new fbc.a(this.m.h, L, W, $$0x -> this.m.a(new fbe(L, this::a, eze.d.e, this.aa))));
      this.ad.b(ffe.a(wt.k, $$0x -> this.d()).a());
      this.ad.a($$1x -> {
         ffc var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ad.a();
   }

   @Override
   public wu i() {
      return wt.a(this.n(), this.O);
   }

   @Override
   public void d() {
      this.m.a(this.M);
   }

   private void a(@Nullable ezv $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fci($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(@Nullable fbx $$0) {
      this.m.a(this);
      if ($$0 != null) {
         this.a(new fch($$0, this.N.a, this.Q, this.ac));
      }
   }

   private void a(fce $$0) {
      List<fce> $$1 = new ArrayList<>();
      if (this.ab != null) {
         $$1.add(this.ab);
      }

      if (this.b != this.N.n) {
         $$1.add(new fcm(this.N.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.m.a(new fau(this.M, $$1.toArray(new fce[0])));
   }

   class a extends ffe {
      private static final akh b = new akh("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akh v;

      a(fep $$0, wu $$1, akh $$2, ffe.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fer $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(fbc.this.p, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
