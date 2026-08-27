import com.google.common.collect.ImmutableList;

public interface ffe {
   default void a(ffd $$0, vu $$1) {
      this.a($$0, ffg.a($$1.getString()));
   }

   default void a(ffd $$0, String $$1) {
      this.a($$0, ffg.a($$1));
   }

   default void a(ffd $$0, vu... $$1) {
      this.a($$0, ffg.a(ImmutableList.copyOf($$1)));
   }

   void a(ffd var1, ffg<?> var2);

   ffe a();
}
