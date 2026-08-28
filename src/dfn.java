import com.mojang.serialization.MapCodec;

public abstract class dfn extends dfy implements dna {
   protected static final exv a = dfy.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final exv b = dfy.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dtt c = dts.C;
   private final boolean d;

   public static boolean a(dcw $$0, jd $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dtc $$0) {
      return $$0.a(awe.O) && $$0.b() instanceof dfn;
   }

   protected dfn(boolean $$0, dtb.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dfn> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      dug $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      return c($$1, $$2.e());
   }

   @Override
   protected void b(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dtc a(dtc $$0, dcw $$1, jd $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dug $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(jd $$0, dcw $$1, dug $$2) {
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

   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3) {
   }

   protected dtc a(dcw $$0, jd $$1, dtc $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dug $$4 = $$2.c(this.c());
         return new dlz($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dtc $$3, boolean $$4) {
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
   public dtc a(cyd $$0) {
      epe $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == epf.c;
      dtc $$3 = super.o();
      ji $$4 = $$0.g();
      boolean $$5 = $$4 == ji.f || $$4 == ji.e;
      return $$3.a(this.c(), $$5 ? dug.b : dug.a).a(c, Boolean.valueOf($$2));
   }

   public abstract duf<dug> c();

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, epf.c, epf.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected epe b_(dtc $$0) {
      return $$0.c(c) ? epf.c.a(false) : super.b_($$0);
   }
}
