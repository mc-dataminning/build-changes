import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record btu(UUID d, String e, double f, btu.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<btu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jr.a.fieldOf("uuid").forGetter(btu::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(btu::d),
               btu.a.f.fieldOf("operation").forGetter(btu::e)
            )
            .apply($$0, btu::new)
   );
   public static final Codec<btu> b = a.codec();
   public static final yv<ByteBuf, btu> c = yv.a(jr.g, btu::b, yt.k, $$0 -> $$0.e, yt.i, btu::d, btu.a.e, btu::e, btu::new);

   public btu(String $$0, double $$1, btu.a $$2) {
      this(ayd.a(ayk.c()), $$0, $$1, $$2);
   }

   public ud a() {
      ud $$0 = new ud();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static btu a(ud $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         btu.a $$2 = btu.a.d.apply($$0.h("Operation"));
         return new btu($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         h.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public UUID b() {
      return this.d;
   }

   public String c() {
      return this.e;
   }

   public double d() {
      return this.f;
   }

   public btu.a e() {
      return this.g;
   }

   public static enum a implements ayx {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<btu.a> d = awv.a(btu.a::a, values(), awv.a.a);
      public static final yv<ByteBuf, btu.a> e = yt.a(d, btu.a::a);
      public static final Codec<btu.a> f = ayx.a(btu.a::values);
      private final String g;
      private final int h;

      private a(String $$0, int $$1) {
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
