import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record ezv<T>(alf<js<T>> d, Codec<T> e, ezv.a<T> f) {
   public static final ezv<fdc> a = new ezv<>(mh.bt, fdc.e, e());
   public static final ezv<fbh> b = new ezv<>(mh.bs, fbj.c, e());
   public static final ezv<ezy> c = new ezv<>(mh.br, ezy.d, f());

   public void a(ezz $$0, alf<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<ezv<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends ezu> ezv.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static ezv.a<ezy> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alf<js<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public ezv.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(ezz var1, alf<T> var2, T var3);
   }
}
