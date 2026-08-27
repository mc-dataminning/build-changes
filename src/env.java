public class env extends enx {
   private final ie b;
   private final hz c;
   private final boolean d;
   private final boolean e;

   public static env a(enz $$0, ie $$1, hz $$2) {
      return new env(true, $$0, $$1, $$2, false);
   }

   public env(enz $$0, ie $$1, hz $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private env(boolean $$0, enz $$1, ie $$2, hz $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public env a(ie $$0) {
      return new env(this.d, this.a, $$0, this.c, this.e);
   }

   public env a(hz $$0) {
      return new env(this.d, this.a, this.b, $$0, this.e);
   }

   public hz a() {
      return this.c;
   }

   public ie b() {
      return this.b;
   }

   @Override
   public enx.a c() {
      return this.d ? enx.a.a : enx.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
