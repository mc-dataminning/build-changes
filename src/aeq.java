public record aeq(ago e, byte f) implements zj<aby> {
   public static final za<wn, aeq> a = zj.a(aeq::a, aeq::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private aeq(wn $$0) {
      this(new ago($$0), $$0.readByte());
   }

   private void a(wn $$0) {
      this.e.a($$0);
      $$0.l(this.f);
   }

   @Override
   public zl<aeq> a() {
      return agr.ap;
   }

   public void a(aby $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public ago b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
