public class ahq implements zf<agp> {
   public static final yw<vu, ahq> a = zf.a(ahq::a, ahq::new);
   private final boolean b;
   private final boolean c;

   public ahq(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private ahq(vu $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   @Override
   public zh<ahq> a() {
      return agn.bN;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
