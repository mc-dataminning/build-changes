import javax.annotation.Nullable;

public interface fqp extends fqc {
   long t = 250L;

   default void f(double $$0, double $$1) {
   }

   default boolean a(double $$0, double $$1, int $$2) {
      return false;
   }

   default boolean b(double $$0, double $$1, int $$2) {
      return false;
   }

   default boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      return false;
   }

   default boolean a(double $$0, double $$1, double $$2, double $$3) {
      return false;
   }

   default boolean a(int $$0, int $$1, int $$2) {
      return false;
   }

   default boolean c(int $$0, int $$1, int $$2) {
      return false;
   }

   default boolean a(char $$0, int $$1) {
      return false;
   }

   @Nullable
   default foa a(fsv $$0) {
      return null;
   }

   default boolean a_(double $$0, double $$1) {
      return false;
   }

   void a(boolean var1);

   boolean aM_();

   @Nullable
   default foa aN_() {
      return this.aM_() ? foa.a(this) : null;
   }

   default fsz J() {
      return fsz.a();
   }

   default fsz b(fsx $$0) {
      return this.J().c($$0);
   }
}
