import java.util.Optional;
import javax.annotation.Nullable;

public class dn {
   public static final dn a = new dn(null);
   @Nullable
   private final afw b;
   private boolean c;
   private Optional<gx<du>> d = Optional.empty();

   public dn(@Nullable afw $$0) {
      this.b = $$0;
   }

   public Optional<gx<du>> a(agk $$0) {
      if (!this.c) {
         if (this.b != null) {
            this.d = $$0.a(this.b);
         }

         this.c = true;
      }

      return this.d;
   }

   @Nullable
   public afw a() {
      return this.d.<afw>map(gx::a).orElse(this.b);
   }
}
