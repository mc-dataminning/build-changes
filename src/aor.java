import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class aor {
   private final anh a;
   private final aol<InputStream> b;
   private final aol<aov> c;
   @Nullable
   private aov d;

   public aor(anh $$0, aol<InputStream> $$1, aol<aov> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aor(anh $$0, aol<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aov.b;
      this.d = aov.a;
   }

   public anh a() {
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

   public aov f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
