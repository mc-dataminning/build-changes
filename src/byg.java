import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public record byg(alg d, double e, byg.a f) {
   public static final MapCodec<byg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("id").forGetter(byg::a), Codec.DOUBLE.fieldOf("amount").forGetter(byg::b), byg.a.f.fieldOf("operation").forGetter(byg::c))
            .apply($$0, byg::new)
   );
   public static final Codec<byg> b = a.codec();
   public static final yw<ByteBuf, byg> c = yw.a(alg.b, byg::a, yu.m, byg::b, byg.a.e, byg::c, byg::new);

   public boolean a(alg $$0) {
      return $$0.equals(this.d);
   }

   public alg a() {
      return this.d;
   }

   public double b() {
      return this.e;
   }

   public byg.a c() {
      return this.f;
   }

   public static enum a implements bak {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<byg.a> d = ayc.a(byg.a::a, values(), ayc.a.a);
      public static final yw<ByteBuf, byg.a> e = yu.a(d, byg.a::a);
      public static final Codec<byg.a> f = bak.a(byg.a::values);
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
