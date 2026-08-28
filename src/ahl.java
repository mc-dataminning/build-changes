import java.util.List;
import java.util.Optional;

public record ahl(int c, List<String> d, Optional<String> e) implements zs<ags> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final zj<wl, ahl> b = zj.a(zh.g, ahl::b, zh.b(8192).a(zh.c(200)), ahl::e, zh.b(128).a(zh::a), ahl::f, ahl::new);

   public ahl(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zu<ahl> a() {
      return agq.bw;
   }

   public void a(ags $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.c;
   }

   public List<String> e() {
      return this.d;
   }

   public Optional<String> f() {
      return this.e;
   }
}
