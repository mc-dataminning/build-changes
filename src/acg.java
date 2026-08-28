public class acg implements zf<abt> {
   public static final yw<vv, acg> a = zf.a(acg::a, acg::new);
   private final bqn b;
   private final boolean c;

   public acg(bqn $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private acg(vv $$0) {
      this.b = bqn.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(vv $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public zh<acg> a() {
      return agf.m;
   }

   public void a(abt $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bqn e() {
      return this.b;
   }
}
