import java.util.Optional;
import javax.annotation.Nullable;

public class dn {
   public static final dn a = new dn(null);
   @Nullable
   private final agm b;
   private boolean c;
   private Optional<hb<du>> d = Optional.empty();

   public dn(@Nullable agm $$0) {
      this.b = $$0;
   }

   public Optional<hb<du>> a(aha $$0) {
      if (!this.c) {
         if (this.b != null) {
            this.d = $$0.a(this.b);
         }

         this.c = true;
      }

      return this.d;
   }

   @Nullable
   public agm a() {
      return this.d.<agm>map(hb::a).orElse(this.b);
   }
}
