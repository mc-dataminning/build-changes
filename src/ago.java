public class ago implements yb<aez> {
   public static final xs<vf, ago> a = yb.a(ago::a, ago::new);
   private final int b;
   private final cqk c;

   public ago(int $$0, cqk $$1) {
      this.b = $$0;
      this.c = $$1.q();
   }

   private ago(vf $$0) {
      this.b = $$0.readShort();
      this.c = cqk.f.decode($$0);
   }

   private void a(vf $$0) {
      $$0.l(this.b);
      cqk.f.encode($$0, this.c);
   }

   @Override
   public yd<ago> a() {
      return aex.bU;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public cqk e() {
      return this.c;
   }
}
