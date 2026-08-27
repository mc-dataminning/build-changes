import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record btf(UUID d, String e, double f, btf.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<btf> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jq.a.fieldOf("uuid").forGetter(btf::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(btf::d),
               btf.a.f.fieldOf("operation").forGetter(btf::e)
            )
            .apply($$0, btf::new)
   );
   public static final Codec<btf> b = a.codec();
   public static final ys<ByteBuf, btf> c = ys.a(jq.g, btf::b, yq.k, $$0 -> $$0.e, yq.i, btf::d, btf.a.e, btf::e, btf::new);

   public btf(String $$0, double $$1, btf.a $$2) {
      this(axz.a(ayg.c()), $$0, $$1, $$2);
   }

   public ua a() {
      ua $$0 = new ua();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static btf a(ua $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         btf.a $$2 = btf.a.d.apply($$0.h("Operation"));
         return new btf($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public btf.a e() {
      return this.g;
   }

   public static enum a implements ayt {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<btf.a> d = awq.a(btf.a::a, values(), awq.a.a);
      public static final ys<ByteBuf, btf.a> e = yq.a(d, btf.a::a);
      public static final Codec<btf.a> f = ayt.a(btf.a::values);
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
