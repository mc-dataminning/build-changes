import it.unimi.dsi.fastutil.HashCommon;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public final class crs {
   private static final crs b = new crs(null, 0L);
   public static final int a = 64;
   @Nullable
   private final crt c;
   private final long d;

   private crs(@Nullable crt $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   static crs a(crt $$0, Collection<crq> $$1) {
      if ($$1.isEmpty()) {
         return b;
      } else {
         long $$2 = a($$0, 0L, $$1);
         return new crs($$0, $$2);
      }
   }

   public static crs a() {
      return b;
   }

   public static crs a(crq $$0) {
      return new crs($$0.a, $$0.b);
   }

   public static crs a(crq $$0, crq... $$1) {
      long $$2 = $$1.length == 0 ? $$0.b : a($$0.a, $$0.b, Arrays.asList($$1));
      return new crs($$0.a, $$2);
   }

   private static long a(crt $$0, long $$1, Iterable<crq> $$2) {
      for (crq $$3 : $$2) {
         if ($$0 != $$3.a) {
            throw new IllegalStateException("Mismatched feature universe, expected '" + $$0 + "', but got '" + $$3.a + "'");
         }

         $$1 |= $$3.b;
      }

      return $$1;
   }

   public boolean b(crq $$0) {
      return this.c != $$0.a ? false : (this.d & $$0.b) != 0L;
   }

   public boolean b() {
      return this.equals(b);
   }

   public boolean a(crs $$0) {
      if (this.c == null) {
         return true;
      } else {
         return this.c != $$0.c ? false : (this.d & ~$$0.d) == 0L;
      }
   }

   public boolean b(crs $$0) {
      return this.c != null && $$0.c != null && this.c == $$0.c ? (this.d & $$0.d) != 0L : false;
   }

   public crs c(crs $$0) {
      if (this.c == null) {
         return $$0;
      } else if ($$0.c == null) {
         return this;
      } else if (this.c != $$0.c) {
         throw new IllegalArgumentException("Mismatched set elements: '" + this.c + "' != '" + $$0.c + "'");
      } else {
         return new crs(this.c, this.d | $$0.d);
      }
   }

   public crs d(crs $$0) {
      if (this.c == null || $$0.c == null) {
         return this;
      } else if (this.c != $$0.c) {
         throw new IllegalArgumentException("Mismatched set elements: '" + this.c + "' != '" + $$0.c + "'");
      } else {
         long $$1 = this.d & ~$$0.d;
         return $$1 == 0L ? b : new crs(this.c, $$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof crs $$1 && this.c == $$1.c && this.d == $$1.d) {
            return true;
         }

         return false;
      }
   }

   @Override
   public int hashCode() {
      return (int)HashCommon.mix(this.d);
   }
}
