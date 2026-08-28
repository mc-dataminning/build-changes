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

public record bvs(ale d, double e, bvs.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bvs> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ale.a.fieldOf("id").forGetter(bvs::b), Codec.DOUBLE.fieldOf("amount").forGetter(bvs::c), bvs.a.f.fieldOf("operation").forGetter(bvs::d))
            .apply($$0, bvs::new)
   );
   public static final Codec<bvs> b = a.codec();
   public static final zc<ByteBuf, bvs> c = zc.a(ale.b, bvs::b, za.k, bvs::c, bvs.a.e, bvs::d, bvs::new);

   public ug a() {
      DataResult<vd> $$0 = b.encode(this, uu.a, new ug());
      return (ug)$$0.getOrThrow();
   }

   @Nullable
   public static bvs a(ug $$0) {
      DataResult<bvs> $$1 = b.parse(uu.a, $$0);
      if ($$1.isSuccess()) {
         return (bvs)$$1.getOrThrow();
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

   public bvs.a d() {
      return this.f;
   }

   public static enum a implements bab {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bvs.a> d = axw.a(bvs.a::a, values(), axw.a.a);
      public static final zc<ByteBuf, bvs.a> e = za.a(d, bvs.a::a);
      public static final Codec<bvs.a> f = bab.a(bvs.a::values);
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
