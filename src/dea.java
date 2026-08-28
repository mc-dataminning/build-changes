public interface dea {
   czd a(int var1);

   int a();

   default boolean b() {
      for (int $$0 = 0; $$0 < this.a(); $$0++) {
         if (!this.a($$0).f()) {
            return false;
         }
      }

      return true;
   }
}
