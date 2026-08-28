public interface cmh extends buk<cmk> {
   cmg gB();

   void a(cmg var1);

   default cmk a() {
      return this.gB().a();
   }

   default void a(cmk $$0) {
      this.a(this.gB().a($$0));
   }
}
