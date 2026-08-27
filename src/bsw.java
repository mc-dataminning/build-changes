import java.util.UUID;
import javax.annotation.Nullable;

public interface bsw {
   @Nullable
   UUID W_();

   dao e();

   @Nullable
   default bso P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
