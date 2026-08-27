import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqc {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<bqc> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               je.a.fieldOf("UUID").forGetter(bqc::a),
               Codec.STRING.fieldOf("Name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("Amount").forGetter(bqc::c),
               bqc.a.f.fieldOf("Operation").forGetter(bqc::b)
            )
            .apply($$0, bqc::new)
   );
   private final double c;
   private final bqc.a d;
   private final String e;
   private final UUID f;

   public bqc(String $$0, double $$1, bqc.a $$2) {
      this(awm.a(awt.c()), $$0, $$1, $$2);
   }

   public bqc(UUID $$0, String $$1, double $$2, bqc.a $$3) {
      this.f = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public UUID a() {
      return this.f;
   }

   public bqc.a b() {
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
         bqc $$1 = (bqc)$$0;
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

   public sy d() {
      sy $$0 = new sy();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.c);
      $$0.a("Operation", this.d.a());
      $$0.a("UUID", this.f);
      return $$0;
   }

   @Nullable
   public static bqc a(sy $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bqc.a $$2 = bqc.a.d.apply($$0.h("Operation"));
         return new bqc($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         b.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a implements axg {
      a("addition", 0),
      b("multiply_base", 1),
      c("multiply_total", 2);

      public static final IntFunction<bqc.a> d = ave.a(bqc.a::a, values(), ave.a.a);
      public static final xq<ByteBuf, bqc.a> e = xo.a(d, bqc.a::a);
      public static final Codec<bqc.a> f = axg.a(bqc.a::values);
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
