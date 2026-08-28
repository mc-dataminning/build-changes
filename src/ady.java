public class ady implements zo<acf> {
   public static final ze<wp, ady> a = zo.a(ady::a, ady::new);
   private final int b;
   private final djg c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public ady(int $$0, djg $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private ady(wp $$0) {
      this.b = $$0.x();
      this.c = djg.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(wp $$0) {
      $$0.f(this.b);
      djg.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public zq<ady> a() {
      return agy.Q;
   }

   public void a(acf $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public djg e() {
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
