import java.util.List;
import java.util.Optional;

public record agr(int c, List<String> d, Optional<String> e) implements zb<afz> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final ys<vu, agr> b = ys.a(yq.f, agr::b, yq.b(8192).a(yq.c(200)), agr::e, yq.b(128).a(yq::a), agr::f, agr::new);

   public agr(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zd<agr> a() {
      return afx.bu;
   }

   public void a(afz $$0) {
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
