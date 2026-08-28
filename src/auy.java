import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class auy {
   private final atm a;
   private final aur<InputStream> b;
   private final aur<avc> c;
   @Nullable
   private avc d;

   public auy(atm $$0, aur<InputStream> $$1, aur<avc> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public auy(atm $$0, aur<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = avc.b;
      this.d = avc.a;
   }

   public atm a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<aug> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public avc f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
