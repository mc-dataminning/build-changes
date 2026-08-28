import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum dsm implements bai {
   a(0, "none", h.a),
   b(1, "clockwise_90", h.u),
   c(2, "180", h.c),
   d(3, "counterclockwise_90", h.v);

   public static final IntFunction<dsm> e = aya.a(dsm::b, values(), aya.a.b);
   public static final Codec<dsm> f = bai.a(dsm::values);
   public static final yu<ByteBuf, dsm> g = ys.a(e, dsm::b);
   private final int h;
   private final String i;
   private final h j;

   private dsm(final int $$0, final String $$1, final h $$2) {
      this.h = $$0;
      this.i = $$1;
      this.j = $$2;
   }

   public dsm a(dsm $$0) {
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
      return this.j;
   }

   public ja a(ja $$0) {
      if ($$0.o() == ja.a.b) {
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

   public static dsm a(azt $$0) {
      return af.a(values(), $$0);
   }

   public static List<dsm> b(azt $$0) {
      return af.b(values(), $$0);
   }

   @Override
   public String c() {
      return this.i;
   }

   private int b() {
      return this.h;
   }
}
