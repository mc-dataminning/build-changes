import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fdl extends gvm {
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
   private final fnd L;
   private final fbn M;
   private final wu N;
   private final int O;
   private final wu P;
   private static final akk Q = new akk("textures/gui/realms/upload.png");
   private static final akk R = new akk("textures/gui/realms/adventure.png");
   private static final akk S = new akk("textures/gui/realms/survival_spawn.png");
   private static final akk T = new akk("textures/gui/realms/new_world.png");
   private static final akk U = new akk("textures/gui/realms/experience.png");
   private static final akk V = new akk("textures/gui/realms/inspiration.png");
   fcf W;
   fcf X;
   fcf Y;
   fcf Z;
   public final int b;
   @Nullable
   private final fep aa;
   private final Runnable ab;
   private final fkz ac = new fkz(this);

   private fdl(fnd $$0, fbn $$1, int $$2, wu $$3, wu $$4, int $$5, wu $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public fdl(fnd $$0, fbn $$1, int $$2, wu $$3, wu $$4, int $$5, wu $$6, @Nullable fep $$7, Runnable $$8) {
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

   public static fdl a(fnd $$0, fbn $$1, fep $$2, Runnable $$3) {
      return new fdl($$0, $$1, $$1.n, A, B, -6250336, a, $$2, $$3);
   }

   public static fdl a(fnd $$0, int $$1, fbn $$2, Runnable $$3) {
      return new fdl($$0, $$2, $$1, C, D, -6250336, a, $$3);
   }

   public static fdl a(fnd $$0, fbn $$1, Runnable $$2) {
      return new fdl($$0, $$1, $$1.n, E, F, -65536, G, $$2);
   }

   @Override
   public void aO_() {
      fld $$0 = this.ac.a(fld.d());
      $$0.c().a(9 / 3);
      $$0.a(new fit(this.k, this.o), flc::b);
      $$0.a(new fit(this.N, this.o).b(this.O), flc::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            faw $$0 = faw.a();

            try {
               fcf $$1 = $$0.a(1, 10, fbn.d.a);
               fcf $$2 = $$0.a(1, 10, fbn.d.c);
               fcf $$3 = $$0.a(1, 10, fbn.d.d);
               fcf $$4 = $$0.a(1, 10, fbn.d.e);
               fdl.this.l.execute(() -> {
                  fdl.this.W = $$1;
                  fdl.this.X = $$2;
                  fdl.this.Y = $$3;
                  fdl.this.Z = $$4;
               });
            } catch (fcj var6) {
               fdl.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fky $$1 = this.ac.c(new fky());
      fky.b $$2 = $$1.d(3);
      $$2.c().f(16);
      $$2.a(new fdl.a(this.l.h, fdk.a, T, $$0x -> this.l.a(new fdk(this::a, this.k))));
      $$2.a(new fdl.a(this.l.h, fdm.a, Q, $$0x -> this.l.a(new fdm(this.aa, this.M.a, this.b, this))));
      $$2.a(new fdl.a(this.l.h, H, S, $$0x -> this.l.a(new fdn(H, this::a, fbn.d.a, this.W))));
      $$2.a(fle.b(16), 3);
      $$2.a(new fdl.a(this.l.h, I, R, $$0x -> this.l.a(new fdn(I, this::a, fbn.d.c, this.X))));
      $$2.a(new fdl.a(this.l.h, J, U, $$0x -> this.l.a(new fdn(J, this::a, fbn.d.d, this.Y))));
      $$2.a(new fdl.a(this.l.h, K, V, $$0x -> this.l.a(new fdn(K, this::a, fbn.d.e, this.Z))));
      this.ac.b(fhm.a(wt.k, $$0x -> this.d()).a());
      this.ac.a($$1x -> {
         fhk var10000 = this.c($$1x);
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

   private void a(@Nullable fce $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new fer($$0, this.M.a, this.P, this.ab));
      }
   }

   private void a(@Nullable feg $$0) {
      this.l.a(this);
      if ($$0 != null) {
         this.a(new feq($$0, this.M.a, this.P, this.ab));
      }
   }

   private void a(fen $$0) {
      List<fen> $$1 = new ArrayList<>();
      if (this.aa != null) {
         $$1.add(this.aa);
      }

      if (this.b != this.M.n) {
         $$1.add(new fev(this.M.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.l.a(new fdd(this.L, $$1.toArray(new fen[0])));
   }

   class a extends fhm {
      private static final akk b = new akk("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final akk v;

      a(final fgx $$0, final wu $$1, final akk $$2, final fhm.c $$3) {
         super(0, 0, 60, 60 + 9, $$1, $$3, q);
         this.v = $$2;
      }

      @Override
      public void b(fgz $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(fdl.this.o, this.z(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
