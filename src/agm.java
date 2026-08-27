public class agm implements zb<afz> {
   public static final ys<vu, agm> a = zb.a(agm::a, agm::new);
   private final int b;
   private final int c;

   public agm(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agm(vu $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(vu $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public zd<agm> a() {
      return afx.bp;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
