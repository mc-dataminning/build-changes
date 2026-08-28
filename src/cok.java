public interface cok extends bwg<coo> {
   coj gz();

   void a(coj var1);

   default coo a() {
      return this.gz().a();
   }

   default void a(coo $$0) {
      this.a(this.gz().a($$0));
   }
}
