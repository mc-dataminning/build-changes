import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class akv {
   private final ajl a;
   private final akp<InputStream> b;
   private final akp<akz> c;
   @Nullable
   private akz d;

   public akv(ajl $$0, akp<InputStream> $$1, akp<akz> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public akv(ajl $$0, akp<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = akz.b;
      this.d = akz.a;
   }

   public ajl a() {
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

   public akz f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
