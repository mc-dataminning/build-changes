import java.util.List;
import java.util.Optional;

public record ahk(int c, List<String> d, Optional<String> e) implements zk<agq> {
   public static final int a = 4;
   private static final int f = 128;
   private static final int g = 8192;
   private static final int h = 200;
   public static final zb<wa, ahk> b = zb.a(yz.g, ahk::b, yz.b(8192).a(yz.c(200)), ahk::e, yz.b(128).a(yz::a), ahk::f, ahk::new);

   public ahk(int c, List<String> d, Optional<String> e) {
      d = List.copyOf(d);
      this.c = c;
      this.d = d;
      this.e = e;
   }

   @Override
   public zm<ahk> a() {
      return ago.bz;
   }

   public void a(agq $$0) {
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
