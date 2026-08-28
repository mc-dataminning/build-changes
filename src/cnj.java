public interface cnj extends bvj<cnm> {
   cni gz();

   void a(cni var1);

   default cnm a() {
      return this.gz().a();
   }

   default void a(cnm $$0) {
      this.a(this.gz().a($$0));
   }
}
