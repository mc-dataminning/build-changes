public interface aup {
   int a();

   String b();

   default vf d() {
      return vf.c(this.b());
   }
}
