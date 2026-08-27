import javax.annotation.Nullable;

public class ctk extends cyw implements czm {
   public static final dfq a = dfp.C;
   protected static final float b = 6.5F;
   protected static final float c = 9.5F;
   protected static final ehw d = csl.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ehw e = csl.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ehw f = csl.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public ctk(dey.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(g, ha.a.b));
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      switch ((ha.a)$$0.c(g)) {
         case a:
         default:
            return f;
         case c:
            return e;
         case b:
            return d;
      }
   }

   @Nullable
   @Override
   public dez a(clf $$0) {
      eac $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == ead.c;
      return super.a($$0).a(a, Boolean.valueOf($$2));
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, ead.c, ead.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      $$0.a(a).a(g);
   }

   @Override
   public eac c_(dez $$0) {
      return $$0.c(a) ? ead.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dez $$0, cor $$1, gu $$2, eas $$3) {
      return false;
   }
}
