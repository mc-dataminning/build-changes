public interface ats {
   int a();

   String b();

   default uv d() {
      return uv.c(this.b());
   }
}
