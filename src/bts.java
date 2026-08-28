import java.util.UUID;
import javax.annotation.Nullable;

public interface bts {
   @Nullable
   UUID W_();

   dbk e();

   @Nullable
   default btk P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
