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

public record bxm(alz d, double e, bxm.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bxm> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alz.a.fieldOf("id").forGetter(bxm::b), Codec.DOUBLE.fieldOf("amount").forGetter(bxm::c), bxm.a.f.fieldOf("operation").forGetter(bxm::d))
            .apply($$0, bxm::new)
   );
   public static final Codec<bxm> b = a.codec();
   public static final zt<ByteBuf, bxm> c = zt.a(alz.b, bxm::b, zr.m, bxm::c, bxm.a.e, bxm::d, bxm::new);

   public ux a() {
      DataResult<vu> $$0 = b.encode(this, vl.a, new ux());
      return (ux)$$0.getOrThrow();
   }

   @Nullable
   public static bxm a(ux $$0) {
      DataResult<bxm> $$1 = b.parse(vl.a, $$0);
      if ($$1.isSuccess()) {
         return (bxm)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(alz $$0) {
      return $$0.equals(this.d);
   }

   public alz b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bxm.a d() {
      return this.f;
   }

   public static enum a implements bba {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bxm.a> d = ayv.a(bxm.a::a, values(), ayv.a.a);
      public static final zt<ByteBuf, bxm.a> e = zr.a(d, bxm.a::a);
      public static final Codec<bxm.a> f = bba.a(bxm.a::values);
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
