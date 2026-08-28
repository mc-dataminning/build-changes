import java.util.List;

public record add(add.a b, List<String> c) implements zs<ace> {
   public static final zj<wl, add> a = zs.a(add::a, add::new);

   private add(wl $$0) {
      this($$0.b(add.a.class), $$0.a(wl::p));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wl::a);
   }

   @Override
   public zu<add> a() {
      return agq.y;
   }

   public void a(ace $$0) {
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
