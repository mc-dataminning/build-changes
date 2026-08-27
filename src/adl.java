public class adl implements zb<abm> {
   public static final ys<vu, adl> a = zb.a(adl::a, adl::new);
   private final int b;
   private final akh c;

   public adl(int $$0, cxf<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private adl(vu $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(vu $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public zd<adl> a() {
      return afx.Y;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public akh b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
