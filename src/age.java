public record age(float b, boolean c) implements zf<abu> {
   public static final yw<vu, age> a = zf.a(age::a, age::new);

   private age(vu $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static age a(bum $$0) {
      return new age($$0.f(), $$0.l());
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zh<age> a() {
      return agn.cq;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
