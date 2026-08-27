public interface auk {
   int a();

   String b();

   default vd d() {
      return vd.c(this.b());
   }
}
