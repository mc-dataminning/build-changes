import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public record ezb<T extends eza>(String a, Function<eza.a, T> b, Function<eza.a, Codec<T>> c, bbd d) {
   public ezb(String $$0, Supplier<T> $$1, Codec<T> $$2, bbd $$3) {
      this($$0, $$1x -> $$1.get(), $$1x -> $$2, $$3);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof ezb<?> $$1 && this.a.equals($$1.a)) {
         return true;
      }

      return false;
   }

   @Override
   public int hashCode() {
      return this.a.hashCode();
   }

   @Override
   public String toString() {
      return "SavedDataType[" + this.a + "]";
   }
}
