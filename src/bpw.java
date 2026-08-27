import java.util.UUID;
import javax.annotation.Nullable;

public interface bpw {
   @Nullable
   UUID d();

   cws e();

   @Nullable
   default bpp P_() {
      UUID $$0 = this.d();
      return $$0 == null ? null : this.e().b($$0);
   }
}
