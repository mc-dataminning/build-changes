import com.mojang.serialization.MapCodec;

public class dbq extends cwj implements cwm {
   public static final MapCodec<dbq> a = b(dbq::new);

   @Override
   public MapCodec<dbq> a() {
      return a;
   }

   public dbq(diz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctl $$0, hx $$1, dja $$2) {
      if (!$$0.a_($$1.c()).a((cso)$$0, $$1)) {
         return false;
      } else {
         for (hx $$3 : hx.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(asb.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cti $$0, aup $$1, hx $$2, dja $$3) {
      return true;
   }

   @Override
   public void a(amz $$0, aup $$1, hx $$2, dja $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (hx $$6 : hx.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dja $$7 = $$0.a_($$6);
         if ($$7.a(cwl.on)) {
            $$5 = true;
         }

         if ($$7.a(cwl.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cwl.on.o() : cwl.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cwl.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cwl.ow.o(), 3);
      }
   }
}
