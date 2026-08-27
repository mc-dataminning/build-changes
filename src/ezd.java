import java.util.List;
import java.util.Optional;
import java.util.Map.Entry;
import org.joml.Vector3f;

public class ezd {
   public static void a(fnn<?> $$0, ezb $$1, long $$2, float $$3, Vector3f $$4) {
      float $$5 = a($$1, $$2);

      for (Entry<String, List<eza>> $$6 : $$1.c().entrySet()) {
         Optional<fqf> $$7 = $$0.a($$6.getKey());
         List<eza> $$8 = $$6.getValue();
         $$7.ifPresent($$4x -> $$8.forEach($$4xx -> {
               ezc[] $$5x = $$4xx.b();
               int $$6x = Math.max(0, awm.a(0, $$5x.length, $$2xxx -> $$5 <= $$5x[$$2xxx].a()) - 1);
               int $$7x = Math.min($$5x.length - 1, $$6x + 1);
               ezc $$8x = $$5x[$$6x];
               ezc $$9 = $$5x[$$7x];
               float $$10 = $$5 - $$8x.a();
               float $$11;
               if ($$7x != $$6x) {
                  $$11 = awm.a($$10 / ($$9.a() - $$8x.a()), 0.0F, 1.0F);
               } else {
                  $$11 = 0.0F;
               }

               $$9.c().apply($$4, $$11, $$5x, $$6x, $$7x, $$3);
               $$4xx.a().apply($$4x, $$4);
            }));
      }
   }

   private static float a(ezb $$0, long $$1) {
      float $$2 = (float)$$1 / 1000.0F;
      return $$0.b() ? $$2 % $$0.a() : $$2;
   }

   public static Vector3f a(float $$0, float $$1, float $$2) {
      return new Vector3f($$0, -$$1, $$2);
   }

   public static Vector3f b(float $$0, float $$1, float $$2) {
      return new Vector3f($$0 * (float) (Math.PI / 180.0), $$1 * (float) (Math.PI / 180.0), $$2 * (float) (Math.PI / 180.0));
   }

   public static Vector3f a(double $$0, double $$1, double $$2) {
      return new Vector3f((float)($$0 - 1.0), (float)($$1 - 1.0), (float)($$2 - 1.0));
   }
}
