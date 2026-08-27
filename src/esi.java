import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class esi extends gjl {
   static final Logger c = LogUtils.getLogger();
   static final agt v = new agt("widget/slot_frame");
   private static final vb w = vb.c("mco.selectServer.create");
   private static final vb x = vb.c("mco.selectServer.create.subtitle");
   private static final vb y = vb.c("mco.configure.world.switch.slot");
   private static final vb z = vb.c("mco.configure.world.switch.slot.subtitle");
   private static final vb A = vb.c("mco.reset.world.title");
   private static final vb B = vb.c("mco.reset.world.warning");
   public static final vb a = vb.c("mco.create.world.reset.title");
   private static final vb C = vb.c("mco.reset.world.resetting.screen.title");
   private static final vb D = vb.c("mco.reset.world.template");
   private static final vb E = vb.c("mco.reset.world.adventure");
   private static final vb F = vb.c("mco.reset.world.experience");
   private static final vb G = vb.c("mco.reset.world.inspiration");
   private final fcc H;
   private final eqk I;
   private final vb J;
   private final int K;
   private final vb L;
   private static final agt M = new agt("textures/gui/realms/upload.png");
   private static final agt N = new agt("textures/gui/realms/adventure.png");
   private static final agt O = new agt("textures/gui/realms/survival_spawn.png");
   private static final agt P = new agt("textures/gui/realms/new_world.png");
   private static final agt Q = new agt("textures/gui/realms/experience.png");
   private static final agt R = new agt("textures/gui/realms/inspiration.png");
   erc S;
   erc T;
   erc U;
   erc V;
   public final int b;
   @Nullable
   private final ets W;
   private final Runnable X;
   private final ezr Y = new ezr(this);

   private esi(fcc $$0, eqk $$1, int $$2, vb $$3, vb $$4, int $$5, vb $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public esi(fcc $$0, eqk $$1, int $$2, vb $$3, vb $$4, int $$5, vb $$6, @Nullable ets $$7, Runnable $$8) {
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

   public static esi a(fcc $$0, eqk $$1, ets $$2, Runnable $$3) {
      return new esi($$0, $$1, $$1.n, w, x, -6250336, a, $$2, $$3);
   }

   public static esi a(fcc $$0, int $$1, eqk $$2, Runnable $$3) {
      return new esi($$0, $$2, $$1, y, z, -6250336, a, $$3);
   }

   public static esi a(fcc $$0, eqk $$1, Runnable $$2) {
      return new esi($$0, $$1, $$1.n, A, B, -65536, C, $$2);
   }

   @Override
   public void aP_() {
      ezv $$0 = ezv.d();
      $$0.a(new exo(this.e, this.i), ezu::b);
      $$0.a(ezw.b(3));
      $$0.a(new exo(this.J, this.i).i(this.K), ezu::b);
      this.Y.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            ept $$0 = ept.a();

            try {
               erc $$1 = $$0.a(1, 10, eqk.d.a);
               erc $$2 = $$0.a(1, 10, eqk.d.c);
               erc $$3 = $$0.a(1, 10, eqk.d.d);
               erc $$4 = $$0.a(1, 10, eqk.d.e);
               esi.this.f.execute(() -> {
                  esi.this.S = $$1;
                  esi.this.T = $$2;
                  esi.this.U = $$3;
                  esi.this.V = $$4;
               });
            } catch (erg var6) {
               esi.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new esi.a(this.a(1), h(0) + 10, esh.a, P, $$0x -> this.f.a(new esh(this::a, this.e))));
      this.d(new esi.a(this.a(2), h(0) + 10, esj.a, M, $$0x -> this.f.a(new esj(this.I.a, this.b, this))));
      this.d(new esi.a(this.a(3), h(0) + 10, D, O, $$0x -> this.f.a(new esk(D, this::a, eqk.d.a, this.S))));
      this.d(new esi.a(this.a(1), h(6) + 20, E, N, $$0x -> this.f.a(new esk(E, this::a, eqk.d.c, this.T))));
      this.d(new esi.a(this.a(2), h(6) + 20, F, Q, $$0x -> this.f.a(new esk(F, this::a, eqk.d.d, this.U))));
      this.d(new esi.a(this.a(3), h(6) + 20, G, R, $$0x -> this.f.a(new esk(G, this::a, eqk.d.e, this.V))));
      this.Y.b(ewh.a(va.k, $$0x -> this.aF_()).a());
      this.Y.a($$1 -> {
         ewf var10000 = this.d($$1);
      });
      this.Y.a();
   }

   @Override
   public vb h() {
      return va.a(this.m(), this.J);
   }

   @Override
   public void aF_() {
      this.f.a(this.H);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(@Nullable erb $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((etk)(new etn($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(@Nullable etd $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((etk)(new etm($$0, this.I.a, this.L, this.X)));
      }
   }

   private void a(etk $$0) {
      List<etk> $$1 = new ArrayList<>();
      if (this.W != null) {
         $$1.add(this.W);
      }

      if (this.b != this.I.n) {
         $$1.add(new etr(this.I.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new esa(this.H, $$1.toArray(new etk[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new esa(this.H, new etr(this.I.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends ewh {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final agt t;

      a(int $$0, int $$1, vb $$2, agt $$3, ewh.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, p);
         this.t = $$3;
      }

      @Override
      public void b(evw $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.n();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.p();
         int $$6 = this.r();
         $$0.a(this.t, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(esi.v, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(esi.this.i, this.l(), $$5 + 30, $$6, $$7);
      }
   }
}
