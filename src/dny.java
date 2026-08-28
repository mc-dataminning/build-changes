import com.mojang.serialization.MapCodec;

public class dny extends dsl {
   public static final MapCodec<dny> a = b(dny::new);

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   protected dny(eas.d $$0) {
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
   public eat a(ddg $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static eat a(diq $$0, iv $$1, eat $$2) {
      eat $$3 = $$0.a_($$1.e());
      eat $$4 = $$0.a_($$1.d());
      eat $$5 = $$0.a_($$1.f());
      eat $$6 = $$0.a_($$1.i());
      eat $$7 = $$0.a_($$1.g());
      eat $$8 = $$0.a_($$1.h());
      dmr $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dmt.lb) || $$3.a(dmt.fY)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dmt.lb)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dmt.lb)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dmt.lb)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dmt.lb)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dmt.lb)));
   }

   @Override
   protected eat a(eat $$0, djp $$1, dkb $$2, iv $$3, jb $$4, iv $$5, eat $$6, azv $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dmt.lb) || $$4 == jb.a && $$6.a(dmt.fY);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(eat $$0, arq $$1, iv $$2, azv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(eat $$0, djp $$1, iv $$2) {
      eat $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jb $$5 : jb.c.a) {
         iv $$6 = $$2.a($$5);
         eat $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            eat $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dmt.fY)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dmt.fY);
   }

   @Override
   protected void a(eau.a<dmr, eat> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(eat $$0, exp $$1) {
      return false;
   }
}
