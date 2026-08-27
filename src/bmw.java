import java.util.UUID;
import javax.annotation.Nullable;

public interface bmw {
   @Nullable
   UUID d();

   cto e();

   @Nullable
   default bmo R_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
