public class aeu implements zb<abn> {
   public static final ys<vr, aeu> a = zb.a(aeu::a, aeu::new);
   private final int b;
   private final int c;
   private final int d;
   private final int e;

   public aeu(bsd $$0) {
      this($$0.al(), $$0.ds());
   }

   public aeu(int $$0, evz $$1) {
      this.b = $$0;
      double $$2 = 3.9;
      double $$3 = aye.a($$1.c, -3.9, 3.9);
      double $$4 = aye.a($$1.d, -3.9, 3.9);
      double $$5 = aye.a($$1.e, -3.9, 3.9);
      this.c = (int)($$3 * 8000.0);
      this.d = (int)($$4 * 8000.0);
      this.e = (int)($$5 * 8000.0);
   }

   private aeu(vr $$0) {
      this.b = $$0.l();
      this.c = $$0.readShort();
      this.d = $$0.readShort();
      this.e = $$0.readShort();
   }

   private void a(vr $$0) {
      $$0.c(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      $$0.l(this.e);
   }

   @Override
   public zd<aeu> a() {
      return afz.aE;
   }

   public void a(abn $$0) {
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

   public int g() {
      return this.e;
   }
}
