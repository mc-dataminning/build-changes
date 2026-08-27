import com.mojang.serialization.MapCodec;

public class czy extends def {
   public static final MapCodec<czy> a = b(czy::new);

   @Override
   public MapCodec<czy> a() {
      return a;
   }

   protected czy(dli.d $$0) {
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
   public dlj a(crk $$0) {
      return a($$0.q(), $$0.a(), this.o());
   }

   public static dlj a(cux $$0, hz $$1, dlj $$2) {
      dlj $$3 = $$0.a_($$1.d());
      dlj $$4 = $$0.a_($$1.c());
      dlj $$5 = $$0.a_($$1.e());
      dlj $$6 = $$0.a_($$1.h());
      dlj $$7 = $$0.a_($$1.f());
      dlj $$8 = $$0.a_($$1.g());
      cys $$9 = $$2.b();
      return $$2.b(g, Boolean.valueOf($$3.a($$9) || $$3.a(cyu.kv) || $$3.a(cyu.fz)))
         .b(f, Boolean.valueOf($$4.a($$9) || $$4.a(cyu.kv)))
         .b(b, Boolean.valueOf($$5.a($$9) || $$5.a(cyu.kv)))
         .b(c, Boolean.valueOf($$6.a($$9) || $$6.a(cyu.kv)))
         .b(d, Boolean.valueOf($$7.a($$9) || $$7.a(cyu.kv)))
         .b(e, Boolean.valueOf($$8.a($$9) || $$8.a(cyu.kv)));
   }

   @Override
   protected dlj a(dlj $$0, ie $$1, dlj $$2, cvs $$3, hz $$4, hz $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
         return super.a($$0, $$1, $$2, $$3, $$4, $$5);
      } else {
         boolean $$6 = $$2.a(this) || $$2.a(cyu.kv) || $$1 == ie.a && $$2.a(cyu.fz);
         return $$0.a(h.get($$1), Boolean.valueOf($$6));
      }
   }

   @Override
   protected void a(dlj $$0, aow $$1, hz $$2, awp $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected boolean a(dlj $$0, cvu $$1, hz $$2) {
      dlj $$3 = $$1.a_($$2.d());
      boolean $$4 = !$$1.a_($$2.c()).i() && !$$3.i();

      for (ie $$5 : ie.c.a) {
         hz $$6 = $$2.a($$5);
         dlj $$7 = $$1.a_($$6);
         if ($$7.a(this)) {
            if ($$4) {
               return false;
            }

            dlj $$8 = $$1.a_($$6.d());
            if ($$8.a(this) || $$8.a(cyu.fz)) {
               return true;
            }
         }
      }

      return $$3.a(this) || $$3.a(cyu.fz);
   }

   @Override
   protected void a(dlk.a<cys, dlj> $$0) {
      $$0.a(b, c, d, e, f, g);
   }

   @Override
   protected boolean a(dlj $$0, cux $$1, hz $$2, ehm $$3) {
      return false;
   }
}
