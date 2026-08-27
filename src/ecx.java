import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import java.util.function.Consumer;

public class ecx extends ede {
   ecx(int $$0, int $$1, efh[] $$2, edw[] $$3) {
      super($$0, $$1, $$2, $$3);
   }

   @Override
   public edd a() {
      return eda.a;
   }

   @Override
   public void a(Consumer<ciw> $$0, ech $$1) {
   }

   public static ede.a<?> b() {
      return a(ecx::new);
   }

   public static class a extends ede.e<ecx> {
      public ecx a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, efh[] $$4, edw[] $$5) {
         return new ecx($$2, $$3, $$4, $$5);
      }
   }
}
