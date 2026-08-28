import java.util.List;

public record acs(acs.a b, List<String> c) implements zf<abt> {
   public static final yw<vv, acs> a = zf.a(acs::a, acs::new);

   private acs(vv $$0) {
      this($$0.b(acs.a.class), $$0.a(vv::p));
   }

   private void a(vv $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vv::a);
   }

   @Override
   public zh<acs> a() {
      return agf.y;
   }

   public void a(abt $$0) {
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
