public interface coi extends bwf<col> {
   coh gz();

   void a(coh var1);

   default col a() {
      return this.gz().a();
   }

   default void a(col $$0) {
      this.a(this.gz().a($$0));
   }
}
