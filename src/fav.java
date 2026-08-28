import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record fav<T>(alq<jt<T>> d, Codec<T> e, fav.a<T> f) {
   public static final fav<fec> a = new fav<>(mi.bt, fec.e, e());
   public static final fav<fch> b = new fav<>(mi.bs, fcj.c, e());
   public static final fav<fay> c = new fav<>(mi.br, fay.d, f());

   public void a(faz $$0, alq<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<fav<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends fau> fav.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static fav.a<fay> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alq<jt<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public fav.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(faz var1, alq<T> var2, T var3);
   }
}
