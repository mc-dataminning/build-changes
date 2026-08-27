import com.google.common.collect.ImmutableList;

public interface evt {
   default void a(evs $$0, te $$1) {
      this.a($$0, evv.a($$1.getString()));
   }

   default void a(evs $$0, String $$1) {
      this.a($$0, evv.a($$1));
   }

   default void a(evs $$0, te... $$1) {
      this.a($$0, evv.a(ImmutableList.copyOf($$1)));
   }

   void a(evs var1, evv<?> var2);

   evt a();
}
