public interface dgp extends dgl {
   long al();

   default float ar() {
      return eas.k[this.G_().b(this.al())];
   }

   default float f(float $$0) {
      return this.G_().a(this.al());
   }

   default int as() {
      return this.G_().b(this.al());
   }
}
