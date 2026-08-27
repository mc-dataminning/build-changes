public interface dch extends dcd {
   long ak();

   default float aq() {
      return dwu.i[this.E_().b(this.ak())];
   }

   default float f(float $$0) {
      return this.E_().a(this.ak());
   }

   default int ar() {
      return this.E_().b(this.ak());
   }
}
