public class aga implements yb<aez> {
   public static final xs<uu, aga> a = yb.a(aga::a, aga::new);
   private final int b;
   private final ajh c;
   private final boolean d;

   public aga(int $$0, ctr<?> $$1, boolean $$2) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
   }

   private aga(uu $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
      this.d = $$0.readBoolean();
   }

   private void a(uu $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
   }

   @Override
   public yd<aga> a() {
      return aex.bG;
   }

   public void a(aez $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ajh e() {
      return this.c;
   }

   public boolean f() {
      return this.d;
   }
}
