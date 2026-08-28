import com.mojang.serialization.MapCodec;

public abstract class dew extends dfh implements dmi {
   protected static final ewy a = dfh.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0);
   protected static final ewy b = dfh.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);
   public static final dtb c = dta.C;
   private final boolean d;

   public static boolean a(dcf $$0, ja $$1) {
      return g($$0.a_($$1));
   }

   public static boolean g(dsk $$0) {
      return $$0.a(avw.N) && $$0.b() instanceof dew;
   }

   protected dew(boolean $$0, dsj.d $$1) {
      super($$1);
      this.d = $$0;
   }

   @Override
   protected abstract MapCodec<? extends dew> a();

   public boolean b() {
      return this.d;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      dto $$4 = $$0.a(this) ? $$0.c(this.c()) : null;
      return $$4 != null && $$4.b() ? b : a;
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return c($$1, $$2.d());
   }

   @Override
   protected void b(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
      if (!$$3.a($$0.b())) {
         this.a($$0, $$1, $$2, $$4);
      }
   }

   protected dsk a(dsk $$0, dcf $$1, ja $$2, boolean $$3) {
      $$0 = this.a($$1, $$2, $$0, true);
      if (this.d) {
         $$1.a($$0, $$2, this, $$2, $$3);
      }

      return $$0;
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3, ja $$4, boolean $$5) {
      if (!$$1.B && $$1.a_($$2).a(this)) {
         dto $$6 = $$0.c(this.c());
         if (a($$2, $$1, $$6)) {
            c($$0, $$1, $$2);
            $$1.a($$2, $$5);
         } else {
            this.a($$0, $$1, $$2, $$3);
         }
      }
   }

   private static boolean a(ja $$0, dcf $$1, dto $$2) {
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

   protected void a(dsk $$0, dcf $$1, ja $$2, dfh $$3) {
   }

   protected dsk a(dcf $$0, ja $$1, dsk $$2, boolean $$3) {
      if ($$0.B) {
         return $$2;
      } else {
         dto $$4 = $$2.c(this.c());
         return new dlh($$0, $$1, $$2).a($$0.C($$1), $$3, $$4).c();
      }
   }

   @Override
   protected void a(dsk $$0, dcf $$1, ja $$2, dsk $$3, boolean $$4) {
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
   public dsk a(cxm $$0) {
      eoh $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eoi.c;
      dsk $$3 = super.o();
      jf $$4 = $$0.g();
      boolean $$5 = $$4 == jf.f || $$4 == jf.e;
      return $$3.a(this.c(), $$5 ? dto.b : dto.a).a(c, Boolean.valueOf($$2));
   }

   public abstract dtn<dto> c();

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eoi.c, eoi.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected eoh b_(dsk $$0) {
      return $$0.c(c) ? eoi.c.a(false) : super.b_($$0);
   }
}
