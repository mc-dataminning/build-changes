import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public class ecw extends ede {
   final aep i;

   ecw(aep $$0, int $$1, int $$2, efh[] $$3, edw[] $$4) {
      super($$1, $$2, $$3, $$4);
      this.i = $$0;
   }

   @Override
   public edd a() {
      return eda.d;
   }

   @Override
   public void a(Consumer<ciw> $$0, ech $$1) {
      $$1.a(this.i, $$0);
   }

   public static ede.a<?> a(aep $$0) {
      return a(($$1, $$2, $$3, $$4) -> new ecw($$0, $$1, $$2, $$3, $$4));
   }

   public static class a extends ede.e<ecw> {
      public void a(JsonObject $$0, ecw $$1, JsonSerializationContext $$2) {
         super.a($$0, $$1, $$2);
         $$0.addProperty("name", $$1.i.toString());
      }

      protected ecw a(JsonObject $$0, JsonDeserializationContext $$1, int $$2, int $$3, efh[] $$4, edw[] $$5) {
         aep $$6 = new aep(arf.i($$0, "name"));
         return new ecw($$6, $$2, $$3, $$4, $$5);
      }
   }
}
