import java.util.List;

public record adg(adg.a b, List<String> c) implements zs<ach> {
   public static final zj<wi, adg> a = zs.a(adg::a, adg::new);

   private adg(wi $$0) {
      this($$0.b(adg.a.class), $$0.a(wi::p));
   }

   private void a(wi $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wi::a);
   }

   @Override
   public zu<adg> a() {
      return agw.y;
   }

   public void a(ach $$0) {
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
