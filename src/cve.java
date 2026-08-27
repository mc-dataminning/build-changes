import com.mojang.serialization.MapCodec;

public class cve extends cut {
   public static final MapCodec<cve> a = b(cve::new);
   public static final dhw b = dhm.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final ekb e = cut.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final ekb f = cut.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<cve> a() {
      return a;
   }

   protected cve(dgv.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, Integer.valueOf(0)));
   }

   @Override
   public void a(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      ht $$4 = $$2.c();
      if ($$1.t($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.o());
               dgw $$7 = $$0.a(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, $$2, false);
            } else {
               $$1.a($$2, $$0.a(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   public ekb c(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return e;
   }

   @Override
   public ekb a(dgw $$0, cqy $$1, ht $$2, ejn $$3) {
      return f;
   }

   @Override
   public dgw a(dgw $$0, hx $$1, dgw $$2, crt $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dgw $$0, crv $$1, ht $$2) {
      for (hx $$3 : hx.c.a) {
         dgw $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(arh.b)) {
            return false;
         }
      }

      dgw $$5 = $$1.a_($$2.d());
      return ($$5.a(cuv.dQ) || $$5.a(arc.H)) && !$$1.a_($$2.c()).k();
   }

   @Override
   public void a(dgw $$0, crs $$1, ht $$2, bki $$3) {
      $$3.a($$1.ag().j(), 1.0F);
   }

   @Override
   protected void a(dgx.a<cut, dgw> $$0) {
      $$0.a(b);
   }

   @Override
   public boolean a(dgw $$0, cqy $$1, ht $$2, ecw $$3) {
      return false;
   }
}
