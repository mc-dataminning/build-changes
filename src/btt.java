import java.util.UUID;
import javax.annotation.Nullable;

public interface btt {
   @Nullable
   UUID W_();

   dcl e();

   @Nullable
   default btl P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
