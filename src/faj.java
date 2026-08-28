import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record faj<T>(alh<js<T>> d, Codec<T> e, faj.a<T> f) {
   public static final faj<fdq> a = new faj<>(mh.bt, fdq.e, e());
   public static final faj<fbv> b = new faj<>(mh.bs, fbx.c, e());
   public static final faj<fam> c = new faj<>(mh.br, fam.d, f());

   public void a(fan $$0, alh<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<faj<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends fai> faj.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static faj.a<fam> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alh<js<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public faj.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(fan var1, alh<T> var2, T var3);
   }
}
