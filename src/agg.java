public class agg implements xx<aes> {
   public static final xo<vb, agg> a = xx.a(agg::a, agg::new);
   private final int b;
   private final cpd c;

   public agg(int $$0, cpd $$1) {
      this.b = $$0;
      this.c = $$1.q();
   }

   private agg(vb $$0) {
      this.b = $$0.readShort();
      this.c = cpd.f.decode($$0);
   }

   private void a(vb $$0) {
      $$0.l(this.b);
      cpd.f.encode($$0, this.c);
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

   public cpd e() {
      return this.c;
   }
}
