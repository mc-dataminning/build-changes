public class bkb extends bjx {
   private final bjy c;
   private final bka d;

   public bkb(int $$0, bjy $$1, bka $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bkb(int $$0, bjy $$1, bka $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acb((long[])this.b.clone(), this.d));
   }
}
