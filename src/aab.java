import java.util.List;

public record aab(List<ib> c) implements zo {
   public static final ye<vg, aab> a = zo.a(aab::a, aab::new);
   public static final zo.b<aab> b = zo.a("debug/raids");

   private aab(vg $$0) {
      this($$0.a(ib.b));
   }

   private void a(vg $$0) {
      $$0.a(this.c, ib.b);
   }

   @Override
   public zo.b<aab> a() {
      return b;
   }

   public List<ib> b() {
      return this.c;
   }
}
