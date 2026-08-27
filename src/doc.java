import com.mojang.serialization.Codec;
import java.util.List;

class doc extends dof {
   public static final Codec<doc> a = a(doc::new);

   public doc(List<dod> $$0) {
      super($$0);
   }

   public boolean a(csz $$0, hx $$1) {
      for (dod $$2 : this.e) {
         if ($$2.test($$0, $$1)) {
            return true;
         }
      }

      return false;
   }

   @Override
   public doe<?> a() {
      return doe.i;
   }
}
