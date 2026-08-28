public class bpc extends boy {
   private final boz c;
   private final bpb d;

   public bpc(int $$0, boz $$1, bpb $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bpc(int $$0, boz $$1, bpb $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acu((long[])this.b.clone(), this.d));
   }
}
