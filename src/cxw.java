import com.mojang.serialization.MapCodec;

public class cxw extends dcd {
   public static final MapCodec<cxw> a = b(cxw::new);

   @Override
   public MapCodec<cxw> a() {
      return a;
   }

   protected cxw(djg.d $$0) {
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
   public djh a(cph $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static djh a(csv $$0, hx $$1, djh $$2) {
      djh $$3 = $$0.a_($$1.d());
      djh $$4 = $$0.a_($$1.c());
      djh $$5 = $$0.a_($$1.e());
      djh $$6 = $$0.a_($$1.h());
      djh $$7 = $$0.a_($$1.f());
      djh $$8 = $$0.a_($$1.g());
      cwq $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cws.kv) || $$3.a(cws.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cws.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cws.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cws.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cws.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cws.kv)));
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cws.kv) || $$1 == ic.a && $$2.a(cws.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(djh $$0, and $$1, hx $$2, auv $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(djh $$0, cts $$1, hx $$2) {
      djh $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ic $$5 : ic.c.a) {
         hx $$6 = $$2.a($$5);
         djh $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            djh $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cws.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cws.fz);
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(djh $$0, csv $$1, hx $$2, efh $$3) {
      return false;
   }
}
