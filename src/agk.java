public class agk implements xz<aev> {
   public static final xq<vd, agk> a = xz.a(agk::a, agk::new);
   private final int b;
   private final cpq c;

   public agk(int $$0, cpq $$1) {
      this.b = $$0;
      this.c = $$1.q();
   }

   private agk(vd $$0) {
      this.b = $$0.readShort();
      this.c = cpq.f.decode($$0);
   }

   private void a(vd $$0) {
      $$0.l(this.b);
      cpq.f.encode($$0, this.c);
   }

   @Override
   public yb<agk> a() {
      return aet.bU;
   }

   public void a(aev $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public cpq e() {
      return this.c;
   }
}
