import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class avm {
   private final aua a;
   private final avg<InputStream> b;
   private final avg<avq> c;
   @Nullable
   private avq d;

   public avm(aua $$0, avg<InputStream> $$1, avg<avq> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public avm(aua $$0, avg<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = avq.b;
      this.d = avq.a;
   }

   public aua a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<auu> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public avq f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
