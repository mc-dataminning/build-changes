public interface coj extends bwg<com> {
   coi gC();

   void a(coi var1);

   default com a() {
      return this.gC().a();
   }

   default void a(com $$0) {
      this.a(this.gC().a($$0));
   }
}
