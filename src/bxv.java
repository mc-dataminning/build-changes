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

public record bxv(ald d, double e, bxv.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bxv> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ald.a.fieldOf("id").forGetter(bxv::b), Codec.DOUBLE.fieldOf("amount").forGetter(bxv::c), bxv.a.f.fieldOf("operation").forGetter(bxv::d))
            .apply($$0, bxv::new)
   );
   public static final Codec<bxv> b = a.codec();
   public static final yt<ByteBuf, bxv> c = yt.a(ald.b, bxv::b, yr.m, bxv::c, bxv.a.e, bxv::d, bxv::new);

   public tw a() {
      DataResult<ut> $$0 = b.encode(this, uk.a, new tw());
      return (tw)$$0.getOrThrow();
   }

   @Nullable
   public static bxv a(tw $$0) {
      DataResult<bxv> $$1 = b.parse(uk.a, $$0);
      if ($$1.isSuccess()) {
         return (bxv)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(ald $$0) {
      return $$0.equals(this.d);
   }

   public ald b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bxv.a d() {
      return this.f;
   }

   public static enum a implements bag {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bxv.a> d = aya.a(bxv.a::a, values(), aya.a.a);
      public static final yt<ByteBuf, bxv.a> e = yr.a(d, bxv.a::a);
      public static final Codec<bxv.a> f = bag.a(bxv.a::values);
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
