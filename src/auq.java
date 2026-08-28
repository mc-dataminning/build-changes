import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class auq {
   private final ate a;
   private final auk<InputStream> b;
   private final auk<auu> c;
   @Nullable
   private auu d;

   public auq(ate $$0, auk<InputStream> $$1, auk<auu> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public auq(ate $$0, auk<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = auu.b;
      this.d = auu.a;
   }

   public ate a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<atz> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public auu f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
