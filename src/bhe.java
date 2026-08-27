import com.mojang.logging.LogUtils;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bhe {
   private static final Logger a = LogUtils.getLogger();
   private final double b;
   private final bhe.a c;
   private final Supplier<String> d;
   private final UUID e;

   public bhe(String $$0, double $$1, bhe.a $$2) {
      this(apa.a(apf.c()), () -> $$0, $$1, $$2);
   }

   public bhe(UUID $$0, String $$1, double $$2, bhe.a $$3) {
      this($$0, () -> $$1, $$2, $$3);
   }

   public bhe(UUID $$0, Supplier<String> $$1, double $$2, bhe.a $$3) {
      this.e = $$0;
      this.d = $$1;
      this.b = $$2;
      this.c = $$3;
   }

   public UUID a() {
      return this.e;
   }

   public String b() {
      return this.d.get();
   }

   public bhe.a c() {
      return this.c;
   }

   public double d() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else if ($$0 != null && this.getClass() == $$0.getClass()) {
         bhe $$1 = (bhe)$$0;
         return Objects.equals(this.e, $$1.e);
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return this.e.hashCode();
   }

   @Override
   public String toString() {
      return "AttributeModifier{amount=" + this.b + ", operation=" + this.c + ", name='" + this.d.get() + "', id=" + this.e + "}";
   }

   public qr e() {
      qr $$0 = new qr();
      $$0.a("Name", this.b());
      $$0.a("Amount", this.b);
      $$0.a("Operation", this.c.a());
      $$0.a("UUID", this.e);
      return $$0;
   }

   @Nullable
   public static bhe a(qr $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bhe.a $$2 = bhe.a.a($$0.h("Operation"));
         return new bhe($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         a.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a {
      a(0),
      b(1),
      c(2);

      private static final bhe.a[] d = new bhe.a[]{a, b, c};
      private final int e;

      private a(int $$0) {
         this.e = $$0;
      }

      public int a() {
         return this.e;
      }

      public static bhe.a a(int $$0) {
         if ($$0 >= 0 && $$0 < d.length) {
            return d[$$0];
         } else {
            throw new IllegalArgumentException("No operation with value " + $$0);
         }
      }
   }
}
