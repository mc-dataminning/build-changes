import com.mojang.serialization.MapCodec;

public class dmg extends dlu {
   public static final MapCodec<dmg> a = b(dmg::new);
   public static final eao b = eae.az;
   public static final int c = 15;
   private static final feq d = dlu.b(14.0, 0.0, 16.0);
   private static final feq e = dlu.b(14.0, 0.0, 15.0);

   @Override
   public MapCodec<dmg> a() {
      return a;
   }

   protected dmg(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      iu $$4 = $$2.d();
      if ($$1.v($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dzo $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 260);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 260);
            }
         }
      }
   }

   @Override
   protected feq b(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return e;
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return d;
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      for (ja $$3 : ja.c.a) {
         dzo $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axf.b)) {
            return false;
         }
      }

      dzo $$5 = $$1.a_($$2.e());
      return ($$5.a(dlw.ed) || $$5.a(axa.J)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, bwa $$3) {
      $$3.a($$1.al().k(), 1.0F);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
