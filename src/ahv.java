public class ahv implements zk<agq> {
   public static final zb<wa, ahv> a = zk.a(ahv::a, ahv::new);
   private final je b;
   private final jj c;
   private final ahv.a d;
   private final int e;

   public ahv(ahv.a $$0, je $$1, jj $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahv(ahv.a $$0, je $$1, jj $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahv(wa $$0) {
      this.d = $$0.b(ahv.a.class);
      this.b = $$0.e();
      this.c = jj.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(wa $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zm<ahv> a() {
      return ago.bN;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public je b() {
      return this.b;
   }

   public jj e() {
      return this.c;
   }

   public ahv.a f() {
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
