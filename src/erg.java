import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erg extends ghw {
   static final Logger c = LogUtils.getLogger();
   static final agm v = new agm("widget/slot_frame");
   private static final uv w = uv.c("mco.selectServer.create");
   private static final uv x = uv.c("mco.selectServer.create.subtitle");
   private static final uv y = uv.c("mco.configure.world.switch.slot");
   private static final uv z = uv.c("mco.configure.world.switch.slot.subtitle");
   private static final uv A = uv.c("mco.reset.world.title");
   private static final uv B = uv.c("mco.reset.world.warning");
   public static final uv a = uv.c("mco.create.world.reset.title");
   private static final uv C = uv.c("mco.reset.world.resetting.screen.title");
   private static final uv D = uv.c("mco.reset.world.template");
   private static final uv E = uv.c("mco.reset.world.adventure");
   private static final uv F = uv.c("mco.reset.world.experience");
   private static final uv G = uv.c("mco.reset.world.inspiration");
   private final faz H;
   private final epi I;
   private final uv J;
   private final int K;
   private final uv L;
   private static final agm M = new agm("textures/gui/realms/upload.png");
   private static final agm N = new agm("textures/gui/realms/adventure.png");
   private static final agm O = new agm("textures/gui/realms/survival_spawn.png");
   private static final agm P = new agm("textures/gui/realms/new_world.png");
   private static final agm Q = new agm("textures/gui/realms/experience.png");
   private static final agm R = new agm("textures/gui/realms/inspiration.png");
   eqa S;
   eqa T;
   eqa U;
   eqa V;
   public final int b;
   @Nullable
   private final esq W;
   private final Runnable X;
   private final eyo Y = new eyo(this);

   private erg(faz $$0, epi $$1, int $$2, uv $$3, uv $$4, int $$5, uv $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public erg(faz $$0, epi $$1, int $$2, uv $$3, uv $$4, int $$5, uv $$6, @Nullable esq $$7, Runnable $$8) {
      super($$3);
      this.H = $$0;
      this.I = $$1;
      this.b = $$2;
      this.J = $$4;
      this.K = $$5;
      this.L = $$6;
      this.W = $$7;
      this.X = $$8;
   }

   public static erg a(faz $$0, epi $$1, esq $$2, Runnable $$3) {
      return new erg($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static erg a(faz $$0, int $$1, epi $$2, Runnable $$3) {
      return new erg($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static erg a(faz $$0, epi $$1, Runnable $$2) {
      return new erg($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aQ_() {
      eys $$0 = eys.d();
      $$0.a(new ewl(this.e, this.i), eyr::b);
      $$0.a(eyt.b(3));
      $$0.a(new ewl(this.J, this.i).i(this.K), eyr::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eor $$0 = eor.a();

            try {
               eqa $$1 = $$0.a(1, 10, epi.d.a);
               eqa $$2 = $$0.a(1, 10, epi.d.c);
               eqa $$3 = $$0.a(1, 10, epi.d.d);
               eqa $$4 = $$0.a(1, 10, epi.d.e);
               erg.this.f.execute(() -> {
                  erg.this.S = $$1;
                  erg.this.T = $$2;
                  erg.this.U = $$3;
                  erg.this.V = $$4;
               });
            } catch (eqe var6) {
               erg.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new erg.a(this.a(1), h(0) + 10, erf.a, P, $$0x -> this.f.a(new erf(this::a, this.e))));
      this.d(new erg.a(this.a(2), h(0) + 10, erh.a, M, $$0x -> this.f.a(new erh(this.I.a, this.b, this))));
      this.d(new erg.a(this.a(3), h(0) + 10, D, O, $$0x -> this.f.a(new eri(D, this::a, epi.d.a, this.S))));
      this.d(new erg.a(this.a(1), h(6) + 20, E, N, $$0x -> this.f.a(new eri(E, this::a, epi.d.c, this.T))));
      this.d(new erg.a(this.a(2), h(6) + 20, F, Q, $$0x -> this.f.a(new eri(F, this::a, epi.d.d, this.U))));
      this.d(new erg.a(this.a(3), h(6) + 20, G, R, $$0x -> this.f.a(new eri(G, this::a, epi.d.e, this.V))));
      this.Y.b(eve.a(uu.k, $$0x -> this.aG_()).a());
      this.Y.a($$1 -> {
         evc var10000 = this.d($$1);
      });
      this.Y.a();
   }

   @Override
   public uv h() {
      return uu.a(this.m(), this.J);
   }

   @Override
   public void aG_() {
      this.f.a(this.H);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(@Nullable epz $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((esi)(new esl($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable esb $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((esi)(new esk($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(esi $$0) {
      List<esi> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new esp(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new eqy(this.H, $$1.toArray(new esi[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new eqy(this.H, new esp(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends eve {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final agm t;

      a(int $$0, int $$1, uv $$2, agm $$3, eve.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(eut $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.n();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.p();
         int $$6 = this.r();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(erg.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(erg.this.i, this.l(), $$5 + 30, $$6, $$7);
      }
   }
}
