import java.util.Objects;
import javax.annotation.Nullable;

public class abd implements wk<yd> {
   private final ekp a;
   private final String b;

   public abd(ekp $$0, @Nullable ekq $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public abd(tu $$0) {
      this.a = $$0.a(ekp.u);
      this.b = $$0.s();
   }

   @Override
   public void a(tu $$0) {
      $$0.a(ekp::a, this.a);
      $$0.a(this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public ekp a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
