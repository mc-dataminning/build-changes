import javax.annotation.Nullable;

public class ctw extends cwj implements css {
   public static final int a = 2;
   public static final dge b = dfu.ar;
   protected static final int c = 4;
   protected static final int d = 5;
   protected static final int e = 2;
   protected static final int f = 6;
   protected static final int g = 7;
   protected static final int h = 3;
   protected static final int i = 8;
   protected static final int j = 9;
   protected static final int k = 4;
   protected static final eib[] l = new eib[]{
      csq.a(11.0, 7.0, 6.0, 15.0, 12.0, 10.0), csq.a(9.0, 5.0, 5.0, 15.0, 12.0, 11.0), csq.a(7.0, 3.0, 4.0, 15.0, 12.0, 12.0)
   };
   protected static final eib[] m = new eib[]{
      csq.a(1.0, 7.0, 6.0, 5.0, 12.0, 10.0), csq.a(1.0, 5.0, 5.0, 7.0, 12.0, 11.0), csq.a(1.0, 3.0, 4.0, 9.0, 12.0, 12.0)
   };
   protected static final eib[] n = new eib[]{
      csq.a(6.0, 7.0, 1.0, 10.0, 12.0, 5.0), csq.a(5.0, 5.0, 1.0, 11.0, 12.0, 7.0), csq.a(4.0, 3.0, 1.0, 12.0, 12.0, 9.0)
   };
   protected static final eib[] D = new eib[]{
      csq.a(6.0, 7.0, 11.0, 10.0, 12.0, 15.0), csq.a(5.0, 5.0, 9.0, 11.0, 12.0, 15.0), csq.a(4.0, 3.0, 7.0, 12.0, 12.0, 15.0)
   };

   public ctw(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(aC, hc.c).a(b, Integer.valueOf(0)));
   }

   @Override
   public boolean e_(dfe $$0) {
      return $$0.c(b) < 2;
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.z.a(5) == 0) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a($$2, $$0.a(b, Integer.valueOf($$4 + 1)), 2);
         }
      }
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      dfe $$3 = $$1.a_($$2.a($$0.c(aC)));
      return $$3.a(apo.z);
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      int $$4 = $$0.c(b);
      switch ((hc)$$0.c(aC)) {
         case d:
            return D[$$4];
         case c:
         default:
            return n[$$4];
         case e:
            return m[$$4];
         case f:
            return l[$$4];
      }
   }

   @Nullable
   @Override
   public dfe a(cli $$0) {
      dfe $$1 = this.n();
      cpt $$2 = $$0.q();
      gw $$3 = $$0.a();

      for (hc $$4 : $$0.f()) {
         if ($$4.o().d()) {
            $$1 = $$1.a(aC, $$4);
            if ($$1.a($$2, $$3)) {
               return $$1;
            }
         }
      }

      return null;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == $$0.c(aC) && !$$0.a($$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(cpt $$0, gw $$1, dfe $$2) {
      return $$2.c(b) < 2;
   }

   @Override
   public boolean a(cpq $$0, arx $$1, gw $$2, dfe $$3) {
      return true;
   }

   @Override
   public void a(akn $$0, arx $$1, gw $$2, dfe $$3) {
      $$0.a($$2, $$3.a(b, Integer.valueOf($$3.c(b) + 1)), 2);
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(aC, b);
   }

   @Override
   public boolean a(dfe $$0, cow $$1, gw $$2, eax $$3) {
      return false;
   }
}
