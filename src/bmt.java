import java.util.UUID;
import javax.annotation.Nullable;

public interface bmt {
   @Nullable
   UUID d();

   ctg e();

   @Nullable
   default bml R_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
