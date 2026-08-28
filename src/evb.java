public interface evb extends eqv {
   float b(equ var1);

   default int a(equ $$0) {
      return Math.round(this.b($$0));
   }

   eva b();
}
