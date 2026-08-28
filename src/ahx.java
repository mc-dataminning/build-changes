public class ahx implements zh<agr> {
   public static final yy<vw, ahx> a = zh.a(ahx::a, ahx::new);
   private final iv b;
   private final jb c;
   private final ahx.a d;
   private final int e;

   public ahx(ahx.a $$0, iv $$1, jb $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahx(ahx.a $$0, iv $$1, jb $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahx(vw $$0) {
      this.d = $$0.b(ahx.a.class);
      this.b = $$0.e();
      this.c = jb.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(vw $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zj<ahx> a() {
      return agp.bS;
   }

   public void a(agr $$0) {
      $$0.a(this);
   }

   public iv b() {
      return this.b;
   }

   public jb e() {
      return this.c;
   }

   public ahx.a f() {
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
