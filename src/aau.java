import java.util.Objects;
import javax.annotation.Nullable;

public class aau implements wb<xu> {
   private final eja a;
   private final String b;

   public aau(eja $$0, @Nullable ejb $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public aau(tl $$0) {
      this.a = $$0.a(eja.u);
      this.b = $$0.s();
   }

   @Override
   public void a(tl $$0) {
      $$0.a(eja::a, this.a);
      $$0.a(this.b);
   }

   public void a(xu $$0) {
      $$0.a(this);
   }

   public eja a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
