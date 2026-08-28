public class ach implements zk<abz> {
   public static final zb<wo, ach> a = zk.a(ach::a, ach::new);
   private final je b;
   private final int c;
   private final int d;
   private final dhj e;

   public ach(je $$0, dhj $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private ach(wo $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yz.a(lv.f).decode($$0);
   }

   private void a(wo $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      yz.a(lv.f).encode($$0, this.e);
   }

   @Override
   public zm<ach> a() {
      return ago.j;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public je b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dhj g() {
      return this.e;
   }
}
