public interface aua {
   int a();

   String b();

   default vb d() {
      return vb.c(this.b());
   }
}
