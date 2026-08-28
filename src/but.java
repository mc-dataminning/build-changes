import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record but(UUID d, String e, double f, but.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<but> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a.fieldOf("uuid").forGetter(but::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(but::d),
               but.a.f.fieldOf("operation").forGetter(but::e)
            )
            .apply($$0, but::new)
   );
   public static final Codec<but> b = a.codec();
   public static final zm<ByteBuf, but> c = zm.a(kc.g, but::b, zk.l, $$0 -> $$0.e, zk.j, but::d, but.a.e, but::e, but::new);

   public but(String $$0, double $$1, but.a $$2) {
      this(ayx.a(azf.c()), $$0, $$1, $$2);
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
   public static but a(ur $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         but.a $$2 = but.a.d.apply($$0.h("Operation"));
         return new but($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public but.a e() {
      return this.g;
   }

   public static enum a implements azs {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<but.a> d = axo.a(but.a::a, values(), axo.a.a);
      public static final zm<ByteBuf, but.a> e = zk.a(d, but.a::a);
      public static final Codec<but.a> f = azs.a(but.a::values);
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
