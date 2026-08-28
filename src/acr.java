public class acr implements zo<acf> {
   public static final ze<vy, acr> a = zo.a(acr::a, acr::new);
   private final buz b;
   private final boolean c;

   public acr(buz $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acr(vy $$0) {
      this.b = buz.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vy $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zq<acr> a() {
      return agy.l;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public buz e() {
      return this.b;
   }
}
