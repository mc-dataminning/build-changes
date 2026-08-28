import java.util.List;

public record acs(acs.a b, List<String> c) implements zf<abu> {
   public static final yw<vu, acs> a = zf.a(acs::a, acs::new);

   private acs(vu $$0) {
      this($$0.b(acs.a.class), $$0.a(vu::p));
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vu::a);
   }

   @Override
   public zh<acs> a() {
      return agn.x;
   }

   public void a(abu $$0) {
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
