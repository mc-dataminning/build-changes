import java.util.UUID;
import javax.annotation.Nullable;

public interface btx {
   @Nullable
   UUID W_();

   dbp e();

   @Nullable
   default btp P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
