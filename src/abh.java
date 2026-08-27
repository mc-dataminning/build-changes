import java.util.Objects;
import javax.annotation.Nullable;

public class abh implements wo<yh> {
   private final eku a;
   private final String b;

   public abh(eku $$0, @Nullable ekv $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public abh(ty $$0) {
      this.a = $$0.a(eku.u);
      this.b = $$0.s();
   }

   @Override
   public void a(ty $$0) {
      $$0.a(eku::a, this.a);
      $$0.a(this.b);
   }

   public void a(yh $$0) {
      $$0.a(this);
   }

   public eku a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
