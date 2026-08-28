public interface dho extends dhk {
   long ak();

   default float aq() {
      return ebp.j[this.G_().b(this.ak())];
   }

   default float f(float $$0) {
      return this.G_().a(this.ak());
   }

   default int ar() {
      return this.G_().b(this.ak());
   }
}
