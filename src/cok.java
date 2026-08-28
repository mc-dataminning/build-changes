public interface cok extends bwh<coo> {
   coj gC();

   void a(coj var1);

   default coo a() {
      return this.gC().a();
   }

   default void a(coo $$0) {
      this.a(this.gC().a($$0));
   }
}
