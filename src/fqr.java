import javax.annotation.Nullable;

public interface fqr extends fqe {
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
   default foc a(fsx $$0) {
      return null;
   }

   default boolean a_(double $$0, double $$1) {
      return false;
   }

   void a(boolean var1);

   boolean aM_();

   @Nullable
   default foc aN_() {
      return this.aM_() ? foc.a(this) : null;
   }

   default ftb J() {
      return ftb.a();
   }

   default ftb b(fsz $$0) {
      return this.J().c($$0);
   }
}
