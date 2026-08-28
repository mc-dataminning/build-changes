import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class avc {
   private final atp a;
   private final auv<InputStream> b;
   private final auv<avg> c;
   @Nullable
   private avg d;

   public avc(atp $$0, auv<InputStream> $$1, auv<avg> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public avc(atp $$0, auv<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = avg.b;
      this.d = avg.a;
   }

   public atp a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<auk> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public avg f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
