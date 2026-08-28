import java.util.UUID;
import javax.annotation.Nullable;

public interface btz {
   @Nullable
   UUID W_();

   dbr e();

   @Nullable
   default btr P_() {
      UUID $$0 = this.W_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
