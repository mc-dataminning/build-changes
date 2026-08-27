import javax.annotation.Nullable;

public interface ewu extends ewj {
   long s = 250L;

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
   default eul a(eyy $$0) {
      return null;
   }

   default boolean a_(double $$0, double $$1) {
      return false;
   }

   void b_(boolean var1);

   boolean aJ_();

   @Nullable
   default eul aN_() {
      return this.aJ_() ? eul.a(this) : null;
   }

   default ezc s() {
      return ezc.a();
   }
}
