public interface ata {
   int a();

   String b();

   default ui d() {
      return ui.c(this.b());
   }
}
