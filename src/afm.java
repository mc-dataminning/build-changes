public class afm implements yb<aez> {
   public static final xs<uu, afm> a = yb.a(afm::a, afm::new);
   private final int b;
   private final int c;

   public afm(int $$0, int $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private afm(uu $$0) {
      this.b = $$0.readByte();
      this.c = $$0.readByte();
   }

   private void a(uu $$0) {
      $$0.k(this.b);
      $$0.k(this.c);
   }

   @Override
   public yd<afm> a() {
      return aex.bp;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }
}
