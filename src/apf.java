import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class apf {
   private final anv a;
   private final aoz<InputStream> b;
   private final aoz<apj> c;
   @Nullable
   private apj d;

   public apf(anv $$0, aoz<InputStream> $$1, aoz<apj> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public apf(anv $$0, aoz<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = apj.b;
      this.d = apj.a;
   }

   public anv a() {
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

   public apj f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
