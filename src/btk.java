import java.util.UUID;
import javax.annotation.Nullable;

public interface btk {
   @Nullable
   UUID W_();

   dbx e();

   @Nullable
   default btc P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
