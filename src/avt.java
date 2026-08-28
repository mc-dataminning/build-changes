import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class avt {
   private final aug a;
   private final avn<InputStream> b;
   private final avn<avx> c;
   @Nullable
   private avx d;

   public avt(aug $$0, avn<InputStream> $$1, avn<avx> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public avt(aug $$0, avn<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = avx.b;
      this.d = avx.a;
   }

   public aug a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<avc> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public avx f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
