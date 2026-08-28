public class aby implements zc<abr> {
   public static final yt<wg, aby> a = zc.a(aby::a, aby::new);
   private final jj b;
   private final int c;
   private final int d;
   private final dku e;

   public aby(jj $$0, dku $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private aby(wg $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = yr.a(me.f).decode($$0);
   }

   private void a(wg $$0) {
      $$0.a(this.b);
      $$0.l(this.c);
      $$0.l(this.d);
      yr.a(me.f).encode($$0, this.e);
   }

   @Override
   public ze<aby> a() {
      return agk.i;
   }

   public void a(abr $$0) {
      $$0.a(this);
   }

   public jj b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public dku g() {
      return this.e;
   }
}
