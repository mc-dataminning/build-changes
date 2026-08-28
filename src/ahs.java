import java.util.List;
import java.util.Optional;

public record ahs(int b, List<String> c, Optional<String> d) implements zs<agy> {
   public static final zj<wi, ahs> a = zj.a(zh.h, ahs::b, zh.b(1024).a(zh.c(100)), ahs::e, zh.b(32).a(zh::a), ahs::f, ahs::new);

   public ahs(int b, List<String> c, Optional<String> d) {
      c = List.copyOf(c);
      this.b = b;
      this.c = c;
      this.d = d;
   }

   @Override
   public zu<ahs> a() {
      return agw.bz;
   }

   public void a(agy $$0) {
      $$0.a(this);
   }

   public List<String> e() {
      return this.c;
   }

   public Optional<String> f() {
      return this.d;
   }
}
