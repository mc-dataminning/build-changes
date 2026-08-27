import java.util.Objects;
import javax.annotation.Nullable;

public class abr implements wo<yh> {
   private final String a;
   @Nullable
   private final String b;
   private final int c;
   private final ahd.a d;

   public abr(ahd.a $$0, @Nullable String $$1, String $$2, int $$3) {
      if ($$0 != ahd.a.b && $$1 == null) {
         throw new IllegalArgumentException("Need an objective name");
      } else {
         this.a = $$2;
         this.b = $$1;
         this.c = $$3;
         this.d = $$0;
      }
   }

   public abr(ty $$0) {
      this.a = $$0.s();
      this.d = $$0.b(ahd.a.class);
      String $$1 = $$0.s();
      this.b = Objects.equals($$1, "") ? null : $$1;
      if (this.d != ahd.a.b) {
         this.c = $$0.n();
      } else {
         this.c = 0;
      }
   }

   @Override
   public void a(ty $$0) {
      $$0.a(this.a);
      $$0.a(this.d);
      $$0.a(this.b == null ? "" : this.b);
      if (this.d != ahd.a.b) {
         $$0.c(this.c);
      }
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public String a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public ahd.a f() {
      return this.d;
   }
}
