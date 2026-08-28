public class ael implements aac<acr> {
   public static final zt<xg, ael> a = aac.a(ael::a, ael::new);
   private final int b;
   private final dfy c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public ael(int $$0, dfy $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private ael(xg $$0) {
      this.b = $$0.x();
      this.c = dfy.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(xg $$0) {
      $$0.f(this.b);
      dfy.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public aae<ael> a() {
      return ahk.Q;
   }

   public void a(acr $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public dfy e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public boolean h() {
      return this.f;
   }

   public boolean i() {
      return this.g;
   }
}
