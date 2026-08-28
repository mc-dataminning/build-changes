import java.util.List;
import java.util.Optional;

public record ahk(int b, List<String> c, Optional<String> d) implements zk<agq> {
   public static final zb<wa, ahk> a = zb.a(yz.g, ahk::b, yz.b(1024).a(yz.c(100)), ahk::e, yz.b(32).a(yz::a), ahk::f, ahk::new);

   public ahk(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zm<ahk> a() {
      return ago.bz;
   }

   public void a(agq $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
