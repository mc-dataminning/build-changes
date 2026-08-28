public class aea implements aac<acr> {
   public static final zt<ws, aea> a = aac.a(aea::a, aea::new);
   private final int b;
   private final int c;
   private final int d;

   public aea(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private aea(ws $$0) {
      this.b = $$0.x();
      this.c = $$0.l();
      this.d = $$0.readInt();
   }

   private void a(ws $$0) {
      $$0.f(this.b);
      $$0.c(this.c);
      $$0.q(this.d);
   }

   @Override
   public aae<aea> a() {
      return ahk.H;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }
}
