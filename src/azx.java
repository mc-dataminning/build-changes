import com.mojang.datafixers.DSL.TypeReference;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Const.PrimitiveType;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.codecs.PrimitiveCodec;

public class azx extends Schema {
   public static final PrimitiveCodec<String> a = new PrimitiveCodec<String>() {
      public <T> DataResult<String> read(DynamicOps<T> $$0, T $$1) {
         return $$0.getStringValue($$1).map(azx::a);
      }

      public <T> T a(DynamicOps<T> $$0, String $$1) {
         return (T)$$0.createString($$1);
      }

      @Override
      public String toString() {
         return "NamespacedString";
      }
   };
   private static final Type<String> b = new PrimitiveType(a);

   public azx(int $$0, Schema $$1) {
      super($$0, $$1);
   }

   public static String a(String $$0) {
      aer $$1 = aer.a($$0);
      return $$1 != null ? $$1.toString() : $$0;
   }

   public static Type<String> a() {
      return b;
   }

   public Type<?> getChoiceType(TypeReference $$0, String $$1) {
      return super.getChoiceType($$0, a($$1));
   }
}
