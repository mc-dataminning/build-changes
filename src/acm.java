public class acm implements zs<ace> {
   public static final zj<ww, acm> a = zs.a(acm::a, acm::new);
   private final iz b;
   private final int c;
   private final int d;
   private final deu e;

   public acm(iz $$0, deu $$1, int $$2, int $$3) {
      this.b = $$0;
      this.e = $$1;
      this.c = $$2;
      this.d = $$3;
   }

   private acm(ww $$0) {
      this.b = $$0.e();
      this.c = $$0.readUnsignedByte();
      this.d = $$0.readUnsignedByte();
      this.e = zh.a(lq.f).decode($$0);
   }

   private void a(ww $$0) {
      $$0.a(this.b);
      $$0.k(this.c);
      $$0.k(this.d);
      zh.a(lq.f).encode($$0, this.e);
   }

   @Override
   public zu<acm> a() {
      return agq.j;
   }

   public void a(ace $$0) {
      $$0.a(this);
   }

   public iz b() {
      return this.b;
   }

   public int e() {
      return this.c;
   }

   public int f() {
      return this.d;
   }

   public deu g() {
      return this.e;
   }
}
