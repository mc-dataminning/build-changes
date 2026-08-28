import com.google.gson.annotations.SerializedName;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public abstract class fnf {
   @Override
   public String toString() {
      StringBuilder $$0 = new StringBuilder("{");

      for (Field $$1 : this.getClass().getFields()) {
         if (!b($$1)) {
            try {
               $$0.append(a($$1)).append("=").append($$1.get(this)).append(" ");
            } catch (IllegalAccessException var7) {
            }
         }
      }

      $$0.deleteCharAt($$0.length() - 1);
      $$0.append('}');
      return $$0.toString();
   }

   private static String a(Field $$0) {
      SerializedName $$1 = $$0.getAnnotation(SerializedName.class);
      return $$1 != null ? $$1.value() : $$0.getName();
   }

   private static boolean b(Field $$0) {
      return Modifier.isStatic($$0.getModifiers());
   }
}
