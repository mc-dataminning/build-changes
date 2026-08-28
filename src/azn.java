public interface azn {
   int b();

   String a();

   default wv d() {
      return wv.c(this.a());
   }
}
