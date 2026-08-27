import com.mojang.serialization.MapCodec;

public class daa extends cut implements cuw {
   public static final MapCodec<daa> a = b(daa::new);

   @Override
   public MapCodec<daa> a() {
      return a;
   }

   public daa(dgv.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(crv $$0, ht $$1, dgw $$2) {
      if (!$$0.a_($$1.c()).a((cqy)$$0, $$1)) {
         return false;
      } else {
         for (ht $$3 : ht.a($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(arc.aK)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(crs $$0, ato $$1, ht $$2, dgw $$3) {
      return true;
   }

   @Override
   public void a(ama $$0, ato $$1, ht $$2, dgw $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (ht $$6 : ht.a($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dgw $$7 = $$0.a_($$6);
         if ($$7.a(cuv.on)) {
            $$5 = true;
         }

         if ($$7.a(cuv.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? cuv.on.o() : cuv.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, cuv.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, cuv.ow.o(), 3);
      }
   }
}
