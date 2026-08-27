import javax.annotation.Nullable;

public class ctl extends cyx implements czn {
   public static final dfr a = dfq.C;
   protected static final float b = 6.5F;
   protected static final float c = 9.5F;
   protected static final ehx d = csm.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final ehx e = csm.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final ehx f = csm.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public ctl(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(g, ha.a.b));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
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
   public dfa a(clg $$0) {
      ead $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eae.c;
      return super.a($$0).a(a, Boolean.valueOf($$2));
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eae.c, eae.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a).a(g);
   }

   @Override
   public ead c_(dfa $$0) {
      return $$0.c(a) ? eae.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return false;
   }
}
