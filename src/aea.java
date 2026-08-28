public class aea implements zs<ach> {
   public static final zj<ww, aea> a = zs.a(aea::a, aea::new);
   private final int b;
   private final ded c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public aea(int $$0, ded $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private aea(ww $$0) {
      this.b = $$0.x();
      this.c = ded.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(ww $$0) {
      $$0.f(this.b);
      ded.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public zu<aea> a() {
      return agw.Q;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public ded e() {
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
