public class adm implements zk<abz> {
   public static final zb<wa, adm> a = zk.a(adm::a, adm::new);
   private final int b;
   private final je c;
   private final int d;
   private final boolean e;

   public adm(int $$0, je $$1, int $$2, boolean $$3) {
      this.b = $$0;
      this.c = $$1.j();
      this.d = $$2;
      this.e = $$3;
   }

   private adm(wa $$0) {
      this.b = $$0.readInt();
      this.c = $$0.e();
      this.d = $$0.readInt();
      this.e = $$0.readBoolean();
   }

   private void a(wa $$0) {
      $$0.q(this.b);
      $$0.a(this.c);
      $$0.q(this.d);
      $$0.a(this.e);
   }

   @Override
   public zm<adm> a() {
      return ago.L;
   }

   public void a(abz $$0) {
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

   public je g() {
      return this.c;
   }
}
