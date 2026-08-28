import java.util.List;

public record abg(List<iz> c) implements aat {
   public static final zj<wl, abg> a = aat.a(abg::a, abg::new);
   public static final aat.b<abg> b = aat.a("debug/raids");

   private abg(wl $$0) {
      this($$0.a(iz.b));
   }

   private void a(wl $$0) {
      $$0.a(this.c, iz.b);
   }

   @Override
   public aat.b<abg> a() {
      return b;
   }

   public List<iz> b() {
      return this.c;
   }
}
