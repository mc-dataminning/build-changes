import java.time.Instant;
import javax.annotation.Nullable;

public class aq {
   @Nullable
   private Instant a;

   public aq() {
   }

   public aq(Instant $$0) {
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

   public void a(wh $$0) {
      $$0.a(this.a, wh::a);
   }

   public static aq b(wh $$0) {
      aq $$1 = new aq();
      $$1.a = $$0.c(wh::t);
      return $$1;
   }
}
