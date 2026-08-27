import java.time.Instant;
import javax.annotation.Nullable;

public class an {
   @Nullable
   private Instant a;

   public an() {
   }

   public an(Instant $$0) {
      this.a = $$0;
   }

   public boolean a() {
      return this.a != null;
   }

   public void b() {
      this.a = Instant.now();
   }

   public void c() {
      this.a = null;
   }

   @Nullable
   public Instant d() {
      return this.a;
   }

   @Override
   public String toString() {
      return "CriterionProgress{obtained=" + (this.a == null ? "false" : this.a) + "}";
   }

   public void a(so $$0) {
      $$0.a(this.a, so::a);
   }

   public static an b(so $$0) {
      an $$1 = new an();
      $$1.a = $$0.c(so::v);
      return $$1;
   }
}
