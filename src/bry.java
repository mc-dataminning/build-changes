import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record bry(UUID d, String e, double f, bry.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<bry> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jh.a.fieldOf("uuid").forGetter(bry::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(bry::d),
               bry.a.f.fieldOf("operation").forGetter(bry::e)
            )
            .apply($$0, bry::new)
   );
   public static final Codec<bry> b = a.codec();
   public static final yg<ByteBuf, bry> c = yg.a(jh.g, bry::b, ye.k, $$0 -> $$0.e, ye.i, bry::d, bry.a.e, bry::e, bry::new);

   public bry(String $$0, double $$1, bry.a $$2) {
      this(axm.a(axt.c()), $$0, $$1, $$2);
   }

   public to a() {
      to $$0 = new to();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static bry a(to $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bry.a $$2 = bry.a.d.apply($$0.h("Operation"));
         return new bry($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public bry.a e() {
      return this.g;
   }

   public static enum a implements ayg {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bry.a> d = awd.a(bry.a::a, values(), awd.a.a);
      public static final yg<ByteBuf, bry.a> e = ye.a(d, bry.a::a);
      public static final Codec<bry.a> f = ayg.a(bry.a::values);
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
