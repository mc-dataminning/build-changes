import com.mojang.serialization.MapCodec;

public abstract class dct extends dde implements dkf {
   protected static final eui a = dde.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final eui b = dde.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dqy c = dqx.C;
   private final boolean d;

   public static boolean a(dad $$0, in $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dqh $$0) {
      return $$0.a(avr.N) && $$0.b() instanceof dct;
   }

   protected dct(boolean $$0, dqg.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dct> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected eui a(dqh $$0, czj $$1, in $$2, etu $$3) {
      drl $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dqh $$0, dag $$1, in $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dqh a(dqh $$0, dad $$1, in $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dde $$3, in $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         drl $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(in $$0, dad $$1, drl $$2) {
      if (!c($$1, $$0.d())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.h());
            case d:
               return !c($$1, $$0.g());
            case e:
               return !c($$1, $$0.e());
            case f:
               return !c($$1, $$0.f());
            default:
               return false;
         }
      }
   }

   protected void a(dqh $$0, dad $$1, in $$2, dde $$3) {
   }

   protected dqh a(dad $$0, in $$1, dqh $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         drl $$4 = $$2.c(this.c());
         return new dje($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dqh $$0, dad $$1, in $$2, dqh $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.c(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.d(), this);
         }
      }
   }

   @Override
   public dqh a(cwi $$0) {
      ema $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == emb.c;
      dqh $$3 = super.n();
      is $$4 = $$0.g();
      boolean $$5 = $$4 == is.f || $$4 == is.e;
      return $$3.a(this.c(), $$5 ? drl.b : drl.a).a(c, Boolean.valueOf($$2));
   }

   public abstract drk<drl> c();

   @Override
   protected dqh a(dqh $$0, is $$1, dqh $$2, dae $$3, in $$4, in $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, emb.c, emb.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected ema b_(dqh $$0) {
      return $$0.c(c) ? emb.c.a(false) : super.b_($$0);
   }
}
