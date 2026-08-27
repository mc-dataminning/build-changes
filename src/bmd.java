import java.util.UUID;
import javax.annotation.Nullable;

public interface bmd {
   @Nullable
   UUID d();

   csp e();

   @Nullable
   default blv R_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
