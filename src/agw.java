import java.util.List;
import java.util.Optional;

public record agw(int c, List<String> d, Optional<String> e) implements ze<agd> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final yv<vx, agw> b = yv.a(yt.f, agw::b, yt.b(8192).a(yt.c(200)), agw::e, yt.b(128).a(yt::a), agw::f, agw::new);

   public agw(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zg<agw> a() {
      return agb.bv;
   }

   public void a(agd $$0) {
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
