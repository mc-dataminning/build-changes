import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class ary {
   private final aqo a;
   private final ars<InputStream> b;
   private final ars<asc> c;
   @Nullable
   private asc d;

   public ary(aqo $$0, ars<InputStream> $$1, ars<asc> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ary(aqo $$0, ars<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = asc.b;
      this.d = asc.a;
   }

   public aqo a() {
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

   public asc f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
