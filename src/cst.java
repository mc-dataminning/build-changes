import it.unimi.dsi.fastutil.HashCommon;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public final class cst {
   private static final cst b = new cst(null, 0L);
   public static final int a = 64;
   @Nullable
   private final csu c;
   private final long d;

   private cst(@Nullable csu $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   static cst a(csu $$0, Collection<csr> $$1) {
      if ($$1.isEmpty()) {
         return b;
      } else {
         long $$2 = a($$0, 0L, $$1);
         return new cst($$0, $$2);
      }
   }

   public static cst a() {
      return b;
   }

   public static cst a(csr $$0) {
      return new cst($$0.a, $$0.b);
   }

   public static cst a(csr $$0, csr... $$1) {
      long $$2 = $$1.length == 0 ? $$0.b : a($$0.a, $$0.b, Arrays.asList($$1));
      return new cst($$0.a, $$2);
   }

   private static long a(csu $$0, long $$1, Iterable<csr> $$2) {
      for (csr $$3 : $$2) {
         if ($$0 != $$3.a) {
            throw new IllegalStateException("Mismatched feature universe, expected '" + $$0 + "', but got '" + $$3.a + "'");
         }

         $$1 |= $$3.b;
      }

      return $$1;
   }

   public boolean b(csr $$0) {
      return this.c != $$0.a ? false : (this.d & $$0.b) != 0L;
   }

   public boolean b() {
      return this.equals(b);
   }

   public boolean a(cst $$0) {
      if (this.c == null) {
         return true;
      } else {
         return this.c != $$0.c ? false : (this.d & ~$$0.d) == 0L;
      }
   }

   public boolean b(cst $$0) {
      return this.c != null && $$0.c != null && this.c == $$0.c ? (this.d & $$0.d) != 0L : false;
   }

   public cst c(cst $$0) {
      if (this.c == null) {
         return $$0;
      } else if ($$0.c == null) {
         return this;
      } else if (this.c != $$0.c) {
         throw new IllegalArgumentException("Mismatched set elements: '" + this.c + "' != '" + $$0.c + "'");
      } else {
         return new cst(this.c, this.d | $$0.d);
      }
   }

   public cst d(cst $$0) {
      if (this.c == null || $$0.c == null) {
         return this;
      } else if (this.c != $$0.c) {
         throw new IllegalArgumentException("Mismatched set elements: '" + this.c + "' != '" + $$0.c + "'");
      } else {
         long $$1 = this.d & ~$$0.d;
         return $$1 == 0L ? b : new cst(this.c, $$1);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof cst $$1 && this.c == $$1.c && this.d == $$1.d) {
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
