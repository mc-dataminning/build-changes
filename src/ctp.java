import javax.annotation.Nullable;

public class ctp extends czb implements czr {
   public static final dfv a = dfu.C;
   protected static final float b = 6.5F;
   protected static final float c = 9.5F;
   protected static final eib d = csq.a(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
   protected static final eib e = csq.a(6.5, 6.5, 0.0, 9.5, 9.5, 16.0);
   protected static final eib f = csq.a(0.0, 6.5, 6.5, 16.0, 9.5, 9.5);

   public ctp(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, Boolean.valueOf(false)).a(g, hc.a.b));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      switch ((hc.a)$$0.c(g)) {
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
   public dfe a(cli $$0) {
      eah $$1 = $$0.q().b_($$0.a());
      boolean $$2 = $$1.a() == eai.c;
      return super.a($$0).a(a, Boolean.valueOf($$2));
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      if ($$0.c(a)) {
         $$3.a($$4, eai.c, eai.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a).a(g);
   }

   @Override
   public eah c_(dfe $$0) {
      return $$0.c(a) ? eai.c.a(false) : super.c_($$0);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
