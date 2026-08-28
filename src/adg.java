import java.util.List;

public record adg(adg.a b, List<String> c) implements zv<ach> {
   public static final zm<wl, adg> a = zv.a(adg::a, adg::new);

   private adg(wl $$0) {
      this($$0.b(adg.a.class), $$0.a(wl::p));
   }

   private void a(wl $$0) {
      $$0.a(this.b);
      $$0.a(this.c, wl::a);
   }

   @Override
   public zx<adg> a() {
      return agt.y;
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
