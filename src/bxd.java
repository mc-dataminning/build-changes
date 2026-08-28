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

public record bxd(alp d, double e, bxd.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bxd> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alp.a.fieldOf("id").forGetter(bxd::b), Codec.DOUBLE.fieldOf("amount").forGetter(bxd::c), bxd.a.f.fieldOf("operation").forGetter(bxd::d))
            .apply($$0, bxd::new)
   );
   public static final Codec<bxd> b = a.codec();
   public static final zi<ByteBuf, bxd> c = zi.a(alp.b, bxd::b, zg.m, bxd::c, bxd.a.e, bxd::d, bxd::new);

   public um a() {
      DataResult<vj> $$0 = b.encode(this, va.a, new um());
      return (um)$$0.getOrThrow();
   }

   @Nullable
   public static bxd a(um $$0) {
      DataResult<bxd> $$1 = b.parse(va.a, $$0);
      if ($$1.isSuccess()) {
         return (bxd)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(alp $$0) {
      return $$0.equals(this.d);
   }

   public alp b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bxd.a d() {
      return this.f;
   }

   public static enum a implements baq {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bxd.a> d = ayl.a(bxd.a::a, values(), ayl.a.a);
      public static final zi<ByteBuf, bxd.a> e = zg.a(d, bxd.a::a);
      public static final Codec<bxd.a> f = baq.a(bxd.a::values);
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
