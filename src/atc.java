import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class atc {
   private final arq a;
   private final asw<InputStream> b;
   private final asw<atg> c;
   @Nullable
   private atg d;

   public atc(arq $$0, asw<InputStream> $$1, asw<atg> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public atc(arq $$0, asw<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = atg.b;
      this.d = atg.a;
   }

   public arq a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<asl> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public atg f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
