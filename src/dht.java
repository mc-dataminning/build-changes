import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dht extends die implements dpf {
   protected static final fah a = die.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final fah b = die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dwa c = dvz.C;
   private final boolean d;

   public static boolean a(dfb $$0, jh $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dvj $$0) {
      return $$0.a(axa.O) && $$0.b() instanceof dht;
   }

   protected dht(boolean $$0, dvi.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dht> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      dwn $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dvj a(dvj $$0, dfb $$1, jh $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3, @Nullable ess $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dwn $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jh $$0, dfb $$1, dwn $$2) {
      if (!c($$1, $$0.e())) {
         return true;
      } else {
         switch ($$2) {
            case c:
               return !c($$1, $$0.i());
            case d:
               return !c($$1, $$0.h());
            case e:
               return !c($$1, $$0.f());
            case f:
               return !c($$1, $$0.g());
            default:
               return false;
         }
      }
   }

   protected void a(dvj $$0, dfb $$1, jh $$2, die $$3) {
   }

   protected dvj a(dfb $$0, jh $$1, dvj $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dwn $$4 = $$2.c(this.c());
         return new doe($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, dvj $$3, boolean $$4) {
      if (!$$4) {
         super.a($$0, $$1, $$2, $$3, $$4);
         if ($$0.c(this.c()).b()) {
            $$1.a($$2.d(), this);
         }

         if (this.d) {
            $$1.a($$2, this);
            $$1.a($$2.e(), this);
         }
      }
   }

   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erl.c;
      dvj $$3 = super.m();
      jm $$4 = $$0.g();
      boolean $$5 = $$4 == jm.f || $$4 == jm.e;
      return $$3.b(this.c(), $$5 ? dwn.b : dwn.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dwm<dwn> c();

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(c) ? erl.c.a(false) : super.b_($$0);
   }
}
