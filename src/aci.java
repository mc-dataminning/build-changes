public record aci(vb a, boolean b) implements wu<yo> {
   public aci(ue $$0) {
      this($$0.m(), $$0.readBoolean());
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   @Override
   public boolean b() {
      return true;
   }

   public boolean d() {
      return this.b;
   }
}
