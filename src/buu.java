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

public record buu(akr d, double e, buu.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<buu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akr.a.fieldOf("id").forGetter(buu::b), Codec.DOUBLE.fieldOf("amount").forGetter(buu::c), buu.a.f.fieldOf("operation").forGetter(buu::d))
            .apply($$0, buu::new)
   );
   public static final Codec<buu> b = a.codec();
   public static final yx<ByteBuf, buu> c = yx.a(akr.b, buu::b, yv.j, buu::c, buu.a.e, buu::d, buu::new);

   public ub a() {
      DataResult<uy> $$0 = b.encode(this, up.a, new ub());
      return (ub)$$0.getOrThrow();
   }

   @Nullable
   public static buu a(ub $$0) {
      DataResult<buu> $$1 = b.parse(up.a, $$0);
      if ($$1.isSuccess()) {
         return (buu)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(akr $$0) {
      return $$0.equals(this.d);
   }

   public akr b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public buu.a d() {
      return this.f;
   }

   public static enum a implements azk {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<buu.a> d = axe.a(buu.a::a, values(), axe.a.a);
      public static final yx<ByteBuf, buu.a> e = yv.a(d, buu.a::a);
      public static final Codec<buu.a> f = azk.a(buu.a::values);
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
