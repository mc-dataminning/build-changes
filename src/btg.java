import java.util.UUID;
import javax.annotation.Nullable;

public interface btg {
   @Nullable
   UUID W_();

   dbu e();

   @Nullable
   default bsy P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
