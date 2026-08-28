public class boa extends bnw {
   private final bnx c;
   private final bnz d;

   public boa(int $$0, bnx $$1, bnz $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public boa(int $$0, bnx $$1, bnz $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new ads((long[])this.b.clone(), this.d));
   }
}
