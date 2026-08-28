import com.mojang.serialization.Codec;
import java.util.Optional;

public class ecg extends ebk<edx> {
   public ecg(Codec<edx> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ebm<edx> $$0) {
      dcg $$1 = $$0.b();
      ja $$2 = $$0.e();
      ayo $$3 = $$0.d();
      edx $$4 = $$0.f();
      Optional<jf> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ja $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && ebg.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         ebg.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jf> a(dcg $$0, ja $$1, ayo $$2) {
      boolean $$3 = ebg.b($$0.a_($$1.c()));
      boolean $$4 = ebg.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jf.a : jf.b);
      } else if ($$3) {
         return Optional.of(jf.a);
      } else {
         return $$4 ? Optional.of(jf.b) : Optional.empty();
      }
   }

   private static void a(dcg $$0, ayo $$1, ja $$2, edx $$3) {
      ebg.c($$0, $$2);

      for (jf $$4 : jf.c.a) {
         if (!($$1.i() > $$3.c)) {
            ja $$5 = $$2.a($$4);
            ebg.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               ja $$6 = $$5.a(jf.b($$1));
               ebg.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  ja $$7 = $$6.a(jf.b($$1));
                  ebg.c($$0, $$7);
               }
            }
         }
      }
   }
}
