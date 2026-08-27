public record afo(float b, boolean c) implements zb<abm> {
   public static final ys<vu, afo> a = zb.a(afo::a, afo::new);

   private afo(vu $$0) {
      this($$0.readFloat(), $$0.readBoolean());
   }

   public static afo a(bpx $$0) {
      return new afo($$0.f(), $$0.l());
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<afo> a() {
      return afx.cd;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public boolean e() {
      return this.c;
   }
}
