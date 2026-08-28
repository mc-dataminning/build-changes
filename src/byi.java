import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public record byi(alg d, double e, byi.a f) {
   public static final MapCodec<byi> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("id").forGetter(byi::a), Codec.DOUBLE.fieldOf("amount").forGetter(byi::b), byi.a.f.fieldOf("operation").forGetter(byi::c))
            .apply($$0, byi::new)
   );
   public static final Codec<byi> b = a.codec();
   public static final yw<ByteBuf, byi> c = yw.a(alg.b, byi::a, yu.m, byi::b, byi.a.e, byi::c, byi::new);

   public boolean a(alg $$0) {
      return $$0.equals(this.d);
   }

   public alg a() {
      return this.d;
   }

   public double b() {
      return this.e;
   }

   public byi.a c() {
      return this.f;
   }

   public static enum a implements bak {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<byi.a> d = ayc.a(byi.a::a, values(), ayc.a.a);
      public static final yw<ByteBuf, byi.a> e = yu.a(d, byi.a::a);
      public static final Codec<byi.a> f = bak.a(byi.a::values);
      private final String g;
      private final int h;

      private a(final String $$0, final int $$1) {
         this.g = $$0;
         this.h = $$1;
      }

      public int a() {
         return this.h;
      }

      @Override
      public String c() {
         return this.g;
      }
   }
}
