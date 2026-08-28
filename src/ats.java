import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class ats {
   private final asg a;
   private final atm<InputStream> b;
   private final atm<atw> c;
   @Nullable
   private atw d;

   public ats(asg $$0, atm<InputStream> $$1, atm<atw> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ats(asg $$0, atm<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = atw.b;
      this.d = atw.a;
   }

   public asg a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<atb> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public atw f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
