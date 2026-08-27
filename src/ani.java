import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class ani {
   private final aly a;
   private final anc<InputStream> b;
   private final anc<anm> c;
   @Nullable
   private anm d;

   public ani(aly $$0, anc<InputStream> $$1, anc<anm> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ani(aly $$0, anc<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = anm.b;
      this.d = anm.a;
   }

   public aly a() {
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

   public anm f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
