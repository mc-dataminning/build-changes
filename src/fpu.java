import com.google.common.collect.ImmutableList;

public interface fpu {
   default void a(fpt $$0, xl $$1) {
      this.a($$0, fpw.a($$1.getString()));
   }

   default void a(fpt $$0, String $$1) {
      this.a($$0, fpw.a($$1));
   }

   default void a(fpt $$0, xl... $$1) {
      this.a($$0, fpw.a(ImmutableList.copyOf($$1)));
   }

   void a(fpt var1, fpw<?> var2);

   fpu a();
}
