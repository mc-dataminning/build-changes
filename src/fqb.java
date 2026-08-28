import javax.annotation.Nullable;

public interface fqb extends fpo {
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
   default fnn a(fsh $$0) {
      return null;
   }

   default boolean c(double $$0, double $$1) {
      return false;
   }

   void a(boolean var1);

   boolean aN_();

   @Nullable
   default fnn aO_() {
      return this.aN_() ? fnn.a(this) : null;
   }

   default fsl H() {
      return fsl.a();
   }
}
