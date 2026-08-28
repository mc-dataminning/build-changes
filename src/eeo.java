import com.mojang.serialization.MapCodec;
import java.util.List;

class eeo extends ees {
   public static final MapCodec<eeo> a = a(eeo::new);

   public eeo(List<eeq> $$0) {
      super($$0);
   }

   public boolean a(dhx $$0, jh $$1) {
      for (eeq $$2 : this.e) {
         if (!$$2.test($$0, $$1)) {
            return false;
         }
      }

      return true;
   }

   @Override
   public eer<?> a() {
      return eer.j;
   }
}
