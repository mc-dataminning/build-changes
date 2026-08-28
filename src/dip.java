import com.mojang.serialization.MapCodec;

public class dip extends dmx {
   public static final MapCodec<dip> a = b(dip::new);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   protected dip(dun.d $$0) {
      super(0.3125F, $$0);
      this.l(
         this.F
            .b()
            .b(b, Boolean.valueOf(false))
            .b(c, Boolean.valueOf(false))
            .b(d, Boolean.valueOf(false))
            .b(e, Boolean.valueOf(false))
            .b(f, Boolean.valueOf(false))
            .b(g, Boolean.valueOf(false))
      );
   }

   @Override
   public duo a(czk $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static duo a(ddl $$0, je $$1, duo $$2) {
      duo $$3 = $$0.a_($$1.e());
      duo $$4 = $$0.a_($$1.d());
      duo $$5 = $$0.a_($$1.f());
      duo $$6 = $$0.a_($$1.i());
      duo $$7 = $$0.a_($$1.g());
      duo $$8 = $$0.a_($$1.h());
      dhj $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dhl.kv) || $$3.a(dhl.fz)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dhl.kv)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dhl.kv)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dhl.kv)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dhl.kv)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dhl.kv)));
   }

   @Override
   protected duo a(duo $$0, jj $$1, duo $$2, deh $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dhl.kv) || $$1 == jj.a && $$2.a(dhl.fz);
         return $$0.b(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(duo $$0, arh $$1, je $$2, azl $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(duo $$0, dej $$1, je $$2) {
      duo $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jj $$5 : jj.c.a) {
         je $$6 = $$2.a($$5);
         duo $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            duo $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dhl.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dhl.fz);
   }

   @Override
   protected void a(dup.a<dhj, duo> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(duo $$0, ere $$1) {
      return false;
   }
}
