import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonSerializationContext;
import java.util.function.Consumer;

public abstract class dzy extends eaf {
   protected final eaf[] c;
   private final dzx e;

   protected dzy(eaf[] $$0, eck[] $$1) {
      super($$1);
      this.c = $$0;
      this.e = this.a($$0);
   }

   @Override
   public void a(dzv $$0) {
      super.a($$0);
      if (this.c.length == 0) {
         $$0.a("Empty children list");
      }

      for (int $$1 = 0; $$1 < this.c.length; $$1++) {
         this.c[$$1].a($$0.b(".entry[" + $$1 + "]"));
      }
   }

   protected abstract dzx a(dzx[] var1);

   @Override
   public final boolean expand(dzk $$0, Consumer<eae> $$1) {
      return !this.a($$0) ? false : this.e.expand($$0, $$1);
   }

   public static <T extends dzy> eaf.b<T> a(final dzy.a<T> $$0) {
      return new eaf.b<T>() {
         public void a(JsonObject $$0x, T $$1, JsonSerializationContext $$2) {
            $$0.add("children", $$2.serialize($$1.c));
         }

         public final T a(JsonObject $$0x, JsonDeserializationContext $$1, eck[] $$2) {
            eaf[] $$3 = aor.a($$0, "children", $$1, eaf[].class);
            return $$0.create($$3, $$2);
         }
      };
   }

   @FunctionalInterface
   public interface a<T extends dzy> {
      T create(eaf[] var1, eck[] var2);
   }
}
