public class ady implements zq<acf> {
   public static final zh<wu, ady> a = zq.a(ady::a, ady::new);
   private final int b;
   private final dek c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public ady(int $$0, dek $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private ady(wu $$0) {
      this.b = $$0.x();
      this.c = dek.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(wu $$0) {
      $$0.f(this.b);
      dek.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public zs<ady> a() {
      return agu.Q;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public dek e() {
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
