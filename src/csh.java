public interface csh extends csd {
   long ai();

   default float ao() {
      return dkr.i[this.D_().b(this.ai())];
   }

   default float f(float $$0) {
      return this.D_().a(this.ai());
   }

   default int ap() {
      return this.D_().b(this.ai());
   }
}
