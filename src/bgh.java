import java.util.UUID;
import javax.annotation.Nullable;

public interface bgh {
   @Nullable
   UUID U_();

   cmd e();

   @Nullable
   default bfz I_() {
      UUID $$0 = this.U_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
