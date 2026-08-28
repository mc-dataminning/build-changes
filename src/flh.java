public abstract class flh implements AutoCloseable {
   private final fli a;
   private final int b;
   private final int c;
   private final int i;
   private final String j;
   protected flf d = flf.a;
   protected flf e = flf.a;
   protected flg f = flg.a;
   protected flg g = flg.b;
   protected boolean h = true;

   public flh(String $$0, fli $$1, int $$2, int $$3, int $$4) {
      this.j = $$0;
      this.a = $$1;
      this.b = $$2;
      this.c = $$3;
      this.i = $$4;
   }

   public int a(int $$0) {
      return this.b >> $$0;
   }

   public int b(int $$0) {
      return this.c >> $$0;
   }

   public int c() {
      return this.i;
   }

   public fli d() {
      return this.a;
   }

   public void a(flf $$0) {
      this.a($$0, $$0);
   }

   public void a(flf $$0, flf $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(flg $$0, boolean $$1) {
      this.a($$0, $$0, $$1);
   }

   public void a(flg $$0, flg $$1, boolean $$2) {
      this.f = $$0;
      this.g = $$1;
      this.h = $$2;
   }

   public String e() {
      return this.j;
   }

   @Override
   public abstract void close();
}
