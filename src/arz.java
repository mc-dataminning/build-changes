import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class arz {
   private final aqp a;
   private final art<InputStream> b;
   private final art<asd> c;
   @Nullable
   private asd d;

   public arz(aqp $$0, art<InputStream> $$1, art<asd> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public arz(aqp $$0, art<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = asd.b;
      this.d = asd.a;
   }

   public aqp a() {
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

   public asd f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
