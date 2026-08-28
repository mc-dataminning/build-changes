import java.util.List;

public record adh(adh.a b, List<String> c) implements zw<aci> {
   public static final zn<wm, adh> a = zw.a(adh::a, adh::new);

   private adh(wm $$0) {
      this($$0.b(adh.a.class), $$0.a(wm::p));
   }

   private void a(wm $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wm::a);
   }

   @Override
   public zy<adh> a() {
      return agu.y;
   }

   public void a(aci $$0) {
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
