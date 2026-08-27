import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eom extends ged {
   private static final aep b = new aep("widget/slot_frame");
   static final Logger c = LogUtils.getLogger();
   private final exv y;
   private final emo z;
   private te A = te.c("mco.reset.world.warning");
   private te B = td.e;
   private int C = -65536;
   private static final aep D = new aep("textures/gui/realms/upload.png");
   private static final aep E = new aep("textures/gui/realms/adventure.png");
   private static final aep F = new aep("textures/gui/realms/survival_spawn.png");
   private static final aep G = new aep("textures/gui/realms/new_world.png");
   private static final aep H = new aep("textures/gui/realms/experience.png");
   private static final aep I = new aep("textures/gui/realms/inspiration.png");
   eng J;
   eng K;
   eng L;
   eng M;
   public int a = -1;
   private te N = te.c("mco.reset.world.resetting.screen.title");
   private final Runnable O;
   private final Runnable P;

   public eom(exv $$0, emo $$1, te $$2, Runnable $$3, Runnable $$4) {
      super($$2);
      this.y = $$0;
      this.z = $$1;
      this.O = $$3;
      this.P = $$4;
   }

   public eom(exv $$0, emo $$1, Runnable $$2, Runnable $$3) {
      this($$0, $$1, te.c("mco.reset.world.title"), $$2, $$3);
   }

   public eom(exv $$0, emo $$1, te $$2, te $$3, int $$4, te $$5, Runnable $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$6, $$7);
      this.A = $$3;
      this.C = $$4;
      this.B = $$5;
   }

   public void a(int $$0) {
      this.a = $$0;
   }

   public void a(te $$0) {
      this.N = $$0;
   }

   @Override
   public void aE_() {
      this.d(esi.a(this.B, $$0 -> this.f.a(this.y)).a(this.g / 2 - 40, h(14) - 10, 80, 20).a());
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            elx $$0 = elx.a();

            try {
               eng $$1 = $$0.a(1, 10, emo.c.a);
               eng $$2 = $$0.a(1, 10, emo.c.c);
               eng $$3 = $$0.a(1, 10, emo.c.d);
               eng $$4 = $$0.a(1, 10, emo.c.e);
               eom.this.f.execute(() -> {
                  eom.this.J = $$1;
                  eom.this.K = $$2;
                  eom.this.L = $$3;
                  eom.this.M = $$4;
               });
            } catch (enk var6) {
               eom.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.a(new geb(this.A, this.g / 2, 22, this.C));
      this.d(new eom.a(this.b(1), h(0) + 10, te.c("mco.reset.world.generate"), G, $$0 -> this.f.a(new eol(this::a, this.e))));
      this.d(
         new eom.a(this.b(2), h(0) + 10, te.c("mco.reset.world.upload"), D, $$0 -> this.f.a(new eon(this.z.a, this.a != -1 ? this.a : this.z.n, this, this.P)))
      );
      this.d(
         new eom.a(
            this.b(3), h(0) + 10, te.c("mco.reset.world.template"), F, $$0 -> this.f.a(new eoo(te.c("mco.reset.world.template"), this::a, emo.c.a, this.J))
         )
      );
      this.d(
         new eom.a(
            this.b(1), h(6) + 20, te.c("mco.reset.world.adventure"), E, $$0 -> this.f.a(new eoo(te.c("mco.reset.world.adventure"), this::a, emo.c.c, this.K))
         )
      );
      this.d(
         new eom.a(
            this.b(2), h(6) + 20, te.c("mco.reset.world.experience"), H, $$0 -> this.f.a(new eoo(te.c("mco.reset.world.experience"), this::a, emo.c.d, this.L))
         )
      );
      this.d(
         new eom.a(
            this.b(3),
            h(6) + 20,
            te.c("mco.reset.world.inspiration"),
            I,
            $$0 -> this.f.a(new eoo(te.c("mco.reset.world.inspiration"), this::a, emo.c.e, this.M))
         )
      );
   }

   @Override
   public te e() {
      return td.a(this.m(), this.l());
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      if ($$0 == 256) {
         this.f.a(this.y);
         return true;
      } else {
         return super.a($$0, $$1, $$2);
      }
   }

   private int b(int $$0) {
      return this.g / 2 - 130 + ($$0 - 1) * 100;
   }

   @Override
   public void a(erx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 7, -1);
   }

   void a(erx $$0, int $$1, int $$2, te $$3, aep $$4, boolean $$5, boolean $$6) {
      if ($$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a($$4, $$1 + 2, $$2 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
      $$0.a(b, $$1, $$2 + 12, 60, 60);
      int $$7 = $$5 ? -6250336 : -1;
      $$0.a(this.i, $$3, $$1 + 30, $$2, $$7);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(epn $$0) {
      this.f.a(new eof(this.y, $$0));
   }

   @Override
   public void a(Runnable $$0) {
      this.a((epn)(new epu(this.z.a, this.a, () -> this.f.execute($$0))));
   }

   private void a(@Nullable enf $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epn)(new epq($$0, this.z.a, this.N, this.O))));
      }
   }

   private void a(@Nullable eph $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epn)(new epp($$0, this.z.a, this.N, this.O))));
      }
   }

   private void b(Runnable $$0) {
      if (this.a == -1) {
         $$0.run();
      } else {
         this.a($$0);
      }
   }

   class a extends esi {
      private final aep b;

      public a(int $$0, int $$1, te $$2, aep $$3, esi.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, o);
         this.b = $$3;
      }

      @Override
      public void b(erx $$0, int $$1, int $$2, float $$3) {
         eom.this.a($$0, this.p(), this.r(), this.l(), this.b, this.n(), this.a_((double)$$1, (double)$$2));
      }
   }
}
