public class ada implements wb<aca> {
   private final int a;
   private final afw b;
   private final boolean c;

   public ada(int $$0, cno<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public ada(tl $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(tl $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public afw d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
