public interface coh extends bwh<cok> {
   cog gx();

   void a(cog var1);

   default cok a() {
      return this.gx().a();
   }

   default void a(cok $$0) {
      this.a(this.gx().a($$0));
   }
}
