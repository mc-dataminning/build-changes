public interface azn {
   int b();

   String a();

   default xi d() {
      return xi.c(this.a());
   }
}
