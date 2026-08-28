public class adg implements zb<abn> {
   public static final ys<wf, adg> a = zb.a(adg::a, adg::new);
   private final int b;
   private final dbf c;
   private final int d;
   private final int e;
   private final boolean f;
   private final boolean g;

   public adg(int $$0, dbf $$1, int $$2, int $$3, boolean $$4, boolean $$5) {
      this.b = $$0;
      this.c = $$1.a();
      this.d = $$2;
      this.e = $$3;
      this.f = $$4;
      this.g = $$5;
   }

   private adg(wf $$0) {
      this.b = $$0.l();
      this.c = dbf.b.decode($$0);
      this.d = $$0.l();
      this.e = $$0.l();
      this.f = $$0.readBoolean();
      this.g = $$0.readBoolean();
   }

   private void a(wf $$0) {
      $$0.c(this.b);
      dbf.b.encode($$0, this.c);
      $$0.c(this.d);
      $$0.c(this.e);
      $$0.a(this.f);
      $$0.a(this.g);
   }

   @Override
   public zd<adg> a() {
      return afz.Q;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public dbf e() {
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
