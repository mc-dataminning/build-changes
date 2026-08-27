public class ahu implements zb<afz> {
   public static final ys<vu, ahu> a = zb.a(ahu::a, ahu::new);
   private final etl b;
   private final bpl c;
   private final int d;

   public ahu(bpl $$0, etl $$1, int $$2) {
      this.c = $$0;
      this.b = $$1;
      this.d = $$2;
   }

   private ahu(vu $$0) {
      this.c = $$0.b(bpl.class);
      this.b = $$0.v();
      this.d = $$0.l();
   }

   private void a(vu $$0) {
      $$0.a(this.c);
      $$0.a(this.b);
      $$0.c(this.d);
   }

   @Override
   public zd<ahu> a() {
      return afx.ca;
   }

   public void a(afz $$0) {
      $$0.a(this);
   }

   public bpl b() {
      return this.c;
   }

   public etl e() {
      return this.b;
   }

   public int f() {
      return this.d;
   }
}
