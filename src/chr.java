import it.unimi.dsi.fastutil.HashCommon;
import java.util.Arrays;
import java.util.Collection;
import javax.annotation.Nullable;

public final class chr {
   private static final chr b = new chr(null, 0L);
   public static final int a = 64;
   @Nullable
   private final chs c;
   private final long d;

   private chr(@Nullable chs $$0, long $$1) {
      this.c = $$0;
      this.d = $$1;
   }

   static chr a(chs $$0, Collection<chp> $$1) {
      if ($$1.isEmpty()) {
         return b;
      } else {
         long $$2 = a($$0, 0L, $$1);
         return new chr($$0, $$2);
      }
   }

   public static chr a() {
      return b;
   }

   public static chr a(chp $$0) {
      return new chr($$0.a, $$0.b);
   }

   public static chr a(chp $$0, chp... $$1) {
      long $$2 = $$1.length == 0 ? $$0.b : a($$0.a, $$0.b, Arrays.asList($$1));
      return new chr($$0.a, $$2);
   }

   private static long a(chs $$0, long $$1, Iterable<chp> $$2) {
      for (chp $$3 : $$2) {
         if ($$0 != $$3.a) {
            throw new IllegalStateException("Mismatched feature universe, expected '" + $$0 + "', but got '" + $$3.a + "'");
         }

         $$1 |= $$3.b;
      }

      return $$1;
   }

   public boolean b(chp $$0) {
      return this.c != $$0.a ? false : (this.d & $$0.b) != 0L;
   }

   public boolean a(chr $$0) {
      if (this.c == null) {
         return true;
      } else {
         return this.c != $$0.c ? false : (this.d & ~$$0.d) == 0L;
      }
   }

   public chr b(chr $$0) {
      if (this.c == null) {
         return $$0;
      } else if ($$0.c == null) {
         return this;
      } else if (this.c != $$0.c) {
         throw new IllegalArgumentException("Mismatched set elements: '" + this.c + "' != '" + $$0.c + "'");
      } else {
         return new chr(this.c, this.d | $$0.d);
      }
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof chr $$1 && this.c == $$1.c && this.d == $$1.d) {
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
