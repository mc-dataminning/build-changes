public interface dhg extends dhc {
   long al();

   default float ar() {
      return ebj.j[this.G_().b(this.al())];
   }

   default float f(float $$0) {
      return this.G_().a(this.al());
   }

   default int as() {
      return this.G_().b(this.al());
   }
}
