import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Supplier;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bkd {
   private static final Logger a = LogUtils.getLogger();
   private final double b;
   private final bkd.a c;
   private final Supplier<String> d;
   private final UUID e;

   public bkd(String $$0, double $$1, bkd.a $$2) {
      this(arp.a(aru.c()), () -> $$0, $$1, $$2);
   }

   public bkd(UUID $$0, String $$1, double $$2, bkd.a $$3) {
      this($$0, () -> $$1, $$2, $$3);
   }

   public bkd(UUID $$0, Supplier<String> $$1, double $$2, bkd.a $$3) {
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

   public bkd.a c() {
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
         bkd $$1 = (bkd)$$0;
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
   public static bkd a(qr $$0) {
      try {
         UUID $$1 = $$0.a("UUID");
         bkd.a $$2 = bkd.a.a($$0.h("Operation"));
         return new bkd($$1, $$0.l("Name"), $$0.k("Amount"), $$2);
      } catch (Exception var3) {
         a.warn("Unable to create attribute: {}", var3.getMessage());
         return null;
      }
   }

   public static enum a implements ash {
      a("addition", 0),
      b("multiply_base", 1),
      c("multiply_total", 2);

      private static final bkd.a[] e = new bkd.a[]{a, b, c};
      public static final Codec<bkd.a> d = ash.a(bkd.a::values);
      private final String f;
      private final int g;

      private a(String $$0, int $$1) {
         this.f = $$0;
         this.g = $$1;
      }

      public int a() {
         return this.g;
      }

      public static bkd.a a(int $$0) {
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
