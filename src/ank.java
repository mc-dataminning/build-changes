import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class ank {
   private final ama a;
   private final ane<InputStream> b;
   private final ane<ano> c;
   @Nullable
   private ano d;

   public ank(ama $$0, ane<InputStream> $$1, ane<ano> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ank(ama $$0, ane<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = ano.b;
      this.d = ano.a;
   }

   public ama a() {
      return this.a;
   }

   public String b() {
      return this.a.a();
   }

   public boolean c() {
      return this.a.b();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public ano f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
