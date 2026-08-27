import java.util.UUID;
import javax.annotation.Nullable;

public interface brl {
   @Nullable
   UUID W_();

   czl e();

   @Nullable
   default bre P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
