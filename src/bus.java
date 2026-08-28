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

public record bus(akq d, double e, bus.a f) {
   private static final Logger g = LogUtils.getLogger();
   public static final MapCodec<bus> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(akq.a.fieldOf("id").forGetter(bus::b), Codec.DOUBLE.fieldOf("amount").forGetter(bus::c), bus.a.f.fieldOf("operation").forGetter(bus::d))
            .apply($$0, bus::new)
   );
   public static final Codec<bus> b = a.codec();
   public static final yw<ByteBuf, bus> c = yw.a(akq.b, bus::b, yu.j, bus::c, bus.a.e, bus::d, bus::new);

   public ua a() {
      DataResult<ux> $$0 = b.encode(this, uo.a, new ua());
      return (ua)$$0.getOrThrow();
   }

   @Nullable
   public static bus a(ua $$0) {
      DataResult<bus> $$1 = b.parse(uo.a, $$0);
      if ($$1.isSuccess()) {
         return (bus)$$1.getOrThrow();
      } else {
         g.warn("Unable to create attribute: {}", ((Error)$$1.error().get()).message());
         return null;
      }
   }

   public boolean a(akq $$0) {
      return $$0.equals(this.d);
   }

   public akq b() {
      return this.d;
   }

   public double c() {
      return this.e;
   }

   public bus.a d() {
      return this.f;
   }

   public static enum a implements azj {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bus.a> d = axd.a(bus.a::a, values(), axd.a.a);
      public static final yw<ByteBuf, bus.a> e = yu.a(d, bus.a::a);
      public static final Codec<bus.a> f = azj.a(bus.a::values);
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
