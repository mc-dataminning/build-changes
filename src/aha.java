import java.util.List;
import java.util.Optional;

public record aha(int c, List<String> d, Optional<String> e) implements zf<agh> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final yw<vv, aha> b = yw.a(yu.g, aha::b, yu.b(8192).a(yu.c(200)), aha::e, yu.b(128).a(yu::a), aha::f, aha::new);

   public aha(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zh<aha> a() {
      return agf.bw;
   }

   public void a(agh $$0) {
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
