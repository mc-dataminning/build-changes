import java.util.List;
import java.util.Optional;

public record agf(int c, List<String> d, Optional<String> e) implements yp<afn> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final yg<vi, agf> b = yg.a(ye.f, agf::b, ye.b(8192).a(ye.c(200)), agf::e, ye.b(128).a(ye::a), agf::f, agf::new);

   public agf(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public yr<agf> a() {
      return afl.bu;
   }

   public void a(afn $$0) {
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
