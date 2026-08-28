import com.mojang.serialization.MapCodec;

public class dge extends dkm {
   public static final MapCodec<dge> a = b(dge::new);

   @Override
   public MapCodec<dge> a() {
      return a;
   }

   protected dge(dsa.d $$0) {
      super(0.3125F, $$0);
      this.k(
         this.E
            .b()
            .a(b, Boolean.valueOf(false))
            .a(c, Boolean.valueOf(false))
            .a(d, Boolean.valueOf(false))
            .a(e, Boolean.valueOf(false))
            .a(f, Boolean.valueOf(false))
            .a(g, Boolean.valueOf(false))
      );
   }

   @Override
   public dsb a(cxz $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dsb a(dbd $$0, iz $$1, dsb $$2) {
      dsb $$3 = $$0.a_($$1.d());
      dsb $$4 = $$0.a_($$1.c());
      dsb $$5 = $$0.a_($$1.e());
      dsb $$6 = $$0.a_($$1.h());
      dsb $$7 = $$0.a_($$1.f());
      dsb $$8 = $$0.a_($$1.g());
      dey $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dfa.kv) || $$3.a(dfa.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dfa.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dfa.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dfa.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dfa.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dfa.kv)));
   }

   @Override
   protected dsb a(dsb $$0, je $$1, dsb $$2, dby $$3, iz $$4, iz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dfa.kv) || $$1 == je.a && $$2.a(dfa.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dsb $$0, are $$1, iz $$2, azg $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dsb $$0, dca $$1, iz $$2) {
      dsb $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (je $$5 : je.c.a) {
         iz $$6 = $$2.a($$5);
         dsb $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dsb $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dfa.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dfa.fz);
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
