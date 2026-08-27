public record acx(float a, boolean b) implements xd<yx> {
   public acx(ug $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static acx a(bkf $$0) {
      return new acx($$0.f(), $$0.l());
   }

   @Override
   public void a(ug $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
   }

   public void a(yx $$0) {
      $$0.a(this);
   }

   public boolean d() {
      return this.b;
   }
}
