import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ewi extends gob {
   static final Logger c = LogUtils.getLogger();
   private static final vs v = vs.c("mco.selectServer.create");
   private static final vs w = vs.c("mco.selectServer.create.subtitle");
   private static final vs x = vs.c("mco.configure.world.switch.slot");
   private static final vs y = vs.c("mco.configure.world.switch.slot.subtitle");
   private static final vs z = vs.c("mco.reset.world.title");
   private static final vs A = vs.c("mco.reset.world.warning");
   public static final vs a = vs.c("mco.create.world.reset.title");
   private static final vs B = vs.c("mco.reset.world.resetting.screen.title");
   private static final vs C = vs.c("mco.reset.world.template");
   private static final vs D = vs.c("mco.reset.world.adventure");
   private static final vs E = vs.c("mco.reset.world.experience");
   private static final vs F = vs.c("mco.reset.world.inspiration");
   private final fgh G;
   private final euk H;
   private final vs I;
   private final int J;
   private final vs K;
   private static final ajc L = new ajc("textures/gui/realms/upload.png");
   private static final ajc M = new ajc("textures/gui/realms/adventure.png");
   private static final ajc N = new ajc("textures/gui/realms/survival_spawn.png");
   private static final ajc O = new ajc("textures/gui/realms/new_world.png");
   private static final ajc P = new ajc("textures/gui/realms/experience.png");
   private static final ajc Q = new ajc("textures/gui/realms/inspiration.png");
   evc R;
   evc S;
   evc T;
   evc U;
   public final int b;
   @Nullable
   private final exm V;
   private final Runnable W;
   private final fdw X = new fdw(this);

   private ewi(fgh $$0, euk $$1, int $$2, vs $$3, vs $$4, int $$5, vs $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public ewi(fgh $$0, euk $$1, int $$2, vs $$3, vs $$4, int $$5, vs $$6, @Nullable exm $$7, Runnable $$8) {
      super($$3);
      this.G = $$0;
      this.H = $$1;
      this.b = $$2;
      this.I = $$4;
      this.J = $$5;
      this.K = $$6;
      this.V = $$7;
      this.W = $$8;
   }

   public static ewi a(fgh $$0, euk $$1, exm $$2, Runnable $$3) {
      return new ewi($$0, $$1, $$1.n, v, w, -6250336, a, $$2, $$3);
   }

   public static ewi a(fgh $$0, int $$1, euk $$2, Runnable $$3) {
      return new ewi($$0, $$2, $$1, x, y, -6250336, a, $$3);
   }

   public static ewi a(fgh $$0, euk $$1, Runnable $$2) {
      return new ewi($$0, $$1, $$1.n, z, A, -65536, B, $$2);
   }

   @Override
   public void aP_() {
      fea $$0 = this.X.a(fea.d());
      $$0.c().a(9 / 3);
      $$0.a(new fbr(this.e, this.i), fdz::b);
      $$0.a(new fbr(this.I, this.i).b(this.J), fdz::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            ett $$0 = ett.a();

            try {
               evc $$1 = $$0.a(1, 10, euk.d.a);
               evc $$2 = $$0.a(1, 10, euk.d.c);
               evc $$3 = $$0.a(1, 10, euk.d.d);
               evc $$4 = $$0.a(1, 10, euk.d.e);
               ewi.this.f.execute(() -> {
                  ewi.this.R = $$1;
                  ewi.this.S = $$2;
                  ewi.this.T = $$3;
                  ewi.this.U = $$4;
               });
            } catch (evg var6) {
               ewi.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fdv $$1 = this.X.c(new fdv());
      fdv.b $$2 = $$1.d(3);
      $$2.c().a(16);
      $$2.a(new ewi.a(ewh.a, O, $$0x -> this.f.a(new ewh(this::a, this.e))));
      $$2.a(new ewi.a(ewj.a, L, $$0x -> this.f.a(new ewj(this.V, this.H.a, this.b, this))));
      $$2.a(new ewi.a(C, N, $$0x -> this.f.a(new ewk(C, this::a, euk.d.a, this.R))));
      $$2.a(new ewi.a(D, M, $$0x -> this.f.a(new ewk(D, this::a, euk.d.c, this.S))));
      $$2.a(new ewi.a(E, P, $$0x -> this.f.a(new ewk(E, this::a, euk.d.d, this.T))));
      $$2.a(new ewi.a(F, Q, $$0x -> this.f.a(new ewk(F, this::a, euk.d.e, this.U))));
      this.X.b(fak.a(vr.k, $$0x -> this.d()).a());
      this.X.a($$1x -> {
         fai var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.X.a();
   }

   @Override
   public vs i() {
      return vr.a(this.p(), this.I);
   }

   @Override
   public void d() {
      this.f.a(this.G);
   }

   private void a(@Nullable evb $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new exo($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(@Nullable exd $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a(new exn($$0, this.H.a, this.K, this.W));
      }
   }

   private void a(exk $$0) {
      List<exk> $$1 = new ArrayList<>();
      if (this.V != null) {
         $$1.add(this.V);
      }

      if (this.b != this.H.n) {
         $$1.add(new exs(this.H.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new ewa(this.G, $$1.toArray(new exk[0])));
   }

   class a extends fak {
      private static final ajc b = new ajc("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int t = 56;
      private final ajc u;

      a(vs $$0, ajc $$1, fak.c $$2) {
         super(0, 0, 60, 60, $$0, $$2, p);
         this.u = $$1;
      }

      @Override
      public void b(ezx $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.z();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.B();
         int $$6 = this.C();
         $$0.a(this.u, $$5 + 2, $$6 + 2, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(b, $$5, $$6, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(ewi.this.i, this.x(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
