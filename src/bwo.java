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

public record bwo(akv d, double e, bwo.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bwo> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akv.a.fieldOf("id").forGetter(bwo::b), Codec.DOUBLE.fieldOf("amount").forGetter(bwo::c), bwo.a.f.fieldOf("operation").forGetter(bwo::d))
            .apply($$0, bwo::new)
   );
   public static final Codec<bwo> b = a.codec();
   public static final yn<ByteBuf, bwo> c = yn.a(akv.b, bwo::b, yl.m, bwo::c, bwo.a.e, bwo::d, bwo::new);

   public tq a() {
      DataResult<un> $$0 = b.encode(this, ue.a, new tq());
      return (tq)$$0.getOrThrow();
   }

   @Nullable
   public static bwo a(tq $$0) {
      DataResult<bwo> $$1 = b.parse(ue.a, $$0);
      if ($$1.isSuccess()) {
         return (bwo)$$1.getOrThrow();
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

   public bwo.a d() {
      return this.f;
   }

   public static enum a implements azv {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bwo.a> d = axq.a(bwo.a::a, values(), axq.a.a);
      public static final yn<ByteBuf, bwo.a> e = yl.a(d, bwo.a::a);
      public static final Codec<bwo.a> f = azv.a(bwo.a::values);
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
