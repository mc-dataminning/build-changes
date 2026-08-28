import com.mojang.serialization.MapCodec;

public class djb extends diq {
   public static final MapCodec<djb> a = b(djb::new);
   public static final dwu b = dwl.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final fas e = diq.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final fas f = diq.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<djb> a() {
      return a;
   }

   protected djb(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      jh $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dvv $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected fas b(dvv $$0, der $$1, jh $$2, fad $$3) {
      return e;
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return f;
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(dvv $$0, dfp $$1, jh $$2) {
      for (jm $$3 : jm.c.a) {
         dvv $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axi.b)) {
            return false;
         }
      }

      dvv $$5 = $$1.a_($$2.e());
      return ($$5.a(dis.dQ) || $$5.a(axc.I)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, bul $$3) {
      $$3.a($$1.ai().k(), 1.0F);
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvv $$0, esk $$1) {
      return false;
   }
}
