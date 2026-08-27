public class ach implements xz<aai> {
   public static final xq<us, ach> a = xz.a(ach::a, ach::new);
   private final int b;
   private final ajc c;

   public ach(int $$0, csu<?> $$1) {
      this.b = $$0;
      this.c = $$1.a();
   }

   private ach(us $$0) {
      this.b = $$0.readByte();
      this.c = $$0.q();
   }

   private void a(us $$0) {
      $$0.k(this.b);
      $$0.a(this.c);
   }

   @Override
   public yb<ach> a() {
      return aet.Y;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public ajc b() {
      return this.c;
   }

   public int e() {
      return this.b;
   }
}
