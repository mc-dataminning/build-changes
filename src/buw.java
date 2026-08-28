import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record buw(UUID d, String e, double f, buw.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<buw> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a.fieldOf("uuid").forGetter(buw::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(buw::d),
               buw.a.f.fieldOf("operation").forGetter(buw::e)
            )
            .apply($$0, buw::new)
   );
   public static final Codec<buw> b = a.codec();
   public static final zn<ByteBuf, buw> c = zn.a(kc.g, buw::b, zl.l, $$0 -> $$0.e, zl.j, buw::d, buw.a.e, buw::e, buw::new);

   public buw(String $$0, double $$1, buw.a $$2) {
      this(ayz.a(azh.c()), $$0, $$1, $$2);
   }

   public us a() {
      us $$0 = new us();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static buw a(us $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         buw.a $$2 = buw.a.d.apply($$0.h("Operation"));
         return new buw($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public buw.a e() {
      return this.g;
   }

   public static enum a implements azu {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<buw.a> d = axp.a(buw.a::a, values(), axp.a.a);
      public static final zn<ByteBuf, buw.a> e = zl.a(d, buw.a::a);
      public static final Codec<buw.a> f = azu.a(buw.a::values);
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
