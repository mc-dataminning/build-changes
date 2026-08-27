import java.util.stream.Stream;

public class cuj {
   public static bqb<cuh> a(dca $$0, cly $$1, bpz $$2) {
      $$1.c($$2);
      return bqb.b($$1.b($$2));
   }

   public static cuh a(cuh $$0, cly $$1, cuh $$2, boolean $$3) {
      boolean $$4 = $$1.fY();
      if ($$3 && $$4) {
         if (!$$1.gl().i($$2)) {
            $$1.gl().f($$2);
         }

         return $$0;
      } else {
         $$0.a(1, $$1);
         if ($$0.d()) {
            return $$2;
         } else {
            if (!$$1.gl().f($$2)) {
               $$1.a($$2, false);
            }

            return $$0;
         }
      }
   }

   public static cuh a(cuh $$0, cly $$1, cuh $$2) {
      return a($$0, $$1, $$2, true);
   }

   public static void a(cig $$0, Stream<cuh> $$1) {
      dca $$2 = $$0.dU();
      if (!$$2.C) {
         $$1.forEach($$2x -> $$2.b(new cig($$2, $$0.dz(), $$0.dB(), $$0.dF(), $$2x)));
      }
   }
}
