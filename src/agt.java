public class agt implements zf<agp> {
   public static final yw<vu, agt> a = zf.a(agt::a, agt::new);
   private final bty b;

   public agt(bty $$0) {
      this.b = $$0;
   }

   private agt(vu $$0) {
      this.b = bty.a($$0.readUnsignedByte());
   }

   private void a(vu $$0) {
      $$0.l(this.b.a());
   }

   @Override
   public zh<agt> a() {
      return agn.bn;
   }

   public void a(agp $$0) {
      $$0.a(this);
   }

   public bty b() {
      return this.b;
   }
}
