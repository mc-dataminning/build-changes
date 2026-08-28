import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.DataResult.Error;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record byd(ale d, double e, byd.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<byd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("id").forGetter(byd::b), Codec.DOUBLE.fieldOf("amount").forGetter(byd::c), byd.a.f.fieldOf("operation").forGetter(byd::d))
            .apply($$0, byd::new)
   );
   public static final Codec<byd> b = a.codec();
   public static final yu<ByteBuf, byd> c = yu.a(ale.b, byd::b, ys.m, byd::c, byd.a.e, byd::d, byd::new);

   public tx a() {
      DataResult<uu> $$0 = b.encode(this, ul.a, new tx());
      return (tx)$$0.getOrThrow();
   }

   @Nullable
   public static byd a(tx $$0) {
      DataResult<byd> $$1 = b.parse(ul.a, $$0);
      if ($$1.isSuccess()) {
         return (byd)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(ale $$0) {
      return $$0.equals(this.d);
   }

   public ale b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public byd.a d() {
      return this.f;
   }

   public static enum a implements bai {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<byd.a> d = aya.a(byd.a::a, values(), aya.a.a);
      public static final yu<ByteBuf, byd.a> e = ys.a(d, byd.a::a);
      public static final Codec<byd.a> f = bai.a(byd.a::values);
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
