public class aca implements va<aaz> {
   private final int a;
   private final aeu b;
   private final boolean c;

   public aca(int $$0, cmf<?> $$1, boolean $$2) {
      this.a = $$0;
      this.b = $$1.a();
      this.c = $$2;
   }

   public aca(sl $$0) {
      this.a = $$0.readByte();
      this.b = $$0.s();
      this.c = $$0.readBoolean();
   }

   @Override
   public void a(sl $$0) {
      $$0.k(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(aaz $$0) {
      $$0.a(this);
   }

   public int a() {
      return this.a;
   }

   public aeu d() {
      return this.b;
   }

   public boolean e() {
      return this.c;
   }
}
