import com.mojang.serialization.MapCodec;

public class dna extends drm {
   public static final MapCodec<dna> a = b(dna::new);

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(dzn.d $$0) {
      super(10.0F, $$0);
      this.l(
         this.B
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
   public dzo a(dcl $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static dzo a(dhv $$0, iu $$1, dzo $$2) {
      dzo $$3 = $$0.a_($$1.e());
      dzo $$4 = $$0.a_($$1.d());
      dzo $$5 = $$0.a_($$1.f());
      dzo $$6 = $$0.a_($$1.i());
      dzo $$7 = $$0.a_($$1.g());
      dzo $$8 = $$0.a_($$1.h());
      dlu $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dlw.kX) || $$3.a(dlw.fU)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dlw.kX)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dlw.kX)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dlw.kX)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dlw.kX)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dlw.kX)));
   }

   @Override
   protected dzo a(dzo $$0, dis $$1, dje $$2, iu $$3, ja $$4, iu $$5, dzo $$6, azt $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dlw.kX) || $$4 == ja.a && $$6.a(dlw.fU);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dzo $$0, dis $$1, iu $$2) {
      dzo $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (ja $$5 : ja.c.a) {
         iu $$6 = $$2.a($$5);
         dzo $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dzo $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dlw.fU)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dlw.fU);
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dzo $$0, ewk $$1) {
      return false;
   }
}
