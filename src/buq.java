import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record buq(UUID d, String e, double f, buq.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<buq> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a.fieldOf("uuid").forGetter(buq::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(buq::d),
               buq.a.f.fieldOf("operation").forGetter(buq::e)
            )
            .apply($$0, buq::new)
   );
   public static final Codec<buq> b = a.codec();
   public static final zj<ByteBuf, buq> c = zj.a(kc.g, buq::b, zh.l, $$0 -> $$0.e, zh.j, buq::d, buq.a.e, buq::e, buq::new);

   public buq(String $$0, double $$1, buq.a $$2) {
      this(ayu.a(azc.c()), $$0, $$1, $$2);
   }

   public ur a() {
      ur $$0 = new ur();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static buq a(ur $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         buq.a $$2 = buq.a.d.apply($$0.h("Operation"));
         return new buq($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public buq.a e() {
      return this.g;
   }

   public static enum a implements azp {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<buq.a> d = axl.a(buq.a::a, values(), axl.a.a);
      public static final zj<ByteBuf, buq.a> e = zh.a(d, buq.a::a);
      public static final Codec<buq.a> f = azp.a(buq.a::values);
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
