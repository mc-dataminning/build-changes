import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class asm {
   private final ara a;
   private final asg<InputStream> b;
   private final asg<asq> c;
   @Nullable
   private asq d;

   public asm(ara $$0, asg<InputStream> $$1, asg<asq> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public asm(ara $$0, asg<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = asq.b;
      this.d = asq.a;
   }

   public ara a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<arv> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public asq f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
