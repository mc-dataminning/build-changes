public class acu implements zs<ach> {
   public static final zj<wi, acu> a = zs.a(acu::a, acu::new);
   private final bse b;
   private final boolean c;

   public acu(bse $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acu(wi $$0) {
      this.b = bse.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.l(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zu<acu> a() {
      return agw.m;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bse e() {
      return this.b;
   }
}
