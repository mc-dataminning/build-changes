import java.util.List;
import java.util.Optional;

public record agu(int c, List<String> d, Optional<String> e) implements zb<agb> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final ys<vr, agu> b = ys.a(yq.g, agu::b, yq.b(8192).a(yq.c(200)), agu::e, yq.b(128).a(yq::a), agu::f, agu::new);

   public agu(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zd<agu> a() {
      return afz.bw;
   }

   public void a(agb $$0) {
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
