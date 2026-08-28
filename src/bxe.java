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

public record bxe(aku d, double e, bxe.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bxe> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(aku.a.fieldOf("id").forGetter(bxe::b), Codec.DOUBLE.fieldOf("amount").forGetter(bxe::c), bxe.a.f.fieldOf("operation").forGetter(bxe::d))
            .apply($$0, bxe::new)
   );
   public static final Codec<bxe> b = a.codec();
   public static final yn<ByteBuf, bxe> c = yn.a(aku.b, bxe::b, yl.m, bxe::c, bxe.a.e, bxe::d, bxe::new);

   public tq a() {
      DataResult<un> $$0 = b.encode(this, ue.a, new tq());
      return (tq)$$0.getOrThrow();
   }

   @Nullable
   public static bxe a(tq $$0) {
      DataResult<bxe> $$1 = b.parse(ue.a, $$0);
      if ($$1.isSuccess()) {
         return (bxe)$$1.getOrThrow();
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

   public bxe.a d() {
      return this.f;
   }

   public static enum a implements azv {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bxe.a> d = axq.a(bxe.a::a, values(), axq.a.a);
      public static final yn<ByteBuf, bxe.a> e = yl.a(d, bxe.a::a);
      public static final Codec<bxe.a> f = azv.a(bxe.a::values);
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
