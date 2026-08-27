import java.util.UUID;
import javax.annotation.Nullable;

public interface bjg {
   @Nullable
   UUID U_();

   cpd e();

   @Nullable
   default biy I_() {
      UUID $$0 = this.U_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
