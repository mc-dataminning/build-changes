import java.util.Optional;
import javax.annotation.Nullable;

public interface djw extends ddc, dhm {
   @Override
   default boolean a(@Nullable ckl $$0, cza $$1, im $$2, dpy $$3, elq $$4) {
      return $$4 == els.c;
   }

   @Override
   default boolean a(czv $$0, im $$1, dpy $$2, elr $$3) {
      if (!$$2.c(dqo.C) && $$3.a() == els.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dqo.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default csd a(@Nullable ckl $$0, czv $$1, im $$2, dpy $$3) {
      if ($$3.c(dqo.C)) {
         $$1.a($$2, $$3.a(dqo.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new csd(csg.qz);
      } else {
         return csd.i;
      }
   }

   @Override
   default Optional<auy> as_() {
      return els.c.j();
   }
}
