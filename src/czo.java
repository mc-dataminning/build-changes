import com.mojang.serialization.MapCodec;

public class czo extends dag {
   public static final MapCodec<czo> a = b(czo::new);
   public static final int b = 3;
   public static final dka c = djq.as;
   private static final int f = 4;
   private static final int g = 2;

   @Override
   public MapCodec<czo> a() {
      return a;
   }

   public czo(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(c, Integer.valueOf(0)));
   }

   @Override
   public void b(dja $$0, amz $$1, hx $$2, aup $$3) {
      this.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dja $$0, amz $$1, hx $$2, aup $$3) {
      if (($$3.a(3) == 0 || this.a($$1, $$2, 4)) && $$1.A($$2) > 11 - $$0.c(c) - $$0.b($$1, $$2) && this.e($$0, $$1, $$2)) {
         hx.a $$4 = new hx.a();

         for (ic $$5 : ic.values()) {
            $$4.a($$2, $$5);
            dja $$6 = $$1.a_($$4);
            if ($$6.a(this) && !this.e($$6, $$1, $$4)) {
               $$1.a($$4, this, aui.a($$3, 20, 40));
            }
         }
      } else {
         $$1.a($$2, this, aui.a($$3, 20, 40));
      }
   }

   private boolean e(dja $$0, cti $$1, hx $$2) {
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
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      if ($$3.o().a(this) && this.a($$1, $$2, 2)) {
         this.d($$0, $$1, $$2);
      }

      super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   private boolean a(cso $$0, hx $$1, int $$2) {
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
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(c);
   }

   @Override
   public cmr a(ctl $$0, hx $$1, dja $$2) {
      return cmr.f;
   }
}
