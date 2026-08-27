public class agy implements yz<afx> {
   public static final yq<vs, agy> a = yz.a(agy::a, agy::new);
   private final int b;
   private final akf c;
   private final boolean d;

   public agy(int $$0, cwi<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private agy(vs $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(vs $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public zb<agy> a() {
      return afv.bG;
   }

   public void a(afx $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public akf e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
