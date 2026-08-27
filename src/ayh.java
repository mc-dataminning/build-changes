public interface ayh {
   int a();

   String b();

   default wx d() {
      return wx.c(this.b());
   }
}
