import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class aqg {
   private final aow a;
   private final aqa<InputStream> b;
   private final aqa<aqk> c;
   @Nullable
   private aqk d;

   public aqg(aow $$0, aqa<InputStream> $$1, aqa<aqk> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aqg(aow $$0, aqa<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aqk.b;
      this.d = aqk.a;
   }

   public aow a() {
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

   public aqk f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
