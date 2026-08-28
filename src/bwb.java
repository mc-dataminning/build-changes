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

public record bwb(alh d, double e, bwb.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bwb> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alh.a.fieldOf("id").forGetter(bwb::b), Codec.DOUBLE.fieldOf("amount").forGetter(bwb::c), bwb.a.f.fieldOf("operation").forGetter(bwb::d))
            .apply($$0, bwb::new)
   );
   public static final Codec<bwb> b = a.codec();
   public static final zf<ByteBuf, bwb> c = zf.a(alh.b, bwb::b, zd.k, bwb::c, bwb.a.e, bwb::d, bwb::new);

   public uj a() {
      DataResult<vg> $$0 = b.encode(this, ux.a, new uj());
      return (uj)$$0.getOrThrow();
   }

   @Nullable
   public static bwb a(uj $$0) {
      DataResult<bwb> $$1 = b.parse(ux.a, $$0);
      if ($$1.isSuccess()) {
         return (bwb)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(alh $$0) {
      return $$0.equals(this.d);
   }

   public alh b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bwb.a d() {
      return this.f;
   }

   public static enum a implements baf {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bwb.a> d = aya.a(bwb.a::a, values(), aya.a.a);
      public static final zf<ByteBuf, bwb.a> e = zd.a(d, bwb.a::a);
      public static final Codec<bwb.a> f = baf.a(bwb.a::values);
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
