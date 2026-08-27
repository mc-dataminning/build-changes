import java.time.Instant;
import javax.annotation.Nullable;

public class ao {
   @Nullable
   private Instant a;

   public ao() {
   }

   public ao(Instant $$0) {
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

   public void a(ui $$0) {
      $$0.a(this.a, ui::a);
   }

   public static ao b(ui $$0) {
      ao $$1 = new ao();
      $$1.a = $$0.c(ui::w);
      return $$1;
   }
}
