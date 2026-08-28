import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fjz {
   private fjz() {
   }

   @VisibleForTesting
   protected static List<String> a(String $$0) {
      return Arrays.asList($$0.split("\\n"));
   }

   public static List<fjz.a> a(String $$0, fjz.b... $$1) {
      return a($$0, Arrays.asList($$1));
   }

   private static List<fjz.a> a(String $$0, List<fjz.b> $$1) {
      List<String> $$2 = a($$0);
      return a($$2, $$1);
   }

   private static List<fjz.a> a(List<String> $$0, List<fjz.b> $$1) {
      int $$2 = 0;
      List<fjz.a> $$3 = Lists.newArrayList();

      for (String $$4 : $$0) {
         List<fjz.b> $$5 = Lists.newArrayList();

         for (String $$7 : a($$4, "%link")) {
            if ("%link".equals($$7)) {
               $$5.add($$1.get($$2++));
            } else {
               $$5.add(fjz.b.a($$7));
            }
         }

         $$3.add(new fjz.a($$5));
      }

      return $$3;
   }

   public static List<String> a(String $$0, String $$1) {
      if ($$1.isEmpty()) {
         throw new IllegalArgumentException("Delimiter cannot be the empty string");
      } else {
         List<String> $$2 = Lists.newArrayList();
         int $$3 = 0;

         int $$4;
         while (($$4 = $$0.indexOf($$1, $$3)) != -1) {
            if ($$4 > $$3) {
               $$2.add($$0.substring($$3, $$4));
            }

            $$2.add($$1);
            $$3 = $$4 + $$1.length();
         }

         if ($$3 < $$0.length()) {
            $$2.add($$0.substring($$3));
         }

         return $$2;
      }
   }

   public static class a {
      public final List<fjz.b> a;

      a(fjz.b... $$0) {
         this(Arrays.asList($$0));
      }

      a(List<fjz.b> $$0) {
         this.a = $$0;
      }

      @Override
      public String toString() {
         return "Line{segments=" + this.a + "}";
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            fjz.a $$1 = (fjz.a)$$0;
            return Objects.equals(this.a, $$1.a);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.a);
      }
   }

   public static class b {
      private final String a;
      @Nullable
      private final String b;
      @Nullable
      private final String c;

      private b(String $$0) {
         this.a = $$0;
         this.b = null;
         this.c = null;
      }

      private b(String $$0, @Nullable String $$1, @Nullable String $$2) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            fjz.b $$1 = (fjz.b)$$0;
            return Objects.equals(this.a, $$1.a) && Objects.equals(this.b, $$1.b) && Objects.equals(this.c, $$1.c);
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.a, this.b, this.c);
      }

      @Override
      public String toString() {
         return "Segment{fullText='" + this.a + "', linkTitle='" + this.b + "', linkUrl='" + this.c + "'}";
      }

      public String a() {
         return this.b() ? this.b : this.a;
      }

      public boolean b() {
         return this.b != null;
      }

      public String c() {
         if (!this.b()) {
            throw new IllegalStateException("Not a link: " + this);
         } else {
            return this.c;
         }
      }

      public static fjz.b a(String $$0, String $$1) {
         return new fjz.b(null, $$0, $$1);
      }

      @VisibleForTesting
      protected static fjz.b a(String $$0) {
         return new fjz.b($$0);
      }
   }
}
