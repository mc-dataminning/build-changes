public class abv implements zb<abn> {
   public static final ys<wf, abv> a = zb.a(abv::a, abv::new);
   private final ja b;
   private final int c;
   private final int d;
   private final dfh e;

   public abv(ja $$0, dfh $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private abv(wf $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yq.a(lr.f).decode($$0);
   }

   private void a(wf $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      yq.a(lr.f).encode($$0, this.e);
   }

   @Override
   public zd<abv> a() {
      return afz.j;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public ja b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dfh g() {
      return this.e;
   }
}
