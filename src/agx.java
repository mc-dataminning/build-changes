import java.util.List;
import java.util.Optional;

public record agx(int c, List<String> d, Optional<String> e) implements ze<age> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final yv<vx, agx> b = yv.a(yt.f, agx::b, yt.b(8192).a(yt.c(200)), agx::e, yt.b(128).a(yt::a), agx::f, agx::new);

   public agx(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zg<agx> a() {
      return agc.bw;
   }

   public void a(age $$0) {
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
