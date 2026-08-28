import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class dhy extends dij implements dpk {
   protected static final fal a = dij.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final fal b = dij.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dwf c = dwe.C;
   private final boolean d;

   public static boolean a(dff $$0, jh $$1) {
      return h($$0.a_($$1));
   }

   public static boolean h(dvo $$0) {
      return $$0.a(axd.O) && $$0.b() instanceof dhy;
   }

   protected dhy(boolean $$0, dvn.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dhy> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      dwr $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dvo $$0, dfi $$1, jh $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dvo a(dvo $$0, dff $$1, jh $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, null, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      if (!$$1.C && $$1.a_($$2).a(this)) {
         dwr $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jh $$0, dff $$1, dwr $$2) {
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

   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3) {
   }

   protected dvo a(dff $$0, jh $$1, dvo $$2, boolean $$3) {
      if ($$0.C) {
         return $$2;
      } else {
         dwr $$4 = $$2.c(this.c());
         return new doj($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
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
   public dvo a(czw $$0) {
      ero $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == erp.c;
      dvo $$3 = super.m();
      jm $$4 = $$0.g();
      boolean $$5 = $$4 == jm.f || $$4 == jm.e;
      return $$3.b(this.c(), $$5 ? dwr.b : dwr.a).b(c, Boolean.valueOf($$2));
   }

   public abstract dwq<dwr> c();

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      if ($$0.c(c)) {
         $$2.a($$3, erp.c, erp.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected ero b_(dvo $$0) {
      return $$0.c(c) ? erp.c.a(false) : super.b_($$0);
   }
}
