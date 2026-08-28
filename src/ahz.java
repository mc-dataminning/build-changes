public class ahz implements zo<agu> {
   public static final zf<we, ahz> a = zo.a(ahz::a, ahz::new);
   private final jg b;
   private final jl c;
   private final ahz.a d;
   private final int e;

   public ahz(ahz.a $$0, jg $$1, jl $$2, int $$3) {
      this.d = $$0;
      this.b = $$1.j();
      this.c = $$2;
      this.e = $$3;
   }

   public ahz(ahz.a $$0, jg $$1, jl $$2) {
      this($$0, $$1, $$2, 0);
   }

   private ahz(we $$0) {
      this.d = $$0.b(ahz.a.class);
      this.b = $$0.e();
      this.c = jl.a($$0.readUnsignedByte());
      this.e = $$0.l();
   }

   private void a(we $$0) {
      $$0.a(this.d);
      $$0.a(this.b);
      $$0.l(this.c.d());
      $$0.c(this.e);
   }

   @Override
   public zq<ahz> a() {
      return ags.bN;
   }

   public void a(agu $$0) {
      $$0.a(this);
   }

   public jg b() {
      return this.b;
   }

   public jl e() {
      return this.c;
   }

   public ahz.a f() {
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
