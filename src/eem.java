import com.mojang.serialization.Codec;
import java.util.Optional;

public class eem extends edq<egd> {
   public eem(Codec<egd> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eds<egd> $$0) {
      deh $$1 = $$0.b();
      je $$2 = $$0.e();
      azl $$3 = $$0.d();
      egd $$4 = $$0.f();
      Optional<jj> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         je $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && edl.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         edl.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jj> a(deh $$0, je $$1, azl $$2) {
      boolean $$3 = edl.b($$0.a_($$1.d()));
      boolean $$4 = edl.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jj.a : jj.b);
      } else if ($$3) {
         return Optional.of(jj.a);
      } else {
         return $$4 ? Optional.of(jj.b) : Optional.empty();
      }
   }

   private static void a(deh $$0, azl $$1, je $$2, egd $$3) {
      edl.c($$0, $$2);

      for (jj $$4 : jj.c.a) {
         if (!($$1.i() > $$3.c)) {
            je $$5 = $$2.a($$4);
            edl.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               je $$6 = $$5.a(jj.b($$1));
               edl.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  je $$7 = $$6.a(jj.b($$1));
                  edl.c($$0, $$7);
               }
            }
         }
      }
   }
}
