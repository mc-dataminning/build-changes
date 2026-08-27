public record ewr(agm a, agm b, agm c, agm d) {
   public ewr(agm $$0, agm $$1) {
      this($$0, $$0, $$1, $$1);
   }

   public ewr(agm $$0, agm $$1, agm $$2) {
      this($$0, $$1, $$2, $$1);
   }

   public agm a(boolean $$0, boolean $$1) {
      if ($$0) {
         return $$1 ? this.c : this.a;
      } else {
         return $$1 ? this.d : this.b;
      }
   }
}
