public class acc implements vd<abc> {
   private final int a;
   private final aew b;
   private final boolean c;

   public acc(int $$0, cmk<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public acc(so $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(so $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(abc $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public aew d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
