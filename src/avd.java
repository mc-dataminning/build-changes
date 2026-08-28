import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class avd {
   private final atr a;
   private final auw<InputStream> b;
   private final auw<avh> c;
   @Nullable
   private avh d;

   public avd(atr $$0, auw<InputStream> $$1, auw<avh> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public avd(atr $$0, auw<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = avh.b;
      this.d = avh.a;
   }

   public atr a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<aul> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public avh f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
