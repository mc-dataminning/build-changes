import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bmz {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<bmz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               iy.a.fieldOf("UUID").forGetter(bmz::a),
               Codec.STRING.fieldOf("Name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("Amount").forGetter(bmz::c),
               bmz.a.d.fieldOf("Operation").forGetter(bmz::b)
            )
            .apply($$0, bmz::new)
   );
   private final double c;
   private final bmz.a d;
   private final String e;
   private final UUID f;

   public bmz(String $$0, double $$1, bmz.a $$2) {
      this(aty.a(auf.c()), $$0, $$1, $$2);
   }

   public bmz(UUID $$0, String $$1, double $$2, bmz.a $$3) {
      this.f = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public UUID a() {
      return this.f;
   }

   public bmz.a b() {
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
         bmz $$1 = (bmz)$$0;
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

   public sj d() {
      sj $$0 = new sj();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.c);
      $$0.a("Operation", this.d.a());
      $$0.a("UUID", this.f);
      return $$0;
   }

   @Nullable
   public static bmz a(sj $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bmz.a $$2 = bmz.a.a($$0.h("Operation"));
         return new bmz($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         b.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a implements aut {
      a("addition", 0),
      b("multiply_base", 1),
      c("multiply_total", 2);

      private static final bmz.a[] e = new bmz.a[]{a, b, c};
      public static final Codec<bmz.a> d = aut.a(bmz.a::values);
      private final String f;
      private final int g;

      private a(String $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bmz.a a(int $$0) {
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
