import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class djc extends djn implements dqt {
   protected static final fbv a = djn.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final fbv b = djn.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dxp c = dxo.J;
   private final boolean d;

   public static boolean a(dgj $$0, ji $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dwy $$0) {
      return $$0.a(awp.P) && $$0.b() instanceof djc;
   }

   protected djc(boolean $$0, dwx.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends djc> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      dyb $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dwy $$0, dgm $$1, ji $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dwy a(dwy $$0, dgj $$1, ji $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3, @Nullable eui $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dyb $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ji $$0, dgj $$1, dyb $$2) {
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

   protected void a(dwy $$0, dgj $$1, ji $$2, djn $$3) {
   }

   protected dwy a(dgj $$0, ji $$1, dwy $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dyb $$4 = $$2.c(this.c());
         return new dps($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dwy $$0, dgj $$1, ji $$2, dwy $$3, boolean $$4) {
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
   public dwy a(dah $$0) {
      eta $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == etb.c;
      dwy $$3 = super.m();
      jn $$4 = $$0.g();
      boolean $$5 = $$4 == jn.f || $$4 == jn.e;
      return $$3.b(this.c(), $$5 ? dyb.b : dyb.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dya<dyb> c();

   @Override
   protected dwy a(dwy $$0, dgm $$1, dgy $$2, ji $$3, jn $$4, ji $$5, dwy $$6, azh $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, etb.c, etb.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected eta b_(dwy $$0) {
      return $$0.c(c) ? etb.c.a(false) : super.b_($$0);
   }
}
