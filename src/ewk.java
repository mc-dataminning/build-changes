import com.google.common.collect.ImmutableList;

public interface ewk {
   default void a(ewj $$0, tn $$1) {
      this.a($$0, ewm.a($$1.getString()));
   }

   default void a(ewj $$0, String $$1) {
      this.a($$0, ewm.a($$1));
   }

   default void a(ewj $$0, tn... $$1) {
      this.a($$0, ewm.a(ImmutableList.copyOf($$1)));
   }

   void a(ewj var1, ewm<?> var2);

   ewk a();
}
