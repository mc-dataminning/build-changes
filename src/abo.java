import java.util.Objects;
import javax.annotation.Nullable;

public class abo implements wu<yo> {
   private final elw a;
   private final String b;

   public abo(elw $$0, @Nullable elx $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public abo(ue $$0) {
      this.a = $$0.a(elw.u);
      this.b = $$0.s();
   }

   @Override
   public void a(ue $$0) {
      $$0.a(elw::a, this.a);
      $$0.a(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public elw a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
