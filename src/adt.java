public record adt(adu a) implements ux<adr> {
   public adt(si $$0) {
      this($$0.a(adu.a));
   }

   @Override
   public void a(si $$0) {
      $$0.a(adu.a, this.a);
   }

   public void a(adr $$0) {
      $$0.a(this);
   }
}
