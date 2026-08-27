public record acv(aeq e, byte f) implements xz<aai> {
   public static final xq<vd, acv> a = xz.a(acv::a, acv::new);
   public static final byte b = 1;
   public static final byte c = 2;
   public static final byte d = 3;

   private acv(vd $$0) {
      this(new aeq($$0), $$0.readByte());
   }

   private void a(vd $$0) {
      this.e.a($$0);
      $$0.k(this.f);
   }

   @Override
   public yb<acv> a() {
      return aet.al;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public boolean a(byte $$0) {
      return (this.f & $$0) != 0;
   }

   public aeq b() {
      return this.e;
   }

   public byte e() {
      return this.f;
   }
}
