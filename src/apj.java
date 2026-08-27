import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class apj {
   private final anz a;
   private final apd<InputStream> b;
   private final apd<apn> c;
   @Nullable
   private apn d;

   public apj(anz $$0, apd<InputStream> $$1, apd<apn> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public apj(anz $$0, apd<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = apn.b;
      this.d = apn.a;
   }

   public anz a() {
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

   public apn f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
