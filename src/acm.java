import java.util.List;

public record acm(acm.a b, List<String> c) implements zb<abn> {
   public static final ys<vr, acm> a = zb.a(acm::a, acm::new);

   private acm(vr $$0) {
      this($$0.b(acm.a.class), $$0.a(vr::p));
   }

   private void a(vr $$0) {
      $$0.a(this.b);
      $$0.a(this.c, vr::a);
   }

   @Override
   public zd<acm> a() {
      return afz.y;
   }

   public void a(abn $$0) {
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
