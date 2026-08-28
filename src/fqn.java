import javax.annotation.Nullable;

public interface fqn extends fqa {
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
   default fny a(fst $$0) {
      return null;
   }

   default boolean a_(double $$0, double $$1) {
      return false;
   }

   void a(boolean var1);

   boolean aM_();

   @Nullable
   default fny aN_() {
      return this.aM_() ? fny.a(this) : null;
   }

   default fsx J() {
      return fsx.a();
   }

   default fsx b(fsv $$0) {
      return this.J().c($$0);
   }
}
