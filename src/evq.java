public interface evq extends erq {
   float b(erp var1);

   default int a(erp $$0) {
      return Math.round(this.b($$0));
   }

   evp b();
}
