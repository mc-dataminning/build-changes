import java.util.UUID;
import javax.annotation.Nullable;

public interface blg {
   @Nullable
   UUID d();

   crj e();

   @Nullable
   default bky P_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
