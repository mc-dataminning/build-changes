import java.time.Instant;
import javax.annotation.Nullable;

public class as {
   @Nullable
   private Instant a;

   public as() {
   }

   public as(Instant $$0) {
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

   public void a(vy $$0) {
      $$0.a(this.a, vy::a);
   }

   public static as b(vy $$0) {
      as $$1 = new as();
      $$1.a = $$0.c(vy::t);
      return $$1;
   }
}
