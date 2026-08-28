import java.util.List;

public record abg(List<jh> c) implements aat {
   public static final zh<wg, abg> a = aat.a(abg::a, abg::new);
   public static final aat.b<abg> b = aat.a("debug/raids");

   private abg(wg $$0) {
      this($$0.a(jh.b));
   }

   private void a(wg $$0) {
      $$0.a(this.c, jh.b);
   }

   @Override
   public aat.b<abg> a() {
      return b;
   }

   public List<jh> b() {
      return this.c;
   }
}
