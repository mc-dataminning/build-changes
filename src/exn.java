import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record exn<T>(alc<kf<T>> d, Codec<T> e, exn.a<T> f) {
   public static final exn<fau> a = new exn<>(me.bp, fau.e, e());
   public static final exn<eyz> b = new exn<>(me.bo, ezb.c, e());
   public static final exn<exq> c = new exn<>(me.bn, exq.d, f());

   public void a(exr $$0, alc<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<exn<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends exm> exn.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static exn.a<exq> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alc<kf<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public exn.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(exr var1, alc<T> var2, T var3);
   }
}
