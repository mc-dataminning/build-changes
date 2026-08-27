public class eno extends enq {
   private final ie b;
   private final hz c;
   private final boolean d;
   private final boolean e;

   public static eno a(ens $$0, ie $$1, hz $$2) {
      return new eno(true, $$0, $$1, $$2, false);
   }

   public eno(ens $$0, ie $$1, hz $$2, boolean $$3) {
      this(false, $$0, $$1, $$2, $$3);
   }

   private eno(boolean $$0, ens $$1, ie $$2, hz $$3, boolean $$4) {
      super($$1);
      this.d = $$0;
      this.b = $$2;
      this.c = $$3;
      this.e = $$4;
   }

   public eno a(ie $$0) {
      return new eno(this.d, this.a, $$0, this.c, this.e);
   }

   public eno a(hz $$0) {
      return new eno(this.d, this.a, this.b, $$0, this.e);
   }

   public hz a() {
      return this.c;
   }

   public ie b() {
      return this.b;
   }

   @Override
   public enq.a c() {
      return this.d ? enq.a.a : enq.a.b;
   }

   public boolean d() {
      return this.e;
   }
}
