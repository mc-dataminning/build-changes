public class aek implements xf<adj> {
   private final int a;
   private final ahg b;
   private final boolean c;

   public aek(int $$0, cqd<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public aek(ui $$0) {
      this.a = $$0.readByte();
      this.b = $$0.t();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(ui $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(adj $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public ahg d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
