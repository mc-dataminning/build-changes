import java.util.UUID;
import javax.annotation.Nullable;

public interface btv {
   @Nullable
   UUID W_();

   dbn e();

   @Nullable
   default btn P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
