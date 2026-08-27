public class acd implements ze<abq> {
   public static final yv<vx, acd> a = ze.a(acd::a, acd::new);
   private final bpr b;
   private final boolean c;

   public acd(bpr $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acd(vx $$0) {
      this.b = bpr.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vx $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zg<acd> a() {
      return agb.m;
   }

   public void a(abq $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bpr e() {
      return this.b;
   }
}
