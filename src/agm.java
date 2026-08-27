public class agm implements yn<afl> {
   public static final ye<vg, agm> a = yn.a(agm::a, agm::new);
   private final int b;
   private final ajt c;
   private final boolean d;

   public agm(int $$0, cvl<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private agm(vg $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(vg $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yp<agm> a() {
      return afj.bG;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ajt e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
