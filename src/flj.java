public abstract class flj implements AutoCloseable {
   private final flk a;
   private final int b;
   private final int c;
   private final int i;
   private final String j;
   protected flh d = flh.a;
   protected flh e = flh.a;
   protected fli f = fli.a;
   protected fli g = fli.b;
   protected boolean h = true;

   public flj(String $$0, flk $$1, int $$2, int $$3, int $$4) {
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

   public flk d() {
      return this.a;
   }

   public void a(flh $$0) {
      this.a($$0, $$0);
   }

   public void a(flh $$0, flh $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   public void a(fli $$0, boolean $$1) {
      this.a($$0, $$0, $$1);
   }

   public void a(fli $$0, fli $$1, boolean $$2) {
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
