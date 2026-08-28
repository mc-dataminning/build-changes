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

public record bwk(all d, double e, bwk.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bwk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(all.a.fieldOf("id").forGetter(bwk::b), Codec.DOUBLE.fieldOf("amount").forGetter(bwk::c), bwk.a.f.fieldOf("operation").forGetter(bwk::d))
            .apply($$0, bwk::new)
   );
   public static final Codec<bwk> b = a.codec();
   public static final zj<ByteBuf, bwk> c = zj.a(all.b, bwk::b, zh.k, bwk::c, bwk.a.e, bwk::d, bwk::new);

   public un a() {
      DataResult<vk> $$0 = b.encode(this, vb.a, new un());
      return (un)$$0.getOrThrow();
   }

   @Nullable
   public static bwk a(un $$0) {
      DataResult<bwk> $$1 = b.parse(vb.a, $$0);
      if ($$1.isSuccess()) {
         return (bwk)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(all $$0) {
      return $$0.equals(this.d);
   }

   public all b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bwk.a d() {
      return this.f;
   }

   public static enum a implements baj {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bwk.a> d = aye.a(bwk.a::a, values(), aye.a.a);
      public static final zj<ByteBuf, bwk.a> e = zh.a(d, bwk.a::a);
      public static final Codec<bwk.a> f = baj.a(bwk.a::values);
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
