import java.util.List;
import java.util.Optional;

public record ahp(int c, List<String> d, Optional<String> e) implements zw<agw> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final zn<wm, ahp> b = zn.a(zl.g, ahp::b, zl.b(8192).a(zl.c(200)), ahp::e, zl.b(128).a(zl::a), ahp::f, ahp::new);

   public ahp(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zy<ahp> a() {
      return agu.bw;
   }

   public void a(agw $$0) {
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
