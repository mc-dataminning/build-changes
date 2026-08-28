import com.mojang.serialization.Codec;
import java.util.Optional;

public class ech extends ebl<edy> {
   public ech(Codec<edy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebn<edy> $$0) {
      dch $$1 = $$0.b();
      ja $$2 = $$0.e();
      ayo $$3 = $$0.d();
      edy $$4 = $$0.f();
      Optional<jf> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ja $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && ebh.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         ebh.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jf> a(dch $$0, ja $$1, ayo $$2) {
      boolean $$3 = ebh.b($$0.a_($$1.c()));
      boolean $$4 = ebh.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jf.a : jf.b);
      } else if ($$3) {
         return Optional.of(jf.a);
      } else {
         return $$4 ? Optional.of(jf.b) : Optional.empty();
      }
   }

   private static void a(dch $$0, ayo $$1, ja $$2, edy $$3) {
      ebh.c($$0, $$2);

      for (jf $$4 : jf.c.a) {
         if (!($$1.i() > $$3.c)) {
            ja $$5 = $$2.a($$4);
            ebh.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               ja $$6 = $$5.a(jf.b($$1));
               ebh.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  ja $$7 = $$6.a(jf.b($$1));
                  ebh.c($$0, $$7);
               }
            }
         }
      }
   }
}
