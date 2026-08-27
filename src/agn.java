public record agn(int b, int c, boolean d) implements yz<afx> {
   public static final yq<vs, agn> a = yz.a(agn::a, agn::new);

   private agn(vs $$0) {
      this($$0.l(), $$0.l(), $$0.readBoolean());
   }

   private void a(vs $$0) {
      $$0.c(this.b);
      $$0.c(this.c);
      $$0.a(this.d);
   }

   @Override
   public zb<agn> a() {
      return afv.bs;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public int e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
