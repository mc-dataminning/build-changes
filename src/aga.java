public record aga(float b, boolean c) implements zl<abw> {
   public static final zc<we, aga> a = zl.a(aga::a, aga::new);

   private aga(we $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static aga a(bql $$0) {
      return new aga($$0.f(), $$0.l());
   }

   private void a(we $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zn<aga> a() {
      return agj.cf;
   }

   public void a(abw $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
