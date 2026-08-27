import java.util.UUID;
import javax.annotation.Nullable;

public interface bms {
   @Nullable
   UUID d();

   ctf e();

   @Nullable
   default bmk R_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
