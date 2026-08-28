import java.util.List;

public record aal(List<ji> c) implements zy {
   public static final ym<vl, aal> a = zy.a(aal::a, aal::new);
   public static final zy.b<aal> b = zy.a("debug/raids");

   private aal(vl $$0) {
      this($$0.a(ji.b));
   }

   private void a(vl $$0) {
      $$0.a(this.c, ji.b);
   }

   @Override
   public zy.b<aal> a() {
      return b;
   }

   public List<ji> b() {
      return this.c;
   }
}
