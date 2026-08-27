public class ago implements yp<afn> {
   public static final yg<vi, ago> a = yp.a(ago::a, ago::new);
   private final int b;
   private final ajv c;
   private final boolean d;

   public ago(int $$0, cvu<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private ago(vi $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(vi $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yr<ago> a() {
      return afl.bG;
   }

   public void a(afn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ajv e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
