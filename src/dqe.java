import com.mojang.serialization.Codec;
import java.util.List;

public enum dqe implements azv {
   a("none", h.a),
   b("clockwise_90", h.u),
   c("180", h.c),
   d("counterclockwise_90", h.v);

   public static final Codec<dqe> e = azv.a(dqe::values);
   private final String f;
   private final h g;

   private dqe(final String $$0, final h $$1) {
      this.f = $$0;
      this.g = $$1;
   }

   public dqe a(dqe $$0) {
      return switch ($$0) {
         case b -> {
            switch (this) {
               case a:
                  yield b;
               case b:
                  yield c;
               case c:
                  yield d;
               case d:
                  yield a;
               default:
                  throw new MatchException(null, null);
            }
         }
         case c -> {
            switch (this) {
               case a:
                  yield c;
               case b:
                  yield d;
               case c:
                  yield a;
               case d:
                  yield b;
               default:
                  throw new MatchException(null, null);
            }
         }
         case d -> {
            switch (this) {
               case a:
                  yield d;
               case b:
                  yield a;
               case c:
                  yield b;
               case d:
                  yield c;
               default:
                  throw new MatchException(null, null);
            }
         }
         default -> this;
      };
   }

   public h a() {
      return this.g;
   }

   public jn a(jn $$0) {
      if ($$0.o() == jn.a.b) {
         return $$0;
      } else {
         return switch (this) {
            case b -> $$0.h();
            case c -> $$0.g();
            case d -> $$0.i();
            default -> $$0;
         };
      }
   }

   public int a(int $$0, int $$1) {
      return switch (this) {
         case b -> ($$0 + $$1 / 4) % $$1;
         case c -> ($$0 + $$1 / 2) % $$1;
         case d -> ($$0 + $$1 * 3 / 4) % $$1;
         default -> $$0;
      };
   }

   public static dqe a(azh $$0) {
      return af.a(values(), $$0);
   }

   public static List<dqe> b(azh $$0) {
      return af.b(values(), $$0);
   }

   @Override
   public String c() {
      return this.f;
   }
}
