import com.google.common.collect.ImmutableList;

public interface fbk {
   default void a(fbj $$0, vg $$1) {
      this.a($$0, fbm.a($$1.getString()));
   }

   default void a(fbj $$0, String $$1) {
      this.a($$0, fbm.a($$1));
   }

   default void a(fbj $$0, vg... $$1) {
      this.a($$0, fbm.a(ImmutableList.copyOf($$1)));
   }

   void a(fbj var1, fbm<?> var2);

   fbk a();
}
