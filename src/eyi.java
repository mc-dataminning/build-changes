import com.mojang.serialization.Codec;
import java.util.function.Function;
import java.util.function.Supplier;

public record eyi<T extends eyh>(String a, Function<eyh.a, T> b, Function<eyh.a, Codec<T>> c, bbb d) {
   public eyi(String $$0, Supplier<T> $$1, Codec<T> $$2, bbb $$3) {
      this($$0, $$1x -> $$1.get(), $$1x -> $$2, $$3);
   }

   @Override
   public boolean equals(Object $$0) {
      if ($$0 instanceof eyi<?> $$1 && this.a.equals($$1.a)) {
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
