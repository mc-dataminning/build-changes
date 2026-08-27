import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class bdh extends bes {
   private final String a;

   public bdh(Schema $$0, String $$1, String $$2) {
      super($$0, true, "Horse armor fix for " + $$1, bfs.z, $$1);
      this.a = $$2;
   }

   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      Optional<? extends Dynamic<?>> $$1 = $$0.get(this.a).result();
      if ($$1.isPresent()) {
         Dynamic<?> $$2 = (Dynamic<?>)$$1.get();
         Dynamic<T> $$3 = $$0.remove(this.a);
         $$3 = $$3.set("body_armor_item", $$2);
         return $$3.set("body_armor_drop_chance", $$0.createFloat(2.0F));
      } else {
         return $$0;
      }
   }
}
