public class agk implements yz<afx> {
   public static final yq<vs, agk> a = yz.a(agk::a, agk::new);
   private final int b;
   private final int c;

   public agk(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agk(vs $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(vs $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public zb<agk> a() {
      return afv.bp;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
