import java.util.UUID;
import javax.annotation.Nullable;

public interface bwn {
   @Nullable
   UUID ab_();

   dgz e();

   @Nullable
   default bwg ah_() {
      UUID $$0 = this.ab_();
      return $$0 == null ? null : this.e().b($$0);
   }
}
