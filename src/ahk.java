import com.google.common.collect.Lists;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import javax.annotation.Nullable;
import org.apache.commons.lang3.StringUtils;

public class ahk extends IOException {
   private final List<ahk.a> a = Lists.newArrayList();
   private final String b;

   public ahk(String $$0) {
      this.a.add(new ahk.a());
      this.b = $$0;
   }

   public ahk(String $$0, Throwable $$1) {
      super($$1);
      this.a.add(new ahk.a());
      this.b = $$0;
   }

   public void a(String $$0) {
      this.a.get(0).a($$0);
   }

   public void b(String $$0) {
      this.a.get(0).a = $$0;
      this.a.add(0, new ahk.a());
   }

   @Override
   public String getMessage() {
      return "Invalid " + this.a.get(this.a.size() - 1) + ": " + this.b;
   }

   public static ahk a(Exception $$0) {
      if ($$0 instanceof ahk) {
         return (ahk)$$0;
      } else {
         String $$1 = $$0.getMessage();
         if ($$0 instanceof FileNotFoundException) {
            $$1 = "File not found";
         }

         return new ahk($$1, $$0);
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
