import javax.annotation.Nullable;

public class crs extends csk implements czl {
   public static final dfp a = dfo.C;

   protected crs(dex.d $$0) {
      super($$0);
      this.k(this.n().a(a, Boolean.valueOf(false)));
   }

   @Override
   public boolean c(dey $$0, coq $$1, gv $$2) {
      return true;
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.a;
   }

   @Override
   public float b(dey $$0, coq $$1, gv $$2) {
      return 1.0F;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(a) ? eac.c.a(false) : super.c_($$0);
   }

   @Nullable
   @Override
   public dey a(cle $$0) {
      return this.n().a(a, Boolean.valueOf($$0.q().b_($$0.a()).a() == eac.c));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }

   @Override
   public ciw a(@Nullable cbl $$0, cpl $$1, gv $$2, dey $$3) {
      return $$0 != null && $$0.f() ? czl.super.a($$0, $$1, $$2, $$3) : ciw.b;
   }

   @Override
   public boolean a(@Nullable cbl $$0, coq $$1, gv $$2, dey $$3, eaa $$4) {
      return $$0 != null && $$0.f() ? czl.super.a($$0, $$1, $$2, $$3, $$4) : false;
   }
}
