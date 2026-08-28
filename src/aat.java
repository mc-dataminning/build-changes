import java.util.List;

public record aat(List<iu> c) implements aag {
   public static final yu<vs, aat> a = aag.a(aat::a, aat::new);
   public static final aag.b<aat> b = aag.a("debug/raids");

   private aat(vs $$0) {
      this($$0.a(iu.b));
   }

   private void a(vs $$0) {
      $$0.a(this.c, iu.b);
   }

   @Override
   public aag.b<aat> a() {
      return b;
   }

   public List<iu> b() {
      return this.c;
   }
}
