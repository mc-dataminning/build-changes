import com.google.common.collect.ImmutableList;

public interface fja {
   default void a(fiz $$0, wu $$1) {
      this.a($$0, fjc.a($$1.getString()));
   }

   default void a(fiz $$0, String $$1) {
      this.a($$0, fjc.a($$1));
   }

   default void a(fiz $$0, wu... $$1) {
      this.a($$0, fjc.a(ImmutableList.copyOf($$1)));
   }

   void a(fiz var1, fjc<?> var2);

   fja a();
}
