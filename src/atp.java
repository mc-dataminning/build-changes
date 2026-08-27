import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class atp {
   private final asd a;
   private final atj<InputStream> b;
   private final atj<att> c;
   @Nullable
   private att d;

   public atp(asd $$0, atj<InputStream> $$1, atj<att> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public atp(asd $$0, atj<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = att.b;
      this.d = att.a;
   }

   public asd a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<asy> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public att f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
