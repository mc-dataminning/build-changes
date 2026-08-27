import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class ata {
   private final aro a;
   private final asu<InputStream> b;
   private final asu<ate> c;
   @Nullable
   private ate d;

   public ata(aro $$0, asu<InputStream> $$1, asu<ate> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ata(aro $$0, asu<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = ate.b;
      this.d = ate.a;
   }

   public aro a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<asj> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public ate f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
