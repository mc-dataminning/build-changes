public interface ayf {
   int a();

   String b();

   default wx d() {
      return wx.c(this.b());
   }
}
