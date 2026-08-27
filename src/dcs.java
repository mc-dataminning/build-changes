import com.google.common.collect.ImmutableSet;
import java.util.Collection;
import java.util.Optional;

public class dcs extends dde<Boolean> {
   private final ImmutableSet<Boolean> a = ImmutableSet.of(true, false);

   protected dcs(String $$0) {
      super($$0, Boolean.class);
   }

   @Override
   public Collection<Boolean> a() {
      return this.a;
   }

   public static dcs a(String $$0) {
      return new dcs($$0);
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
      } else if ($$0 instanceof dcs && super.equals($$0)) {
         dcs $$1 = (dcs)$$0;
         return this.a.equals($$1.a);
      } else {
         return false;
      }
   }

   @Override
   public int b() {
      return 31 * super.b() + this.a.hashCode();
   }
}
