import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record bui(UUID d, String e, double f, bui.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<bui> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kd.a.fieldOf("uuid").forGetter(bui::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(bui::d),
               bui.a.f.fieldOf("operation").forGetter(bui::e)
            )
            .apply($$0, bui::new)
   );
   public static final Codec<bui> b = a.codec();
   public static final ys<ByteBuf, bui> c = ys.a(kd.g, bui::b, yq.l, $$0 -> $$0.e, yq.j, bui::d, bui.a.e, bui::e, bui::new);

   public bui(String $$0, double $$1, bui.a $$2) {
      this(ayg.a(ayo.c()), $$0, $$1, $$2);
   }

   public tx a() {
      tx $$0 = new tx();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static bui a(tx $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bui.a $$2 = bui.a.d.apply($$0.h("Operation"));
         return new bui($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public bui.a e() {
      return this.g;
   }

   public static enum a implements azc {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<bui.a> d = aww.a(bui.a::a, values(), aww.a.a);
      public static final ys<ByteBuf, bui.a> e = yq.a(d, bui.a::a);
      public static final Codec<bui.a> f = azc.a(bui.a::values);
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
