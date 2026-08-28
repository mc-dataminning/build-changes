public class adu implements zs<ach> {
   public static final zj<wi, adu> a = zs.a(adu::a, adu::new);
   private final int b;
   private final jh c;
   private final int d;
   private final boolean e;

   public adu(int $$0, jh $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private adu(wi $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(wi $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
   }

   @Override
   public zu<adu> a() {
      return agw.L;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.e;
   }

   public int e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }

   public jh g() {
      return this.c;
   }
}
