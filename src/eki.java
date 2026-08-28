import com.mojang.serialization.Codec;
import java.util.Optional;

public class eki extends ejm<elz> {
   public eki(Codec<elz> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejo<elz> $$0) {
      djb $$1 = $$0.b();
      iu $$2 = $$0.e();
      azv $$3 = $$0.d();
      elz $$4 = $$0.f();
      Optional<ja> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iu $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && ejh.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         ejh.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ja> a(djb $$0, iu $$1, azv $$2) {
      boolean $$3 = ejh.b($$0.a_($$1.d()));
      boolean $$4 = ejh.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ja.a : ja.b);
      } else if ($$3) {
         return Optional.of(ja.a);
      } else {
         return $$4 ? Optional.of(ja.b) : Optional.empty();
      }
   }

   private static void a(djb $$0, azv $$1, iu $$2, elz $$3) {
      ejh.c($$0, $$2);

      for (ja $$4 : ja.c.a) {
         if (!($$1.i() > $$3.c)) {
            iu $$5 = $$2.a($$4);
            ejh.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               iu $$6 = $$5.a(ja.b($$1));
               ejh.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  iu $$7 = $$6.a(ja.b($$1));
                  ejh.c($$0, $$7);
               }
            }
         }
      }
   }
}
