import com.mojang.serialization.MapCodec;

public class dib extends dmj {
   public static final MapCodec<dib> a = b(dib::new);

   @Override
   public MapCodec<dib> a() {
      return a;
   }

   protected dib(dtz.d $$0) {
      super(0.3125F, $$0);
      this.l(
         this.E
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
   public dua a(cyw $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dua a(dcx $$0, je $$1, dua $$2) {
      dua $$3 = $$0.a_($$1.e());
      dua $$4 = $$0.a_($$1.d());
      dua $$5 = $$0.a_($$1.f());
      dua $$6 = $$0.a_($$1.i());
      dua $$7 = $$0.a_($$1.g());
      dua $$8 = $$0.a_($$1.h());
      dgv $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dgx.kv) || $$3.a(dgx.fz)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dgx.kv)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dgx.kv)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dgx.kv)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dgx.kv)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dgx.kv)));
   }

   @Override
   protected dua a(dua $$0, jj $$1, dua $$2, ddt $$3, je $$4, je $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dgx.kv) || $$1 == jj.a && $$2.a(dgx.fz);
         return $$0.b(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dua $$0, arg $$1, je $$2, azk $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dua $$0, ddv $$1, je $$2) {
      dua $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jj $$5 : jj.c.a) {
         je $$6 = $$2.a($$5);
         dua $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dua $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dgx.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dgx.fz);
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dua $$0, eqq $$1) {
      return false;
   }
}
