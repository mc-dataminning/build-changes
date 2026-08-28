import java.util.List;
import java.util.Optional;

public record aho(int c, List<String> d, Optional<String> e) implements zv<agv> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final zm<wl, aho> b = zm.a(zk.g, aho::b, zk.b(8192).a(zk.c(200)), aho::e, zk.b(128).a(zk::a), aho::f, aho::new);

   public aho(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zx<aho> a() {
      return agt.bw;
   }

   public void a(agv $$0) {
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
