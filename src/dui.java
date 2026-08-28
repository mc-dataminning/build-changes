import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.IntFunction;

public enum dui implements bax {
   a(0, "none", h.a),
   b(1, "clockwise_90", h.u),
   c(2, "180", h.c),
   d(3, "counterclockwise_90", h.v);

   public static final IntFunction<dui> e = ayo.a(dui::b, values(), ayo.a.b);
   public static final Codec<dui> f = bax.a(dui::values);
   public static final ze<ByteBuf, dui> g = zc.a(e, dui::b);
   @Deprecated
   public static final Codec<dui> h = azg.c(dui::valueOf);
   private final int i;
   private final String j;
   private final h k;

   private dui(final int $$0, final String $$1, final h $$2) {
      this.i = $$0;
      this.j = $$1;
      this.k = $$2;
   }

   public dui a(dui $$0) {
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
      return this.k;
   }

   public jc a(jc $$0) {
      if ($$0.o() == jc.a.b) {
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

   public static dui a(bai $$0) {
      return ag.a(values(), $$0);
   }

   public static List<dui> b(bai $$0) {
      return ag.b(values(), $$0);
   }

   @Override
   public String c() {
      return this.j;
   }

   private int b() {
      return this.i;
   }
}
