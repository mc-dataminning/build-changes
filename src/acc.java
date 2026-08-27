import java.util.Objects;
import javax.annotation.Nullable;

public class acc implements xg<zb> {
   private final emx a;
   private final String b;

   public acc(emx $$0, @Nullable emy $$1) {
      this.a = $$0;
      if ($$1 == null) {
         this.b = "";
      } else {
         this.b = $$1.b();
      }
   }

   public acc(uj $$0) {
      this.a = $$0.a(emx.u);
      this.b = $$0.s();
   }

   @Override
   public void a(uj $$0) {
      $$0.a(emx::a, this.a);
      $$0.a(this.b);
   }

   public void a(zb $$0) {
      $$0.a(this);
   }

   public emx a() {
      return this.a;
   }

   @Nullable
   public String d() {
      return Objects.equals(this.b, "") ? null : this.b;
   }
}
