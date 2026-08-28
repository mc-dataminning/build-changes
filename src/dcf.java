public interface dcf extends dcb {
   long ak();

   default float aq() {
      return dvu.i[this.D_().b(this.ak())];
   }

   default float f(float $$0) {
      return this.D_().a(this.ak());
   }

   default int ar() {
      return this.D_().b(this.ak());
   }
}
