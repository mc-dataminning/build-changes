public class afn implements zg<abu> {
   public static final yx<vw, afn> a = zg.a(afn::a, afn::new);
   private final int b;
   private final int c;
   private final int d;

   public afn(int $$0, int $$1, int $$2) {
      this.b = $$0;
      this.c = $$1;
      this.d = $$2;
   }

   private afn(vw $$0) {
      this.b = $$0.readInt();
      this.c = $$0.readInt();
      this.d = $$0.readInt();
   }

   private void a(vw $$0) {
      $$0.p(this.b);
      $$0.p(this.c);
      $$0.p(this.d);
   }

   @Override
   public zi<afn> a() {
      return agg.aQ;
   }

   public void a(abu $$0) {
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
