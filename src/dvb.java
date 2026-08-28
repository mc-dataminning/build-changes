import com.mojang.serialization.MapCodec;

public class dvb extends dmr {
   public static final MapCodec<dvb> a = b(dvb::new);
   public static final ebt b = ebj.az;
   private static final ffw c = dmr.b(12.0, 0.0, 16.0);

   @Override
   public MapCodec<dvb> a() {
      return a;
   }

   protected dvb(eas.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected ffw a(eat $$0, diq $$1, iv $$2, ffh $$3) {
      return c;
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(eat $$0, arq $$1, iv $$2, azv $$3) {
      if ($$1.v($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.m());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 260);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 260);
            }
         }
      }
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axc.ah) || $$3.a(axc.J)) {
            iv $$4 = $$2.e();

            for (jb $$5 : jb.c.a) {
               eat $$6 = $$1.a_($$4.a($$5));
               exa $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axh.a) || $$6.a(dmt.lo)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b);
   }
}
