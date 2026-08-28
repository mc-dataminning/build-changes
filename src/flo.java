import com.google.common.collect.ImmutableList;

public interface flo {
   default void a(fln $$0, wu $$1) {
      this.a($$0, flq.a($$1.getString()));
   }

   default void a(fln $$0, String $$1) {
      this.a($$0, flq.a($$1));
   }

   default void a(fln $$0, wu... $$1) {
      this.a($$0, flq.a(ImmutableList.copyOf($$1)));
   }

   void a(fln var1, flq<?> var2);

   flo a();
}
