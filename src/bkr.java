import java.util.UUID;
import javax.annotation.Nullable;

public interface bkr {
   @Nullable
   UUID d();

   cqq e();

   @Nullable
   default bkj P_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
