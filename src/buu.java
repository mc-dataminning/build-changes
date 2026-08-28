import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public record buu(UUID d, String e, double f, buu.a g) {
   private static final Logger h = LogUtils.getLogger();
   public static final MapCodec<buu> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               kc.a.fieldOf("uuid").forGetter(buu::b),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("amount").forGetter(buu::d),
               buu.a.f.fieldOf("operation").forGetter(buu::e)
            )
            .apply($$0, buu::new)
   );
   public static final Codec<buu> b = a.codec();
   public static final zm<ByteBuf, buu> c = zm.a(kc.g, buu::b, zk.l, $$0 -> $$0.e, zk.j, buu::d, buu.a.e, buu::e, buu::new);

   public buu(String $$0, double $$1, buu.a $$2) {
      this(ayy.a(azg.c()), $$0, $$1, $$2);
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
   public static buu a(ur $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         buu.a $$2 = buu.a.d.apply($$0.h("Operation"));
         return new buu($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
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

   public buu.a e() {
      return this.g;
   }

   public static enum a implements azt {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<buu.a> d = axo.a(buu.a::a, values(), axo.a.a);
      public static final zm<ByteBuf, buu.a> e = zk.a(d, buu.a::a);
      public static final Codec<buu.a> f = azt.a(buu.a::values);
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
