import com.mojang.logging.LogUtils;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ezw extends gru {
   static final Logger c = LogUtils.getLogger();
   private static final wi y = wi.c("mco.selectServer.create");
   private static final wi z = wi.c("mco.selectServer.create.subtitle");
   private static final wi A = wi.c("mco.configure.world.switch.slot");
   private static final wi B = wi.c("mco.configure.world.switch.slot.subtitle");
   private static final wi C = wi.c("mco.reset.world.title");
   private static final wi D = wi.c("mco.reset.world.warning");
   public static final wi a = wi.c("mco.create.world.reset.title");
   private static final wi E = wi.c("mco.reset.world.resetting.screen.title");
   private static final wi F = wi.c("mco.reset.world.template");
   private static final wi G = wi.c("mco.reset.world.adventure");
   private static final wi H = wi.c("mco.reset.world.experience");
   private static final wi I = wi.c("mco.reset.world.inspiration");
   private final fjx J;
   private final exy K;
   private final wi L;
   private final int M;
   private final wi N;
   private static final ajv O = new ajv("textures/gui/realms/upload.png");
   private static final ajv P = new ajv("textures/gui/realms/adventure.png");
   private static final ajv Q = new ajv("textures/gui/realms/survival_spawn.png");
   private static final ajv R = new ajv("textures/gui/realms/new_world.png");
   private static final ajv S = new ajv("textures/gui/realms/experience.png");
   private static final ajv T = new ajv("textures/gui/realms/inspiration.png");
   eyq U;
   eyq V;
   eyq W;
   eyq X;
   public final int b;
   @Nullable
   private final fba Y;
   private final Runnable Z;
   private final fhl aa = new fhl(this);

   private ezw(fjx $$0, exy $$1, int $$2, wi $$3, wi $$4, int $$5, wi $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, null, $$7);
   }

   public ezw(fjx $$0, exy $$1, int $$2, wi $$3, wi $$4, int $$5, wi $$6, @Nullable fba $$7, Runnable $$8) {
      super($$3);
      this.J = $$0;
      this.K = $$1;
      this.b = $$2;
      this.L = $$4;
      this.M = $$5;
      this.N = $$6;
      this.Y = $$7;
      this.Z = $$8;
   }

   public static ezw a(fjx $$0, exy $$1, fba $$2, Runnable $$3) {
      return new ezw($$0, $$1, $$1.n, y, z, -6250336, a, $$2, $$3);
   }

   public static ezw a(fjx $$0, int $$1, exy $$2, Runnable $$3) {
      return new ezw($$0, $$2, $$1, A, B, -6250336, a, $$3);
   }

   public static ezw a(fjx $$0, exy $$1, Runnable $$2) {
      return new ezw($$0, $$1, $$1.n, C, D, -65536, E, $$2);
   }

   @Override
   public void aM_() {
      fhp $$0 = this.aa.a(fhp.d());
      $$0.c().a(9 / 3);
      $$0.a(new fff(this.i, this.m), fho::b);
      $$0.a(new fff(this.L, this.m).b(this.M), fho::b);
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            exh $$0 = exh.a();

            try {
               eyq $$1 = $$0.a(1, 10, exy.d.a);
               eyq $$2 = $$0.a(1, 10, exy.d.c);
               eyq $$3 = $$0.a(1, 10, exy.d.d);
               eyq $$4 = $$0.a(1, 10, exy.d.e);
               ezw.this.j.execute(() -> {
                  ezw.this.U = $$1;
                  ezw.this.V = $$2;
                  ezw.this.W = $$3;
                  ezw.this.X = $$4;
               });
            } catch (eyu var6) {
               ezw.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      fhk $$1 = this.aa.c(new fhk());
      fhk.b $$2 = $$1.d(3);
      $$2.c().a(16);
      $$2.a(new ezw.a(ezv.a, R, $$0x -> this.j.a(new ezv(this::a, this.i))));
      $$2.a(new ezw.a(ezx.a, O, $$0x -> this.j.a(new ezx(this.Y, this.K.a, this.b, this))));
      $$2.a(new ezw.a(F, Q, $$0x -> this.j.a(new ezy(F, this::a, exy.d.a, this.U))));
      $$2.a(new ezw.a(G, P, $$0x -> this.j.a(new ezy(G, this::a, exy.d.c, this.V))));
      $$2.a(new ezw.a(H, S, $$0x -> this.j.a(new ezy(H, this::a, exy.d.d, this.W))));
      $$2.a(new ezw.a(I, T, $$0x -> this.j.a(new ezy(I, this::a, exy.d.e, this.X))));
      this.aa.b(fdy.a(wh.k, $$0x -> this.d()).a());
      this.aa.a($$1x -> {
         fdw var10000 = this.c($$1x);
      });
      this.c();
   }

   @Override
   protected void c() {
      this.aa.a();
   }

   @Override
   public wi i() {
      return wh.a(this.n(), this.L);
   }

   @Override
   public void d() {
      this.j.a(this.J);
   }

   private void a(@Nullable eyp $$0) {
      this.j.a(this);
      if ($$0 != null) {
         this.a(new fbc($$0, this.K.a, this.N, this.Z));
      }
   }

   private void a(@Nullable far $$0) {
      this.j.a(this);
      if ($$0 != null) {
         this.a(new fbb($$0, this.K.a, this.N, this.Z));
      }
   }

   private void a(fay $$0) {
      List<fay> $$1 = new ArrayList<>();
      if (this.Y != null) {
         $$1.add(this.Y);
      }

      if (this.b != this.K.n) {
         $$1.add(new fbg(this.K.a, this.b, () -> {
         }));
      }

      $$1.add($$0);
      this.j.a(new ezo(this.J, $$1.toArray(new fay[0])));
   }

   class a extends fdy {
      private static final ajv b = new ajv("widget/slot_frame");
      private static final int c = 60;
      private static final int d = 2;
      private static final int u = 56;
      private final ajv v;

      a(wi $$0, ajv $$1, fdy.c $$2) {
         super(0, 0, 60, 60, $$0, $$2, q);
         this.v = $$1;
      }

      @Override
      public void b(fdl $$0, int $$1, int $$2, float $$3) {
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
         $$0.a(ezw.this.m, this.y(), $$5 + 28, $$6 - 14, $$7);
      }
   }
}
