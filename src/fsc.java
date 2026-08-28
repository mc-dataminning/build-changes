import com.google.common.collect.ImmutableList;

public interface fsc {
   default void a(fsb $$0, xv $$1) {
      this.a($$0, fse.a($$1.getString()));
   }

   default void a(fsb $$0, String $$1) {
      this.a($$0, fse.a($$1));
   }

   default void a(fsb $$0, xv... $$1) {
      this.a($$0, fse.a(ImmutableList.copyOf($$1)));
   }

   void a(fsb var1, fse<?> var2);

   fsc a();
}
