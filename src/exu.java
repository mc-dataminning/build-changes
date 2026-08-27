public record exu(agt a, agt b, agt c, agt d) {
   public exu(agt $$0, agt $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public exu(agt $$0, agt $$1, agt $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public agt a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
