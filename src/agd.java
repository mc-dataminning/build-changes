public class agd implements zs<ach> {
   public static final zj<wi, agd> a = zs.a(agd::a, agd::new);
   private final int b;
   private final int c;
   private final int d;

   public agd(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private agd(wi $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(wi $$0) {
      $$0.q(this.b);
      $$0.q(this.c);
      $$0.q(this.d);
   }

   @Override
   public zu<agd> a() {
      return agw.aR;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
