import java.util.List;

public record acl(acl.a b, List<String> c) implements zb<abm> {
   public static final ys<vu, acl> a = zb.a(acl::a, acl::new);

   private acl(vu $$0) {
      this($$0.b(acl.a.class), $$0.a(vu::p));
   }

   private void a(vu $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vu::a);
   }

   @Override
   public zd<acl> a() {
      return afx.y;
   }

   public void a(abm $$0) {
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
