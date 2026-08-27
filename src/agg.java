public class agg implements xx<aes> {
   public static final xo<vb, agg> a = xx.a(agg::a, agg::new);
   private final int b;
   private final coz c;

   public agg(int $$0, coz $$1) {
      this.b = $$0;
      this.c = $$1.q();
   }

   private agg(vb $$0) {
      this.b = $$0.readShort();
      this.c = coz.f.decode($$0);
   }

   private void a(vb $$0) {
      $$0.l(this.b);
      coz.f.encode($$0, this.c);
   }

   @Override
   public xz<agg> a() {
      return aeq.bS;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public coz e() {
      return this.c;
   }
}
