import com.mojang.serialization.Codec;
import java.util.Optional;

public class ebt extends eax<edk> {
   public ebt(Codec<edk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eaz<edk> $$0) {
      dby $$1 = $$0.b();
      iz $$2 = $$0.e();
      azg $$3 = $$0.d();
      edk $$4 = $$0.f();
      Optional<je> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iz $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && eat.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         eat.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<je> a(dby $$0, iz $$1, azg $$2) {
      boolean $$3 = eat.b($$0.a_($$1.c()));
      boolean $$4 = eat.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? je.a : je.b);
      } else if ($$3) {
         return Optional.of(je.a);
      } else {
         return $$4 ? Optional.of(je.b) : Optional.empty();
      }
   }

   private static void a(dby $$0, azg $$1, iz $$2, edk $$3) {
      eat.c($$0, $$2);

      for (je $$4 : je.c.a) {
         if (!($$1.i() > $$3.c)) {
            iz $$5 = $$2.a($$4);
            eat.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               iz $$6 = $$5.a(je.b($$1));
               eat.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  iz $$7 = $$6.a(je.b($$1));
                  eat.c($$0, $$7);
               }
            }
         }
      }
   }
}
