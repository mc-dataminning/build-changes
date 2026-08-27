import com.mojang.serialization.MapCodec;

public class cye extends dcl {
   public static final MapCodec<cye> a = b(cye::new);

   @Override
   public MapCodec<cye> a() {
      return a;
   }

   protected cye(djo.d $$0) {
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
   public djp a(cpp $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static djp a(ctd $$0, hx $$1, djp $$2) {
      djp $$3 = $$0.a_($$1.d());
      djp $$4 = $$0.a_($$1.c());
      djp $$5 = $$0.a_($$1.e());
      djp $$6 = $$0.a_($$1.h());
      djp $$7 = $$0.a_($$1.f());
      djp $$8 = $$0.a_($$1.g());
      cwy $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cxa.kv) || $$3.a(cxa.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cxa.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cxa.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cxa.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cxa.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cxa.kv)));
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cxa.kv) || $$1 == ic.a && $$2.a(cxa.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(djp $$0, ane $$1, hx $$2, auw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(djp $$0, cua $$1, hx $$2) {
      djp $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ic $$5 : ic.c.a) {
         hx $$6 = $$2.a($$5);
         djp $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            djp $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cxa.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cxa.fz);
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(djp $$0, ctd $$1, hx $$2, efp $$3) {
      return false;
   }
}
