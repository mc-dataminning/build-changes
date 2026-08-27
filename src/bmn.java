import java.util.UUID;
import javax.annotation.Nullable;

public interface bmn {
   @Nullable
   UUID d();

   csz e();

   @Nullable
   default bmf R_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
