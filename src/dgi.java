import com.mojang.serialization.MapCodec;

public class dgi extends dkw {
   public static final MapCodec<dgi> a = b(dgi::new);

   @Override
   public MapCodec<dgi> a() {
      return a;
   }

   protected dgi(dtb.d $$0) {
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
   public dtc a(cyd $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static dtc a(dbg $$0, ir $$1, dtc $$2) {
      dtc $$3 = $$0.a_($$1.d());
      dtc $$4 = $$0.a_($$1.c());
      dtc $$5 = $$0.a_($$1.e());
      dtc $$6 = $$0.a_($$1.h());
      dtc $$7 = $$0.a_($$1.f());
      dtc $$8 = $$0.a_($$1.g());
      dfc $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dfe.lp) || $$3.a(dfe.gr)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dfe.lp)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dfe.lp)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dfe.lp)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dfe.lp)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dfe.lp)));
   }

   @Override
   protected dtc a(dtc $$0, iw $$1, dtc $$2, dcb $$3, ir $$4, ir $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dfe.lp) || $$1 == iw.a && $$2.a(dfe.gr);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcd $$1, ir $$2) {
      dtc $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (iw $$5 : iw.c.a) {
         ir $$6 = $$2.a($$5);
         dtc $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dtc $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dfe.gr)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dfe.gr);
   }

   @Override
   protected void a(dtd.a<dfc, dtc> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
