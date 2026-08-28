import java.time.Instant;
import javax.annotation.Nullable;

public class ar {
   @Nullable
   private Instant a;

   public ar() {
   }

   public ar(Instant $$0) {
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

   public void a(vs $$0) {
      $$0.a(this.a, vs::a);
   }

   public static ar b(vs $$0) {
      ar $$1 = new ar();
      $$1.a = $$0.c(vs::t);
      return $$1;
   }
}
