import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class alj extends IOException {
   private final List<alj.a> a = Lists.newArrayList();
   private final String b;

   public alj(String $$0) {
      this.a.add(new alj.a());
      this.b = $$0;
   }

   public alj(String $$0, Throwable $$1) {
      super($$1);
      this.a.add(new alj.a());
      this.b = $$0;
   }

   public void a(String $$0) {
      this.a.get(0).a($$0);
   }

   public void b(String $$0) {
      this.a.get(0).a = $$0;
      this.a.add(0, new alj.a());
   }

   @Override
   public String getMessage() {
      return "Invalid " + this.a.get(this.a.size() - 1) + ": " + this.b;
   }

   public static alj a(Exception $$0) {
      if ($$0 instanceof alj) {
         return (alj)$$0;
      } else {
         String $$1 = $$0.getMessage();
         if ($$0 instanceof FileNotFoundException) {
            $$1 = "File not found";
         }

         return new alj($$1, $$0);
      }
   }

   public static class a {
      @Nullable
      String a;
      private final List<String> b = Lists.newArrayList();

      a() {
      }

      void a(String $$0) {
         this.b.add(0, $$0);
      }

      @Nullable
      public String a() {
         return this.a;
      }

      public String b() {
         return StringUtils.join(this.b, "->");
      }

      @Override
      public String toString() {
         if (this.a != null) {
            return this.b.isEmpty() ? this.a : this.a + " " + this.b();
         } else {
            return this.b.isEmpty() ? "(Unknown file)" : "(Unknown file) " + this.b();
         }
      }
   }
}
