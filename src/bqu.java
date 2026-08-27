import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.Objects;
import java.util.UUID;
import java.util.function.IntFunction;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bqu {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<bqu> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               jf.a.fieldOf("UUID").forGetter(bqu::a),
               Codec.STRING.fieldOf("Name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("Amount").forGetter(bqu::c),
               bqu.a.f.fieldOf("Operation").forGetter(bqu::b)
            )
            .apply($$0, bqu::new)
   );
   private final double c;
   private final bqu.a d;
   private final String e;
   private final UUID f;

   public bqu(String $$0, double $$1, bqu.a $$2) {
      this(aww.a(axd.c()), $$0, $$1, $$2);
   }

   public bqu(UUID $$0, String $$1, double $$2, bqu.a $$3) {
      this.f = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public UUID a() {
      return this.f;
   }

   public bqu.a b() {
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
         bqu $$1 = (bqu)$$0;
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
   public static bqu a(ta $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bqu.a $$2 = bqu.a.d.apply($$0.h("Operation"));
         return new bqu($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         b.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a implements axq {
      a("addition", 0),
      b("multiply_base", 1),
      c("multiply_total", 2);

      public static final IntFunction<bqu.a> d = avn.a(bqu.a::a, values(), avn.a.a);
      public static final xs<ByteBuf, bqu.a> e = xq.a(d, bqu.a::a);
      public static final Codec<bqu.a> f = axq.a(bqu.a::values);
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
