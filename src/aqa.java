import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class aqa {
   private final aoq a;
   private final apu<InputStream> b;
   private final apu<aqe> c;
   @Nullable
   private aqe d;

   public aqa(aoq $$0, apu<InputStream> $$1, apu<aqe> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aqa(aoq $$0, apu<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aqe.b;
      this.d = aqe.a;
   }

   public aoq a() {
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

   public aqe f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
