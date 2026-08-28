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

public record bvk(alb d, double e, bvk.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bvk> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alb.a.fieldOf("id").forGetter(bvk::b), Codec.DOUBLE.fieldOf("amount").forGetter(bvk::c), bvk.a.f.fieldOf("operation").forGetter(bvk::d))
            .apply($$0, bvk::new)
   );
   public static final Codec<bvk> b = a.codec();
   public static final zb<ByteBuf, bvk> c = zb.a(alb.b, bvk::b, yz.j, bvk::c, bvk.a.e, bvk::d, bvk::new);

   public uf a() {
      DataResult<vc> $$0 = b.encode(this, ut.a, new uf());
      return (uf)$$0.getOrThrow();
   }

   @Nullable
   public static bvk a(uf $$0) {
      DataResult<bvk> $$1 = b.parse(ut.a, $$0);
      if ($$1.isSuccess()) {
         return (bvk)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(alb $$0) {
      return $$0.equals(this.d);
   }

   public alb b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bvk.a d() {
      return this.f;
   }

   public static enum a implements azy {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bvk.a> d = axt.a(bvk.a::a, values(), axt.a.a);
      public static final zb<ByteBuf, bvk.a> e = yz.a(d, bvk.a::a);
      public static final Codec<bvk.a> f = azy.a(bvk.a::values);
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
