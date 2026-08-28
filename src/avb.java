import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class avb {
   private final ato a;
   private final auu<InputStream> b;
   private final auu<avf> c;
   @Nullable
   private avf d;

   public avb(ato $$0, auu<InputStream> $$1, auu<avf> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public avb(ato $$0, auu<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = avf.b;
      this.d = avf.a;
   }

   public ato a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<auj> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public avf f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
