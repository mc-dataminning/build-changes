import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public abstract class ecv extends edc {
   protected final edc[] c;
   private final ecu e;

   protected ecv(edc[] $$0, efh[] $$1) {
      super($$1);
      this.c = $$0;
      this.e = this.a($$0);
   }

   @Override
   public void a(ecs $$0) {
      super.a($$0);
      if (this.c.length == 0) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         this.c[$$1].a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract ecu a(ecu[] var1);

   @Override
   public final boolean expand(ech $$0, Consumer<edb> $$1) {
      return !this.a($$0) ? false : this.e.expand($$0, $$1);
   }

   public static <T extends ecv> edc.b<T> a(final ecv.a<T> $$0) {
      return new edc.b<T>() {
         public void a(JsonObject $$0x, T $$1, JsonSerializationContext $$2) {
            $$0.add("children", $$2.serialize($$1.c));
         }

         public final T a(JsonObject $$0x, JsonDeserializationContext $$1, efh[] $$2) {
            edc[] $$3 = arf.a($$0, "children", $$1, edc[].class);
            return $$0.create($$3, $$2);
         }
      };
   }

   @FunctionalInterface
   public interface a<T extends ecv> {
      T create(edc[] var1, efh[] var2);
   }
}
