import com.mojang.serialization.MapCodec;

public class dmd extends dgv implements dgy {
   public static final MapCodec<dmd> a = b(dmd::new);

   @Override
   public MapCodec<dmd> a() {
      return a;
   }

   public dmd(dtz.d $$0) {
      super($$0);
   }

   @Override
   public boolean b(ddv $$0, je $$1, dua $$2) {
      if (!$$0.a_($$1.d()).f()) {
         return false;
      } else {
         for (je $$3 : je.c($$1.b(-1, -1, -1), $$1.b(1, 1, 1))) {
            if ($$0.a_($$3).a(aws.aM)) {
               return true;
            }
         }

         return false;
      }
   }

   @Override
   public boolean a(dds $$0, azk $$1, je $$2, dua $$3) {
      return true;
   }

   @Override
   public void a(arg $$0, azk $$1, je $$2, dua $$3) {
      boolean $$4 = false;
      boolean $$5 = false;

      for (je $$6 : je.c($$2.b(-1, -1, -1), $$2.b(1, 1, 1))) {
         dua $$7 = $$0.a_($$6);
         if ($$7.a(dgx.on)) {
            $$5 = true;
         }

         if ($$7.a(dgx.ow)) {
            $$4 = true;
         }

         if ($$5 && $$4) {
            break;
         }
      }

      if ($$5 && $$4) {
         $$0.a($$2, $$1.h() ? dgx.on.o() : dgx.ow.o(), 3);
      } else if ($$5) {
         $$0.a($$2, dgx.on.o(), 3);
      } else if ($$4) {
         $$0.a($$2, dgx.ow.o(), 3);
      }
   }

   @Override
   public dgy.a at_() {
      return dgy.a.a;
   }
}
