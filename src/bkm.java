public class bkm extends bki {
   private final bkj c;
   private final bkl d;

   public bkm(int $$0, bkj $$1, bkl $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public bkm(int $$0, bkj $$1, bkl $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new acl((long[])this.b.clone(), this.d));
   }
}
