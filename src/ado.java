public record ado(fdw b, float c, float d) implements zd<abs> {
   public static final yu<vs, ado> a = yu.a(fdw.b, ado::b, ys.l, ado::e, ys.l, ado::f, ado::new);

   public static ado a(bwa $$0) {
      return new ado($$0.dt(), $$0.dL(), $$0.dN());
   }

   @Override
   public zf<ado> a() {
      return agl.V;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public float e() {
      return this.c;
   }

   public float f() {
      return this.d;
   }
}
