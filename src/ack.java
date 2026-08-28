public class ack implements zb<abn> {
   public static final ys<wf, ack> a = zb.a(ack::a, ack::new);
   public static final int b = -1;
   public static final int c = -2;
   private final int d;
   private final int e;
   private final int f;
   private final cuc g;

   public ack(int $$0, int $$1, int $$2, cuc $$3) {
      this.d = $$0;
      this.e = $$1;
      this.f = $$2;
      this.g = $$3.s();
   }

   private ack(wf $$0) {
      this.d = $$0.readByte();
      this.e = $$0.l();
      this.f = $$0.readShort();
      this.g = cuc.h.decode($$0);
   }

   private void a(wf $$0) {
      $$0.k(this.d);
      $$0.c(this.e);
      $$0.l(this.f);
      cuc.h.encode($$0, this.g);
   }

   @Override
   public zd<ack> a() {
      return afz.w;
   }

   public void a(abn $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.d;
   }

   public int e() {
      return this.f;
   }

   public cuc f() {
      return this.g;
   }

   public int g() {
      return this.e;
   }
}
