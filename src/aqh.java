import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

public class aqh {
   private final aox a;
   private final aqb<InputStream> b;
   private final aqb<aql> c;
   @Nullable
   private aql d;

   public aqh(aox $$0, aqb<InputStream> $$1, aqb<aql> $$2) {
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public aqh(aox $$0, aqb<InputStream> $$1) {
      this.a = $$0;
      this.b = $$1;
      this.c = aql.b;
      this.d = aql.a;
   }

   public aox a() {
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

   public aql f() throws IOException {
      if (this.d == null) {
         this.d = this.c.get();
      }

      return this.d;
   }
}
