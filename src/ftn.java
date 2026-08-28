import com.google.common.collect.ImmutableList;

public interface ftn {
   default void a(ftm $$0, wp $$1) {
      this.a($$0, ftp.a($$1.getString()));
   }

   default void a(ftm $$0, String $$1) {
      this.a($$0, ftp.a($$1));
   }

   default void a(ftm $$0, wp... $$1) {
      this.a($$0, ftp.a(ImmutableList.copyOf($$1)));
   }

   void a(ftm var1, ftp<?> var2);

   ftn a();
}
