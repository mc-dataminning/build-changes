import com.google.common.collect.ImmutableList;

public interface ewd {
   default void a(ewc $$0, ti $$1) {
      this.a($$0, ewf.a($$1.getString()));
   }

   default void a(ewc $$0, String $$1) {
      this.a($$0, ewf.a($$1));
   }

   default void a(ewc $$0, ti... $$1) {
      this.a($$0, ewf.a(ImmutableList.copyOf($$1)));
   }

   void a(ewc var1, ewf<?> var2);

   ewd a();
}
