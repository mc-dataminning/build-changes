public class abo implements zb<abm> {
   public static final ys<vu, abo> a = zb.a(abo::a, abo::new);
   private final int b;
   private final double c;
   private final double d;
   private final double e;
   private final int f;

   public abo(brq $$0) {
      this.b = $$0.aj();
      this.c = $$0.ds();
      this.d = $$0.du();
      this.e = $$0.dy();
      this.f = $$0.p();
   }

   private abo(vu $$0) {
      this.b = $$0.l();
      this.c = $$0.readDouble();
      this.d = $$0.readDouble();
      this.e = $$0.readDouble();
      this.f = $$0.readShort();
   }

   private void a(vu $$0) {
      $$0.c(this.b);
      $$0.a(this.c);
      $$0.a(this.d);
      $$0.a(this.e);
      $$0.l(this.f);
   }

   @Override
   public zd<abo> a() {
      return afx.d;
   }

   public void a(abm $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public double e() {
      return this.c;
   }

   public double f() {
      return this.d;
   }

   public double g() {
      return this.e;
   }

   public int h() {
      return this.f;
   }
}
