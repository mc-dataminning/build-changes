import com.mojang.serialization.MapCodec;

public class dbi extends dfp {
   public static final MapCodec<dbi> a = b(dbi::new);

   @Override
   public MapCodec<dbi> a() {
      return a;
   }

   protected dbi(dna.d $$0) {
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
   public dnb a(csu $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dnb a(cwh $$0, ib $$1, dnb $$2) {
      dnb $$3 = $$0.a_($$1.d());
      dnb $$4 = $$0.a_($$1.c());
      dnb $$5 = $$0.a_($$1.e());
      dnb $$6 = $$0.a_($$1.h());
      dnb $$7 = $$0.a_($$1.f());
      dnb $$8 = $$0.a_($$1.g());
      dac $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dae.kv) || $$3.a(dae.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dae.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dae.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dae.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dae.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dae.kv)));
   }

   @Override
   protected dnb a(dnb $$0, ih $$1, dnb $$2, cxc $$3, ib $$4, ib $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dae.kv) || $$1 == ih.a && $$2.a(dae.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dnb $$0, apf $$1, ib $$2, axd $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dnb $$0, cxe $$1, ib $$2) {
      dnb $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ih $$5 : ih.c.a) {
         ib $$6 = $$2.a($$5);
         dnb $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dnb $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(dae.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dae.fz);
   }

   @Override
   protected void a(dnc.a<dac, dnb> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dnb $$0, cwh $$1, ib $$2, eje $$3) {
      return false;
   }
}
