public class agk implements yn<afl> {
   public static final ye<vg, agk> a = yn.a(agk::a, agk::new);
   private final boolean b;
   private final boolean c;

   public agk(boolean $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agk(vg $$0) {
      this.b = $$0.readBoolean();
      this.c = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   @Override
   public yp<agk> a() {
      return afj.bE;
   }

   public boolean b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
