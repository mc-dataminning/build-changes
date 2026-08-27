public interface axy {
   int a();

   String b();

   default ws d() {
      return ws.c(this.b());
   }
}
