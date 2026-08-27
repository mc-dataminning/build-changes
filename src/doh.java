import com.mojang.serialization.Codec;
import java.util.Optional;

public class doh extends dnl<dpy> {
   public doh(Codec<dpy> $$0) {
      super($$0);
   }

   @Override
   public boolean a(dnn<dpy> $$0) {
      cpl $$1 = $$0.b();
      gv $$2 = $$0.e();
      art $$3 = $$0.d();
      dpy $$4 = $$0.f();
      Optional<hb> $$5 = a($$1, $$2, $$3);
      if ($$5.isEmpty()) {
         return false;
      } else {
         gv $$6 = $$2.a($$5.get().g());
         a($$1, $$3, $$6, $$4);
         int $$7 = $$3.i() < $$4.b && dnh.c($$1.a_($$2.a($$5.get()))) ? 2 : 1;
         dnh.a($$1, $$2, $$5.get(), $$7, false);
         return true;
      }
   }

   private static Optional<hb> a(cpl $$0, gv $$1, art $$2) {
      boolean $$3 = dnh.b($$0.a_($$1.c()));
      boolean $$4 = dnh.b($$0.a_($$1.d()));
      if ($$3 && $$4) {
         return Optional.of($$2.h() ? hb.a : hb.b);
      } else if ($$3) {
         return Optional.of(hb.a);
      } else {
         return $$4 ? Optional.of(hb.b) : Optional.empty();
      }
   }

   private static void a(cpl $$0, art $$1, gv $$2, dpy $$3) {
      dnh.c($$0, $$2);

      for (hb $$4 : hb.c.a) {
         if (!($$1.i() > $$3.c)) {
            gv $$5 = $$2.a($$4);
            dnh.c($$0, $$5);
            if (!($$1.i() > $$3.d)) {
               gv $$6 = $$5.a(hb.b($$1));
               dnh.c($$0, $$6);
               if (!($$1.i() > $$3.e)) {
                  gv $$7 = $$6.a(hb.b($$1));
                  dnh.c($$0, $$7);
               }
            }
         }
      }
   }
}
