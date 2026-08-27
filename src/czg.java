import com.mojang.serialization.MapCodec;

public class czg extends cua implements cud {
   public static final MapCodec<czg> a = b(czg::new);

   @Override
   public MapCodec<czg> a() {
      return a;
   }

   public czg(dga.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crc $$0, ht $$1, dgb $$2) {
      if (!$$0.a_($$1.c()).a((cqf)$$0, $$1)) {
         return false;
      } else {
         for (ht $$3 : ht.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(aqs.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(cqz $$0, ate $$1, ht $$2, dgb $$3) {
      return true;
   }

   @Override
   public void a(alq $$0, ate $$1, ht $$2, dgb $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ht $$6 : ht.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dgb $$7 = $$0.a_($$6);
         if ($$7.a(cuc.on)) {
            $$5 = true;
         }

         if ($$7.a(cuc.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cuc.on.o() : cuc.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cuc.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cuc.ow.o(), 3);
      }
   }
}
