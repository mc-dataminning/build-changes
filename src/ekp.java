import com.mojang.serialization.Codec;
import java.util.Optional;

public class ekp extends ejt<emg> {
   public ekp(Codec<emg> $$0) {
      super($$0);
   }

   @Override
   public boolean a(ejv<emg> $$0) {
      dji $$1 = $$0.b();
      iv $$2 = $$0.e();
      azv $$3 = $$0.d();
      emg $$4 = $$0.f();
      Optional<jb> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         iv $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && ejo.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         ejo.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<jb> a(dji $$0, iv $$1, azv $$2) {
      boolean $$3 = ejo.b($$0.a_($$1.d()));
      boolean $$4 = ejo.b($$0.a_($$1.e()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? jb.a : jb.b);
      } else if ($$3) {
         return Optional.of(jb.a);
      } else {
         return $$4 ? Optional.of(jb.b) : Optional.empty();
      }
   }

   private static void a(dji $$0, azv $$1, iv $$2, emg $$3) {
      ejo.c($$0, $$2);

      for (jb $$4 : jb.c.a) {
         if (!($$1.i() > $$3.c)) {
            iv $$5 = $$2.a($$4);
            ejo.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               iv $$6 = $$5.a(jb.b($$1));
               ejo.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  iv $$7 = $$6.a(jb.b($$1));
                  ejo.c($$0, $$7);
               }
            }
         }
      }
   }
}
