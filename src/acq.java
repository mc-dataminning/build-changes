import java.util.List;

public record acq(acq.a b, List<String> c) implements zd<abs> {
   public static final yu<vs, acq> a = zd.a(acq::a, acq::new);

   private acq(vs $$0) {
      this($$0.b(acq.a.class), $$0.a(vs::p));
   }

   private void a(vs $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vs::a);
   }

   @Override
   public zf<acq> a() {
      return agl.x;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
