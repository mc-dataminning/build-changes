import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public record byn(alg d, double e, byn.a f) {
   public static final MapCodec<byn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alg.a.fieldOf("id").forGetter(byn::a), Codec.DOUBLE.fieldOf("amount").forGetter(byn::b), byn.a.f.fieldOf("operation").forGetter(byn::c))
            .apply($$0, byn::new)
   );
   public static final Codec<byn> b = a.codec();
   public static final yw<ByteBuf, byn> c = yw.a(alg.b, byn::a, yu.m, byn::b, byn.a.e, byn::c, byn::new);

   public boolean a(alg $$0) {
      return $$0.equals(this.d);
   }

   public alg a() {
      return this.d;
   }

   public double b() {
      return this.e;
   }

   public byn.a c() {
      return this.f;
   }

   public static enum a implements bak {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<byn.a> d = ayc.a(byn.a::a, values(), ayc.a.a);
      public static final yw<ByteBuf, byn.a> e = yu.a(d, byn.a::a);
      public static final Codec<byn.a> f = bak.a(byn.a::values);
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
