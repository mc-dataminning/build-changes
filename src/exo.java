public interface exo extends eti {
   float b(eth var1);

   default int a(eth $$0) {
      return Math.round(this.b($$0));
   }

   exn b();
}
