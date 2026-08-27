public class ago implements yb<aez> {
   public static final xs<vf, ago> a = yb.a(ago::a, ago::new);
   private final int b;
   private final cqm c;

   public ago(int $$0, cqm $$1) {
      this.b = $$0;
      this.c = $$1.q();
   }

   private ago(vf $$0) {
      this.b = $$0.readShort();
      this.c = cqm.f.decode($$0);
   }

   private void a(vf $$0) {
      $$0.l(this.b);
      cqm.f.encode($$0, this.c);
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

   public cqm e() {
      return this.c;
   }
}
