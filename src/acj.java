public class acj implements zb<abn> {
   public static final ys<vr, acj> a = zb.a(acj::a, acj::new);
   private final int b;
   private final int c;
   private final int d;

   public acj(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private acj(vr $$0) {
      this.b = $$0.readUnsignedByte();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
   }

   private void a(vr $$0) {
      $$0.k(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
   }

   @Override
   public zd<acj> a() {
      return afz.v;
   }

   public void a(abn $$0) {
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
