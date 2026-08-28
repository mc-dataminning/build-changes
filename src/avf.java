import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class avf {
   private final att a;
   private final auz<InputStream> b;
   private final auz<avj> c;
   @Nullable
   private avj d;

   public avf(att $$0, auz<InputStream> $$1, auz<avj> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public avf(att $$0, auz<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = avj.b;
      this.d = avj.a;
   }

   public att a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<aun> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public avj f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
