import java.util.List;
import java.util.Optional;

public record ahb(int c, List<String> d, Optional<String> e) implements zg<agi> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final yx<vw, ahb> b = yx.a(yv.g, ahb::b, yv.b(8192).a(yv.c(200)), ahb::e, yv.b(128).a(yv::a), ahb::f, ahb::new);

   public ahb(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zi<ahb> a() {
      return agg.bw;
   }

   public void a(agi $$0) {
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
