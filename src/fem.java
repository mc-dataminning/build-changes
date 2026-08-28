public interface fem extends fai {
   float b(fah var1);

   default int a(fah $$0) {
      return Math.round(this.b($$0));
   }

   fel b();
}
