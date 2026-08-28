import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class aum {
   private final atb a;
   private final aug<InputStream> b;
   private final aug<auq> c;
   @Nullable
   private auq d;

   public aum(atb $$0, aug<InputStream> $$1, aug<auq> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aum(atb $$0, aug<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = auq.b;
      this.d = auq.a;
   }

   public atb a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<atv> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public auq f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
