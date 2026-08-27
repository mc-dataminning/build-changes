import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class brt {
   private static final Logger d = LogUtils.getLogger();
   public static final MapCodec<brt> a = RecordCodecBuilder.mapCodec(
      $$0 -> $$0.group(
               jf.a.fieldOf("uuid").forGetter(brt::a),
               Codec.STRING.fieldOf("name").forGetter($$0x -> $$0x.g),
               Codec.DOUBLE.fieldOf("amount").forGetter(brt::c),
               brt.a.f.fieldOf("operation").forGetter(brt::b)
            )
            .apply($$0, brt::new)
   );
   public static final Codec<brt> b = a.codec();
   public static final ye<ByteBuf, brt> c = ye.a(jf.g, brt::a, yc.k, $$0 -> $$0.g, yc.i, brt::c, brt.a.e, brt::b, brt::new);
   private final double e;
   private final brt.a f;
   private final String g;
   private final UUID h;

   public brt(String $$0, double $$1, brt.a $$2) {
      this(axk.a(axr.c()), $$0, $$1, $$2);
   }

   public brt(UUID $$0, String $$1, double $$2, brt.a $$3) {
      this.h = $$0;
      this.g = $$1;
      this.e = $$2;
      this.f = $$3;
   }

   public UUID a() {
      return this.h;
   }

   public brt.a b() {
      return this.f;
   }

   public double c() {
      return this.e;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         brt $$1 = (brt)$$0;
         return Objects.equals(this.h, $$1.h);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.h.hashCode();
   }

   @Override
   public String toString() {
      return "AttributeModifier{amount=" + this.e + ", operation=" + this.f + ", name='" + this.g + "', id=" + this.h + "}";
   }

   public tm d() {
      tm $$0 = new tm();
      $$0.a("Name", this.g);
      $$0.a("Amount", this.e);
      $$0.a("Operation", this.f.a());
      $$0.a("UUID", this.h);
      return $$0;
   }

   @Nullable
   public static brt a(tm $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         brt.a $$2 = brt.a.d.apply($$0.h("Operation"));
         return new brt($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         d.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a implements aye {
      a("add_value", 0),
      b("add_multiplied_base", 1),
      c("add_multiplied_total", 2);

      public static final IntFunction<brt.a> d = awb.a(brt.a::a, values(), awb.a.a);
      public static final ye<ByteBuf, brt.a> e = yc.a(d, brt.a::a);
      public static final Codec<brt.a> f = aye.a(brt.a::values);
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
