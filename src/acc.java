public record acc(float a, boolean b) implements wk<yd> {
   public acc(tu $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static acc a(bjg $$0) {
      return new acc($$0.f(), $$0.l());
   }

   @Override
   public void a(tu $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(yd $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }
}
