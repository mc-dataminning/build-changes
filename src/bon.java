import java.util.UUID;
import javax.annotation.Nullable;

public interface bon {
   @Nullable
   UUID d();

   cve e();

   @Nullable
   default bog R_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
