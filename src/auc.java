import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import javax.annotation.Nullable;

public class auc {
   private final asq a;
   private final atw<InputStream> b;
   private final atw<aug> c;
   @Nullable
   private aug d;

   public auc(asq $$0, atw<InputStream> $$1, atw<aug> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public auc(asq $$0, atw<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aug.b;
      this.d = aug.a;
   }

   public asq a() {
      return this.a;
   }

   public String b() {
      return this.a.b();
   }

   public Optional<atl> c() {
      return this.a.c();
   }

   public InputStream d() throws IOException {
      return this.b.get();
   }

   public BufferedReader e() throws IOException {
      return new BufferedReader(new InputStreamReader(this.d(), StandardCharsets.UTF_8));
   }

   public aug f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
