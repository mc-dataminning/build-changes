public class aig implements zs<agy> {
   public static final zj<wi, aig> a = zs.a(aig::a, aig::new);
   private final cti b;
   private final boolean c;
   private final boolean d;

   public aig(cti $$0, boolean $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aig(wi $$0) {
      this.b = $$0.b(cti.class);
      this.c = $$0.readBoolean();
      this.d = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zu<aig> a() {
      return agw.bQ;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public cti b() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
