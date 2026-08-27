import java.util.Objects;
import javax.annotation.Nullable;

public class aby implements xd<yx> {
   private final emh a;
   private final String b;

   public aby(emh $$0, @Nullable emi $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public aby(ug $$0) {
      this.a = $$0.a(emh.u);
      this.b = $$0.s();
   }

   @Override
   public void a(ug $$0) {
      $$0.a(emh::a, this.a);
      $$0.a(this.b);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public emh a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
