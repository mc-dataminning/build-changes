public class afs implements xx<aes> {
   public static final xo<uq, afs> a = xx.a(afs::a, afs::new);
   private final int b;
   private final aiy c;
   private final boolean d;

   public afs(int $$0, csd<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private afs(uq $$0) {
      this.b = $$0.readByte();
      this.c = $$0.s();
      this.d = $$0.readBoolean();
   }

   private void a(uq $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public xz<afs> a() {
      return aeq.bE;
   }

   public void a(aes $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public aiy e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
