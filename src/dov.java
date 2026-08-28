import com.mojang.serialization.MapCodec;

public class dov extends dti {
   public static final MapCodec<dov> a = b(dov::new);

   @Override
   public MapCodec<dov> a() {
      return a;
   }

   protected dov(ebp.d $$0) {
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
   public ebq a(ded $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static ebq a(djn $$0, iw $$1, ebq $$2) {
      ebq $$3 = $$0.a_($$1.e());
      ebq $$4 = $$0.a_($$1.d());
      ebq $$5 = $$0.a_($$1.f());
      ebq $$6 = $$0.a_($$1.i());
      ebq $$7 = $$0.a_($$1.g());
      ebq $$8 = $$0.a_($$1.h());
      dno $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dnq.lb) || $$3.a(dnq.fY)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dnq.lb)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dnq.lb)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dnq.lb)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dnq.lb)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dnq.lb)));
   }

   @Override
   protected ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dnq.lb) || $$4 == jc.a && $$6.a(dnq.fY);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(ebq $$0, dkm $$1, iw $$2) {
      ebq $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jc $$5 : jc.c.a) {
         iw $$6 = $$2.a($$5);
         ebq $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            ebq $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dnq.fY)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dnq.fY);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(ebq $$0, eyp $$1) {
      return false;
   }
}
