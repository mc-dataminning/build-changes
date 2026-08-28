import com.mojang.serialization.MapCodec;

public class dhe extends dlm {
   public static final MapCodec<dhe> a = b(dhe::new);

   @Override
   public MapCodec<dhe> a() {
      return a;
   }

   protected dhe(dtb.d $$0) {
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
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dtc a(dcc $$0, jd $$1, dtc $$2) {
      dtc $$3 = $$0.a_($$1.e());
      dtc $$4 = $$0.a_($$1.d());
      dtc $$5 = $$0.a_($$1.f());
      dtc $$6 = $$0.a_($$1.i());
      dtc $$7 = $$0.a_($$1.g());
      dtc $$8 = $$0.a_($$1.h());
      dfy $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(dga.kv) || $$3.a(dga.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(dga.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(dga.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(dga.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(dga.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(dga.kv)));
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(dga.kv) || $$1 == ji.a && $$2.a(dga.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dtc $$0, dcz $$1, jd $$2) {
      dtc $$3 = $$1.a_($$2.e());
      boolean $$4 = !$$1.a_($$2.d()).i() && !$$3.i();

      for (ji $$5 : ji.c.a) {
         jd $$6 = $$2.a($$5);
         dtc $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dtc $$8 = $$1.a_($$6.e());
            if ($$8.a(this) || $$8.a(dga.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(dga.fz);
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
