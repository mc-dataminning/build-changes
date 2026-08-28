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

public record bwg(ali d, double e, bwg.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bwg> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(ali.a.fieldOf("id").forGetter(bwg::b), Codec.DOUBLE.fieldOf("amount").forGetter(bwg::c), bwg.a.f.fieldOf("operation").forGetter(bwg::d))
            .apply($$0, bwg::new)
   );
   public static final Codec<bwg> b = a.codec();
   public static final zg<ByteBuf, bwg> c = zg.a(ali.b, bwg::b, ze.k, bwg::c, bwg.a.e, bwg::d, bwg::new);

   public uk a() {
      DataResult<vh> $$0 = b.encode(this, uy.a, new uk());
      return (uk)$$0.getOrThrow();
   }

   @Nullable
   public static bwg a(uk $$0) {
      DataResult<bwg> $$1 = b.parse(uy.a, $$0);
      if ($$1.isSuccess()) {
         return (bwg)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(ali $$0) {
      return $$0.equals(this.d);
   }

   public ali b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bwg.a d() {
      return this.f;
   }

   public static enum a implements bag {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bwg.a> d = ayb.a(bwg.a::a, values(), ayb.a.a);
      public static final zg<ByteBuf, bwg.a> e = ze.a(d, bwg.a::a);
      public static final Codec<bwg.a> f = bag.a(bwg.a::values);
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
