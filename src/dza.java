import com.mojang.serialization.Codec;
import java.util.Optional;

public class dza extends dye<ear> {
   public dza(Codec<ear> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dyg<ear> $$0) {
      czh $$1 = $$0.b();
      id $$2 = $$0.e();
      axt $$3 = $$0.d();
      ear $$4 = $$0.f();
      Optional<ij> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         id $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dya.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dya.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ij> a(czh $$0, id $$1, axt $$2) {
      boolean $$3 = dya.b($$0.a_($$1.c()));
      boolean $$4 = dya.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ij.a : ij.b);
      } else if ($$3) {
         return Optional.of(ij.a);
      } else {
         return $$4 ? Optional.of(ij.b) : Optional.empty();
      }
   }

   private static void a(czh $$0, axt $$1, id $$2, ear $$3) {
      dya.c($$0, $$2);

      for (ij $$4 : ij.c.a) {
         if (!($$1.i() > $$3.c)) {
            id $$5 = $$2.a($$4);
            dya.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               id $$6 = $$5.a(ij.b($$1));
               dya.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  id $$7 = $$6.a(ij.b($$1));
                  dya.c($$0, $$7);
               }
            }
         }
      }
   }
}
