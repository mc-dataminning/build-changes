import com.mojang.serialization.MapCodec;

public class dal extends daa {
   public static final MapCodec<dal> a = b(dal::new);
   public static final dnz b = dnp.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final eqk e = daa.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final eqk f = daa.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dal> a() {
      return a;
   }

   protected dal(dmy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dmz $$0, apf $$1, ib $$2, axd $$3) {
      ib $$4 = $$2.c();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dmz $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected eqk b(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return e;
   }

   @Override
   protected eqk a(dmz $$0, cwf $$1, ib $$2, epw $$3) {
      return f;
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      for (ih $$3 : ih.c.a) {
         dmz $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(aus.b)) {
            return false;
         }
      }

      dmz $$5 = $$1.a_($$2.d());
      return ($$5.a(dac.dQ) || $$5.a(aun.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   protected void a(dmz $$0, cwz $$1, ib $$2, bow $$3) {
      $$3.a($$1.ah().j(), 1.0F);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
