public class agr implements ze<agd> {
   public static final yv<vx, agr> a = ze.a(agr::a, agr::new);
   private final int b;
   private final int c;

   public agr(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private agr(vx $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(vx $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public zg<agr> a() {
      return agb.bq;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
