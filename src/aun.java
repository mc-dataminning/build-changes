import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class aun {
   private final atb a;
   private final auh<InputStream> b;
   private final auh<aur> c;
   @Nullable
   private aur d;

   public aun(atb $$0, auh<InputStream> $$1, auh<aur> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aun(atb $$0, auh<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aur.b;
      this.d = aur.a;
   }

   public atb a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<atw> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public aur f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
