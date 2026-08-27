import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Objects;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bnj {
   private static final Logger b = LogUtils.getLogger();
   public static final Codec<bnj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(
               ja.a.fieldOf("UUID").forGetter(bnj::a),
               Codec.STRING.fieldOf("Name").forGetter($$0x -> $$0x.e),
               Codec.DOUBLE.fieldOf("Amount").forGetter(bnj::c),
               bnj.a.d.fieldOf("Operation").forGetter(bnj::b)
            )
            .apply($$0, bnj::new)
   );
   private final double c;
   private final bnj.a d;
   private final String e;
   private final UUID f;

   public bnj(String $$0, double $$1, bnj.a $$2) {
      this(aui.a(aup.c()), $$0, $$1, $$2);
   }

   public bnj(UUID $$0, String $$1, double $$2, bnj.a $$3) {
      this.f = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   public UUID a() {
      return this.f;
   }

   public bnj.a b() {
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
         bnj $$1 = (bnj)$$0;
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

   public sl d() {
      sl $$0 = new sl();
      $$0.a("Name", this.e);
      $$0.a("Amount", this.c);
      $$0.a("Operation", this.d.a());
      $$0.a("UUID", this.f);
      return $$0;
   }

   @Nullable
   public static bnj a(sl $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bnj.a $$2 = bnj.a.a($$0.h("Operation"));
         return new bnj($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         b.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a implements ave {
      a("addition", 0),
      b("multiply_base", 1),
      c("multiply_total", 2);

      private static final bnj.a[] e = new bnj.a[]{a, b, c};
      public static final Codec<bnj.a> d = ave.a(bnj.a::values);
      private final String f;
      private final int g;

      private a(String $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bnj.a a(int $$0) {
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
