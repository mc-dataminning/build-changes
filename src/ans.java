import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class ans {
   private final ami a;
   private final anm<InputStream> b;
   private final anm<anw> c;
   @Nullable
   private anw d;

   public ans(ami $$0, anm<InputStream> $$1, anm<anw> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ans(ami $$0, anm<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = anw.b;
      this.d = anw.a;
   }

   public ami a() {
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

   public anw f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
