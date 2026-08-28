import java.util.UUID;
import javax.annotation.Nullable;

public interface btj {
   @Nullable
   UUID W_();

   dbw e();

   @Nullable
   default btb P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
