import com.mojang.serialization.Codec;
import java.util.Optional;

public class dvq extends duu<dxh> {
   public dvq(Codec<dxh> $$0) {
      super($$0);
   }

   @Override
   public boolean a(duw<dxh> $$0) {
      cwf $$1 = $$0.b();
      ib $$2 = $$0.e();
      awt $$3 = $$0.d();
      dxh $$4 = $$0.f();
      Optional<ih> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         ib $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && duq.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         duq.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<ih> a(cwf $$0, ib $$1, awt $$2) {
      boolean $$3 = duq.b($$0.a_($$1.c()));
      boolean $$4 = duq.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? ih.a : ih.b);
      } else if ($$3) {
         return Optional.of(ih.a);
      } else {
         return $$4 ? Optional.of(ih.b) : Optional.empty();
      }
   }

   private static void a(cwf $$0, awt $$1, ib $$2, dxh $$3) {
      duq.c($$0, $$2);

      for (ih $$4 : ih.c.a) {
         if (!($$1.i() > $$3.c)) {
            ib $$5 = $$2.a($$4);
            duq.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               ib $$6 = $$5.a(ih.b($$1));
               duq.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  ib $$7 = $$6.a(ih.b($$1));
                  duq.c($$0, $$7);
               }
            }
         }
      }
   }
}
