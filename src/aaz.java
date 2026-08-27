public class aaz implements yb<aam> {
   public static final xs<uu, aaz> a = yb.a(aaz::a, aaz::new);
   private final bna b;
   private final boolean c;

   public aaz(bna $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aaz(uu $$0) {
      this.b = bna.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(uu $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public yd<aaz> a() {
      return aex.m;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bna e() {
      return this.b;
   }
}
