import javax.annotation.Nullable;

public interface fja extends fio {
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
   default fgo a(flg $$0) {
      return null;
   }

   default boolean c(double $$0, double $$1) {
      return false;
   }

   void a(boolean var1);

   boolean aH_();

   @Nullable
   default fgo aI_() {
      return this.aH_() ? fgo.a(this) : null;
   }

   default flk G() {
      return flk.a();
   }
}
