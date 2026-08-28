import com.mojang.serialization.Codec;
import java.util.Optional;

public class ein extends ehr<eke> {
   public ein(Codec<eke> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eht<eke> $$0) {
      dhq $$1 = $$0.b();
      jj $$2 = $$0.e();
      azs $$3 = $$0.d();
      eke $$4 = $$0.f();
      Optional<jo> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         jj $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && ehm.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         ehm.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jo> a(dhq $$0, jj $$1, azs $$2) {
      boolean $$3 = ehm.b($$0.a_($$1.d()));
      boolean $$4 = ehm.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jo.a : jo.b);
      } else if ($$3) {
         return Optional.of(jo.a);
      } else {
         return $$4 ? Optional.of(jo.b) : Optional.empty();
      }
   }

   private static void a(dhq $$0, azs $$1, jj $$2, eke $$3) {
      ehm.c($$0, $$2);

      for (jo $$4 : jo.c.a) {
         if (!($$1.i() > $$3.c)) {
            jj $$5 = $$2.a($$4);
            ehm.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               jj $$6 = $$5.a(jo.b($$1));
               ehm.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  jj $$7 = $$6.a(jo.b($$1));
                  ehm.c($$0, $$7);
               }
            }
         }
      }
   }
}
