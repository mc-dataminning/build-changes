import com.mojang.serialization.MapCodec;

public class cvg extends czm {
   public static final MapCodec<cvg> a = b(cvg::new);

   @Override
   public MapCodec<cvg> a() {
      return a;
   }

   protected cvg(dga.d $$0) {
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
   public dgb a(cmr $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dgb a(cqf $$0, ht $$1, dgb $$2) {
      dgb $$3 = $$0.a_($$1.d());
      dgb $$4 = $$0.a_($$1.c());
      dgb $$5 = $$0.a_($$1.e());
      dgb $$6 = $$0.a_($$1.h());
      dgb $$7 = $$0.a_($$1.f());
      dgb $$8 = $$0.a_($$1.g());
      cua $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cuc.kv) || $$3.a(cuc.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cuc.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cuc.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cuc.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cuc.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cuc.kv)));
   }

   @Override
   public dgb a(dgb $$0, hx $$1, dgb $$2, cra $$3, ht $$4, ht $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cuc.kv) || $$1 == hx.a && $$2.a(cuc.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   public void a(dgb $$0, alq $$1, ht $$2, ate $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   public boolean a(dgb $$0, crc $$1, ht $$2) {
      dgb $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (hx $$5 : hx.c.a) {
         ht $$6 = $$2.a($$5);
         dgb $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dgb $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cuc.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cuc.fz);
   }

   @Override
   protected void a(dgc.a<cua, dgb> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   public boolean a(dgb $$0, cqf $$1, ht $$2, ebu $$3) {
      return false;
   }
}
