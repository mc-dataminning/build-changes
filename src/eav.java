import com.mojang.serialization.Codec;
import java.util.Optional;

public class eav extends dzz<ecm> {
   public eav(Codec<ecm> $$0) {
      super($$0);
   }

   @Override
   public boolean a(eab<ecm> $$0) {
      dba $$1 = $$0.b();
      io $$2 = $$0.e();
      aym $$3 = $$0.d();
      ecm $$4 = $$0.f();
      Optional<it> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         io $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dzv.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dzv.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<it> a(dba $$0, io $$1, aym $$2) {
      boolean $$3 = dzv.b($$0.a_($$1.c()));
      boolean $$4 = dzv.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? it.a : it.b);
      } else if ($$3) {
         return Optional.of(it.a);
      } else {
         return $$4 ? Optional.of(it.b) : Optional.empty();
      }
   }

   private static void a(dba $$0, aym $$1, io $$2, ecm $$3) {
      dzv.c($$0, $$2);

      for (it $$4 : it.c.a) {
         if (!($$1.i() > $$3.c)) {
            io $$5 = $$2.a($$4);
            dzv.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               io $$6 = $$5.a(it.b($$1));
               dzv.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  io $$7 = $$6.a(it.b($$1));
                  dzv.c($$0, $$7);
               }
            }
         }
      }
   }
}
