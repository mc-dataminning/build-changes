import java.util.List;

public record abg(List<iw> c) implements aat {
   public static final ze<vy, abg> a = aat.a(abg::a, abg::new);
   public static final aat.b<abg> b = aat.a("debug/raids");

   private abg(vy $$0) {
      this($$0.a(iw.b));
   }

   private void a(vy $$0) {
      $$0.a(this.c, iw.b);
   }

   @Override
   public aat.b<abg> a() {
      return b;
   }

   public List<iw> b() {
      return this.c;
   }
}
