import java.util.UUID;
import javax.annotation.Nullable;

public interface bpe {
   @Nullable
   UUID d();

   cvv e();

   @Nullable
   default box R_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
