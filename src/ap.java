import java.time.Instant;
import javax.annotation.Nullable;

public class ap {
   @Nullable
   private Instant a;

   public ap() {
   }

   public ap(Instant $$0) {
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

   public void a(vw $$0) {
      $$0.a(this.a, vw::a);
   }

   public static ap b(vw $$0) {
      ap $$1 = new ap();
      $$1.a = $$0.c(vw::t);
      return $$1;
   }
}
