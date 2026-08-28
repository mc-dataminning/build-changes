import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Optional;

public class dwa extends dwm<Boolean> {
   private final ImmutableList<Boolean> a = ImmutableList.of(true, false);

   protected dwa(String $$0) {
      super($$0, Boolean.class);
   }

   @Override
   public List<Boolean> a() {
      return this.a;
   }

   public static dwa a(String $$0) {
      return new dwa($$0);
   }

   @Override
   public Optional<Boolean> b(String $$0) {
      return !"true".equals($$0) && !"false".equals($$0) ? Optional.empty() : Optional.of(Boolean.valueOf($$0));
   }

   public String a(Boolean $$0) {
      return $$0.toString();
   }

   public int b(Boolean $$0) {
      return $$0 ? 0 : 1;
   }

   @Override
   public boolean equals(Object $$0) {
      if (this == $$0) {
         return true;
      } else {
         if ($$0 instanceof dwa $$1 && super.equals($$0)) {
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
