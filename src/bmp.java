import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bmp {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<bmp> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iz.a.fieldOf("UUID").forGetter(bmp::a),
               Codec.STRING.fieldOf("Name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("Amount").forGetter(bmp::c),
               bmp.a.d.fieldOf("Operation").forGetter(bmp::b)
            )
            .apply($$0, bmp::new)
   );
   private final double c;
   private final bmp.a d;
   private final String e;
   private final UUID f;

   public bmp(String $$0, double $$1, bmp.a $$2) {
      this(atq.a(atw.c()), $$0, $$1, $$2);
   }

   public bmp(UUID $$0, String $$1, double $$2, bmp.a $$3) {
      this.f = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public UUID a() {
      return this.f;
   }

   public bmp.a b() {
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
         bmp $$1 = (bmp)$$0;
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

   public sd d() {
      sd $$0 = new sd();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.c);
      $$0.a("Operation", this.d.a());
      $$0.a("UUID", this.f);
      return $$0;
   }

   @Nullable
   public static bmp a(sd $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bmp.a $$2 = bmp.a.a($$0.h("Operation"));
         return new bmp($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         b.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a implements auk {
      a("addition", 0),
      b("multiply_base", 1),
      c("multiply_total", 2);

      private static final bmp.a[] e = new bmp.a[]{a, b, c};
      public static final Codec<bmp.a> d = auk.a(bmp.a::values);
      private final String f;
      private final int g;

      private a(String $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bmp.a a(int $$0) {
         if ($$0 >= 0 && $$0 < e.length) {
            return e[$$0];
         } else {
            throw new IllegalArgumentException("No operation with value " + $$0);
         }
      }

      @Override
      public String c() {
         return this.f;
      }
   }
}
