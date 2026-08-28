import java.util.Optional;
import javax.annotation.Nullable;

public interface dna extends dgf, dkp {
   @Override
   default boolean a(@Nullable cmx $$0, dcc $$1, jd $$2, dtc $$3, epb $$4) {
      return $$4 == epd.c;
   }

   @Override
   default boolean a(dcx $$0, jd $$1, dtc $$2, epc $$3) {
      if (!$$2.c(dts.C) && $$3.a() == epd.c) {
         if (!$$0.x_()) {
            $$0.a($$1, $$2.a(dts.C, Boolean.valueOf(true)), 3);
            $$0.a($$1, $$3.a(), $$3.a().a($$0));
         }

         return true;
      } else {
         return false;
      }
   }

   @Override
   default cuq a(@Nullable cmx $$0, dcx $$1, jd $$2, dtc $$3) {
      if ($$3.c(dts.C)) {
         $$1.a($$2, $$3.a(dts.C, Boolean.valueOf(false)), 3);
         if (!$$3.a($$1, $$2)) {
            $$1.b($$2, true);
         }

         return new cuq(cut.qz);
      } else {
         return cuq.l;
      }
   }

   @Override
   default Optional<avo> aw_() {
      return epd.c.j();
   }
}
