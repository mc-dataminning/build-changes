import java.util.UUID;
import javax.annotation.Nullable;

public interface bqv {
   @Nullable
   UUID d();

   cyo e();

   @Nullable
   default bqo P_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
