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

public record bwn(akv d, double e, bwn.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bwn> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akv.a.fieldOf("id").forGetter(bwn::b), Codec.DOUBLE.fieldOf("amount").forGetter(bwn::c), bwn.a.f.fieldOf("operation").forGetter(bwn::d))
            .apply($$0, bwn::new)
   );
   public static final Codec<bwn> b = a.codec();
   public static final yn<ByteBuf, bwn> c = yn.a(akv.b, bwn::b, yl.m, bwn::c, bwn.a.e, bwn::d, bwn::new);

   public tq a() {
      DataResult<un> $$0 = b.encode(this, ue.a, new tq());
      return (tq)$$0.getOrThrow();
   }

   @Nullable
   public static bwn a(tq $$0) {
      DataResult<bwn> $$1 = b.parse(ue.a, $$0);
      if ($$1.isSuccess()) {
         return (bwn)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(akv $$0) {
      return $$0.equals(this.d);
   }

   public akv b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bwn.a d() {
      return this.f;
   }

   public static enum a implements azv {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bwn.a> d = axq.a(bwn.a::a, values(), axq.a.a);
      public static final yn<ByteBuf, bwn.a> e = yl.a(d, bwn.a::a);
      public static final Codec<bwn.a> f = azv.a(bwn.a::values);
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
