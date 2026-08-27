public class abs implements xf<za> {
   private final double a;
   private final double b;
   private final long c;

   public abs(dkx $$0) {
      this.a = $$0.i();
      this.b = $$0.k();
      this.c = $$0.j();
   }

   public abs(ui $$0) {
      this.a = $$0.readDouble();
      this.b = $$0.readDouble();
      this.c = $$0.o();
   }

   @Override
   public void a(ui $$0) {
      $$0.a(this.a);
      $$0.a(this.b);
      $$0.a(this.c);
   }

   public void a(za $$0) {
      $$0.a(this);
   }

   public double a() {
      return this.a;
   }

   public double d() {
      return this.b;
   }

   public long e() {
      return this.c;
   }
}
