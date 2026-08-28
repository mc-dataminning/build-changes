public class aeq implements zl<aca> {
   public static final zc<wb, aeq> a = zl.a(aeq::a, aeq::new);
   private final int b;
   private final byte c;

   public aeq(btr $$0, byte $$1) {
      this.b = $$0.ap();
      this.c = $$1;
   }

   private aeq(wb $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wb $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
   }

   @Override
   public zn<aeq> a() {
      return agp.an;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public btr a(dej $$0) {
      return $$0.a(this.b);
   }

   public float b() {
      return azf.a(this.c);
   }
}
