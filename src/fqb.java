import com.google.common.collect.ImmutableList;

public interface fqb {
   default void a(fqa $$0, xj $$1) {
      this.a($$0, fqd.a($$1.getString()));
   }

   default void a(fqa $$0, String $$1) {
      this.a($$0, fqd.a($$1));
   }

   default void a(fqa $$0, xj... $$1) {
      this.a($$0, fqd.a(ImmutableList.copyOf($$1)));
   }

   void a(fqa var1, fqd<?> var2);

   fqb a();
}
