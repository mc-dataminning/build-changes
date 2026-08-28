import com.mojang.serialization.Codec;
import java.util.stream.Stream;

public record fal<T>(alj<jt<T>> d, Codec<T> e, fal.a<T> f) {
   public static final fal<fds> a = new fal<>(mi.bt, fds.e, e());
   public static final fal<fbx> b = new fal<>(mi.bs, fbz.c, e());
   public static final fal<fao> c = new fal<>(mi.br, fao.d, f());

   public void a(fap $$0, alj<T> $$1, T $$2) {
      this.f.run($$0, $$1, $$2);
   }

   public static Stream<fal<?>> a() {
      return Stream.of(a, b, c);
   }

   private static <T extends fak> fal.a<T> e() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   private static fal.a<fao> f() {
      return ($$0, $$1, $$2) -> $$2.a($$0.a($$2.a()).a("{" + $$1.b() + "/" + $$1.a() + "}", $$1));
   }

   public alj<jt<T>> b() {
      return this.d;
   }

   public Codec<T> c() {
      return this.e;
   }

   public fal.a<T> d() {
      return this.f;
   }

   @FunctionalInterface
   public interface a<T> {
      void run(fap var1, alj<T> var2, T var3);
   }
}
