import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public record afn(int c, List<String> d, Optional<String> e) implements xz<aev> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final xq<us, afn> b = xq.a(xo.d, afn::b, xo.b(8192).a(xo.a(us.a(ArrayList::new, 200))), afn::e, xo.b(128).a(xo::a), afn::f, afn::new);

   public afn(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public yb<afn> a() {
      return aet.bu;
   }

   public void a(aev $$0) {
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
