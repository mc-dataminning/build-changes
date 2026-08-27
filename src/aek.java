public record aek(float b, boolean c) implements xz<aai> {
   public static final xq<us, aek> a = xz.a(aek::a, aek::new);

   private aek(us $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static aek a(bmw $$0) {
      return new aek($$0.f(), $$0.l());
   }

   private void a(us $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yb<aek> a() {
      return aet.cd;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
