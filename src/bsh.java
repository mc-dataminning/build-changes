import java.util.UUID;
import javax.annotation.Nullable;

public interface bsh {
   @Nullable
   UUID W_();

   czu e();

   @Nullable
   default bsa P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
