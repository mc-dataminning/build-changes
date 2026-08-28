import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdt extends gvu {
   static final Logger c = LogUtils.getLogger();
   private static final wu A = wu.c("mco.selectServer.create");
   private static final wu B = wu.c("mco.selectServer.create.subtitle");
   private static final wu C = wu.c("mco.configure.world.switch.slot");
   private static final wu D = wu.c("mco.configure.world.switch.slot.subtitle");
   private static final wu E = wu.c("mco.reset.world.title");
   private static final wu F = wu.c("mco.reset.world.warning");
   public static final wu a = wu.c("mco.create.world.reset.title");
   private static final wu G = wu.c("mco.reset.world.resetting.screen.title");
   private static final wu H = wu.c("mco.reset.world.template");
   private static final wu I = wu.c("mco.reset.world.adventure");
   private static final wu J = wu.c("mco.reset.world.experience");
   private static final wu K = wu.c("mco.reset.world.inspiration");
   private final fnl L;
   private final fbv M;
   private final wu N;
   private final int O;
   private final wu P;
   private static final akk Q = new akk("textures/gui/realms/upload.png");
   private static final akk R = new akk("textures/gui/realms/adventure.png");
   private static final akk S = new akk("textures/gui/realms/survival_spawn.png");
   private static final akk T = new akk("textures/gui/realms/new_world.png");
   private static final akk U = new akk("textures/gui/realms/experience.png");
   private static final akk V = new akk("textures/gui/realms/inspiration.png");
   fcn W;
   fcn X;
   fcn Y;
   fcn Z;
   public final int b;
   @Nullable
   private final fex aa;
   private final Runnable ab;
   private final flh ac = new flh(this);

   private fdt(fnl $$0, fbv $$1, int $$2, wu $$3, wu $$4, int $$5, wu $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fdt(fnl $$0, fbv $$1, int $$2, wu $$3, wu $$4, int $$5, wu $$6, @Nullable fex $$7, Runnable $$8) {
      super($$3);
      this.L = $$0;
      this.M = $$1;
      this.b = $$2;
      this.N = $$4;
      this.O = $$5;
      this.P = $$6;
      this.aa = $$7;
      this.ab = $$8;
   }

   public static fdt a(fnl $$0, fbv $$1, fex $$2, Runnable $$3) {
      return new fdt($$0, $$1, $$1.n, A, B, -6250336, a, $$2, $$3);
   }

   public static fdt a(fnl $$0, int $$1, fbv $$2, Runnable $$3) {
      return new fdt($$0, $$2, $$1, C, D, -6250336, a, $$3);
   }

   public static fdt a(fnl $$0, fbv $$1, Runnable $$2) {
      return new fdt($$0, $$1, $$1.n, E, F, -65536, G, $$2);
   }

   @Override
   public void aP_() {
      fll $$0 = this.ac.a(fll.d());
      $$0.c().a(9 / 3);
      $$0.a(new fjb(this.k, this.o), flk::b);
      $$0.a(new fjb(this.N, this.o).b(this.O), flk::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            fbe $$0 = fbe.a();

            try {
               fcn $$1 = $$0.a(1, 10, fbv.d.a);
               fcn $$2 = $$0.a(1, 10, fbv.d.c);
               fcn $$3 = $$0.a(1, 10, fbv.d.d);
               fcn $$4 = $$0.a(1, 10, fbv.d.e);
               fdt.this.l.execute(() -> {
                  fdt.this.W = $$1;
                  fdt.this.X = $$2;
                  fdt.this.Y = $$3;
                  fdt.this.Z = $$4;
               });
            } catch (fcr var6) {
               fdt.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      flg $$1 = this.ac.c(new flg());
      flg.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fdt.a(this.l.h, fds.a, T, $$0x -> this.l.a(new fds(this::a, this.k))));
      $$2.a(new fdt.a(this.l.h, fdu.a, Q, $$0x -> this.l.a(new fdu(this.aa, this.M.a, this.b, this))));
      $$2.a(new fdt.a(this.l.h, H, S, $$0x -> this.l.a(new fdv(H, this::a, fbv.d.a, this.W))));
      $$2.a(flm.b(16), 3);
      $$2.a(new fdt.a(this.l.h, I, R, $$0x -> this.l.a(new fdv(I, this::a, fbv.d.c, this.X))));
      $$2.a(new fdt.a(this.l.h, J, U, $$0x -> this.l.a(new fdv(J, this::a, fbv.d.d, this.Y))));
      $$2.a(new fdt.a(this.l.h, K, V, $$0x -> this.l.a(new fdv(K, this::a, fbv.d.e, this.Z))));
      this.ac.b(fhu.a(wt.k, $$0x -> this.d()).a());
      this.ac.a($$1x -> {
         fhs var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.ac.a();
   }

   @Override
   public wu i() {
      return wt.a(this.n(), this.N);
   }

   @Override
   public void d() {
      this.l.a(this.L);
   }

   private void a(@Nullable fcm $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new fez($$0, this.M.a, this.P, this.ab));
      }
   }

   private void a(@Nullable feo $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new fey($$0, this.M.a, this.P, this.ab));
      }
   }

   private void a(fev $$0) {
      List<fev> $$1 = new ArrayList<>();
      if (this.aa != null) {
         $$1.add(this.aa);
      }

      if (this.b != this.M.n) {
         $$1.add(new ffd(this.M.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.l.a(new fdl(this.L, $$1.toArray(new fev[0])));
   }

   class a extends fhu {
      private static final akk b = new akk("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akk v;

      a(final fhf $$0, final wu $$1, final akk $$2, final fhu.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fhh $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.B();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.D();
         int $$6 = this.E();
         $$0.a(this.v, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(fdt.this.o, this.z(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
