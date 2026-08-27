import com.mojang.serialization.MapCodec;

public class cxv extends dcc {
   public static final MapCodec<cxv> a = b(cxv::new);

   @Override
   public MapCodec<cxv> a() {
      return a;
   }

   protected cxv(djf.d $$0) {
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
   public djg a(cpg $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static djg a(csu $$0, hx $$1, djg $$2) {
      djg $$3 = $$0.a_($$1.d());
      djg $$4 = $$0.a_($$1.c());
      djg $$5 = $$0.a_($$1.e());
      djg $$6 = $$0.a_($$1.h());
      djg $$7 = $$0.a_($$1.f());
      djg $$8 = $$0.a_($$1.g());
      cwp $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cwr.kv) || $$3.a(cwr.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cwr.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cwr.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cwr.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cwr.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cwr.kv)));
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cwr.kv) || $$1 == ic.a && $$2.a(cwr.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(djg $$0, and $$1, hx $$2, auu $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(djg $$0, ctr $$1, hx $$2) {
      djg $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ic $$5 : ic.c.a) {
         hx $$6 = $$2.a($$5);
         djg $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            djg $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cwr.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cwr.fz);
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(djg $$0, csu $$1, hx $$2, efg $$3) {
      return false;
   }
}
