public record ahb(int b, int c, boolean d) implements zl<agl> {
   public static final zc<we, ahb> a = zl.a(ahb::a, ahb::new);

   private ahb(we $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(we $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zn<ahb> a() {
      return agj.bu;
   }

   public void a(agl $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
