import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqt {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<bqt> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jf.a.fieldOf("UUID").forGetter(bqt::a),
               Codec.STRING.fieldOf("Name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("Amount").forGetter(bqt::c),
               bqt.a.f.fieldOf("Operation").forGetter(bqt::b)
            )
            .apply($$0, bqt::new)
   );
   private final double c;
   private final bqt.a d;
   private final String e;
   private final UUID f;

   public bqt(String $$0, double $$1, bqt.a $$2) {
      this(aww.a(axd.c()), $$0, $$1, $$2);
   }

   public bqt(UUID $$0, String $$1, double $$2, bqt.a $$3) {
      this.f = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public UUID a() {
      return this.f;
   }

   public bqt.a b() {
      return this.d;
   }

   public double c() {
      return this.c;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bqt $$1 = (bqt)$$0;
         return Objects.equals(this.f, $$1.f);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.f.hashCode();
   }

   @Override
   public String toString() {
      return "AttributeModifier{amount=" + this.c + ", operation=" + this.d + ", name='" + this.e + "', id=" + this.f + "}";
   }

   public ta d() {
      ta $$0 = new ta();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.c);
      $$0.a("Operation", this.d.a());
      $$0.a("UUID", this.f);
      return $$0;
   }

   @Nullable
   public static bqt a(ta $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bqt.a $$2 = bqt.a.d.apply($$0.h("Operation"));
         return new bqt($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         b.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a implements axq {
      a("addition", 0),
      b("multiply_base", 1),
      c("multiply_total", 2);

      public static final IntFunction<bqt.a> d = avn.a(bqt.a::a, values(), avn.a.a);
      public static final xs<ByteBuf, bqt.a> e = xq.a(d, bqt.a::a);
      public static final Codec<bqt.a> f = axq.a(bqt.a::values);
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
