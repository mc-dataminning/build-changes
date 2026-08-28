import com.mojang.serialization.Codec;
import java.util.Optional;

public class els extends ekw<enk> {
   public els(Codec<enk> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eky<enk> $$0) {
      dkk $$1 = $$0.b();
      iw $$2 = $$0.e();
      bai $$3 = $$0.d();
      enk $$4 = $$0.f();
      Optional<jc> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iw $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && ekq.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         ekq.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jc> a(dkk $$0, iw $$1, bai $$2) {
      boolean $$3 = ekq.b($$0.a_($$1.d()));
      boolean $$4 = ekq.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jc.a : jc.b);
      } else if ($$3) {
         return Optional.of(jc.a);
      } else {
         return $$4 ? Optional.of(jc.b) : Optional.empty();
      }
   }

   private static void a(dkk $$0, bai $$1, iw $$2, enk $$3) {
      ekq.c($$0, $$2);

      for (jc $$4 : jc.c.a) {
         if (!($$1.i() > $$3.c)) {
            iw $$5 = $$2.a($$4);
            ekq.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               iw $$6 = $$5.a(jc.b($$1));
               ekq.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  iw $$7 = $$6.a(jc.b($$1));
                  ekq.c($$0, $$7);
               }
            }
         }
      }
   }
}
