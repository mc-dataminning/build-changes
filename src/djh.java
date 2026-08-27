import java.util.Optional;
import javax.annotation.Nullable;

public interface djh extends dco, dgx {
   @Override
   default boolean a(@Nullable cka $$0, cym $$1, id $$2, dpi $$3, ela $$4) {
      return $$4 == elc.c;
   }

   @Override
   default boolean a(czh $$0, id $$1, dpi $$2, elb $$3) {
      if (!$$2.c(dpy.C) && $$3.a() == elc.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dpy.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default crs a(@Nullable cka $$0, czh $$1, id $$2, dpi $$3) {
      if ($$3.c(dpy.C)) {
         $$1.a($$2, $$3.a(dpy.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new crs(crv.qy);
      } else {
         return crs.i;
      }
   }

   @Override
   default Optional<aun> as_() {
      return elc.c.j();
   }
}
