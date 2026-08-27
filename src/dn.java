import java.util.Optional;
import javax.annotation.Nullable;

public class dn {
   public static final dn a = new dn(null);
   @Nullable
   private final agi b;
   private boolean c;
   private Optional<gx<du>> d = Optional.empty();

   public dn(@Nullable agi $$0) {
      this.b = $$0;
   }

   public Optional<gx<du>> a(agw $$0) {
      if (!this.c) {
         if (this.b != null) {
            this.d = $$0.a(this.b);
         }

         this.c = true;
      }

      return this.d;
   }

   @Nullable
   public agi a() {
      return this.d.<agi>map(gx::a).orElse(this.b);
   }
}
