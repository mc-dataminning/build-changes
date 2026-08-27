public record acn(float a, boolean b) implements wu<yo> {
   public acn(ue $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static acn a(bjv $$0) {
      return new acn($$0.f(), $$0.l());
   }

   @Override
   public void a(ue $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(yo $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }
}
