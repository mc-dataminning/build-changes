import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class aut {
   private final ath a;
   private final aun<InputStream> b;
   private final aun<auy> c;
   @Nullable
   private auy d;

   public aut(ath $$0, aun<InputStream> $$1, aun<auy> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aut(ath $$0, aun<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = auy.b;
      this.d = auy.a;
   }

   public ath a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<auc> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public auy f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
