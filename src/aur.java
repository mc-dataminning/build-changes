import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class aur {
   private final atf a;
   private final aul<InputStream> b;
   private final aul<auv> c;
   @Nullable
   private auv d;

   public aur(atf $$0, aul<InputStream> $$1, aul<auv> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aur(atf $$0, aul<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = auv.b;
      this.d = auv.a;
   }

   public atf a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<aua> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public auv f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
