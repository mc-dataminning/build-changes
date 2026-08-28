public interface dke extends dka {
   long am();

   default float as() {
      return efb.k[this.F_().b(this.am())];
   }

   default float f(float $$0) {
      return this.F_().a(this.am());
   }

   default int at() {
      return this.F_().b(this.am());
   }
}
