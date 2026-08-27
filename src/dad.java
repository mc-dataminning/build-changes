import com.mojang.serialization.MapCodec;

public class dad extends dav {
   public static final MapCodec<dad> a = b(dad::new);
   public static final int b = 3;
   public static final dkp c = dkf.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<dad> a() {
      return a;
   }

   public dad(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(djp $$0, ane $$1, hx $$2, auw $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         hx.a $$4 = new hx.a();

         for (ic $$5 : ic.values()) {
            $$4.a($$2, $$5);
            djp $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, aup.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, aup.a($$3, 20, 40));
      }
   }

   private boolean e(djp $$0, ctx $$1, hx $$2) {
      int $$3 = $$0.c(c);
      if ($$3 < 3) {
         $$1.a($$2, $$0.a(c, Integer.valueOf($$3 + 1)), 2);
         return false;
      } else {
         this.d($$0, $$1, $$2);
         return true;
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(ctd $$0, hx $$1, int $$2) {
      int $$3 = 0;
      hx.a $$4 = new hx.a();

      for (ic $$5 : ic.values()) {
         $$4.a($$1, $$5);
         if ($$0.a_($$4).a(this)) {
            if (++$$3 >= $$2) {
               return false;
            }
         }
      }

      return true;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(c);
   }

   @Override
   public cng a(cua $$0, hx $$1, djp $$2) {
      return cng.f;
   }
}
