import com.mojang.serialization.MapCodec;

public class dbg extends dfn {
   public static final MapCodec<dbg> a = b(dbg::new);

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   protected dbg(dmy.d $$0) {
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
   public dmz a(css $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dmz a(cwf $$0, ib $$1, dmz $$2) {
      dmz $$3 = $$0.a_($$1.d());
      dmz $$4 = $$0.a_($$1.c());
      dmz $$5 = $$0.a_($$1.e());
      dmz $$6 = $$0.a_($$1.h());
      dmz $$7 = $$0.a_($$1.f());
      dmz $$8 = $$0.a_($$1.g());
      daa $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dac.kv) || $$3.a(dac.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dac.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dac.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dac.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dac.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dac.kv)));
   }

   @Override
   protected dmz a(dmz $$0, ih $$1, dmz $$2, cxa $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dac.kv) || $$1 == ih.a && $$2.a(dac.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dmz $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dmz $$0, cxc $$1, ib $$2) {
      dmz $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ih $$5 : ih.c.a) {
         ib $$6 = $$2.a($$5);
         dmz $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dmz $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dac.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dac.fz);
   }

   @Override
   protected void a(dna.a<daa, dmz> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dmz $$0, cwf $$1, ib $$2, ejd $$3) {
      return false;
   }
}
