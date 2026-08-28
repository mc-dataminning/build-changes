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

public record bvp(alc d, double e, bvp.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bvp> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(alc.a.fieldOf("id").forGetter(bvp::b), Codec.DOUBLE.fieldOf("amount").forGetter(bvp::c), bvp.a.f.fieldOf("operation").forGetter(bvp::d))
            .apply($$0, bvp::new)
   );
   public static final Codec<bvp> b = a.codec();
   public static final zb<ByteBuf, bvp> c = zb.a(alc.b, bvp::b, yz.j, bvp::c, bvp.a.e, bvp::d, bvp::new);

   public uf a() {
      DataResult<vc> $$0 = b.encode(this, ut.a, new uf());
      return (uf)$$0.getOrThrow();
   }

   @Nullable
   public static bvp a(uf $$0) {
      DataResult<bvp> $$1 = b.parse(ut.a, $$0);
      if ($$1.isSuccess()) {
         return (bvp)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(alc $$0) {
      return $$0.equals(this.d);
   }

   public alc b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bvp.a d() {
      return this.f;
   }

   public static enum a implements azz {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bvp.a> d = axu.a(bvp.a::a, values(), axu.a.a);
      public static final zb<ByteBuf, bvp.a> e = yz.a(d, bvp.a::a);
      public static final Codec<bvp.a> f = azz.a(bvp.a::values);
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
