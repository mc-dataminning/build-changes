import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class ant {
   private final amj a;
   private final ann<InputStream> b;
   private final ann<anx> c;
   @Nullable
   private anx d;

   public ant(amj $$0, ann<InputStream> $$1, ann<anx> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ant(amj $$0, ann<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = anx.b;
      this.d = anx.a;
   }

   public amj a() {
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

   public anx f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
