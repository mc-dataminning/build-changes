import com.mojang.serialization.MapCodec;

public class doj extends dsw {
   public static final MapCodec<doj> a = b(doj::new);

   @Override
   public MapCodec<doj> a() {
      return a;
   }

   protected doj(ebd.d $$0) {
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
   public ebe a(ddr $$0) {
      return a($$0.q(), $$0.a(), this.m());
   }

   public static ebe a(djb $$0, iv $$1, ebe $$2) {
      ebe $$3 = $$0.a_($$1.e());
      ebe $$4 = $$0.a_($$1.d());
      ebe $$5 = $$0.a_($$1.f());
      ebe $$6 = $$0.a_($$1.i());
      ebe $$7 = $$0.a_($$1.g());
      ebe $$8 = $$0.a_($$1.h());
      dnc $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dne.lb) || $$3.a(dne.fY)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dne.lb)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dne.lb)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dne.lb)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dne.lb)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dne.lb)));
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      if (!$$0.a($$1, $$3)) {
         $$2.a($$3, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         boolean $$8 = $$6.a(this) || $$6.a(dne.lb) || $$4 == jb.a && $$6.a(dne.fY);
         return $$0.b(h.get($$4), Boolean.valueOf($$8));
      }
   }

   @Override
   protected void a(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(ebe $$0, dka $$1, iv $$2) {
      ebe $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jb $$5 : jb.c.a) {
         iv $$6 = $$2.a($$5);
         ebe $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            ebe $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dne.fY)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dne.fY);
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(ebe $$0, eyd $$1) {
      return false;
   }
}
