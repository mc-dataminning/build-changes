class bpm extends bpe {
   protected bpm(bpg $$0, int $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean a(bqo $$0, int $$1) {
      if (!$$0.dM().B && $$0 instanceof cjt $$2) {
         $$2.gj().a($$1 + 1, 1.0F);
      }

      return true;
   }
}
