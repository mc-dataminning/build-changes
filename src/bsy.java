import java.util.UUID;
import javax.annotation.Nullable;

public interface bsy {
   @Nullable
   UUID W_();

   daq e();

   @Nullable
   default bsq P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
