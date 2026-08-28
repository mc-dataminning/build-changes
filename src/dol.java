import com.mojang.serialization.MapCodec;

public class dol extends dsy {
   public static final MapCodec<dol> a = b(dol::new);

   @Override
   public MapCodec<dol> a() {
      return a;
   }

   protected dol(ebf.d $$0) {
      super(10.0F, $$0);
      this.l(
         this.C
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
   public ebg a(ddt $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static ebg a(djd $$0, iw $$1, ebg $$2) {
      ebg $$3 = $$0.a_($$1.e());
      ebg $$4 = $$0.a_($$1.d());
      ebg $$5 = $$0.a_($$1.f());
      ebg $$6 = $$0.a_($$1.i());
      ebg $$7 = $$0.a_($$1.g());
      ebg $$8 = $$0.a_($$1.h());
      dne $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dng.lb) || $$3.a(dng.fY)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dng.lb)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dng.lb)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dng.lb)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dng.lb)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dng.lb)));
   }

   @Override
   protected ebg a(ebg $$0, dkc $$1, dko $$2, iw $$3, jc $$4, iw $$5, ebg $$6, azz $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dng.lb) || $$4 == jc.a && $$6.a(dng.fY);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(ebg $$0, aru $$1, iw $$2, azz $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(ebg $$0, dkc $$1, iw $$2) {
      ebg $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jc $$5 : jc.c.a) {
         iw $$6 = $$2.a($$5);
         ebg $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            ebg $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dng.fY)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dng.fY);
   }

   @Override
   protected void a(ebh.a<dne, ebg> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(ebg $$0, eyf $$1) {
      return false;
   }
}
