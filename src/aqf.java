import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class aqf {
   private final aov a;
   private final apz<InputStream> b;
   private final apz<aqj> c;
   @Nullable
   private aqj d;

   public aqf(aov $$0, apz<InputStream> $$1, apz<aqj> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aqf(aov $$0, apz<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aqj.b;
      this.d = aqj.a;
   }

   public aov a() {
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

   public aqj f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
