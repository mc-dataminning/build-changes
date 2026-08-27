import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class anr {
   private final amh a;
   private final anl<InputStream> b;
   private final anl<anv> c;
   @Nullable
   private anv d;

   public anr(amh $$0, anl<InputStream> $$1, anl<anv> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public anr(amh $$0, anl<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = anv.b;
      this.d = anv.a;
   }

   public amh a() {
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

   public anv f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
