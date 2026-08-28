public class aet implements zs<ace> {
   public static final zj<wl, aet> a = zs.a(aet::a, aet::new);
   private final int b;
   private final byte c;

   public aet(bsp $$0, byte $$1) {
      this.b = $$0.al();
      this.c = $$1;
   }

   private aet(wl $$0) {
      this.b = $$0.l();
      this.c = $$0.readByte();
   }

   private void a(wl $$0) {
      $$0.c(this.b);
      $$0.k(this.c);
   }

   @Override
   public zu<aet> a() {
      return agq.am;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public bsp a(dbt $$0) {
      return $$0.a(this.b);
   }

   public byte b() {
      return this.c;
   }
}
