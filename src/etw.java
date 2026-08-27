import javax.annotation.Nullable;

public interface etw extends etq {
   long r = 250L;

   default void e(double $$0, double $$1) {
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

   default boolean b(int $$0, int $$1, int $$2) {
      return false;
   }

   default boolean a(char $$0, int $$1) {
      return false;
   }

   @Nullable
   default eru a(evz $$0) {
      return null;
   }

   default boolean a_(double $$0, double $$1) {
      return false;
   }

   void c_(boolean var1);

   boolean ax_();

   @Nullable
   default eru aC_() {
      return this.ax_() ? eru.a(this) : null;
   }

   default ewd s() {
      return ewd.a();
   }
}
