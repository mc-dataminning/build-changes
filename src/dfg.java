import com.mojang.serialization.MapCodec;

public class dfg extends djo {
   public static final MapCodec<dfg> a = b(dfg::new);

   @Override
   public MapCodec<dfg> a() {
      return a;
   }

   protected dfg(drc.d $$0) {
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
   public drd a(cxb $$0) {
      return a($$0.q(), $$0.a(), this.n());
   }

   public static drd a(daf $$0, io $$1, drd $$2) {
      drd $$3 = $$0.a_($$1.d());
      drd $$4 = $$0.a_($$1.c());
      drd $$5 = $$0.a_($$1.e());
      drd $$6 = $$0.a_($$1.h());
      drd $$7 = $$0.a_($$1.f());
      drd $$8 = $$0.a_($$1.g());
      dea $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dec.kv) || $$3.a(dec.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dec.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dec.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dec.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dec.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dec.kv)));
   }

   @Override
   protected drd a(drd $$0, it $$1, drd $$2, dba $$3, io $$4, io $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dec.kv) || $$1 == it.a && $$2.a(dec.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(drd $$0, aqn $$1, io $$2, aym $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(drd $$0, dbc $$1, io $$2) {
      drd $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (it $$5 : it.c.a) {
         io $$6 = $$2.a($$5);
         drd $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            drd $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dec.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dec.fz);
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(drd $$0, enl $$1) {
      return false;
   }
}
