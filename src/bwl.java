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

public record bwl(aku d, double e, bwl.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bwl> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a.fieldOf("id").forGetter(bwl::b), Codec.DOUBLE.fieldOf("amount").forGetter(bwl::c), bwl.a.f.fieldOf("operation").forGetter(bwl::d))
            .apply($$0, bwl::new)
   );
   public static final Codec<bwl> b = a.codec();
   public static final ym<ByteBuf, bwl> c = ym.a(aku.b, bwl::b, yk.m, bwl::c, bwl.a.e, bwl::d, bwl::new);

   public tq a() {
      DataResult<un> $$0 = b.encode(this, ue.a, new tq());
      return (tq)$$0.getOrThrow();
   }

   @Nullable
   public static bwl a(tq $$0) {
      DataResult<bwl> $$1 = b.parse(ue.a, $$0);
      if ($$1.isSuccess()) {
         return (bwl)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(aku $$0) {
      return $$0.equals(this.d);
   }

   public aku b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bwl.a d() {
      return this.f;
   }

   public static enum a implements azu {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bwl.a> d = axp.a(bwl.a::a, values(), axp.a.a);
      public static final ym<ByteBuf, bwl.a> e = yk.a(d, bwl.a::a);
      public static final Codec<bwl.a> f = azu.a(bwl.a::values);
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
