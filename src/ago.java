public class ago implements yn<afl> {
   public static final ye<vg, ago> a = yn.a(ago::a, ago::new);
   private final ib b;
   private final ih c;
   private final ago.a d;
   private final int e;

   public ago(ago.a $$0, ib $$1, ih $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.i();
      this.c = $$2;
      this.e = $$3;
   }

   public ago(ago.a $$0, ib $$1, ih $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ago(vg $$0) {
      this.d = $$0.b(ago.a.class);
      this.b = $$0.e();
      this.c = ih.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vg $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.k(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public yp<ago> a() {
      return afj.bI;
   }

   public void a(afl $$0) {
      $$0.a(this);
   }

   public ib b() {
      return this.b;
   }

   public ih e() {
      return this.c;
   }

   public ago.a f() {
      return this.d;
   }

   public int g() {
      return this.e;
   }

   public static enum a {
      a,
      b,
      c,
      d,
      e,
      f,
      g;
   }
}
