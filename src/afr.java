import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record afr(int c, List<String> d, Optional<String> e) implements yb<aez> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final xs<uu, afr> b = xs.a(xq.d, afr::b, xq.b(8192).a(xq.a(uu.a(ArrayList::new, 200))), afr::e, xq.b(128).a(xq::a), afr::f, afr::new);

   public afr(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public yd<afr> a() {
      return aex.bu;
   }

   public void a(aez $$0) {
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
