import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class aub {
   private final asp a;
   private final atv<InputStream> b;
   private final atv<auf> c;
   @Nullable
   private auf d;

   public aub(asp $$0, atv<InputStream> $$1, atv<auf> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aub(asp $$0, atv<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = auf.b;
      this.d = auf.a;
   }

   public asp a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<atk> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public auf f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
