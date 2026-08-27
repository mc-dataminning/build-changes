import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class eok extends ger {
   private static final aer b = new aer("widget/slot_frame");
   static final Logger c = LogUtils.getLogger();
   private final eya y;
   private final emm z;
   private tf A = tf.c("mco.reset.world.warning");
   private tf B = te.e;
   private int C = -65536;
   private static final aer D = new aer("textures/gui/realms/upload.png");
   private static final aer E = new aer("textures/gui/realms/adventure.png");
   private static final aer F = new aer("textures/gui/realms/survival_spawn.png");
   private static final aer G = new aer("textures/gui/realms/new_world.png");
   private static final aer H = new aer("textures/gui/realms/experience.png");
   private static final aer I = new aer("textures/gui/realms/inspiration.png");
   ene J;
   ene K;
   ene L;
   ene M;
   public int a = -1;
   private tf N = tf.c("mco.reset.world.resetting.screen.title");
   private final Runnable O;
   private final Runnable P;

   public eok(eya $$0, emm $$1, tf $$2, Runnable $$3, Runnable $$4) {
      super($$2);
      this.y = $$0;
      this.z = $$1;
      this.O = $$3;
      this.P = $$4;
   }

   public eok(eya $$0, emm $$1, Runnable $$2, Runnable $$3) {
      this($$0, $$1, tf.c("mco.reset.world.title"), $$2, $$3);
   }

   public eok(eya $$0, emm $$1, tf $$2, tf $$3, int $$4, tf $$5, Runnable $$6, Runnable $$7) {
      this($$0, $$1, $$2, $$6, $$7);
      this.A = $$3;
      this.C = $$4;
      this.B = $$5;
   }

   public void a(int $$0) {
      this.a = $$0;
   }

   public void a(tf $$0) {
      this.N = $$0;
   }

   @Override
   public void aC_() {
      this.d(esg.a(this.B, $$0 -> this.f.a(this.y)).a(this.g / 2 - 40, h(14) - 10, 80, 20).a());
      (new Thread("Realms-reset-world-fetcher") {
         @Override
         public void run() {
            elv $$0 = elv.a();

            try {
               ene $$1 = $$0.a(1, 10, emm.c.a);
               ene $$2 = $$0.a(1, 10, emm.c.c);
               ene $$3 = $$0.a(1, 10, emm.c.d);
               ene $$4 = $$0.a(1, 10, emm.c.e);
               eok.this.f.execute(() -> {
                  eok.this.J = $$1;
                  eok.this.K = $$2;
                  eok.this.L = $$3;
                  eok.this.M = $$4;
               });
            } catch (eni var6) {
               eok.c.error("Couldn't fetch templates in reset world", var6);
            }
         }
      }).start();
      this.a(new gep(this.A, this.g / 2, 22, this.C));
      this.d(new eok.a(this.b(1), h(0) + 10, tf.c("mco.reset.world.generate"), G, $$0 -> this.f.a(new eoj(this::a, this.e))));
      this.d(
         new eok.a(this.b(2), h(0) + 10, tf.c("mco.reset.world.upload"), D, $$0 -> this.f.a(new eol(this.z.a, this.a != -1 ? this.a : this.z.n, this, this.P)))
      );
      this.d(
         new eok.a(
            this.b(3), h(0) + 10, tf.c("mco.reset.world.template"), F, $$0 -> this.f.a(new eom(tf.c("mco.reset.world.template"), this::a, emm.c.a, this.J))
         )
      );
      this.d(
         new eok.a(
            this.b(1), h(6) + 20, tf.c("mco.reset.world.adventure"), E, $$0 -> this.f.a(new eom(tf.c("mco.reset.world.adventure"), this::a, emm.c.c, this.K))
         )
      );
      this.d(
         new eok.a(
            this.b(2), h(6) + 20, tf.c("mco.reset.world.experience"), H, $$0 -> this.f.a(new eom(tf.c("mco.reset.world.experience"), this::a, emm.c.d, this.L))
         )
      );
      this.d(
         new eok.a(
            this.b(3),
            h(6) + 20,
            tf.c("mco.reset.world.inspiration"),
            I,
            $$0 -> this.f.a(new eom(tf.c("mco.reset.world.inspiration"), this::a, emm.c.e, this.M))
         )
      );
   }

   @Override
   public tf e() {
      return te.a(this.m(), this.l());
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
   public void a(erv $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 7, -1);
   }

   void a(erv $$0, int $$1, int $$2, tf $$3, aer $$4, boolean $$5, boolean $$6) {
      if ($$5) {
         $$0.a(0.56F, 0.56F, 0.56F, 1.0F);
      }

      $$0.a($$4, $$1 + 2, $$2 + 14, 0.0F, 0.0F, 56, 56, 56, 56);
      $$0.a(b, $$1, $$2 + 12, 60, 60);
      int $$7 = $$5 ? -6250336 : -1;
      $$0.a(this.i, $$3, $$1 + 30, $$2, $$7);
      $$0.a(1.0F, 1.0F, 1.0F, 1.0F);
   }

   private void a(epl $$0) {
      this.f.a(new eod(this.y, $$0));
   }

   @Override
   public void a(Runnable $$0) {
      this.a((epl)(new eps(this.z.a, this.a, () -> this.f.execute($$0))));
   }

   private void a(@Nullable end $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epl)(new epo($$0, this.z.a, this.N, this.O))));
      }
   }

   private void a(@Nullable epf $$0) {
      this.f.a(this);
      if ($$0 != null) {
         this.b(() -> this.a((epl)(new epn($$0, this.z.a, this.N, this.O))));
      }
   }

   private void b(Runnable $$0) {
      if (this.a == -1) {
         $$0.run();
      } else {
         this.a($$0);
      }
   }

   class a extends esg {
      private final aer b;

      public a(int $$0, int $$1, tf $$2, aer $$3, esg.c $$4) {
         super($$0, $$1, 60, 72, $$2, $$4, o);
         this.b = $$3;
      }

      @Override
      public void b(erv $$0, int $$1, int $$2, float $$3) {
         eok.this.a($$0, this.r(), this.t(), this.m(), this.b, this.o(), this.a_((double)$$1, (double)$$2));
      }
   }
}
