import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record btt(UUID d, String e, double f, btt.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<btt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               ju.a.fieldOf("uuid").forGetter(btt::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(btt::d),
               btt.a.f.fieldOf("operation").forGetter(btt::e)
            )
            .apply($$0, btt::new)
   );
   public static final Codec<btt> b = a.codec();
   public static final zc<ByteBuf, btt> c = zc.a(ju.g, btt::b, za.l, $$0 -> $$0.e, za.j, btt::d, btt.a.e, btt::e, btt::new);

   public btt(String $$0, double $$1, btt.a $$2) {
      this(aym.a(ayt.c()), $$0, $$1, $$2);
   }

   public uk a() {
      uk $$0 = new uk();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.f);
      $$0.a("Operation", this.g.a());
      $$0.a("UUID", this.d);
      return $$0;
   }

   @Nullable
   public static btt a(uk $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         btt.a $$2 = btt.a.d.apply($$0.h("Operation"));
         return new btt($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public btt.a e() {
      return this.g;
   }

   public static enum a implements azg {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<btt.a> d = axd.a(btt.a::a, values(), axd.a.a);
      public static final zc<ByteBuf, btt.a> e = za.a(d, btt.a::a);
      public static final Codec<btt.a> f = azg.a(btt.a::values);
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
