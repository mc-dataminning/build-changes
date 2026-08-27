import com.mojang.serialization.MapCodec;

public class czu extends deb {
   public static final MapCodec<czu> a = b(czu::new);

   @Override
   public MapCodec<czu> a() {
      return a;
   }

   protected czu(dle.d $$0) {
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
   public dlf a(crg $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dlf a(cut $$0, hz $$1, dlf $$2) {
      dlf $$3 = $$0.a_($$1.d());
      dlf $$4 = $$0.a_($$1.c());
      dlf $$5 = $$0.a_($$1.e());
      dlf $$6 = $$0.a_($$1.h());
      dlf $$7 = $$0.a_($$1.f());
      dlf $$8 = $$0.a_($$1.g());
      cyo $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cyq.kv) || $$3.a(cyq.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cyq.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cyq.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cyq.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cyq.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cyq.kv)));
   }

   @Override
   protected dlf a(dlf $$0, ie $$1, dlf $$2, cvo $$3, hz $$4, hz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cyq.kv) || $$1 == ie.a && $$2.a(cyq.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dlf $$0, aov $$1, hz $$2, awo $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dlf $$0, cvq $$1, hz $$2) {
      dlf $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ie $$5 : ie.c.a) {
         hz $$6 = $$2.a($$5);
         dlf $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dlf $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cyq.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cyq.fz);
   }

   @Override
   protected void a(dlg.a<cyo, dlf> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dlf $$0, cut $$1, hz $$2, ehf $$3) {
      return false;
   }
}
