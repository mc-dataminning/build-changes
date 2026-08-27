public class aht implements ze<agd> {
   public static final yv<wi, aht> a = ze.a(aht::a, aht::new);
   private final int b;
   private final cto c;

   public aht(int $$0, cto $$1) {
      this.b = $$0;
      this.c = $$1.s();
   }

   private aht(wi $$0) {
      this.b = $$0.readShort();
      this.c = cto.e.decode($$0);
   }

   private void a(wi $$0) {
      $$0.l(this.b);
      cto.e.encode($$0, this.c);
   }

   @Override
   public zg<aht> a() {
      return agb.bV;
   }

   public void a(agd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public cto e() {
      return this.c;
   }
}
