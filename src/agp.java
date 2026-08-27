import java.util.List;
import java.util.Optional;

public record agp(int c, List<String> d, Optional<String> e) implements yz<afx> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final yq<vs, agp> b = yq.a(yo.f, agp::b, yo.b(8192).a(yo.c(200)), agp::e, yo.b(128).a(yo::a), agp::f, agp::new);

   public agp(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zb<agp> a() {
      return afv.bu;
   }

   public void a(afx $$0) {
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
