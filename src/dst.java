import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Optional;

public class dst extends dtf<Boolean> {
   private final ImmutableSet<Boolean> a = ImmutableSet.of(true, false);

   protected dst(String $$0) {
      super($$0, Boolean.class);
   }

   @Override
   public Collection<Boolean> a() {
      return this.a;
   }

   public static dst a(String $$0) {
      return new dst($$0);
   }

   @Override
   public Optional<Boolean> b(String $$0) {
      return !"true".equals($$0) && !"false".equals($$0) ? Optional.empty() : Optional.of(Boolean.valueOf($$0));
   }

   public String a(Boolean $$0) {
      return $$0.toString();
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dst $$1 && super.equals($$0)) {
            return this.a.equals($$1.a);
         }

         return false;
      }
   }

   @Override
   public int b() {
      return 31 * super.b() + this.a.hashCode();
   }
}
