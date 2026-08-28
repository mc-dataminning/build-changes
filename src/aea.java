public class aea implements zv<ach> {
   public static final zm<wz, aea> a = zv.a(aea::a, aea::new);
   private final int b;
   private final dav c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public aea(int $$0, dav $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private aea(wz $$0) {
      this.b = $$0.l();
      this.c = dav.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(wz $$0) {
      $$0.c(this.b);
      dav.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public zx<aea> a() {
      return agt.Q;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public dav e() {
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
