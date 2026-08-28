import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import javax.annotation.Nullable;

public class bhx extends bee {
   public static final Escaper a = Escapers.builder().addEscape('"', "\\\"").addEscape('\\', "\\\\").build();

   public bhx(Schema $$0) {
      super($$0, "LockComponentPredicateFix", "minecraft:lock");
   }

   @Nullable
   @Override
   protected <T> Dynamic<T> a(Dynamic<T> $$0) {
      return b($$0);
   }

   @Nullable
   public static <T> Dynamic<T> b(Dynamic<T> $$0) {
      Optional<String> $$1 = $$0.asString().result();
      if ($$1.isEmpty()) {
         return null;
      } else if ($$1.get().isEmpty()) {
         return null;
      } else {
         Dynamic<T> $$2 = $$0.createString("\"" + a.escape($$1.get()) + "\"");
         Dynamic<T> $$3 = $$0.emptyMap().set("minecraft:custom_name", $$2);
         return $$0.emptyMap().set("components", $$3);
      }
   }
}
