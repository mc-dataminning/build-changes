import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class anu {
   private final amk a;
   private final ano<InputStream> b;
   private final ano<any> c;
   @Nullable
   private any d;

   public anu(amk $$0, ano<InputStream> $$1, ano<any> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public anu(amk $$0, ano<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = any.b;
      this.d = any.a;
   }

   public amk a() {
      return this.a;
   }

   public String b() {
      return this.a.a();
   }

   public boolean c() {
      return this.a.b();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public any f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
