import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;

public record bza(alk d, double e, bza.a f) {
   public static final MapCodec<bza> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alk.a.fieldOf("id").forGetter(bza::a), Codec.DOUBLE.fieldOf("amount").forGetter(bza::b), bza.a.f.fieldOf("operation").forGetter(bza::c))
            .apply($$0, bza::new)
   );
   public static final Codec<bza> b = a.codec();
   public static final za<ByteBuf, bza> c = za.a(alk.b, bza::a, yy.m, bza::b, bza.a.e, bza::c, bza::new);

   public boolean a(alk $$0) {
      return $$0.equals(this.d);
   }

   public alk a() {
      return this.d;
   }

   public double b() {
      return this.e;
   }

   public bza.a c() {
      return this.f;
   }

   public static enum a implements bao {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bza.a> d = ayg.a(bza.a::a, values(), ayg.a.a);
      public static final za<ByteBuf, bza.a> e = yy.a(d, bza.a::a);
      public static final Codec<bza.a> f = bao.a(bza.a::values);
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
