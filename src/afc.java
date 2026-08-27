public record afc(float b, boolean c) implements yp<aba> {
   public static final yg<vi, afc> a = yp.a(afc::a, afc::new);

   private afc(vi $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afc a(boq $$0) {
      return new afc($$0.f(), $$0.l());
   }

   private void a(vi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public yr<afc> a() {
      return afl.cd;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
