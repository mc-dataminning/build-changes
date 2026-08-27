import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class erb extends ghr {
   static final Logger c = LogUtils.getLogger();
   static final agi v = new agi("widget/slot_frame");
   private static final ur w = ur.c("mco.selectServer.create");
   private static final ur x = ur.c("mco.selectServer.create.subtitle");
   private static final ur y = ur.c("mco.configure.world.switch.slot");
   private static final ur z = ur.c("mco.configure.world.switch.slot.subtitle");
   private static final ur A = ur.c("mco.reset.world.title");
   private static final ur B = ur.c("mco.reset.world.warning");
   public static final ur a = ur.c("mco.create.world.reset.title");
   private static final ur C = ur.c("mco.reset.world.resetting.screen.title");
   private static final ur D = ur.c("mco.reset.world.template");
   private static final ur E = ur.c("mco.reset.world.adventure");
   private static final ur F = ur.c("mco.reset.world.experience");
   private static final ur G = ur.c("mco.reset.world.inspiration");
   private final fau H;
   private final epd I;
   private final ur J;
   private final int K;
   private final ur L;
   private static final agi M = new agi("textures/gui/realms/upload.png");
   private static final agi N = new agi("textures/gui/realms/adventure.png");
   private static final agi O = new agi("textures/gui/realms/survival_spawn.png");
   private static final agi P = new agi("textures/gui/realms/new_world.png");
   private static final agi Q = new agi("textures/gui/realms/experience.png");
   private static final agi R = new agi("textures/gui/realms/inspiration.png");
   epv S;
   epv T;
   epv U;
   epv V;
   public final int b;
   @Nullable
   private final esl W;
   private final Runnable X;
   private final eyj Y = new eyj(this);

   private erb(fau $$0, epd $$1, int $$2, ur $$3, ur $$4, int $$5, ur $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public erb(fau $$0, epd $$1, int $$2, ur $$3, ur $$4, int $$5, ur $$6, @Nullable esl $$7, Runnable $$8) {
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

   public static erb a(fau $$0, epd $$1, esl $$2, Runnable $$3) {
      return new erb($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static erb a(fau $$0, int $$1, epd $$2, Runnable $$3) {
      return new erb($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static erb a(fau $$0, epd $$1, Runnable $$2) {
      return new erb($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aP_() {
      eyn $$0 = eyn.d();
      $$0.a(new ewg(this.e, this.i), eym::b);
      $$0.a(eyo.b(3));
      $$0.a(new ewg(this.J, this.i).i(this.K), eym::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            eom $$0 = eom.a();

            try {
               epv $$1 = $$0.a(1, 10, epd.d.a);
               epv $$2 = $$0.a(1, 10, epd.d.c);
               epv $$3 = $$0.a(1, 10, epd.d.d);
               epv $$4 = $$0.a(1, 10, epd.d.e);
               erb.this.f.execute(() -> {
                  erb.this.S = $$1;
                  erb.this.T = $$2;
                  erb.this.U = $$3;
                  erb.this.V = $$4;
               });
            } catch (epz var6) {
               erb.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new erb.a(this.a(1), h(0) + 10, era.a, P, $$0x -> this.f.a(new era(this::a, this.e))));
      this.d(new erb.a(this.a(2), h(0) + 10, erc.a, M, $$0x -> this.f.a(new erc(this.I.a, this.b, this))));
      this.d(new erb.a(this.a(3), h(0) + 10, D, O, $$0x -> this.f.a(new erd(D, this::a, epd.d.a, this.S))));
      this.d(new erb.a(this.a(1), h(6) + 20, E, N, $$0x -> this.f.a(new erd(E, this::a, epd.d.c, this.T))));
      this.d(new erb.a(this.a(2), h(6) + 20, F, Q, $$0x -> this.f.a(new erd(F, this::a, epd.d.d, this.U))));
      this.d(new erb.a(this.a(3), h(6) + 20, G, R, $$0x -> this.f.a(new erd(G, this::a, epd.d.e, this.V))));
      this.Y.b(euz.a(uq.k, $$0x -> this.aF_()).a());
      this.Y.a($$1 -> {
         eux var10000 = this.d($$1);
      });
      this.Y.a();
   }

   @Override
   public ur h() {
      return uq.a(this.m(), this.J);
   }

   @Override
   public void aF_() {
      this.f.a(this.H);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(@Nullable epu $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((esd)(new esg($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable erw $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((esd)(new esf($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(esd $$0) {
      List<esd> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new esk(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new eqt(this.H, $$1.toArray(new esd[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new eqt(this.H, new esk(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends euz {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final agi t;

      a(int $$0, int $$1, ur $$2, agi $$3, euz.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(euo $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.n();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.p();
         int $$6 = this.r();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(erb.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(erb.this.i, this.l(), $$5 + 30, $$6, $$7);
      }
   }
}
