public class biy extends biu {
   private final biv c;
   private final bix d;

   public biy(int $$0, biv $$1, bix $$2) {
      this($$0, $$1, $$2, new long[$$0]);
   }

   public biy(int $$0, biv $$1, bix $$2, long[] $$3) {
      super($$0, $$3);
      this.c = $$1;
      this.d = $$2;
   }

   @Override
   protected void a() {
      this.c.a(new abn((long[])this.b.clone(), this.d));
   }
}
