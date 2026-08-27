import java.util.List;
import java.util.Optional;

public record ahd(int c, List<String> d, Optional<String> e) implements zl<agl> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final zc<we, ahd> b = zc.a(za.g, ahd::b, za.b(8192).a(za.c(200)), ahd::e, za.b(128).a(za::a), ahd::f, ahd::new);

   public ahd(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zn<ahd> a() {
      return agj.bw;
   }

   public void a(agl $$0) {
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
