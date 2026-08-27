import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class atv {
   private final asj a;
   private final atp<InputStream> b;
   private final atp<atz> c;
   @Nullable
   private atz d;

   public atv(asj $$0, atp<InputStream> $$1, atp<atz> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public atv(asj $$0, atp<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = atz.b;
      this.d = atz.a;
   }

   public asj a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<ate> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public atz f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
