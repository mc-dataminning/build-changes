import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class asd {
   private final aqt a;
   private final arx<InputStream> b;
   private final arx<ash> c;
   @Nullable
   private ash d;

   public asd(aqt $$0, arx<InputStream> $$1, arx<ash> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public asd(aqt $$0, arx<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = ash.b;
      this.d = ash.a;
   }

   public aqt a() {
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

   public ash f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
