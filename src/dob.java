import com.mojang.serialization.Codec;
import java.util.List;

class dob extends dof {
   public static final Codec<dob> a = a(dob::new);

   public dob(List<dod> $$0) {
      super($$0);
   }

   public boolean a(csz $$0, hx $$1) {
      for (dod $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public doe<?> a() {
      return doe.j;
   }
}
