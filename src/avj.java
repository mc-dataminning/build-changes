import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class avj {
   private final atw a;
   private final avd<InputStream> b;
   private final avd<avn> c;
   @Nullable
   private avn d;

   public avj(atw $$0, avd<InputStream> $$1, avd<avn> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public avj(atw $$0, avd<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = avn.b;
      this.d = avn.a;
   }

   public atw a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<aur> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public avn f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
