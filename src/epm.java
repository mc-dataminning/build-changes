import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class epm extends gfx {
   static final Logger c = LogUtils.getLogger();
   static final afw y = new afw("widget/slot_frame");
   private static final ui z = ui.c("mco.selectServer.create");
   private static final ui A = ui.c("mco.selectServer.create.subtitle");
   private static final ui B = ui.c("mco.configure.world.switch.slot");
   private static final ui C = ui.c("mco.configure.world.switch.slot.subtitle");
   private static final ui D = ui.c("mco.reset.world.title");
   private static final ui E = ui.c("mco.reset.world.warning");
   public static final ui a = ui.c("mco.create.world.reset.title");
   private static final ui F = ui.c("mco.reset.world.resetting.screen.title");
   private static final ui G = ui.c("mco.reset.world.template");
   private static final ui H = ui.c("mco.reset.world.adventure");
   private static final ui I = ui.c("mco.reset.world.experience");
   private static final ui J = ui.c("mco.reset.world.inspiration");
   private final ezd K;
   private final eno L;
   private final ui M;
   private final int N;
   private final ui O;
   private static final afw P = new afw("textures/gui/realms/upload.png");
   private static final afw Q = new afw("textures/gui/realms/adventure.png");
   private static final afw R = new afw("textures/gui/realms/survival_spawn.png");
   private static final afw S = new afw("textures/gui/realms/new_world.png");
   private static final afw T = new afw("textures/gui/realms/experience.png");
   private static final afw U = new afw("textures/gui/realms/inspiration.png");
   eog V;
   eog W;
   eog X;
   eog Y;
   public final int b;
   @Nullable
   private final eqw Z;
   private final Runnable aa;
   private final ewt ab = new ewt(this);

   private epm(ezd $$0, eno $$1, int $$2, ui $$3, ui $$4, int $$5, ui $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public epm(ezd $$0, eno $$1, int $$2, ui $$3, ui $$4, int $$5, ui $$6, @Nullable eqw $$7, Runnable $$8) {
      super($$3);
      this.K = $$0;
      this.L = $$1;
      this.b = $$2;
      this.M = $$4;
      this.N = $$5;
      this.O = $$6;
      this.Z = $$7;
      this.aa = $$8;
   }

   public static epm a(ezd $$0, eno $$1, eqw $$2, Runnable $$3) {
      return new epm($$0, $$1, $$1.n, z, A, -6250336, a, $$2, $$3);
   }

   public static epm a(ezd $$0, int $$1, eno $$2, Runnable $$3) {
      return new epm($$0, $$2, $$1, B, C, -6250336, a, $$3);
   }

   public static epm a(ezd $$0, eno $$1, Runnable $$2) {
      return new epm($$0, $$1, $$1.n, D, E, -65536, F, $$2);
   }

   @Override
   public void aM_() {
      ewx $$0 = ewx.d();
      $$0.a(new euq(this.e, this.i), eww::b);
      $$0.a(ewy.b(3));
      $$0.a(new euq(this.M, this.i).i(this.N), eww::b);
      this.ab.a($$0);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            emx $$0 = emx.a();

            try {
               eog $$1 = $$0.a(1, 10, eno.d.a);
               eog $$2 = $$0.a(1, 10, eno.d.c);
               eog $$3 = $$0.a(1, 10, eno.d.d);
               eog $$4 = $$0.a(1, 10, eno.d.e);
               epm.this.f.execute(() -> {
                  epm.this.V = $$1;
                  epm.this.W = $$2;
                  epm.this.X = $$3;
                  epm.this.Y = $$4;
               });
            } catch (eok var6) {
               epm.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.d(new epm.a(this.a(1), h(0) + 10, epl.a, S, $$0x -> this.f.a(new epl(this::a, this.e))));
      this.d(new epm.a(this.a(2), h(0) + 10, epn.a, P, $$0x -> this.f.a(new epn(this.L.a, this.b, this))));
      this.d(new epm.a(this.a(3), h(0) + 10, G, R, $$0x -> this.f.a(new epo(G, this::a, eno.d.a, this.V))));
      this.d(new epm.a(this.a(1), h(6) + 20, H, Q, $$0x -> this.f.a(new epo(H, this::a, eno.d.c, this.W))));
      this.d(new epm.a(this.a(2), h(6) + 20, I, T, $$0x -> this.f.a(new epo(I, this::a, eno.d.d, this.X))));
      this.d(new epm.a(this.a(3), h(6) + 20, J, U, $$0x -> this.f.a(new epo(J, this::a, eno.d.e, this.Y))));
      this.ab.b(etj.a(uh.k, $$0x -> this.aC_()).a());
      this.ab.a($$1 -> {
         eth var10000 = this.d($$1);
      });
      this.ab.a();
   }

   @Override
   public ui h() {
      return uh.a(this.m(), this.M);
   }

   @Override
   public void aC_() {
      this.f.a(this.K);
   }

   private int a(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   private void a(@Nullable eof $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eqo)(new eqr($$0, this.L.a, this.O, this.aa)));
      }
   }

   private void a(@Nullable eqh $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.a((eqo)(new eqq($$0, this.L.a, this.O, this.aa)));
      }
   }

   private void a(eqo $$0) {
      List<eqo> $$1 = new ArrayList<>();
      if (this.Z != null) {
         $$1.add(this.Z);
      }

      if (this.b != this.L.n) {
         $$1.add(new eqv(this.L.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.f.a(new epe(this.K, $$1.toArray(new eqo[0])));
   }

   @Override
   public void a(Runnable $$0) {
      this.f.a(new epe(this.K, new eqv(this.L.a, this.b, () -> this.f.execute($$0))));
   }

   class a extends etj {
      private static final int b = 60;
      private static final int c = 72;
      private static final int d = 56;
      private final afw s;

      a(int $$0, int $$1, ui $$2, afw $$3, etj.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, o);
         this.s = $$3;
      }

      @Override
      public void b(esy $$0, int $$1, int $$2, float $$3) {
         boolean $$4 = this.n();
         if ($$4) {
            $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
         }

         int $$5 = this.p();
         int $$6 = this.r();
         $$0.a(this.s, $$5 + 2, $$6 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
         $$0.a(epm.y, $$5, $$6 + 12, 60, 60);
         $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
         int $$7 = $$4 ? -6250336 : -1;
         $$0.a(epm.this.i, this.l(), $$5 + 30, $$6, $$7);
      }
   }
}
