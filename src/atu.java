import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class atu {
   private final asi a;
   private final ato<InputStream> b;
   private final ato<aty> c;
   @Nullable
   private aty d;

   public atu(asi $$0, ato<InputStream> $$1, ato<aty> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public atu(asi $$0, ato<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aty.b;
      this.d = aty.a;
   }

   public asi a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<atd> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public aty f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
