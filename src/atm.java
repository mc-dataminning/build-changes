import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class atm {
   private final asa a;
   private final atg<InputStream> b;
   private final atg<atq> c;
   @Nullable
   private atq d;

   public atm(asa $$0, atg<InputStream> $$1, atg<atq> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public atm(asa $$0, atg<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = atq.b;
      this.d = atq.a;
   }

   public asa a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<asv> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public atq f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
