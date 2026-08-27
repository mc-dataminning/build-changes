import com.mojang.serialization.Codec;
import java.util.Optional;

public class ec {
   public static final Codec<ec> a = akt.a.xmap(ec::new, ec::a);
   private final akt b;
   private boolean c;
   private Optional<ht<eh>> d = Optional.empty();

   public ec(akt $$0) {
      this.b = $$0;
   }

   public Optional<ht<eh>> a(ali $$0) {
      if (!this.c) {
         this.d = $$0.a(this.b);
         this.c = true;
      }

      return this.d;
   }

   public akt a() {
      return this.b;
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 == this) {
         return true;
      } else {
         if ($$0 instanceof ec $$1 && this.a().equals($$1.a())) {
            return true;
         }

         return false;
      }
   }
}
