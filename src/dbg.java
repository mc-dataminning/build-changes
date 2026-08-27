import com.mojang.serialization.MapCodec;

public class dbg extends cvz implements cwc {
   public static final MapCodec<dbg> a = b(dbg::new);

   @Override
   public MapCodec<dbg> a() {
      return a;
   }

   public dbg(dio.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ctb $$0, hv $$1, dip $$2) {
      if (!$$0.a_($$1.c()).a((cse)$$0, $$1)) {
         return false;
      } else {
         for (hv $$3 : hv.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(arr.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(csy $$0, auf $$1, hv $$2, dip $$3) {
      return true;
   }

   @Override
   public void a(amp $$0, auf $$1, hv $$2, dip $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (hv $$6 : hv.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dip $$7 = $$0.a_($$6);
         if ($$7.a(cwb.on)) {
            $$5 = true;
         }

         if ($$7.a(cwb.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cwb.on.o() : cwb.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cwb.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cwb.ow.o(), 3);
      }
   }
}
