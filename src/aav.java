public class aav implements xz<aai> {
   public static final xq<us, aav> a = xz.a(aav::a, aav::new);
   private final bmi b;
   private final boolean c;

   public aav(bmi $$0, boolean $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   private aav(us $$0) {
      this.b = bmi.a($$0.readUnsignedByte());
      this.c = $$0.readBoolean();
   }

   private void a(us $$0) {
      $$0.k(this.b.a());
      $$0.a(this.c);
   }

   @Override
   public yb<aav> a() {
      return aet.m;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public boolean b() {
      return this.c;
   }

   public bmi e() {
      return this.b;
   }
}
