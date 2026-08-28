import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dlj extends dlu implements dtb {
   public static final eaf a = eae.I;
   private static final feq b = dlu.b(16.0, 0.0, 2.0);
   private static final feq c = dlu.b(16.0, 0.0, 8.0);
   private final boolean d;

   public static boolean a(dip $$0, iu $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dzo $$0) {
      return $$0.a(axa.P) && $$0.b() instanceof dlj;
   }

   protected dlj(boolean $$0, dzn.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dlj> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$0.c(this.c()).b() ? c : b;
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dzo a(dzo $$0, dip $$1, iu $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3, @Nullable exd $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         eas $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(iu $$0, dip $$1, eas $$2) {
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

   protected void a(dzo $$0, dip $$1, iu $$2, dlu $$3) {
   }

   protected dzo a(dip $$0, iu $$1, dzo $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         eas $$4 = $$2.c(this.c());
         return new drz($$0, $$1, $$2).a($$0.D($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, boolean $$3) {
      if (!$$3) {
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
   public dzo a(dcl $$0) {
      evv $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == evw.c;
      dzo $$3 = super.m();
      ja $$4 = $$0.g();
      boolean $$5 = $$4 == ja.f || $$4 == ja.e;
      return $$3.b(this.c(), $$5 ? eas.b : eas.a).b(a, Boolean.valueOf($$2));
   }

   public abstract ear<eas> c();

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if ($$0.c(a)) {
         $$2.a($$3, evw.c, evw.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected evv b_(dzo $$0) {
      return $$0.c(a) ? evw.c.a(false) : super.b_($$0);
   }
}
