import com.mojang.serialization.MapCodec;

public class dis extends dna {
   public static final MapCodec<dis> a = b(dis::new);

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   protected dis(dur.d $$0) {
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
   public dus a(czn $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static dus a(ddo $$0, jf $$1, dus $$2) {
      dus $$3 = $$0.a_($$1.e());
      dus $$4 = $$0.a_($$1.d());
      dus $$5 = $$0.a_($$1.f());
      dus $$6 = $$0.a_($$1.i());
      dus $$7 = $$0.a_($$1.g());
      dus $$8 = $$0.a_($$1.h());
      dhm $$9 = $$2.b();
      return $$2.c(g, Boolean.valueOf($$3.a($$9) || $$3.a(dho.kv) || $$3.a(dho.fz)))
         .c(f, Boolean.valueOf($$4.a($$9) || $$4.a(dho.kv)))
         .c(b, Boolean.valueOf($$5.a($$9) || $$5.a(dho.kv)))
         .c(c, Boolean.valueOf($$6.a($$9) || $$6.a(dho.kv)))
         .c(d, Boolean.valueOf($$7.a($$9) || $$7.a(dho.kv)))
         .c(e, Boolean.valueOf($$8.a($$9) || $$8.a(dho.kv)));
   }

   @Override
   protected dus a(dus $$0, jk $$1, dus $$2, dek $$3, jf $$4, jf $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dho.kv) || $$1 == jk.a && $$2.a(dho.fz);
         return $$0.b(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dus $$0, arj $$1, jf $$2, azn $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dus $$0, dem $$1, jf $$2) {
      dus $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).l() && !$$3.l();

      for (jk $$5 : jk.c.a) {
         jf $$6 = $$2.a($$5);
         dus $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dus $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dho.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dho.fz);
   }

   @Override
   protected void a(dut.a<dhm, dus> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dus $$0, eri $$1) {
      return false;
   }
}
