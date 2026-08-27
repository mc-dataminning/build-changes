public interface dbe extends dba {
   long aj();

   default float ap() {
      return dut.i[this.D_().b(this.aj())];
   }

   default float f(float $$0) {
      return this.D_().a(this.aj());
   }

   default int aq() {
      return this.D_().b(this.aj());
   }
}
