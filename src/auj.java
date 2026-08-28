import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class auj {
   private final asx a;
   private final aud<InputStream> b;
   private final aud<aun> c;
   @Nullable
   private aun d;

   public auj(asx $$0, aud<InputStream> $$1, aud<aun> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public auj(asx $$0, aud<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aun.b;
      this.d = aun.a;
   }

   public asx a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<ats> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public aun f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
